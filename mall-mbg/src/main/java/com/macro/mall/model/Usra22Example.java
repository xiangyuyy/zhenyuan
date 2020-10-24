package com.macro.mall.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Usra22Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Usra22Example() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andA0100IsNull() {
            addCriterion("A0100 is null");
            return (Criteria) this;
        }

        public Criteria andA0100IsNotNull() {
            addCriterion("A0100 is not null");
            return (Criteria) this;
        }

        public Criteria andA0100EqualTo(String value) {
            addCriterion("A0100 =", value, "a0100");
            return (Criteria) this;
        }

        public Criteria andA0100NotEqualTo(String value) {
            addCriterion("A0100 <>", value, "a0100");
            return (Criteria) this;
        }

        public Criteria andA0100GreaterThan(String value) {
            addCriterion("A0100 >", value, "a0100");
            return (Criteria) this;
        }

        public Criteria andA0100GreaterThanOrEqualTo(String value) {
            addCriterion("A0100 >=", value, "a0100");
            return (Criteria) this;
        }

        public Criteria andA0100LessThan(String value) {
            addCriterion("A0100 <", value, "a0100");
            return (Criteria) this;
        }

        public Criteria andA0100LessThanOrEqualTo(String value) {
            addCriterion("A0100 <=", value, "a0100");
            return (Criteria) this;
        }

        public Criteria andA0100Like(String value) {
            addCriterion("A0100 like", value, "a0100");
            return (Criteria) this;
        }

        public Criteria andA0100NotLike(String value) {
            addCriterion("A0100 not like", value, "a0100");
            return (Criteria) this;
        }

        public Criteria andA0100In(List<String> values) {
            addCriterion("A0100 in", values, "a0100");
            return (Criteria) this;
        }

        public Criteria andA0100NotIn(List<String> values) {
            addCriterion("A0100 not in", values, "a0100");
            return (Criteria) this;
        }

        public Criteria andA0100Between(String value1, String value2) {
            addCriterion("A0100 between", value1, value2, "a0100");
            return (Criteria) this;
        }

        public Criteria andA0100NotBetween(String value1, String value2) {
            addCriterion("A0100 not between", value1, value2, "a0100");
            return (Criteria) this;
        }

        public Criteria andA2210IsNull() {
            addCriterion("A2210 is null");
            return (Criteria) this;
        }

        public Criteria andA2210IsNotNull() {
            addCriterion("A2210 is not null");
            return (Criteria) this;
        }

        public Criteria andA2210EqualTo(Date value) {
            addCriterion("A2210 =", value, "a2210");
            return (Criteria) this;
        }

        public Criteria andA2210NotEqualTo(Date value) {
            addCriterion("A2210 <>", value, "a2210");
            return (Criteria) this;
        }

        public Criteria andA2210GreaterThan(Date value) {
            addCriterion("A2210 >", value, "a2210");
            return (Criteria) this;
        }

        public Criteria andA2210GreaterThanOrEqualTo(Date value) {
            addCriterion("A2210 >=", value, "a2210");
            return (Criteria) this;
        }

        public Criteria andA2210LessThan(Date value) {
            addCriterion("A2210 <", value, "a2210");
            return (Criteria) this;
        }

        public Criteria andA2210LessThanOrEqualTo(Date value) {
            addCriterion("A2210 <=", value, "a2210");
            return (Criteria) this;
        }

        public Criteria andA2210In(List<Date> values) {
            addCriterion("A2210 in", values, "a2210");
            return (Criteria) this;
        }

        public Criteria andA2210NotIn(List<Date> values) {
            addCriterion("A2210 not in", values, "a2210");
            return (Criteria) this;
        }

        public Criteria andA2210Between(Date value1, Date value2) {
            addCriterion("A2210 between", value1, value2, "a2210");
            return (Criteria) this;
        }

        public Criteria andA2210NotBetween(Date value1, Date value2) {
            addCriterion("A2210 not between", value1, value2, "a2210");
            return (Criteria) this;
        }

        public Criteria andA2205IsNull() {
            addCriterion("A2205 is null");
            return (Criteria) this;
        }

        public Criteria andA2205IsNotNull() {
            addCriterion("A2205 is not null");
            return (Criteria) this;
        }

        public Criteria andA2205EqualTo(String value) {
            addCriterion("A2205 =", value, "a2205");
            return (Criteria) this;
        }

        public Criteria andA2205NotEqualTo(String value) {
            addCriterion("A2205 <>", value, "a2205");
            return (Criteria) this;
        }

        public Criteria andA2205GreaterThan(String value) {
            addCriterion("A2205 >", value, "a2205");
            return (Criteria) this;
        }

        public Criteria andA2205GreaterThanOrEqualTo(String value) {
            addCriterion("A2205 >=", value, "a2205");
            return (Criteria) this;
        }

        public Criteria andA2205LessThan(String value) {
            addCriterion("A2205 <", value, "a2205");
            return (Criteria) this;
        }

        public Criteria andA2205LessThanOrEqualTo(String value) {
            addCriterion("A2205 <=", value, "a2205");
            return (Criteria) this;
        }

        public Criteria andA2205Like(String value) {
            addCriterion("A2205 like", value, "a2205");
            return (Criteria) this;
        }

        public Criteria andA2205NotLike(String value) {
            addCriterion("A2205 not like", value, "a2205");
            return (Criteria) this;
        }

        public Criteria andA2205In(List<String> values) {
            addCriterion("A2205 in", values, "a2205");
            return (Criteria) this;
        }

        public Criteria andA2205NotIn(List<String> values) {
            addCriterion("A2205 not in", values, "a2205");
            return (Criteria) this;
        }

        public Criteria andA2205Between(String value1, String value2) {
            addCriterion("A2205 between", value1, value2, "a2205");
            return (Criteria) this;
        }

        public Criteria andA2205NotBetween(String value1, String value2) {
            addCriterion("A2205 not between", value1, value2, "a2205");
            return (Criteria) this;
        }

        public Criteria andA2230IsNull() {
            addCriterion("A2230 is null");
            return (Criteria) this;
        }

        public Criteria andA2230IsNotNull() {
            addCriterion("A2230 is not null");
            return (Criteria) this;
        }

        public Criteria andA2230EqualTo(String value) {
            addCriterion("A2230 =", value, "a2230");
            return (Criteria) this;
        }

        public Criteria andA2230NotEqualTo(String value) {
            addCriterion("A2230 <>", value, "a2230");
            return (Criteria) this;
        }

        public Criteria andA2230GreaterThan(String value) {
            addCriterion("A2230 >", value, "a2230");
            return (Criteria) this;
        }

        public Criteria andA2230GreaterThanOrEqualTo(String value) {
            addCriterion("A2230 >=", value, "a2230");
            return (Criteria) this;
        }

        public Criteria andA2230LessThan(String value) {
            addCriterion("A2230 <", value, "a2230");
            return (Criteria) this;
        }

        public Criteria andA2230LessThanOrEqualTo(String value) {
            addCriterion("A2230 <=", value, "a2230");
            return (Criteria) this;
        }

        public Criteria andA2230Like(String value) {
            addCriterion("A2230 like", value, "a2230");
            return (Criteria) this;
        }

        public Criteria andA2230NotLike(String value) {
            addCriterion("A2230 not like", value, "a2230");
            return (Criteria) this;
        }

        public Criteria andA2230In(List<String> values) {
            addCriterion("A2230 in", values, "a2230");
            return (Criteria) this;
        }

        public Criteria andA2230NotIn(List<String> values) {
            addCriterion("A2230 not in", values, "a2230");
            return (Criteria) this;
        }

        public Criteria andA2230Between(String value1, String value2) {
            addCriterion("A2230 between", value1, value2, "a2230");
            return (Criteria) this;
        }

        public Criteria andA2230NotBetween(String value1, String value2) {
            addCriterion("A2230 not between", value1, value2, "a2230");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("CreateTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("CreateTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("CreateTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("CreateTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CreateTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("CreateTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("CreateTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("CreateTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("CreateTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("CreateTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("CreateTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andModtimeIsNull() {
            addCriterion("ModTime is null");
            return (Criteria) this;
        }

        public Criteria andModtimeIsNotNull() {
            addCriterion("ModTime is not null");
            return (Criteria) this;
        }

        public Criteria andModtimeEqualTo(Date value) {
            addCriterion("ModTime =", value, "modtime");
            return (Criteria) this;
        }

        public Criteria andModtimeNotEqualTo(Date value) {
            addCriterion("ModTime <>", value, "modtime");
            return (Criteria) this;
        }

        public Criteria andModtimeGreaterThan(Date value) {
            addCriterion("ModTime >", value, "modtime");
            return (Criteria) this;
        }

        public Criteria andModtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ModTime >=", value, "modtime");
            return (Criteria) this;
        }

        public Criteria andModtimeLessThan(Date value) {
            addCriterion("ModTime <", value, "modtime");
            return (Criteria) this;
        }

        public Criteria andModtimeLessThanOrEqualTo(Date value) {
            addCriterion("ModTime <=", value, "modtime");
            return (Criteria) this;
        }

        public Criteria andModtimeIn(List<Date> values) {
            addCriterion("ModTime in", values, "modtime");
            return (Criteria) this;
        }

        public Criteria andModtimeNotIn(List<Date> values) {
            addCriterion("ModTime not in", values, "modtime");
            return (Criteria) this;
        }

        public Criteria andModtimeBetween(Date value1, Date value2) {
            addCriterion("ModTime between", value1, value2, "modtime");
            return (Criteria) this;
        }

        public Criteria andModtimeNotBetween(Date value1, Date value2) {
            addCriterion("ModTime not between", value1, value2, "modtime");
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