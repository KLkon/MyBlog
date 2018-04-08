package site.pers.kl.bean;

public class BlogType {
    private Integer blogTypeId;

    private String blogTypeName;

    public Integer getBlogTypeId() {
        return blogTypeId;
    }

    public void setBlogTypeId(Integer blogTypeId) {
        this.blogTypeId = blogTypeId;
    }

    public String getBlogTypeName() {
        return blogTypeName;
    }

    public void setBlogTypeName(String blogTypeName) {
        this.blogTypeName = blogTypeName == null ? null : blogTypeName.trim();
    }

    @Override
    public String toString() {
        return "BlogType{" +
                "blogTypeId=" + blogTypeId +
                ", blogTypeName='" + blogTypeName + '\'' +
                '}';
    }
}