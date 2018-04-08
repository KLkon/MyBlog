package site.pers.kl.bean;

import java.util.ArrayList;
import java.util.List;

public class ContactPersonExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ContactPersonExample() {
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

        public Criteria andPIdIsNull() {
            addCriterion("p_id is null");
            return (Criteria) this;
        }

        public Criteria andPIdIsNotNull() {
            addCriterion("p_id is not null");
            return (Criteria) this;
        }

        public Criteria andPIdEqualTo(Integer value) {
            addCriterion("p_id =", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotEqualTo(Integer value) {
            addCriterion("p_id <>", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThan(Integer value) {
            addCriterion("p_id >", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("p_id >=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThan(Integer value) {
            addCriterion("p_id <", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThanOrEqualTo(Integer value) {
            addCriterion("p_id <=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdIn(List<Integer> values) {
            addCriterion("p_id in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotIn(List<Integer> values) {
            addCriterion("p_id not in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdBetween(Integer value1, Integer value2) {
            addCriterion("p_id between", value1, value2, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotBetween(Integer value1, Integer value2) {
            addCriterion("p_id not between", value1, value2, "pId");
            return (Criteria) this;
        }

        public Criteria andPNameIsNull() {
            addCriterion("p_name is null");
            return (Criteria) this;
        }

        public Criteria andPNameIsNotNull() {
            addCriterion("p_name is not null");
            return (Criteria) this;
        }

        public Criteria andPNameEqualTo(String value) {
            addCriterion("p_name =", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameNotEqualTo(String value) {
            addCriterion("p_name <>", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameGreaterThan(String value) {
            addCriterion("p_name >", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameGreaterThanOrEqualTo(String value) {
            addCriterion("p_name >=", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameLessThan(String value) {
            addCriterion("p_name <", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameLessThanOrEqualTo(String value) {
            addCriterion("p_name <=", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameLike(String value) {
            addCriterion("p_name like", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameNotLike(String value) {
            addCriterion("p_name not like", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameIn(List<String> values) {
            addCriterion("p_name in", values, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameNotIn(List<String> values) {
            addCriterion("p_name not in", values, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameBetween(String value1, String value2) {
            addCriterion("p_name between", value1, value2, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameNotBetween(String value1, String value2) {
            addCriterion("p_name not between", value1, value2, "pName");
            return (Criteria) this;
        }

        public Criteria andPEmailIsNull() {
            addCriterion("p_email is null");
            return (Criteria) this;
        }

        public Criteria andPEmailIsNotNull() {
            addCriterion("p_email is not null");
            return (Criteria) this;
        }

        public Criteria andPEmailEqualTo(String value) {
            addCriterion("p_email =", value, "pEmail");
            return (Criteria) this;
        }

        public Criteria andPEmailNotEqualTo(String value) {
            addCriterion("p_email <>", value, "pEmail");
            return (Criteria) this;
        }

        public Criteria andPEmailGreaterThan(String value) {
            addCriterion("p_email >", value, "pEmail");
            return (Criteria) this;
        }

        public Criteria andPEmailGreaterThanOrEqualTo(String value) {
            addCriterion("p_email >=", value, "pEmail");
            return (Criteria) this;
        }

        public Criteria andPEmailLessThan(String value) {
            addCriterion("p_email <", value, "pEmail");
            return (Criteria) this;
        }

        public Criteria andPEmailLessThanOrEqualTo(String value) {
            addCriterion("p_email <=", value, "pEmail");
            return (Criteria) this;
        }

        public Criteria andPEmailLike(String value) {
            addCriterion("p_email like", value, "pEmail");
            return (Criteria) this;
        }

        public Criteria andPEmailNotLike(String value) {
            addCriterion("p_email not like", value, "pEmail");
            return (Criteria) this;
        }

        public Criteria andPEmailIn(List<String> values) {
            addCriterion("p_email in", values, "pEmail");
            return (Criteria) this;
        }

        public Criteria andPEmailNotIn(List<String> values) {
            addCriterion("p_email not in", values, "pEmail");
            return (Criteria) this;
        }

        public Criteria andPEmailBetween(String value1, String value2) {
            addCriterion("p_email between", value1, value2, "pEmail");
            return (Criteria) this;
        }

        public Criteria andPEmailNotBetween(String value1, String value2) {
            addCriterion("p_email not between", value1, value2, "pEmail");
            return (Criteria) this;
        }

        public Criteria andPConnectionIsNull() {
            addCriterion("p_connection is null");
            return (Criteria) this;
        }

        public Criteria andPConnectionIsNotNull() {
            addCriterion("p_connection is not null");
            return (Criteria) this;
        }

        public Criteria andPConnectionEqualTo(String value) {
            addCriterion("p_connection =", value, "pConnection");
            return (Criteria) this;
        }

        public Criteria andPConnectionNotEqualTo(String value) {
            addCriterion("p_connection <>", value, "pConnection");
            return (Criteria) this;
        }

        public Criteria andPConnectionGreaterThan(String value) {
            addCriterion("p_connection >", value, "pConnection");
            return (Criteria) this;
        }

        public Criteria andPConnectionGreaterThanOrEqualTo(String value) {
            addCriterion("p_connection >=", value, "pConnection");
            return (Criteria) this;
        }

        public Criteria andPConnectionLessThan(String value) {
            addCriterion("p_connection <", value, "pConnection");
            return (Criteria) this;
        }

        public Criteria andPConnectionLessThanOrEqualTo(String value) {
            addCriterion("p_connection <=", value, "pConnection");
            return (Criteria) this;
        }

        public Criteria andPConnectionLike(String value) {
            addCriterion("p_connection like", value, "pConnection");
            return (Criteria) this;
        }

        public Criteria andPConnectionNotLike(String value) {
            addCriterion("p_connection not like", value, "pConnection");
            return (Criteria) this;
        }

        public Criteria andPConnectionIn(List<String> values) {
            addCriterion("p_connection in", values, "pConnection");
            return (Criteria) this;
        }

        public Criteria andPConnectionNotIn(List<String> values) {
            addCriterion("p_connection not in", values, "pConnection");
            return (Criteria) this;
        }

        public Criteria andPConnectionBetween(String value1, String value2) {
            addCriterion("p_connection between", value1, value2, "pConnection");
            return (Criteria) this;
        }

        public Criteria andPConnectionNotBetween(String value1, String value2) {
            addCriterion("p_connection not between", value1, value2, "pConnection");
            return (Criteria) this;
        }

        public Criteria andPMessageIsNull() {
            addCriterion("p_message is null");
            return (Criteria) this;
        }

        public Criteria andPMessageIsNotNull() {
            addCriterion("p_message is not null");
            return (Criteria) this;
        }

        public Criteria andPMessageEqualTo(String value) {
            addCriterion("p_message =", value, "pMessage");
            return (Criteria) this;
        }

        public Criteria andPMessageNotEqualTo(String value) {
            addCriterion("p_message <>", value, "pMessage");
            return (Criteria) this;
        }

        public Criteria andPMessageGreaterThan(String value) {
            addCriterion("p_message >", value, "pMessage");
            return (Criteria) this;
        }

        public Criteria andPMessageGreaterThanOrEqualTo(String value) {
            addCriterion("p_message >=", value, "pMessage");
            return (Criteria) this;
        }

        public Criteria andPMessageLessThan(String value) {
            addCriterion("p_message <", value, "pMessage");
            return (Criteria) this;
        }

        public Criteria andPMessageLessThanOrEqualTo(String value) {
            addCriterion("p_message <=", value, "pMessage");
            return (Criteria) this;
        }

        public Criteria andPMessageLike(String value) {
            addCriterion("p_message like", value, "pMessage");
            return (Criteria) this;
        }

        public Criteria andPMessageNotLike(String value) {
            addCriterion("p_message not like", value, "pMessage");
            return (Criteria) this;
        }

        public Criteria andPMessageIn(List<String> values) {
            addCriterion("p_message in", values, "pMessage");
            return (Criteria) this;
        }

        public Criteria andPMessageNotIn(List<String> values) {
            addCriterion("p_message not in", values, "pMessage");
            return (Criteria) this;
        }

        public Criteria andPMessageBetween(String value1, String value2) {
            addCriterion("p_message between", value1, value2, "pMessage");
            return (Criteria) this;
        }

        public Criteria andPMessageNotBetween(String value1, String value2) {
            addCriterion("p_message not between", value1, value2, "pMessage");
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