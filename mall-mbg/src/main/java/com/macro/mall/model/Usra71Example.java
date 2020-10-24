package com.macro.mall.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Usra71Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Usra71Example() {
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

        public Criteria andA7104IsNull() {
            addCriterion("A7104 is null");
            return (Criteria) this;
        }

        public Criteria andA7104IsNotNull() {
            addCriterion("A7104 is not null");
            return (Criteria) this;
        }

        public Criteria andA7104EqualTo(String value) {
            addCriterion("A7104 =", value, "a7104");
            return (Criteria) this;
        }

        public Criteria andA7104NotEqualTo(String value) {
            addCriterion("A7104 <>", value, "a7104");
            return (Criteria) this;
        }

        public Criteria andA7104GreaterThan(String value) {
            addCriterion("A7104 >", value, "a7104");
            return (Criteria) this;
        }

        public Criteria andA7104GreaterThanOrEqualTo(String value) {
            addCriterion("A7104 >=", value, "a7104");
            return (Criteria) this;
        }

        public Criteria andA7104LessThan(String value) {
            addCriterion("A7104 <", value, "a7104");
            return (Criteria) this;
        }

        public Criteria andA7104LessThanOrEqualTo(String value) {
            addCriterion("A7104 <=", value, "a7104");
            return (Criteria) this;
        }

        public Criteria andA7104Like(String value) {
            addCriterion("A7104 like", value, "a7104");
            return (Criteria) this;
        }

        public Criteria andA7104NotLike(String value) {
            addCriterion("A7104 not like", value, "a7104");
            return (Criteria) this;
        }

        public Criteria andA7104In(List<String> values) {
            addCriterion("A7104 in", values, "a7104");
            return (Criteria) this;
        }

        public Criteria andA7104NotIn(List<String> values) {
            addCriterion("A7104 not in", values, "a7104");
            return (Criteria) this;
        }

        public Criteria andA7104Between(String value1, String value2) {
            addCriterion("A7104 between", value1, value2, "a7104");
            return (Criteria) this;
        }

        public Criteria andA7104NotBetween(String value1, String value2) {
            addCriterion("A7104 not between", value1, value2, "a7104");
            return (Criteria) this;
        }

        public Criteria andA7110IsNull() {
            addCriterion("A7110 is null");
            return (Criteria) this;
        }

        public Criteria andA7110IsNotNull() {
            addCriterion("A7110 is not null");
            return (Criteria) this;
        }

        public Criteria andA7110EqualTo(Date value) {
            addCriterion("A7110 =", value, "a7110");
            return (Criteria) this;
        }

        public Criteria andA7110NotEqualTo(Date value) {
            addCriterion("A7110 <>", value, "a7110");
            return (Criteria) this;
        }

        public Criteria andA7110GreaterThan(Date value) {
            addCriterion("A7110 >", value, "a7110");
            return (Criteria) this;
        }

        public Criteria andA7110GreaterThanOrEqualTo(Date value) {
            addCriterion("A7110 >=", value, "a7110");
            return (Criteria) this;
        }

        public Criteria andA7110LessThan(Date value) {
            addCriterion("A7110 <", value, "a7110");
            return (Criteria) this;
        }

        public Criteria andA7110LessThanOrEqualTo(Date value) {
            addCriterion("A7110 <=", value, "a7110");
            return (Criteria) this;
        }

        public Criteria andA7110In(List<Date> values) {
            addCriterion("A7110 in", values, "a7110");
            return (Criteria) this;
        }

        public Criteria andA7110NotIn(List<Date> values) {
            addCriterion("A7110 not in", values, "a7110");
            return (Criteria) this;
        }

        public Criteria andA7110Between(Date value1, Date value2) {
            addCriterion("A7110 between", value1, value2, "a7110");
            return (Criteria) this;
        }

        public Criteria andA7110NotBetween(Date value1, Date value2) {
            addCriterion("A7110 not between", value1, value2, "a7110");
            return (Criteria) this;
        }

        public Criteria andA7105IsNull() {
            addCriterion("A7105 is null");
            return (Criteria) this;
        }

        public Criteria andA7105IsNotNull() {
            addCriterion("A7105 is not null");
            return (Criteria) this;
        }

        public Criteria andA7105EqualTo(Date value) {
            addCriterion("A7105 =", value, "a7105");
            return (Criteria) this;
        }

        public Criteria andA7105NotEqualTo(Date value) {
            addCriterion("A7105 <>", value, "a7105");
            return (Criteria) this;
        }

        public Criteria andA7105GreaterThan(Date value) {
            addCriterion("A7105 >", value, "a7105");
            return (Criteria) this;
        }

        public Criteria andA7105GreaterThanOrEqualTo(Date value) {
            addCriterion("A7105 >=", value, "a7105");
            return (Criteria) this;
        }

        public Criteria andA7105LessThan(Date value) {
            addCriterion("A7105 <", value, "a7105");
            return (Criteria) this;
        }

        public Criteria andA7105LessThanOrEqualTo(Date value) {
            addCriterion("A7105 <=", value, "a7105");
            return (Criteria) this;
        }

        public Criteria andA7105In(List<Date> values) {
            addCriterion("A7105 in", values, "a7105");
            return (Criteria) this;
        }

        public Criteria andA7105NotIn(List<Date> values) {
            addCriterion("A7105 not in", values, "a7105");
            return (Criteria) this;
        }

        public Criteria andA7105Between(Date value1, Date value2) {
            addCriterion("A7105 between", value1, value2, "a7105");
            return (Criteria) this;
        }

        public Criteria andA7105NotBetween(Date value1, Date value2) {
            addCriterion("A7105 not between", value1, value2, "a7105");
            return (Criteria) this;
        }

        public Criteria andA7125IsNull() {
            addCriterion("A7125 is null");
            return (Criteria) this;
        }

        public Criteria andA7125IsNotNull() {
            addCriterion("A7125 is not null");
            return (Criteria) this;
        }

        public Criteria andA7125EqualTo(Date value) {
            addCriterion("A7125 =", value, "a7125");
            return (Criteria) this;
        }

        public Criteria andA7125NotEqualTo(Date value) {
            addCriterion("A7125 <>", value, "a7125");
            return (Criteria) this;
        }

        public Criteria andA7125GreaterThan(Date value) {
            addCriterion("A7125 >", value, "a7125");
            return (Criteria) this;
        }

        public Criteria andA7125GreaterThanOrEqualTo(Date value) {
            addCriterion("A7125 >=", value, "a7125");
            return (Criteria) this;
        }

        public Criteria andA7125LessThan(Date value) {
            addCriterion("A7125 <", value, "a7125");
            return (Criteria) this;
        }

        public Criteria andA7125LessThanOrEqualTo(Date value) {
            addCriterion("A7125 <=", value, "a7125");
            return (Criteria) this;
        }

        public Criteria andA7125In(List<Date> values) {
            addCriterion("A7125 in", values, "a7125");
            return (Criteria) this;
        }

        public Criteria andA7125NotIn(List<Date> values) {
            addCriterion("A7125 not in", values, "a7125");
            return (Criteria) this;
        }

        public Criteria andA7125Between(Date value1, Date value2) {
            addCriterion("A7125 between", value1, value2, "a7125");
            return (Criteria) this;
        }

        public Criteria andA7125NotBetween(Date value1, Date value2) {
            addCriterion("A7125 not between", value1, value2, "a7125");
            return (Criteria) this;
        }

        public Criteria andA7130IsNull() {
            addCriterion("A7130 is null");
            return (Criteria) this;
        }

        public Criteria andA7130IsNotNull() {
            addCriterion("A7130 is not null");
            return (Criteria) this;
        }

        public Criteria andA7130EqualTo(String value) {
            addCriterion("A7130 =", value, "a7130");
            return (Criteria) this;
        }

        public Criteria andA7130NotEqualTo(String value) {
            addCriterion("A7130 <>", value, "a7130");
            return (Criteria) this;
        }

        public Criteria andA7130GreaterThan(String value) {
            addCriterion("A7130 >", value, "a7130");
            return (Criteria) this;
        }

        public Criteria andA7130GreaterThanOrEqualTo(String value) {
            addCriterion("A7130 >=", value, "a7130");
            return (Criteria) this;
        }

        public Criteria andA7130LessThan(String value) {
            addCriterion("A7130 <", value, "a7130");
            return (Criteria) this;
        }

        public Criteria andA7130LessThanOrEqualTo(String value) {
            addCriterion("A7130 <=", value, "a7130");
            return (Criteria) this;
        }

        public Criteria andA7130Like(String value) {
            addCriterion("A7130 like", value, "a7130");
            return (Criteria) this;
        }

        public Criteria andA7130NotLike(String value) {
            addCriterion("A7130 not like", value, "a7130");
            return (Criteria) this;
        }

        public Criteria andA7130In(List<String> values) {
            addCriterion("A7130 in", values, "a7130");
            return (Criteria) this;
        }

        public Criteria andA7130NotIn(List<String> values) {
            addCriterion("A7130 not in", values, "a7130");
            return (Criteria) this;
        }

        public Criteria andA7130Between(String value1, String value2) {
            addCriterion("A7130 between", value1, value2, "a7130");
            return (Criteria) this;
        }

        public Criteria andA7130NotBetween(String value1, String value2) {
            addCriterion("A7130 not between", value1, value2, "a7130");
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