package site.pers.kl.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;
import site.pers.kl.bean.Blog;
import site.pers.kl.bean.message.Message;
import site.pers.kl.constant.BlogConstant;
import site.pers.kl.service.BlogCommentService;
import site.pers.kl.service.BlogService;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class BlogController {

    @Autowired
    private BlogService blogService;

    //转向首页
    @RequestMapping("/toIndex")
    public String toIndex() {
        return "index";
    }

    //查出选中页的博客
    @RequestMapping("/getBlogComment")
    @ResponseBody
    public ModelAndView getBlogComment(Integer blogId) {
        ModelAndView modelAndView = null;
        Blog blog = blogService.selectBlogWithId(blogId);
        if(blog != null) {
            modelAndView = new ModelAndView("comment", "blog", blog);
        }
        return modelAndView;
    }

    //查出所有博客
    @RequestMapping("/getAllBlog")
    @ResponseBody
    public Message getAllBlog(@RequestParam(value = "pn", defaultValue = "1") Integer pn) {
        Message message = new Message();
        PageHelper.startPage(pn, 1);
        List<Blog> blogList = blogService.selectAllBlogs(null);
        PageInfo<Blog> pageInfo = new PageInfo<>(blogList, 5);
        if(blogList != null) {
            message.add("pageInfo", pageInfo);
        }
        return message;
    }

    //查出选中页的博客
    @RequestMapping("/getPageBlog")
    @ResponseBody
    public ModelAndView getPageBlog(@RequestParam(value = "pn", defaultValue = "1") Integer pn) {
        ModelAndView modelAndView = null;
        PageHelper.startPage(pn, 1);
        List<Blog> blogList = blogService.selectAllBlogs(null);
        PageInfo<Blog> pageInfo = new PageInfo<>(blogList, 5);
        if(blogList != null) {
            modelAndView = new ModelAndView("chooseIndex", "pageInfo", pageInfo);
        }
        return modelAndView;
    }

    //增加博客
    @RequestMapping("/addBlog")
    public String addBlog(Blog blog, @RequestParam("blogImageStream") CommonsMultipartFile blogImageStream,
                          HttpServletRequest request) {
        if(blogImageStream != null) {
            try{
                //获取操作系统路径
                String osName = System.getProperties().getProperty("os.name");
                Date date = new Date();
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMdd-HHmmss");
                String datePath = simpleDateFormat.format(date);
                String fileName = blogImageStream.getOriginalFilename();
                String filePath = "";
                String pageFilePath = "";
                if(osName.contains("Window")) {
                    filePath = BlogConstant.PREFIXWINPATH + BlogConstant.IMAGEPATH + datePath + fileName;
                    pageFilePath = BlogConstant.IMAGEPATH + datePath + fileName;
                } else {
                  filePath = BlogConstant.LINIMAGEPATH + datePath + fileName;
                  pageFilePath = BlogConstant.IMAGEPATH + datePath + fileName;
                }
                File newFile = new File(filePath);
                //通过CommonsMultipartFile的方法直接写文件（注意这个时候）
                blogImageStream.transferTo(newFile);
                if(blog != null) {
                    blog.setBlogImage(pageFilePath);
                    blogService.addBlog(blog);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return "redirect:/toIndex";
    }
}
