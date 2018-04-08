package site.pers.kl.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import site.pers.kl.bean.ContactPerson;
import site.pers.kl.bean.ContactPersonExample;

public interface ContactPersonMapper {
    long countByExample(ContactPersonExample example);

    int deleteByExample(ContactPersonExample example);

    int deleteByPrimaryKey(Integer pId);

    int insert(ContactPerson record);

    int insertSelective(ContactPerson record);

    List<ContactPerson> selectByExample(ContactPersonExample example);

    ContactPerson selectByPrimaryKey(Integer pId);

    int updateByExampleSelective(@Param("record") ContactPerson record, @Param("example") ContactPersonExample example);

    int updateByExample(@Param("record") ContactPerson record, @Param("example") ContactPersonExample example);

    int updateByPrimaryKeySelective(ContactPerson record);

    int updateByPrimaryKey(ContactPerson record);
}