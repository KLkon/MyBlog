package site.pers.kl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import site.pers.kl.bean.BlogType;
import site.pers.kl.service.BlogTypeService;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/blogType")
public class BlogTypeController {

    @Autowired
    private BlogTypeService blogTypeService;

    @ResponseBody
    @RequestMapping("/types")
    public List<BlogType> getAllBlogTypes() {
        return  blogTypeService.getAllBlogTypes();
    }

}
