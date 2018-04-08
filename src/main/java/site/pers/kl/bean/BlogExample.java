package site.pers.kl.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BlogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    @Override
    public String toString() {
        return "BlogExample{" +
                "orderByClause='" + orderByClause + '\'' +
                ", distinct=" + distinct +
                ", oredCriteria=" + oredCriteria.toString() +
                '}';
    }

    public BlogExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andBlogIdIsNull() {
            addCriterion("blog_id is null");
            return (Criteria) this;
        }

        public Criteria andBlogIdIsNotNull() {
            addCriterion("blog_id is not null");
            return (Criteria) this;
        }

        public Criteria andBlogIdEqualTo(Integer value) {
            addCriterion("blog_id =", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdNotEqualTo(Integer value) {
            addCriterion("blog_id <>", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdGreaterThan(Integer value) {
            addCriterion("blog_id >", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("blog_id >=", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdLessThan(Integer value) {
            addCriterion("blog_id <", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdLessThanOrEqualTo(Integer value) {
            addCriterion("blog_id <=", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdIn(List<Integer> values) {
            addCriterion("blog_id in", values, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdNotIn(List<Integer> values) {
            addCriterion("blog_id not in", values, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdBetween(Integer value1, Integer value2) {
            addCriterion("blog_id between", value1, value2, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdNotBetween(Integer value1, Integer value2) {
            addCriterion("blog_id not between", value1, value2, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogArticleTitleIsNull() {
            addCriterion("blog_article_title is null");
            return (Criteria) this;
        }

        public Criteria andBlogArticleTitleIsNotNull() {
            addCriterion("blog_article_title is not null");
            return (Criteria) this;
        }

        public Criteria andBlogArticleTitleEqualTo(String value) {
            addCriterion("blog_article_title =", value, "blogArticleTitle");
            return (Criteria) this;
        }

        public Criteria andBlogArticleTitleNotEqualTo(String value) {
            addCriterion("blog_article_title <>", value, "blogArticleTitle");
            return (Criteria) this;
        }

        public Criteria andBlogArticleTitleGreaterThan(String value) {
            addCriterion("blog_article_title >", value, "blogArticleTitle");
            return (Criteria) this;
        }

        public Criteria andBlogArticleTitleGreaterThanOrEqualTo(String value) {
            addCriterion("blog_article_title >=", value, "blogArticleTitle");
            return (Criteria) this;
        }

        public Criteria andBlogArticleTitleLessThan(String value) {
            addCriterion("blog_article_title <", value, "blogArticleTitle");
            return (Criteria) this;
        }

        public Criteria andBlogArticleTitleLessThanOrEqualTo(String value) {
            addCriterion("blog_article_title <=", value, "blogArticleTitle");
            return (Criteria) this;
        }

        public Criteria andBlogArticleTitleLike(String value) {
            addCriterion("blog_article_title like", value, "blogArticleTitle");
            return (Criteria) this;
        }

        public Criteria andBlogArticleTitleNotLike(String value) {
            addCriterion("blog_article_title not like", value, "blogArticleTitle");
            return (Criteria) this;
        }

        public Criteria andBlogArticleTitleIn(List<String> values) {
            addCriterion("blog_article_title in", values, "blogArticleTitle");
            return (Criteria) this;
        }

        public Criteria andBlogArticleTitleNotIn(List<String> values) {
            addCriterion("blog_article_title not in", values, "blogArticleTitle");
            return (Criteria) this;
        }

        public Criteria andBlogArticleTitleBetween(String value1, String value2) {
            addCriterion("blog_article_title between", value1, value2, "blogArticleTitle");
            return (Criteria) this;
        }

        public Criteria andBlogArticleTitleNotBetween(String value1, String value2) {
            addCriterion("blog_article_title not between", value1, value2, "blogArticleTitle");
            return (Criteria) this;
        }

        public Criteria andBlogAuthorIsNull() {
            addCriterion("blog_author is null");
            return (Criteria) this;
        }

        public Criteria andBlogAuthorIsNotNull() {
            addCriterion("blog_author is not null");
            return (Criteria) this;
        }

        public Criteria andBlogAuthorEqualTo(String value) {
            addCriterion("blog_author =", value, "blogAuthor");
            return (Criteria) this;
        }

        public Criteria andBlogAuthorNotEqualTo(String value) {
            addCriterion("blog_author <>", value, "blogAuthor");
            return (Criteria) this;
        }

        public Criteria andBlogAuthorGreaterThan(String value) {
            addCriterion("blog_author >", value, "blogAuthor");
            return (Criteria) this;
        }

        public Criteria andBlogAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("blog_author >=", value, "blogAuthor");
            return (Criteria) this;
        }

        public Criteria andBlogAuthorLessThan(String value) {
            addCriterion("blog_author <", value, "blogAuthor");
            return (Criteria) this;
        }

        public Criteria andBlogAuthorLessThanOrEqualTo(String value) {
            addCriterion("blog_author <=", value, "blogAuthor");
            return (Criteria) this;
        }

        public Criteria andBlogAuthorLike(String value) {
            addCriterion("blog_author like", value, "blogAuthor");
            return (Criteria) this;
        }

        public Criteria andBlogAuthorNotLike(String value) {
            addCriterion("blog_author not like", value, "blogAuthor");
            return (Criteria) this;
        }

        public Criteria andBlogAuthorIn(List<String> values) {
            addCriterion("blog_author in", values, "blogAuthor");
            return (Criteria) this;
        }

        public Criteria andBlogAuthorNotIn(List<String> values) {
            addCriterion("blog_author not in", values, "blogAuthor");
            return (Criteria) this;
        }

        public Criteria andBlogAuthorBetween(String value1, String value2) {
            addCriterion("blog_author between", value1, value2, "blogAuthor");
            return (Criteria) this;
        }

        public Criteria andBlogAuthorNotBetween(String value1, String value2) {
            addCriterion("blog_author not between", value1, value2, "blogAuthor");
            return (Criteria) this;
        }

        public Criteria andBlogTypeIsNull() {
            addCriterion("blog_type is null");
            return (Criteria) this;
        }

        public Criteria andBlogTypeIsNotNull() {
            addCriterion("blog_type is not null");
            return (Criteria) this;
        }

        public Criteria andBlogTypeEqualTo(Integer value) {
            addCriterion("blog_type =", value, "blogType");
            return (Criteria) this;
        }

        public Criteria andBlogTypeNotEqualTo(Integer value) {
            addCriterion("blog_type <>", value, "blogType");
            return (Criteria) this;
        }

        public Criteria andBlogTypeGreaterThan(Integer value) {
            addCriterion("blog_type >", value, "blogType");
            return (Criteria) this;
        }

        public Criteria andBlogTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("blog_type >=", value, "blogType");
            return (Criteria) this;
        }

        public Criteria andBlogTypeLessThan(Integer value) {
            addCriterion("blog_type <", value, "blogType");
            return (Criteria) this;
        }

        public Criteria andBlogTypeLessThanOrEqualTo(Integer value) {
            addCriterion("blog_type <=", value, "blogType");
            return (Criteria) this;
        }

        public Criteria andBlogTypeIn(List<Integer> values) {
            addCriterion("blog_type in", values, "blogType");
            return (Criteria) this;
        }

        public Criteria andBlogTypeNotIn(List<Integer> values) {
            addCriterion("blog_type not in", values, "blogType");
            return (Criteria) this;
        }

        public Criteria andBlogTypeBetween(Integer value1, Integer value2) {
            addCriterion("blog_type between", value1, value2, "blogType");
            return (Criteria) this;
        }

        public Criteria andBlogTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("blog_type not between", value1, value2, "blogType");
            return (Criteria) this;
        }
//-----------------------------------------------------------------------
        //BlogTypeInfo
        public Criteria andBlogTypeInfo() {
            addCriterion("t.blog_type_info is null");
            return (Criteria) this;
        }

        public Criteria andBlogTypeInfoIsNotNull() {
            addCriterion("t.blog_type_info is not null");
            return (Criteria) this;
        }

        public Criteria andBlogTypeInfoEqualTo(String value) {
            addCriterion("t.blog_tyoe_info =", value, "blogTypeInfo");
            return (Criteria) this;
        }

        public Criteria andBlogTypeInfoNotEqualTo(String value) {
            addCriterion("t.blog_type_info <>", value, "blogTypeInfo");
            return (Criteria) this;
        }

        public Criteria andBlogTypeInfoGreaterThan(String value) {
            addCriterion("t.blog_type_info >", value, "blogTypeInfo");
            return (Criteria) this;
        }

        public Criteria andBlogTypeInfoGreaterThanOrEqualTo(String value) {
            addCriterion("t.blog_type_info >=", value, "blogTypeInfo");
            return (Criteria) this;
        }

        public Criteria andBlogTypeInfoLessThan(String value) {
            addCriterion("t.blog_type_info <", value, "blogTypeInfo");
            return (Criteria) this;
        }

        public Criteria andBlogTypeInfoLessThanOrEqualTo(String value) {
            addCriterion("t.blog_type_info <=", value, "blogTypeInfo");
            return (Criteria) this;
        }

        public Criteria andBlogTypeInfoLike(String value) {
            addCriterion("t.blog_type_name like", value, "blogTypeInfo");
            return (Criteria) this;
        }

        public Criteria andBlogTypeInfoNotLike(String value) {
            addCriterion("t.blog_type_info not like", value, "blogTypeInfo");
            return (Criteria) this;
        }

        public Criteria andBlogTypeInfoIn(List<String> values) {
            addCriterion("t.blog_type_info in", values, "blogTypeInfo");
            return (Criteria) this;
        }

        public Criteria andBlogTypeInfoNotIn(List<String> values) {
            addCriterion("t.blog_type_info not in", values, "blogTypeInfo");
            return (Criteria) this;
        }

        public Criteria andBlogTypeInfoBetween(String value1, String value2) {
            addCriterion("t.blog_type_info between", value1, value2, "blogTypeInfo");
            return (Criteria) this;
        }

        public Criteria andBlogTypeInfoNotBetween(String value1, String value2) {
            addCriterion("t.blog_type_info not between", value1, value2, "blogTypeInfo");
            return (Criteria) this;
        }
        //------------------------------------------------------------------
        public Criteria andBlogImageIsNull() {
            addCriterion("blog_image is null");
            return (Criteria) this;
        }

        public Criteria andBlogImageIsNotNull() {
            addCriterion("blog_image is not null");
            return (Criteria) this;
        }

        public Criteria andBlogImageEqualTo(String value) {
            addCriterion("blog_image =", value, "blogImage");
            return (Criteria) this;
        }

        public Criteria andBlogImageNotEqualTo(String value) {
            addCriterion("blog_image <>", value, "blogImage");
            return (Criteria) this;
        }

        public Criteria andBlogImageGreaterThan(String value) {
            addCriterion("blog_image >", value, "blogImage");
            return (Criteria) this;
        }

        public Criteria andBlogImageGreaterThanOrEqualTo(String value) {
            addCriterion("blog_image >=", value, "blogImage");
            return (Criteria) this;
        }

        public Criteria andBlogImageLessThan(String value) {
            addCriterion("blog_image <", value, "blogImage");
            return (Criteria) this;
        }

        public Criteria andBlogImageLessThanOrEqualTo(String value) {
            addCriterion("blog_image <=", value, "blogImage");
            return (Criteria) this;
        }

        public Criteria andBlogImageLike(String value) {
            addCriterion("blog_image like", value, "blogImage");
            return (Criteria) this;
        }

        public Criteria andBlogImageNotLike(String value) {
            addCriterion("blog_image not like", value, "blogImage");
            return (Criteria) this;
        }

        public Criteria andBlogImageIn(List<String> values) {
            addCriterion("blog_image in", values, "blogImage");
            return (Criteria) this;
        }

        public Criteria andBlogImageNotIn(List<String> values) {
            addCriterion("blog_image not in", values, "blogImage");
            return (Criteria) this;
        }

        public Criteria andBlogImageBetween(String value1, String value2) {
            addCriterion("blog_image between", value1, value2, "blogImage");
            return (Criteria) this;
        }

        public Criteria andBlogImageNotBetween(String value1, String value2) {
            addCriterion("blog_image not between", value1, value2, "blogImage");
            return (Criteria) this;
        }

        public Criteria andBlogContentIsNull() {
            addCriterion("blog_content is null");
            return (Criteria) this;
        }

        public Criteria andBlogContentIsNotNull() {
            addCriterion("blog_content is not null");
            return (Criteria) this;
        }

        public Criteria andBlogContentEqualTo(String value) {
            addCriterion("blog_content =", value, "blogContent");
            return (Criteria) this;
        }

        public Criteria andBlogContentNotEqualTo(String value) {
            addCriterion("blog_content <>", value, "blogContent");
            return (Criteria) this;
        }

        public Criteria andBlogContentGreaterThan(String value) {
            addCriterion("blog_content >", value, "blogContent");
            return (Criteria) this;
        }

        public Criteria andBlogContentGreaterThanOrEqualTo(String value) {
            addCriterion("blog_content >=", value, "blogContent");
            return (Criteria) this;
        }

        public Criteria andBlogContentLessThan(String value) {
            addCriterion("blog_content <", value, "blogContent");
            return (Criteria) this;
        }

        public Criteria andBlogContentLessThanOrEqualTo(String value) {
            addCriterion("blog_content <=", value, "blogContent");
            return (Criteria) this;
        }

        public Criteria andBlogContentLike(String value) {
            addCriterion("blog_content like", value, "blogContent");
            return (Criteria) this;
        }

        public Criteria andBlogContentNotLike(String value) {
            addCriterion("blog_content not like", value, "blogContent");
            return (Criteria) this;
        }

        public Criteria andBlogContentIn(List<String> values) {
            addCriterion("blog_content in", values, "blogContent");
            return (Criteria) this;
        }

        public Criteria andBlogContentNotIn(List<String> values) {
            addCriterion("blog_content not in", values, "blogContent");
            return (Criteria) this;
        }

        public Criteria andBlogContentBetween(String value1, String value2) {
            addCriterion("blog_content between", value1, value2, "blogContent");
            return (Criteria) this;
        }

        public Criteria andBlogContentNotBetween(String value1, String value2) {
            addCriterion("blog_content not between", value1, value2, "blogContent");
            return (Criteria) this;
        }

        public Criteria andBlogSubmitDateIsNull() {
            addCriterion("blog_submit_date is null");
            return (Criteria) this;
        }

        public Criteria andBlogSubmitDateIsNotNull() {
            addCriterion("blog_submit_date is not null");
            return (Criteria) this;
        }

        public Criteria andBlogSubmitDateEqualTo(Date value) {
            addCriterion("blog_submit_date =", value, "blogSubmitDate");
            return (Criteria) this;
        }

        public Criteria andBlogSubmitDateNotEqualTo(Date value) {
            addCriterion("blog_submit_date <>", value, "blogSubmitDate");
            return (Criteria) this;
        }

        public Criteria andBlogSubmitDateGreaterThan(Date value) {
            addCriterion("blog_submit_date >", value, "blogSubmitDate");
            return (Criteria) this;
        }

        public Criteria andBlogSubmitDateGreaterThanOrEqualTo(Date value) {
            addCriterion("blog_submit_date >=", value, "blogSubmitDate");
            return (Criteria) this;
        }

        public Criteria andBlogSubmitDateLessThan(Date value) {
            addCriterion("blog_submit_date <", value, "blogSubmitDate");
            return (Criteria) this;
        }

        public Criteria andBlogSubmitDateLessThanOrEqualTo(Date value) {
            addCriterion("blog_submit_date <=", value, "blogSubmitDate");
            return (Criteria) this;
        }

        public Criteria andBlogSubmitDateIn(List<Date> values) {
            addCriterion("blog_submit_date in", values, "blogSubmitDate");
            return (Criteria) this;
        }

        public Criteria andBlogSubmitDateNotIn(List<Date> values) {
            addCriterion("blog_submit_date not in", values, "blogSubmitDate");
            return (Criteria) this;
        }

        public Criteria andBlogSubmitDateBetween(Date value1, Date value2) {
            addCriterion("blog_submit_date between", value1, value2, "blogSubmitDate");
            return (Criteria) this;
        }

        public Criteria andBlogSubmitDateNotBetween(Date value1, Date value2) {
            addCriterion("blog_submit_date not between", value1, value2, "blogSubmitDate");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}