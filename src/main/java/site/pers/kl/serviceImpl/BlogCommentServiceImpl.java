package site.pers.kl.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import site.pers.kl.bean.BlogComment;
import site.pers.kl.bean.BlogCommentExample;
import site.pers.kl.dao.BlogCommentMapper;
import site.pers.kl.service.BlogCommentService;

import java.util.List;

@Service
public class BlogCommentServiceImpl implements BlogCommentService{
    @Autowired
    private BlogCommentMapper blogCommentMapper;

    /**
     * 评论博客主体的总个数（即不包括回复被人的）
     * @param blogForeignId
     * @return
     */
    @Override
    public long countMainComment(Integer blogForeignId) {
        return blogCommentMapper.countMainComment(blogForeignId);
    }

    /**
     * 添加博客评论
     * @param blogComment
     * @return
     */
    @Override
    public boolean addBlogComment(BlogComment blogComment) {
        int res = 0;
        if(blogComment != null) {
            res = blogCommentMapper.insert(blogComment);
        }
        return res > 0 ? true : false;
    }

    /**
     * 根据博客 ID 找出所有评论
     * @param blogId
     * @return
     */
    @Override
    public List<BlogComment> getAllBlogComments(Integer blogId) {
        List<BlogComment> blogCommentList = null;
        BlogCommentExample example = new BlogCommentExample();
        example.or().andBlogForeignIdEqualTo(blogId);
        blogCommentList = blogCommentMapper.selectByExample(example);
        if(blogCommentList != null) {
            return blogCommentList;
        }
        return null;
    }
}
