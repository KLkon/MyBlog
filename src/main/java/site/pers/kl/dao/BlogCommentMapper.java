package site.pers.kl.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import site.pers.kl.bean.BlogComment;
import site.pers.kl.bean.BlogCommentExample;

public interface BlogCommentMapper {
    //评论博客主体的总个数（即不包括回复被人的）
    long countMainComment(Integer blogForeignId);

    long countByExample(BlogCommentExample example);

    int deleteByExample(BlogCommentExample example);

    int deleteByPrimaryKey(Integer blogCommentId);

    int insert(BlogComment record);

    int insertSelective(BlogComment record);

    List<BlogComment> selectByExample(BlogCommentExample example);

    BlogComment selectByPrimaryKey(Integer blogCommentId);

    int updateByExampleSelective(@Param("record") BlogComment record, @Param("example") BlogCommentExample example);

    int updateByExample(@Param("record") BlogComment record, @Param("example") BlogCommentExample example);

    int updateByPrimaryKeySelective(BlogComment record);

    int updateByPrimaryKey(BlogComment record);
}