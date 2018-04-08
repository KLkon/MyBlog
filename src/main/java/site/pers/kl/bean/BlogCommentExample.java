package site.pers.kl.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BlogCommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BlogCommentExample() {
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

        public Criteria andBlogCommentIdIsNull() {
            addCriterion("blog_comment_id is null");
            return (Criteria) this;
        }

        public Criteria andBlogCommentIdIsNotNull() {
            addCriterion("blog_comment_id is not null");
            return (Criteria) this;
        }

        public Criteria andBlogCommentIdEqualTo(Integer value) {
            addCriterion("blog_comment_id =", value, "blogCommentId");
            return (Criteria) this;
        }

        public Criteria andBlogCommentIdNotEqualTo(Integer value) {
            addCriterion("blog_comment_id <>", value, "blogCommentId");
            return (Criteria) this;
        }

        public Criteria andBlogCommentIdGreaterThan(Integer value) {
            addCriterion("blog_comment_id >", value, "blogCommentId");
            return (Criteria) this;
        }

        public Criteria andBlogCommentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("blog_comment_id >=", value, "blogCommentId");
            return (Criteria) this;
        }

        public Criteria andBlogCommentIdLessThan(Integer value) {
            addCriterion("blog_comment_id <", value, "blogCommentId");
            return (Criteria) this;
        }

        public Criteria andBlogCommentIdLessThanOrEqualTo(Integer value) {
            addCriterion("blog_comment_id <=", value, "blogCommentId");
            return (Criteria) this;
        }

        public Criteria andBlogCommentIdIn(List<Integer> values) {
            addCriterion("blog_comment_id in", values, "blogCommentId");
            return (Criteria) this;
        }

        public Criteria andBlogCommentIdNotIn(List<Integer> values) {
            addCriterion("blog_comment_id not in", values, "blogCommentId");
            return (Criteria) this;
        }

        public Criteria andBlogCommentIdBetween(Integer value1, Integer value2) {
            addCriterion("blog_comment_id between", value1, value2, "blogCommentId");
            return (Criteria) this;
        }

        public Criteria andBlogCommentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("blog_comment_id not between", value1, value2, "blogCommentId");
            return (Criteria) this;
        }

        public Criteria andBlogCommentUsernameIsNull() {
            addCriterion("blog_comment_username is null");
            return (Criteria) this;
        }

        public Criteria andBlogCommentUsernameIsNotNull() {
            addCriterion("blog_comment_username is not null");
            return (Criteria) this;
        }

        public Criteria andBlogCommentUsernameEqualTo(String value) {
            addCriterion("blog_comment_username =", value, "blogCommentUsername");
            return (Criteria) this;
        }

        public Criteria andBlogCommentUsernameNotEqualTo(String value) {
            addCriterion("blog_comment_username <>", value, "blogCommentUsername");
            return (Criteria) this;
        }

        public Criteria andBlogCommentUsernameGreaterThan(String value) {
            addCriterion("blog_comment_username >", value, "blogCommentUsername");
            return (Criteria) this;
        }

        public Criteria andBlogCommentUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("blog_comment_username >=", value, "blogCommentUsername");
            return (Criteria) this;
        }

        public Criteria andBlogCommentUsernameLessThan(String value) {
            addCriterion("blog_comment_username <", value, "blogCommentUsername");
            return (Criteria) this;
        }

        public Criteria andBlogCommentUsernameLessThanOrEqualTo(String value) {
            addCriterion("blog_comment_username <=", value, "blogCommentUsername");
            return (Criteria) this;
        }

        public Criteria andBlogCommentUsernameLike(String value) {
            addCriterion("blog_comment_username like", value, "blogCommentUsername");
            return (Criteria) this;
        }

        public Criteria andBlogCommentUsernameNotLike(String value) {
            addCriterion("blog_comment_username not like", value, "blogCommentUsername");
            return (Criteria) this;
        }

        public Criteria andBlogCommentUsernameIn(List<String> values) {
            addCriterion("blog_comment_username in", values, "blogCommentUsername");
            return (Criteria) this;
        }

        public Criteria andBlogCommentUsernameNotIn(List<String> values) {
            addCriterion("blog_comment_username not in", values, "blogCommentUsername");
            return (Criteria) this;
        }

        public Criteria andBlogCommentUsernameBetween(String value1, String value2) {
            addCriterion("blog_comment_username between", value1, value2, "blogCommentUsername");
            return (Criteria) this;
        }

        public Criteria andBlogCommentUsernameNotBetween(String value1, String value2) {
            addCriterion("blog_comment_username not between", value1, value2, "blogCommentUsername");
            return (Criteria) this;
        }

        public Criteria andBlogCommentContentIsNull() {
            addCriterion("blog_comment_content is null");
            return (Criteria) this;
        }

        public Criteria andBlogCommentContentIsNotNull() {
            addCriterion("blog_comment_content is not null");
            return (Criteria) this;
        }

        public Criteria andBlogCommentContentEqualTo(String value) {
            addCriterion("blog_comment_content =", value, "blogCommentContent");
            return (Criteria) this;
        }

        public Criteria andBlogCommentContentNotEqualTo(String value) {
            addCriterion("blog_comment_content <>", value, "blogCommentContent");
            return (Criteria) this;
        }

        public Criteria andBlogCommentContentGreaterThan(String value) {
            addCriterion("blog_comment_content >", value, "blogCommentContent");
            return (Criteria) this;
        }

        public Criteria andBlogCommentContentGreaterThanOrEqualTo(String value) {
            addCriterion("blog_comment_content >=", value, "blogCommentContent");
            return (Criteria) this;
        }

        public Criteria andBlogCommentContentLessThan(String value) {
            addCriterion("blog_comment_content <", value, "blogCommentContent");
            return (Criteria) this;
        }

        public Criteria andBlogCommentContentLessThanOrEqualTo(String value) {
            addCriterion("blog_comment_content <=", value, "blogCommentContent");
            return (Criteria) this;
        }

        public Criteria andBlogCommentContentLike(String value) {
            addCriterion("blog_comment_content like", value, "blogCommentContent");
            return (Criteria) this;
        }

        public Criteria andBlogCommentContentNotLike(String value) {
            addCriterion("blog_comment_content not like", value, "blogCommentContent");
            return (Criteria) this;
        }

        public Criteria andBlogCommentContentIn(List<String> values) {
            addCriterion("blog_comment_content in", values, "blogCommentContent");
            return (Criteria) this;
        }

        public Criteria andBlogCommentContentNotIn(List<String> values) {
            addCriterion("blog_comment_content not in", values, "blogCommentContent");
            return (Criteria) this;
        }

        public Criteria andBlogCommentContentBetween(String value1, String value2) {
            addCriterion("blog_comment_content between", value1, value2, "blogCommentContent");
            return (Criteria) this;
        }

        public Criteria andBlogCommentContentNotBetween(String value1, String value2) {
            addCriterion("blog_comment_content not between", value1, value2, "blogCommentContent");
            return (Criteria) this;
        }

        public Criteria andBlogForeignIdIsNull() {
            addCriterion("blog_foreign_id is null");
            return (Criteria) this;
        }

        public Criteria andBlogForeignIdIsNotNull() {
            addCriterion("blog_foreign_id is not null");
            return (Criteria) this;
        }

        public Criteria andBlogForeignIdEqualTo(Integer value) {
            addCriterion("blog_foreign_id =", value, "blogForeignId");
            return (Criteria) this;
        }

        public Criteria andBlogForeignIdNotEqualTo(Integer value) {
            addCriterion("blog_foreign_id <>", value, "blogForeignId");
            return (Criteria) this;
        }

        public Criteria andBlogForeignIdGreaterThan(Integer value) {
            addCriterion("blog_foreign_id >", value, "blogForeignId");
            return (Criteria) this;
        }

        public Criteria andBlogForeignIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("blog_foreign_id >=", value, "blogForeignId");
            return (Criteria) this;
        }

        public Criteria andBlogForeignIdLessThan(Integer value) {
            addCriterion("blog_foreign_id <", value, "blogForeignId");
            return (Criteria) this;
        }

        public Criteria andBlogForeignIdLessThanOrEqualTo(Integer value) {
            addCriterion("blog_foreign_id <=", value, "blogForeignId");
            return (Criteria) this;
        }

        public Criteria andBlogForeignIdIn(List<Integer> values) {
            addCriterion("blog_foreign_id in", values, "blogForeignId");
            return (Criteria) this;
        }

        public Criteria andBlogForeignIdNotIn(List<Integer> values) {
            addCriterion("blog_foreign_id not in", values, "blogForeignId");
            return (Criteria) this;
        }

        public Criteria andBlogForeignIdBetween(Integer value1, Integer value2) {
            addCriterion("blog_foreign_id between", value1, value2, "blogForeignId");
            return (Criteria) this;
        }

        public Criteria andBlogForeignIdNotBetween(Integer value1, Integer value2) {
            addCriterion("blog_foreign_id not between", value1, value2, "blogForeignId");
            return (Criteria) this;
        }

        public Criteria andBlogCommentTousernameIsNull() {
            addCriterion("blog_comment_tousername is null");
            return (Criteria) this;
        }

        public Criteria andBlogCommentTousernameIsNotNull() {
            addCriterion("blog_comment_tousername is not null");
            return (Criteria) this;
        }

        public Criteria andBlogCommentTousernameEqualTo(String value) {
            addCriterion("blog_comment_tousername =", value, "blogCommentTousername");
            return (Criteria) this;
        }

        public Criteria andBlogCommentTousernameNotEqualTo(String value) {
            addCriterion("blog_comment_tousername <>", value, "blogCommentTousername");
            return (Criteria) this;
        }

        public Criteria andBlogCommentTousernameGreaterThan(String value) {
            addCriterion("blog_comment_tousername >", value, "blogCommentTousername");
            return (Criteria) this;
        }

        public Criteria andBlogCommentTousernameGreaterThanOrEqualTo(String value) {
            addCriterion("blog_comment_tousername >=", value, "blogCommentTousername");
            return (Criteria) this;
        }

        public Criteria andBlogCommentTousernameLessThan(String value) {
            addCriterion("blog_comment_tousername <", value, "blogCommentTousername");
            return (Criteria) this;
        }

        public Criteria andBlogCommentTousernameLessThanOrEqualTo(String value) {
            addCriterion("blog_comment_tousername <=", value, "blogCommentTousername");
            return (Criteria) this;
        }

        public Criteria andBlogCommentTousernameLike(String value) {
            addCriterion("blog_comment_tousername like", value, "blogCommentTousername");
            return (Criteria) this;
        }

        public Criteria andBlogCommentTousernameNotLike(String value) {
            addCriterion("blog_comment_tousername not like", value, "blogCommentTousername");
            return (Criteria) this;
        }

        public Criteria andBlogCommentTousernameIn(List<String> values) {
            addCriterion("blog_comment_tousername in", values, "blogCommentTousername");
            return (Criteria) this;
        }

        public Criteria andBlogCommentTousernameNotIn(List<String> values) {
            addCriterion("blog_comment_tousername not in", values, "blogCommentTousername");
            return (Criteria) this;
        }

        public Criteria andBlogCommentTousernameBetween(String value1, String value2) {
            addCriterion("blog_comment_tousername between", value1, value2, "blogCommentTousername");
            return (Criteria) this;
        }

        public Criteria andBlogCommentTousernameNotBetween(String value1, String value2) {
            addCriterion("blog_comment_tousername not between", value1, value2, "blogCommentTousername");
            return (Criteria) this;
        }

        public Criteria andBlogCommentDateIsNull() {
            addCriterion("blog_comment_date is null");
            return (Criteria) this;
        }

        public Criteria andBlogCommentDateIsNotNull() {
            addCriterion("blog_comment_date is not null");
            return (Criteria) this;
        }

        public Criteria andBlogCommentDateEqualTo(Date value) {
            addCriterion("blog_comment_date =", value, "blogCommentDate");
            return (Criteria) this;
        }

        public Criteria andBlogCommentDateNotEqualTo(Date value) {
            addCriterion("blog_comment_date <>", value, "blogCommentDate");
            return (Criteria) this;
        }

        public Criteria andBlogCommentDateGreaterThan(Date value) {
            addCriterion("blog_comment_date >", value, "blogCommentDate");
            return (Criteria) this;
        }

        public Criteria andBlogCommentDateGreaterThanOrEqualTo(Date value) {
            addCriterion("blog_comment_date >=", value, "blogCommentDate");
            return (Criteria) this;
        }

        public Criteria andBlogCommentDateLessThan(Date value) {
            addCriterion("blog_comment_date <", value, "blogCommentDate");
            return (Criteria) this;
        }

        public Criteria andBlogCommentDateLessThanOrEqualTo(Date value) {
            addCriterion("blog_comment_date <=", value, "blogCommentDate");
            return (Criteria) this;
        }

        public Criteria andBlogCommentDateIn(List<Date> values) {
            addCriterion("blog_comment_date in", values, "blogCommentDate");
            return (Criteria) this;
        }

        public Criteria andBlogCommentDateNotIn(List<Date> values) {
            addCriterion("blog_comment_date not in", values, "blogCommentDate");
            return (Criteria) this;
        }

        public Criteria andBlogCommentDateBetween(Date value1, Date value2) {
            addCriterion("blog_comment_date between", value1, value2, "blogCommentDate");
            return (Criteria) this;
        }

        public Criteria andBlogCommentDateNotBetween(Date value1, Date value2) {
            addCriterion("blog_comment_date not between", value1, value2, "blogCommentDate");
            return (Criteria) this;
        }

        public Criteria andBlogForeignCommentidIsNull() {
            addCriterion("blog_foreign_commentid is null");
            return (Criteria) this;
        }

        public Criteria andBlogForeignCommentidIsNotNull() {
            addCriterion("blog_foreign_commentid is not null");
            return (Criteria) this;
        }

        public Criteria andBlogForeignCommentidEqualTo(Integer value) {
            addCriterion("blog_foreign_commentid =", value, "blogForeignCommentid");
            return (Criteria) this;
        }

        public Criteria andBlogForeignCommentidNotEqualTo(Integer value) {
            addCriterion("blog_foreign_commentid <>", value, "blogForeignCommentid");
            return (Criteria) this;
        }

        public Criteria andBlogForeignCommentidGreaterThan(Integer value) {
            addCriterion("blog_foreign_commentid >", value, "blogForeignCommentid");
            return (Criteria) this;
        }

        public Criteria andBlogForeignCommentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("blog_foreign_commentid >=", value, "blogForeignCommentid");
            return (Criteria) this;
        }

        public Criteria andBlogForeignCommentidLessThan(Integer value) {
            addCriterion("blog_foreign_commentid <", value, "blogForeignCommentid");
            return (Criteria) this;
        }

        public Criteria andBlogForeignCommentidLessThanOrEqualTo(Integer value) {
            addCriterion("blog_foreign_commentid <=", value, "blogForeignCommentid");
            return (Criteria) this;
        }

        public Criteria andBlogForeignCommentidIn(List<Integer> values) {
            addCriterion("blog_foreign_commentid in", values, "blogForeignCommentid");
            return (Criteria) this;
        }

        public Criteria andBlogForeignCommentidNotIn(List<Integer> values) {
            addCriterion("blog_foreign_commentid not in", values, "blogForeignCommentid");
            return (Criteria) this;
        }

        public Criteria andBlogForeignCommentidBetween(Integer value1, Integer value2) {
            addCriterion("blog_foreign_commentid between", value1, value2, "blogForeignCommentid");
            return (Criteria) this;
        }

        public Criteria andBlogForeignCommentidNotBetween(Integer value1, Integer value2) {
            addCriterion("blog_foreign_commentid not between", value1, value2, "blogForeignCommentid");
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