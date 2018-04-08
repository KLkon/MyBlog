package site.pers.kl.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import site.pers.kl.bean.Blog;
import site.pers.kl.bean.BlogExample;

public interface BlogMapper {
    long countByExample(BlogExample example);

    int deleteByExample(BlogExample example);

    int deleteByPrimaryKey(Integer blogId);

    int insert(Blog record);

    int insertSelective(Blog record);

    List<Blog> selectByExample(BlogExample example);

    //带博客类型
    List<Blog> selectByExampleWithBlogType(BlogExample example);

    //主键查询带博客
    Blog selectByPrimaryKeyWithBlogType(Integer blogId);

    Blog selectByPrimaryKey(Integer blogId);

    int updateByExampleSelective(@Param("record") Blog record, @Param("example") BlogExample example);

    int updateByExample(@Param("record") Blog record, @Param("example") BlogExample example);

    int updateByPrimaryKeySelective(Blog record);

    int updateByPrimaryKey(Blog record);
}