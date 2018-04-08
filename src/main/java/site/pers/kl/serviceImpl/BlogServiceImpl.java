package site.pers.kl.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import site.pers.kl.bean.Blog;
import site.pers.kl.bean.BlogExample;
import site.pers.kl.dao.BlogMapper;
import site.pers.kl.service.BlogService;

import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogMapper blogMapper;

    /**
     * 主键获取带博客
     * @param blogId
     * @return
     */
    @Override
    public Blog selectBlogWithId(Integer blogId) {
        return blogMapper.selectByPrimaryKeyWithBlogType(blogId);
    }

    /**
     * 添加博客
     * @param blog
     * @return
     */
    @Override
    public boolean addBlog(Blog blog) {
        int result = blogMapper.insert(blog);
        if(result > 0) {
            return true;
        }
        return false;
    }

    /**
     * 删除指定博客
     * @param blogId
     * @return
     */
    @Override
    public boolean deleteBlog(int blogId) {
        int result = blogMapper.deleteByPrimaryKey(blogId);
        if(result > 0) {
            return true;
        }
        return false;
    }

    /**
     * 更新博客
     * @param blog
     * @return
     */
    @Override
    public boolean updateBlog(Blog blog) {
        int result = blogMapper.updateByPrimaryKey(blog);
        if(result >= 0) {
            return true;
        }
        return false;
    }

    /**
     * 查找出对应条件的博客
     * @param example
     * @return
     */
    @Override
    public List<Blog> selectAllBlogs(String example) {
        List<Blog> blogList = null;
        if(example != null) {
            BlogExample blogExample = new BlogExample();
            blogExample.or().andBlogArticleTitleLike(example);
            blogExample.or().andBlogAuthorLike(example);
            blogExample.or().andBlogContentLike(example);
            blogExample.or().andBlogImageLike(example);
            blogExample.or().andBlogTypeInfoLike(example);
            blogList = blogMapper.selectByExampleWithBlogType(blogExample);
            if(blogList != null) {
                return blogList;
            }
        } else {
            blogList = blogMapper.selectByExampleWithBlogType(null);
            return blogList;
        }
        return blogList;
    }
}
