package site.pers.kl.bean;

import java.util.Date;

public class Blog {
    private Integer blogId;

    private String blogArticleTitle;

    private String blogAuthor;

    private Integer blogType;

    private String blogImage;

    private String blogContent;

    private Date blogSubmitDate;

    private Date date = new Date();

    //带博客类型
    private BlogType blogTypeInfo;

    public Blog() {
        this.blogSubmitDate = date;
    }

    public Blog(String blogArticleTitle, String blogAuthor, Integer blogType, String blogImage, String blogContent, Date blogSubmitDate, Date date) {
        this.blogArticleTitle = blogArticleTitle;
        this.blogAuthor = blogAuthor;
        this.blogType = blogType;
        this.blogImage = blogImage;
        this.blogContent = blogContent;
        this.blogSubmitDate = blogSubmitDate;
        this.date = date;
    }

    public BlogType getBlogTypeInfo() {
        return blogTypeInfo;
    }

    public void setBlogTypeInfo(BlogType blogTypeInfo) {
        this.blogTypeInfo = blogTypeInfo;
    }

    public Integer getBlogId() {
        return blogId;
    }

    public void setBlogId(Integer blogId) {
        this.blogId = blogId;
    }

    public String getBlogArticleTitle() {
        return blogArticleTitle;
    }

    public void setBlogArticleTitle(String blogArticleTitle) {
        this.blogArticleTitle = blogArticleTitle == null ? null : blogArticleTitle.trim();
    }

    public String getBlogAuthor() {
        return blogAuthor;
    }

    public void setBlogAuthor(String blogAuthor) {
        this.blogAuthor = blogAuthor == null ? null : blogAuthor.trim();
    }

    public Integer getBlogType() {
        return blogType;
    }

    public void setBlogType(Integer blogType) {
        this.blogType = blogType;
    }

    public String getBlogImage() {
        return blogImage;
    }

    public void setBlogImage(String blogImage) {
        this.blogImage = blogImage == null ? null : blogImage.trim();
    }

    public String getBlogContent() {
        return blogContent;
    }

    public void setBlogContent(String blogContent) {
        this.blogContent = blogContent == null ? null : blogContent.trim();
    }

    public Date getBlogSubmitDate() {
        return blogSubmitDate;
    }

    public void setBlogSubmitDate(Date blogSubmitDate) {
        this.blogSubmitDate = blogSubmitDate;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "blogId=" + blogId +
                ", blogArticleTitle='" + blogArticleTitle + '\'' +
                ", blogAuthor='" + blogAuthor + '\'' +
                ", blogType=" + blogType +
                ", blogImage='" + blogImage + '\'' +
                ", blogContent='" + blogContent + '\'' +
                ", blogSubmitDate=" + blogSubmitDate +
                ", date=" + date + '\'' +
                ", blogTypeInfo=" + blogTypeInfo +
                '}';
    }
}