package com.macro.mall.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VZhichengExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VZhichengExample() {
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

        public Criteria andGhIsNull() {
            addCriterion("gh is null");
            return (Criteria) this;
        }

        public Criteria andGhIsNotNull() {
            addCriterion("gh is not null");
            return (Criteria) this;
        }

        public Criteria andGhEqualTo(String value) {
            addCriterion("gh =", value, "gh");
            return (Criteria) this;
        }

        public Criteria andGhNotEqualTo(String value) {
            addCriterion("gh <>", value, "gh");
            return (Criteria) this;
        }

        public Criteria andGhGreaterThan(String value) {
            addCriterion("gh >", value, "gh");
            return (Criteria) this;
        }

        public Criteria andGhGreaterThanOrEqualTo(String value) {
            addCriterion("gh >=", value, "gh");
            return (Criteria) this;
        }

        public Criteria andGhLessThan(String value) {
            addCriterion("gh <", value, "gh");
            return (Criteria) this;
        }

        public Criteria andGhLessThanOrEqualTo(String value) {
            addCriterion("gh <=", value, "gh");
            return (Criteria) this;
        }

        public Criteria andGhLike(String value) {
            addCriterion("gh like", value, "gh");
            return (Criteria) this;
        }

        public Criteria andGhNotLike(String value) {
            addCriterion("gh not like", value, "gh");
            return (Criteria) this;
        }

        public Criteria andGhIn(List<String> values) {
            addCriterion("gh in", values, "gh");
            return (Criteria) this;
        }

        public Criteria andGhNotIn(List<String> values) {
            addCriterion("gh not in", values, "gh");
            return (Criteria) this;
        }

        public Criteria andGhBetween(String value1, String value2) {
            addCriterion("gh between", value1, value2, "gh");
            return (Criteria) this;
        }

        public Criteria andGhNotBetween(String value1, String value2) {
            addCriterion("gh not between", value1, value2, "gh");
            return (Criteria) this;
        }

        public Criteria andZcjbIsNull() {
            addCriterion("zcjb is null");
            return (Criteria) this;
        }

        public Criteria andZcjbIsNotNull() {
            addCriterion("zcjb is not null");
            return (Criteria) this;
        }

        public Criteria andZcjbEqualTo(String value) {
            addCriterion("zcjb =", value, "zcjb");
            return (Criteria) this;
        }

        public Criteria andZcjbNotEqualTo(String value) {
            addCriterion("zcjb <>", value, "zcjb");
            return (Criteria) this;
        }

        public Criteria andZcjbGreaterThan(String value) {
            addCriterion("zcjb >", value, "zcjb");
            return (Criteria) this;
        }

        public Criteria andZcjbGreaterThanOrEqualTo(String value) {
            addCriterion("zcjb >=", value, "zcjb");
            return (Criteria) this;
        }

        public Criteria andZcjbLessThan(String value) {
            addCriterion("zcjb <", value, "zcjb");
            return (Criteria) this;
        }

        public Criteria andZcjbLessThanOrEqualTo(String value) {
            addCriterion("zcjb <=", value, "zcjb");
            return (Criteria) this;
        }

        public Criteria andZcjbLike(String value) {
            addCriterion("zcjb like", value, "zcjb");
            return (Criteria) this;
        }

        public Criteria andZcjbNotLike(String value) {
            addCriterion("zcjb not like", value, "zcjb");
            return (Criteria) this;
        }

        public Criteria andZcjbIn(List<String> values) {
            addCriterion("zcjb in", values, "zcjb");
            return (Criteria) this;
        }

        public Criteria andZcjbNotIn(List<String> values) {
            addCriterion("zcjb not in", values, "zcjb");
            return (Criteria) this;
        }

        public Criteria andZcjbBetween(String value1, String value2) {
            addCriterion("zcjb between", value1, value2, "zcjb");
            return (Criteria) this;
        }

        public Criteria andZcjbNotBetween(String value1, String value2) {
            addCriterion("zcjb not between", value1, value2, "zcjb");
            return (Criteria) this;
        }

        public Criteria andZcsjIsNull() {
            addCriterion("zcsj is null");
            return (Criteria) this;
        }

        public Criteria andZcsjIsNotNull() {
            addCriterion("zcsj is not null");
            return (Criteria) this;
        }

        public Criteria andZcsjEqualTo(Date value) {
            addCriterion("zcsj =", value, "zcsj");
            return (Criteria) this;
        }

        public Criteria andZcsjNotEqualTo(Date value) {
            addCriterion("zcsj <>", value, "zcsj");
            return (Criteria) this;
        }

        public Criteria andZcsjGreaterThan(Date value) {
            addCriterion("zcsj >", value, "zcsj");
            return (Criteria) this;
        }

        public Criteria andZcsjGreaterThanOrEqualTo(Date value) {
            addCriterion("zcsj >=", value, "zcsj");
            return (Criteria) this;
        }

        public Criteria andZcsjLessThan(Date value) {
            addCriterion("zcsj <", value, "zcsj");
            return (Criteria) this;
        }

        public Criteria andZcsjLessThanOrEqualTo(Date value) {
            addCriterion("zcsj <=", value, "zcsj");
            return (Criteria) this;
        }

        public Criteria andZcsjIn(List<Date> values) {
            addCriterion("zcsj in", values, "zcsj");
            return (Criteria) this;
        }

        public Criteria andZcsjNotIn(List<Date> values) {
            addCriterion("zcsj not in", values, "zcsj");
            return (Criteria) this;
        }

        public Criteria andZcsjBetween(Date value1, Date value2) {
            addCriterion("zcsj between", value1, value2, "zcsj");
            return (Criteria) this;
        }

        public Criteria andZcsjNotBetween(Date value1, Date value2) {
            addCriterion("zcsj not between", value1, value2, "zcsj");
            return (Criteria) this;
        }

        public Criteria andZcbhIsNull() {
            addCriterion("zcbh is null");
            return (Criteria) this;
        }

        public Criteria andZcbhIsNotNull() {
            addCriterion("zcbh is not null");
            return (Criteria) this;
        }

        public Criteria andZcbhEqualTo(String value) {
            addCriterion("zcbh =", value, "zcbh");
            return (Criteria) this;
        }

        public Criteria andZcbhNotEqualTo(String value) {
            addCriterion("zcbh <>", value, "zcbh");
            return (Criteria) this;
        }

        public Criteria andZcbhGreaterThan(String value) {
            addCriterion("zcbh >", value, "zcbh");
            return (Criteria) this;
        }

        public Criteria andZcbhGreaterThanOrEqualTo(String value) {
            addCriterion("zcbh >=", value, "zcbh");
            return (Criteria) this;
        }

        public Criteria andZcbhLessThan(String value) {
            addCriterion("zcbh <", value, "zcbh");
            return (Criteria) this;
        }

        public Criteria andZcbhLessThanOrEqualTo(String value) {
            addCriterion("zcbh <=", value, "zcbh");
            return (Criteria) this;
        }

        public Criteria andZcbhLike(String value) {
            addCriterion("zcbh like", value, "zcbh");
            return (Criteria) this;
        }

        public Criteria andZcbhNotLike(String value) {
            addCriterion("zcbh not like", value, "zcbh");
            return (Criteria) this;
        }

        public Criteria andZcbhIn(List<String> values) {
            addCriterion("zcbh in", values, "zcbh");
            return (Criteria) this;
        }

        public Criteria andZcbhNotIn(List<String> values) {
            addCriterion("zcbh not in", values, "zcbh");
            return (Criteria) this;
        }

        public Criteria andZcbhBetween(String value1, String value2) {
            addCriterion("zcbh between", value1, value2, "zcbh");
            return (Criteria) this;
        }

        public Criteria andZcbhNotBetween(String value1, String value2) {
            addCriterion("zcbh not between", value1, value2, "zcbh");
            return (Criteria) this;
        }

        public Criteria andKprqIsNull() {
            addCriterion("kprq is null");
            return (Criteria) this;
        }

        public Criteria andKprqIsNotNull() {
            addCriterion("kprq is not null");
            return (Criteria) this;
        }

        public Criteria andKprqEqualTo(Date value) {
            addCriterion("kprq =", value, "kprq");
            return (Criteria) this;
        }

        public Criteria andKprqNotEqualTo(Date value) {
            addCriterion("kprq <>", value, "kprq");
            return (Criteria) this;
        }

        public Criteria andKprqGreaterThan(Date value) {
            addCriterion("kprq >", value, "kprq");
            return (Criteria) this;
        }

        public Criteria andKprqGreaterThanOrEqualTo(Date value) {
            addCriterion("kprq >=", value, "kprq");
            return (Criteria) this;
        }

        public Criteria andKprqLessThan(Date value) {
            addCriterion("kprq <", value, "kprq");
            return (Criteria) this;
        }

        public Criteria andKprqLessThanOrEqualTo(Date value) {
            addCriterion("kprq <=", value, "kprq");
            return (Criteria) this;
        }

        public Criteria andKprqIn(List<Date> values) {
            addCriterion("kprq in", values, "kprq");
            return (Criteria) this;
        }

        public Criteria andKprqNotIn(List<Date> values) {
            addCriterion("kprq not in", values, "kprq");
            return (Criteria) this;
        }

        public Criteria andKprqBetween(Date value1, Date value2) {
            addCriterion("kprq between", value1, value2, "kprq");
            return (Criteria) this;
        }

        public Criteria andKprqNotBetween(Date value1, Date value2) {
            addCriterion("kprq not between", value1, value2, "kprq");
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