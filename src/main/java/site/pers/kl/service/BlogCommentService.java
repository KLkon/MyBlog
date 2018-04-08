package site.pers.kl.service;

import site.pers.kl.bean.BlogComment;

import java.util.List;

public interface BlogCommentService {
    ////评论博客主体的总个数（即不包括回复被人的）
    public long countMainComment(Integer blogForeignId);
    //通过博客 Id 获取所有评论
    public List<BlogComment> getAllBlogComments(Integer blogId);
    //增加评论
    public boolean addBlogComment(BlogComment blogComment);
}
