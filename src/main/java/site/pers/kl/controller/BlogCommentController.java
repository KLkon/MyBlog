package site.pers.kl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import site.pers.kl.bean.BlogComment;
import site.pers.kl.bean.message.Message;
import site.pers.kl.service.BlogCommentService;

import java.util.List;

@Controller
public class BlogCommentController {

    @Autowired
    private BlogCommentService blogCommentService;

    /**
     * 评论博客主体的总个数（即不包括回复被人的）
     * @param blogForeignId
     * @return
     */
    @RequestMapping("/countMainComment")
    @ResponseBody
    public long countMainComment(Integer blogForeignId) {
        return blogCommentService.countMainComment(blogForeignId);
    }

    /**
     * 添加评论
     * @param blogComment
     * @return
     */
    @RequestMapping("/addComment")
    public String addComment(BlogComment blogComment) {
        if(blogComment != null) {
            if(!blogComment.getBlogCommentUsername().equals("")
                    && !blogComment.getBlogCommentContent().equals("")
                    && !blogComment.getBlogCommentTousername().equals("")) {
                blogCommentService.addBlogComment(blogComment);
            }
        }
        return "redirect:/getBlogComment?blogId=" + blogComment.getBlogForeignId();
    }

    /**
     * 获取所以评论
     * @param blogId
     * @return
     */
    @RequestMapping("/getAllComments")
    @ResponseBody
    public Message getAllBlogComments(Integer blogId) {
        List<BlogComment> blogCommentList = null;
        Message message = new Message();
        blogCommentList = blogCommentService.getAllBlogComments(blogId);
        message.add("blogComments", blogCommentList);
        return  message;
    }

}
