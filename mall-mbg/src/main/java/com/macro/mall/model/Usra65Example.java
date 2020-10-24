package com.macro.mall.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Usra65Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Usra65Example() {
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

        public Criteria andA6501IsNull() {
            addCriterion("a6501 is null");
            return (Criteria) this;
        }

        public Criteria andA6501IsNotNull() {
            addCriterion("a6501 is not null");
            return (Criteria) this;
        }

        public Criteria andA6501EqualTo(String value) {
            addCriterion("a6501 =", value, "a6501");
            return (Criteria) this;
        }

        public Criteria andA6501NotEqualTo(String value) {
            addCriterion("a6501 <>", value, "a6501");
            return (Criteria) this;
        }

        public Criteria andA6501GreaterThan(String value) {
            addCriterion("a6501 >", value, "a6501");
            return (Criteria) this;
        }

        public Criteria andA6501GreaterThanOrEqualTo(String value) {
            addCriterion("a6501 >=", value, "a6501");
            return (Criteria) this;
        }

        public Criteria andA6501LessThan(String value) {
            addCriterion("a6501 <", value, "a6501");
            return (Criteria) this;
        }

        public Criteria andA6501LessThanOrEqualTo(String value) {
            addCriterion("a6501 <=", value, "a6501");
            return (Criteria) this;
        }

        public Criteria andA6501Like(String value) {
            addCriterion("a6501 like", value, "a6501");
            return (Criteria) this;
        }

        public Criteria andA6501NotLike(String value) {
            addCriterion("a6501 not like", value, "a6501");
            return (Criteria) this;
        }

        public Criteria andA6501In(List<String> values) {
            addCriterion("a6501 in", values, "a6501");
            return (Criteria) this;
        }

        public Criteria andA6501NotIn(List<String> values) {
            addCriterion("a6501 not in", values, "a6501");
            return (Criteria) this;
        }

        public Criteria andA6501Between(String value1, String value2) {
            addCriterion("a6501 between", value1, value2, "a6501");
            return (Criteria) this;
        }

        public Criteria andA6501NotBetween(String value1, String value2) {
            addCriterion("a6501 not between", value1, value2, "a6501");
            return (Criteria) this;
        }

        public Criteria andA6502IsNull() {
            addCriterion("a6502 is null");
            return (Criteria) this;
        }

        public Criteria andA6502IsNotNull() {
            addCriterion("a6502 is not null");
            return (Criteria) this;
        }

        public Criteria andA6502EqualTo(String value) {
            addCriterion("a6502 =", value, "a6502");
            return (Criteria) this;
        }

        public Criteria andA6502NotEqualTo(String value) {
            addCriterion("a6502 <>", value, "a6502");
            return (Criteria) this;
        }

        public Criteria andA6502GreaterThan(String value) {
            addCriterion("a6502 >", value, "a6502");
            return (Criteria) this;
        }

        public Criteria andA6502GreaterThanOrEqualTo(String value) {
            addCriterion("a6502 >=", value, "a6502");
            return (Criteria) this;
        }

        public Criteria andA6502LessThan(String value) {
            addCriterion("a6502 <", value, "a6502");
            return (Criteria) this;
        }

        public Criteria andA6502LessThanOrEqualTo(String value) {
            addCriterion("a6502 <=", value, "a6502");
            return (Criteria) this;
        }

        public Criteria andA6502Like(String value) {
            addCriterion("a6502 like", value, "a6502");
            return (Criteria) this;
        }

        public Criteria andA6502NotLike(String value) {
            addCriterion("a6502 not like", value, "a6502");
            return (Criteria) this;
        }

        public Criteria andA6502In(List<String> values) {
            addCriterion("a6502 in", values, "a6502");
            return (Criteria) this;
        }

        public Criteria andA6502NotIn(List<String> values) {
            addCriterion("a6502 not in", values, "a6502");
            return (Criteria) this;
        }

        public Criteria andA6502Between(String value1, String value2) {
            addCriterion("a6502 between", value1, value2, "a6502");
            return (Criteria) this;
        }

        public Criteria andA6502NotBetween(String value1, String value2) {
            addCriterion("a6502 not between", value1, value2, "a6502");
            return (Criteria) this;
        }

        public Criteria andA6503IsNull() {
            addCriterion("a6503 is null");
            return (Criteria) this;
        }

        public Criteria andA6503IsNotNull() {
            addCriterion("a6503 is not null");
            return (Criteria) this;
        }

        public Criteria andA6503EqualTo(Date value) {
            addCriterion("a6503 =", value, "a6503");
            return (Criteria) this;
        }

        public Criteria andA6503NotEqualTo(Date value) {
            addCriterion("a6503 <>", value, "a6503");
            return (Criteria) this;
        }

        public Criteria andA6503GreaterThan(Date value) {
            addCriterion("a6503 >", value, "a6503");
            return (Criteria) this;
        }

        public Criteria andA6503GreaterThanOrEqualTo(Date value) {
            addCriterion("a6503 >=", value, "a6503");
            return (Criteria) this;
        }

        public Criteria andA6503LessThan(Date value) {
            addCriterion("a6503 <", value, "a6503");
            return (Criteria) this;
        }

        public Criteria andA6503LessThanOrEqualTo(Date value) {
            addCriterion("a6503 <=", value, "a6503");
            return (Criteria) this;
        }

        public Criteria andA6503In(List<Date> values) {
            addCriterion("a6503 in", values, "a6503");
            return (Criteria) this;
        }

        public Criteria andA6503NotIn(List<Date> values) {
            addCriterion("a6503 not in", values, "a6503");
            return (Criteria) this;
        }

        public Criteria andA6503Between(Date value1, Date value2) {
            addCriterion("a6503 between", value1, value2, "a6503");
            return (Criteria) this;
        }

        public Criteria andA6503NotBetween(Date value1, Date value2) {
            addCriterion("a6503 not between", value1, value2, "a6503");
            return (Criteria) this;
        }

        public Criteria andA6504IsNull() {
            addCriterion("A6504 is null");
            return (Criteria) this;
        }

        public Criteria andA6504IsNotNull() {
            addCriterion("A6504 is not null");
            return (Criteria) this;
        }

        public Criteria andA6504EqualTo(Date value) {
            addCriterion("A6504 =", value, "a6504");
            return (Criteria) this;
        }

        public Criteria andA6504NotEqualTo(Date value) {
            addCriterion("A6504 <>", value, "a6504");
            return (Criteria) this;
        }

        public Criteria andA6504GreaterThan(Date value) {
            addCriterion("A6504 >", value, "a6504");
            return (Criteria) this;
        }

        public Criteria andA6504GreaterThanOrEqualTo(Date value) {
            addCriterion("A6504 >=", value, "a6504");
            return (Criteria) this;
        }

        public Criteria andA6504LessThan(Date value) {
            addCriterion("A6504 <", value, "a6504");
            return (Criteria) this;
        }

        public Criteria andA6504LessThanOrEqualTo(Date value) {
            addCriterion("A6504 <=", value, "a6504");
            return (Criteria) this;
        }

        public Criteria andA6504In(List<Date> values) {
            addCriterion("A6504 in", values, "a6504");
            return (Criteria) this;
        }

        public Criteria andA6504NotIn(List<Date> values) {
            addCriterion("A6504 not in", values, "a6504");
            return (Criteria) this;
        }

        public Criteria andA6504Between(Date value1, Date value2) {
            addCriterion("A6504 between", value1, value2, "a6504");
            return (Criteria) this;
        }

        public Criteria andA6504NotBetween(Date value1, Date value2) {
            addCriterion("A6504 not between", value1, value2, "a6504");
            return (Criteria) this;
        }

        public Criteria andA6507IsNull() {
            addCriterion("A6507 is null");
            return (Criteria) this;
        }

        public Criteria andA6507IsNotNull() {
            addCriterion("A6507 is not null");
            return (Criteria) this;
        }

        public Criteria andA6507EqualTo(String value) {
            addCriterion("A6507 =", value, "a6507");
            return (Criteria) this;
        }

        public Criteria andA6507NotEqualTo(String value) {
            addCriterion("A6507 <>", value, "a6507");
            return (Criteria) this;
        }

        public Criteria andA6507GreaterThan(String value) {
            addCriterion("A6507 >", value, "a6507");
            return (Criteria) this;
        }

        public Criteria andA6507GreaterThanOrEqualTo(String value) {
            addCriterion("A6507 >=", value, "a6507");
            return (Criteria) this;
        }

        public Criteria andA6507LessThan(String value) {
            addCriterion("A6507 <", value, "a6507");
            return (Criteria) this;
        }

        public Criteria andA6507LessThanOrEqualTo(String value) {
            addCriterion("A6507 <=", value, "a6507");
            return (Criteria) this;
        }

        public Criteria andA6507Like(String value) {
            addCriterion("A6507 like", value, "a6507");
            return (Criteria) this;
        }

        public Criteria andA6507NotLike(String value) {
            addCriterion("A6507 not like", value, "a6507");
            return (Criteria) this;
        }

        public Criteria andA6507In(List<String> values) {
            addCriterion("A6507 in", values, "a6507");
            return (Criteria) this;
        }

        public Criteria andA6507NotIn(List<String> values) {
            addCriterion("A6507 not in", values, "a6507");
            return (Criteria) this;
        }

        public Criteria andA6507Between(String value1, String value2) {
            addCriterion("A6507 between", value1, value2, "a6507");
            return (Criteria) this;
        }

        public Criteria andA6507NotBetween(String value1, String value2) {
            addCriterion("A6507 not between", value1, value2, "a6507");
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