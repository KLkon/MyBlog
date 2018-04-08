package site.pers.kl.bean;

import java.util.Date;

public class BlogComment {
    private Integer blogCommentId;

    private String blogCommentUsername;

    private String blogCommentContent;

    private Integer blogForeignId;

    private String blogCommentTousername;

    private Date blogCommentDate = new Date();

    private Integer blogForeignCommentid;

    public Integer getBlogCommentId() {
        return blogCommentId;
    }

    public void setBlogCommentId(Integer blogCommentId) {
        this.blogCommentId = blogCommentId;
    }

    public String getBlogCommentUsername() {
        return blogCommentUsername;
    }

    public void setBlogCommentUsername(String blogCommentUsername) {
        this.blogCommentUsername = blogCommentUsername == null ? null : blogCommentUsername.trim();
    }

    public String getBlogCommentContent() {
        return blogCommentContent;
    }

    public void setBlogCommentContent(String blogCommentContent) {
        this.blogCommentContent = blogCommentContent == null ? null : blogCommentContent.trim();
    }

    public Integer getBlogForeignId() {
        return blogForeignId;
    }

    public void setBlogForeignId(Integer blogForeignId) {
        this.blogForeignId = blogForeignId;
    }

    public String getBlogCommentTousername() {
        return blogCommentTousername;
    }

    public void setBlogCommentTousername(String blogCommentTousername) {
        this.blogCommentTousername = blogCommentTousername == null ? null : blogCommentTousername.trim();
    }

    public Date getBlogCommentDate() {
        return blogCommentDate;
    }

    public void setBlogCommentDate(Date blogCommentDate) {
        this.blogCommentDate = blogCommentDate;
    }

    public Integer getBlogForeignCommentid() {
        return blogForeignCommentid;
    }

    public void setBlogForeignCommentid(Integer blogForeignCommentid) {
        this.blogForeignCommentid = blogForeignCommentid;
    }
}