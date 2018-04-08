package site.pers.kl.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import site.pers.kl.bean.Blog;
import site.pers.kl.bean.BlogType;
import site.pers.kl.constant.BlogConstant;
import site.pers.kl.dao.BlogMapper;
import site.pers.kl.dao.BlogTypeMapper;
import site.pers.kl.util.EmailUtil;

import javax.servlet.http.HttpServletRequest;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

@RunWith(value = SpringJUnit4ClassRunner.class) //指定测试用例的运行器 这里是指定了Junit4
@ContextConfiguration(locations = "classpath:applicationContext.xml")//装配Spring
public class MyTest {

    @Autowired
    private BlogMapper blogMapper;

    @Autowired
    private BlogTypeMapper blogType;

    @Test
    public void testMial() {
        String flag = EmailUtil.sendMessageToMail("今天有空么", "kl", "changcheng@qq.com");
        System.out.println(flag + "---------------------");
    }

    @Test
    public void errorTest() {
        System.out.println("--------------------------------------");
        System.err.println(2>1);
    }

    @Test
    public void testDate() {
        DateFormat df = new SimpleDateFormat("MMM", Locale.ENGLISH);

        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        System.out.println("---------------------------");
        System.out.println(calendar.getWeekYear());
        System.out.println(df.format(new Date()));

    }

    @Test
    public void testPath(){
    String path = this.getClass().getResource("/").getPath();
    path = path.substring(1, path.indexOf("/target/class"));
        String osName = System.getProperties().getProperty("os.name");
        System.out.println("------------------------------------");
        System.out.println(path);
        System.out.println(osName);
        System.out.println(osName.contains("Window"));
    }

    @Test
    public void testBlog() {
        Blog blog = blogMapper.selectByPrimaryKey(1);
        //boolean blog = blogMapper.countByExample(null) == 0;
        System.out.println("---------------------------------");
        System.out.println(blog);
    }

    @Test
    public void testBlogType() {
        List<BlogType> blogTypeList = blogType.selectByExample(null);
        for (BlogType blogType : blogTypeList) {
            System.out.println("----------------------------------");
            System.out.println(blogType);
        }
    }

}
