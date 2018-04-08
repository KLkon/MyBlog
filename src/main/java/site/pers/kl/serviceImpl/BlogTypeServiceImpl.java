package site.pers.kl.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import site.pers.kl.bean.BlogType;
import site.pers.kl.dao.BlogTypeMapper;
import site.pers.kl.service.BlogTypeService;

import java.util.ArrayList;
import java.util.List;

@Service
public class BlogTypeServiceImpl implements BlogTypeService {

    @Autowired
    private BlogTypeMapper blogTypeMapper;

    //获取所有博客类型
    @Override
    public List<BlogType> getAllBlogTypes() {
        return blogTypeMapper.selectByExample(null);
    }
}
