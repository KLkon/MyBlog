package site.pers.kl.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import site.pers.kl.util.CodeUtil;
import site.pers.kl.bean.Blog;
import site.pers.kl.constant.BlogConstant;
import site.pers.kl.service.BlogService;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.RenderedImage;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@Controller
public class SearchController {

    @Autowired
    private BlogService blogService;

    @RequestMapping("/checkCode")
    @ResponseBody
    public int checkCode(HttpServletRequest request) {
        HttpSession session = request.getSession();
        String code = request.getParameter("authcode");
        //生成验证码时间
        Long getCodeTime = (Long)session.getAttribute("getCodeTime");
        //验证时间
        Long checkCodeTime = System.currentTimeMillis();
        // 验证验证码
        String sessionCode = session.getAttribute("code").toString();
        if((checkCodeTime - getCodeTime) > 60000) {
            return 0;//验证码过期
        }
        if (code != null && !"".equals(code) && sessionCode != null && !"".equals(sessionCode)) {
            if(code.equalsIgnoreCase(sessionCode)) {
                return 1;//验证成功
            }
        }
        return 2;//验证码填写错误
    }

    /**
     * 获取一个验证码
     * @param request
     * @param response
     * @throws IOException
     */
    @RequestMapping("/getCode")
    public void getCode(HttpServletRequest request, HttpServletResponse response)
                        throws IOException{
        //生成验证码时候的时间，此处验证时要校验，验证码时间为 60s
        Long getCodeTime = System.currentTimeMillis();
        request.getSession().setAttribute("getCodeTime", getCodeTime);
        // 调用工具类生成的验证码和验证码图片
        Map<String, Object> codeMap = CodeUtil.generateCodeAndPic();

        // 将四位数字的验证码保存到Session中。
        HttpSession session = request.getSession();
        session.setAttribute("code", codeMap.get("code").toString());

        // 禁止图像缓存。
        response.setHeader("Pragma", "no-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", -1);

        response.setContentType("image/jpeg");

        // 将图像输出到Servlet输出流中。
        ServletOutputStream sos;
        try {
            sos = response.getOutputStream();
            ImageIO.write((RenderedImage) codeMap.get("codePic"), "jpeg", sos);
            sos.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * 按照条件查找数据
     * @param searchSelect
     * @param editbox_search
     * @return
     */
    @ResponseBody
    @RequestMapping("/searchSomething")
    public ModelAndView searchSomeThing(@RequestParam(value = "pn", defaultValue = "1") Integer pn, String searchSelect,
                                        String editbox_search, HttpServletRequest request) {
        ModelAndView modelAndView = null;
        HttpSession session = request.getSession();
        PageHelper.startPage(pn, 1);
        if(editbox_search != null) {
            session.setAttribute("editbox_search", editbox_search);
            List<Blog> blogList = blogService.selectAllBlogs(editbox_search);
            PageInfo<Blog> pageInfo = new PageInfo<>(blogList, 5);
            modelAndView = new ModelAndView("searchIndex", "pageInfo", pageInfo);
        } else {
            editbox_search = session.getAttribute("editbox_search").toString();
            List<Blog> blogList = blogService.selectAllBlogs(editbox_search);
            PageInfo<Blog> pageInfo = new PageInfo<>(blogList, 5);
            modelAndView = new ModelAndView("searchIndex", "pageInfo", pageInfo);
        }
        return modelAndView;
    }

}
