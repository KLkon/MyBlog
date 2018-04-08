package site.pers.kl.service;

import site.pers.kl.bean.Blog;
import site.pers.kl.bean.BlogExample;

import java.util.List;

public interface BlogService {

    //增加博客
    public boolean addBlog(Blog blog);
    //根据博客 id 删除博客
    public boolean deleteBlog(int blogId);
    //根据博客条件查看搜寻指定博客, 若参数为空则查出所有博客
    public List<Blog> selectAllBlogs(String example);
    //根据 id 修改指定博客
    public boolean updateBlog(Blog blog);
    //主键查询博客
    public Blog selectBlogWithId(Integer blogId);
}
