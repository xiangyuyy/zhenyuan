package com.macro.mall.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Usra04Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Usra04Example() {
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

        public Criteria andA0449IsNull() {
            addCriterion("A0449 is null");
            return (Criteria) this;
        }

        public Criteria andA0449IsNotNull() {
            addCriterion("A0449 is not null");
            return (Criteria) this;
        }

        public Criteria andA0449EqualTo(String value) {
            addCriterion("A0449 =", value, "a0449");
            return (Criteria) this;
        }

        public Criteria andA0449NotEqualTo(String value) {
            addCriterion("A0449 <>", value, "a0449");
            return (Criteria) this;
        }

        public Criteria andA0449GreaterThan(String value) {
            addCriterion("A0449 >", value, "a0449");
            return (Criteria) this;
        }

        public Criteria andA0449GreaterThanOrEqualTo(String value) {
            addCriterion("A0449 >=", value, "a0449");
            return (Criteria) this;
        }

        public Criteria andA0449LessThan(String value) {
            addCriterion("A0449 <", value, "a0449");
            return (Criteria) this;
        }

        public Criteria andA0449LessThanOrEqualTo(String value) {
            addCriterion("A0449 <=", value, "a0449");
            return (Criteria) this;
        }

        public Criteria andA0449Like(String value) {
            addCriterion("A0449 like", value, "a0449");
            return (Criteria) this;
        }

        public Criteria andA0449NotLike(String value) {
            addCriterion("A0449 not like", value, "a0449");
            return (Criteria) this;
        }

        public Criteria andA0449In(List<String> values) {
            addCriterion("A0449 in", values, "a0449");
            return (Criteria) this;
        }

        public Criteria andA0449NotIn(List<String> values) {
            addCriterion("A0449 not in", values, "a0449");
            return (Criteria) this;
        }

        public Criteria andA0449Between(String value1, String value2) {
            addCriterion("A0449 between", value1, value2, "a0449");
            return (Criteria) this;
        }

        public Criteria andA0449NotBetween(String value1, String value2) {
            addCriterion("A0449 not between", value1, value2, "a0449");
            return (Criteria) this;
        }

        public Criteria andA0405IsNull() {
            addCriterion("A0405 is null");
            return (Criteria) this;
        }

        public Criteria andA0405IsNotNull() {
            addCriterion("A0405 is not null");
            return (Criteria) this;
        }

        public Criteria andA0405EqualTo(String value) {
            addCriterion("A0405 =", value, "a0405");
            return (Criteria) this;
        }

        public Criteria andA0405NotEqualTo(String value) {
            addCriterion("A0405 <>", value, "a0405");
            return (Criteria) this;
        }

        public Criteria andA0405GreaterThan(String value) {
            addCriterion("A0405 >", value, "a0405");
            return (Criteria) this;
        }

        public Criteria andA0405GreaterThanOrEqualTo(String value) {
            addCriterion("A0405 >=", value, "a0405");
            return (Criteria) this;
        }

        public Criteria andA0405LessThan(String value) {
            addCriterion("A0405 <", value, "a0405");
            return (Criteria) this;
        }

        public Criteria andA0405LessThanOrEqualTo(String value) {
            addCriterion("A0405 <=", value, "a0405");
            return (Criteria) this;
        }

        public Criteria andA0405Like(String value) {
            addCriterion("A0405 like", value, "a0405");
            return (Criteria) this;
        }

        public Criteria andA0405NotLike(String value) {
            addCriterion("A0405 not like", value, "a0405");
            return (Criteria) this;
        }

        public Criteria andA0405In(List<String> values) {
            addCriterion("A0405 in", values, "a0405");
            return (Criteria) this;
        }

        public Criteria andA0405NotIn(List<String> values) {
            addCriterion("A0405 not in", values, "a0405");
            return (Criteria) this;
        }

        public Criteria andA0405Between(String value1, String value2) {
            addCriterion("A0405 between", value1, value2, "a0405");
            return (Criteria) this;
        }

        public Criteria andA0405NotBetween(String value1, String value2) {
            addCriterion("A0405 not between", value1, value2, "a0405");
            return (Criteria) this;
        }

        public Criteria andA0444IsNull() {
            addCriterion("A0444 is null");
            return (Criteria) this;
        }

        public Criteria andA0444IsNotNull() {
            addCriterion("A0444 is not null");
            return (Criteria) this;
        }

        public Criteria andA0444EqualTo(String value) {
            addCriterion("A0444 =", value, "a0444");
            return (Criteria) this;
        }

        public Criteria andA0444NotEqualTo(String value) {
            addCriterion("A0444 <>", value, "a0444");
            return (Criteria) this;
        }

        public Criteria andA0444GreaterThan(String value) {
            addCriterion("A0444 >", value, "a0444");
            return (Criteria) this;
        }

        public Criteria andA0444GreaterThanOrEqualTo(String value) {
            addCriterion("A0444 >=", value, "a0444");
            return (Criteria) this;
        }

        public Criteria andA0444LessThan(String value) {
            addCriterion("A0444 <", value, "a0444");
            return (Criteria) this;
        }

        public Criteria andA0444LessThanOrEqualTo(String value) {
            addCriterion("A0444 <=", value, "a0444");
            return (Criteria) this;
        }

        public Criteria andA0444Like(String value) {
            addCriterion("A0444 like", value, "a0444");
            return (Criteria) this;
        }

        public Criteria andA0444NotLike(String value) {
            addCriterion("A0444 not like", value, "a0444");
            return (Criteria) this;
        }

        public Criteria andA0444In(List<String> values) {
            addCriterion("A0444 in", values, "a0444");
            return (Criteria) this;
        }

        public Criteria andA0444NotIn(List<String> values) {
            addCriterion("A0444 not in", values, "a0444");
            return (Criteria) this;
        }

        public Criteria andA0444Between(String value1, String value2) {
            addCriterion("A0444 between", value1, value2, "a0444");
            return (Criteria) this;
        }

        public Criteria andA0444NotBetween(String value1, String value2) {
            addCriterion("A0444 not between", value1, value2, "a0444");
            return (Criteria) this;
        }

        public Criteria andA0435IsNull() {
            addCriterion("A0435 is null");
            return (Criteria) this;
        }

        public Criteria andA0435IsNotNull() {
            addCriterion("A0435 is not null");
            return (Criteria) this;
        }

        public Criteria andA0435EqualTo(String value) {
            addCriterion("A0435 =", value, "a0435");
            return (Criteria) this;
        }

        public Criteria andA0435NotEqualTo(String value) {
            addCriterion("A0435 <>", value, "a0435");
            return (Criteria) this;
        }

        public Criteria andA0435GreaterThan(String value) {
            addCriterion("A0435 >", value, "a0435");
            return (Criteria) this;
        }

        public Criteria andA0435GreaterThanOrEqualTo(String value) {
            addCriterion("A0435 >=", value, "a0435");
            return (Criteria) this;
        }

        public Criteria andA0435LessThan(String value) {
            addCriterion("A0435 <", value, "a0435");
            return (Criteria) this;
        }

        public Criteria andA0435LessThanOrEqualTo(String value) {
            addCriterion("A0435 <=", value, "a0435");
            return (Criteria) this;
        }

        public Criteria andA0435Like(String value) {
            addCriterion("A0435 like", value, "a0435");
            return (Criteria) this;
        }

        public Criteria andA0435NotLike(String value) {
            addCriterion("A0435 not like", value, "a0435");
            return (Criteria) this;
        }

        public Criteria andA0435In(List<String> values) {
            addCriterion("A0435 in", values, "a0435");
            return (Criteria) this;
        }

        public Criteria andA0435NotIn(List<String> values) {
            addCriterion("A0435 not in", values, "a0435");
            return (Criteria) this;
        }

        public Criteria andA0435Between(String value1, String value2) {
            addCriterion("A0435 between", value1, value2, "a0435");
            return (Criteria) this;
        }

        public Criteria andA0435NotBetween(String value1, String value2) {
            addCriterion("A0435 not between", value1, value2, "a0435");
            return (Criteria) this;
        }

        public Criteria andA04acIsNull() {
            addCriterion("A04AC is null");
            return (Criteria) this;
        }

        public Criteria andA04acIsNotNull() {
            addCriterion("A04AC is not null");
            return (Criteria) this;
        }

        public Criteria andA04acEqualTo(String value) {
            addCriterion("A04AC =", value, "a04ac");
            return (Criteria) this;
        }

        public Criteria andA04acNotEqualTo(String value) {
            addCriterion("A04AC <>", value, "a04ac");
            return (Criteria) this;
        }

        public Criteria andA04acGreaterThan(String value) {
            addCriterion("A04AC >", value, "a04ac");
            return (Criteria) this;
        }

        public Criteria andA04acGreaterThanOrEqualTo(String value) {
            addCriterion("A04AC >=", value, "a04ac");
            return (Criteria) this;
        }

        public Criteria andA04acLessThan(String value) {
            addCriterion("A04AC <", value, "a04ac");
            return (Criteria) this;
        }

        public Criteria andA04acLessThanOrEqualTo(String value) {
            addCriterion("A04AC <=", value, "a04ac");
            return (Criteria) this;
        }

        public Criteria andA04acLike(String value) {
            addCriterion("A04AC like", value, "a04ac");
            return (Criteria) this;
        }

        public Criteria andA04acNotLike(String value) {
            addCriterion("A04AC not like", value, "a04ac");
            return (Criteria) this;
        }

        public Criteria andA04acIn(List<String> values) {
            addCriterion("A04AC in", values, "a04ac");
            return (Criteria) this;
        }

        public Criteria andA04acNotIn(List<String> values) {
            addCriterion("A04AC not in", values, "a04ac");
            return (Criteria) this;
        }

        public Criteria andA04acBetween(String value1, String value2) {
            addCriterion("A04AC between", value1, value2, "a04ac");
            return (Criteria) this;
        }

        public Criteria andA04acNotBetween(String value1, String value2) {
            addCriterion("A04AC not between", value1, value2, "a04ac");
            return (Criteria) this;
        }

        public Criteria andA0410IsNull() {
            addCriterion("A0410 is null");
            return (Criteria) this;
        }

        public Criteria andA0410IsNotNull() {
            addCriterion("A0410 is not null");
            return (Criteria) this;
        }

        public Criteria andA0410EqualTo(String value) {
            addCriterion("A0410 =", value, "a0410");
            return (Criteria) this;
        }

        public Criteria andA0410NotEqualTo(String value) {
            addCriterion("A0410 <>", value, "a0410");
            return (Criteria) this;
        }

        public Criteria andA0410GreaterThan(String value) {
            addCriterion("A0410 >", value, "a0410");
            return (Criteria) this;
        }

        public Criteria andA0410GreaterThanOrEqualTo(String value) {
            addCriterion("A0410 >=", value, "a0410");
            return (Criteria) this;
        }

        public Criteria andA0410LessThan(String value) {
            addCriterion("A0410 <", value, "a0410");
            return (Criteria) this;
        }

        public Criteria andA0410LessThanOrEqualTo(String value) {
            addCriterion("A0410 <=", value, "a0410");
            return (Criteria) this;
        }

        public Criteria andA0410Like(String value) {
            addCriterion("A0410 like", value, "a0410");
            return (Criteria) this;
        }

        public Criteria andA0410NotLike(String value) {
            addCriterion("A0410 not like", value, "a0410");
            return (Criteria) this;
        }

        public Criteria andA0410In(List<String> values) {
            addCriterion("A0410 in", values, "a0410");
            return (Criteria) this;
        }

        public Criteria andA0410NotIn(List<String> values) {
            addCriterion("A0410 not in", values, "a0410");
            return (Criteria) this;
        }

        public Criteria andA0410Between(String value1, String value2) {
            addCriterion("A0410 between", value1, value2, "a0410");
            return (Criteria) this;
        }

        public Criteria andA0410NotBetween(String value1, String value2) {
            addCriterion("A0410 not between", value1, value2, "a0410");
            return (Criteria) this;
        }

        public Criteria andA04adIsNull() {
            addCriterion("A04AD is null");
            return (Criteria) this;
        }

        public Criteria andA04adIsNotNull() {
            addCriterion("A04AD is not null");
            return (Criteria) this;
        }

        public Criteria andA04adEqualTo(String value) {
            addCriterion("A04AD =", value, "a04ad");
            return (Criteria) this;
        }

        public Criteria andA04adNotEqualTo(String value) {
            addCriterion("A04AD <>", value, "a04ad");
            return (Criteria) this;
        }

        public Criteria andA04adGreaterThan(String value) {
            addCriterion("A04AD >", value, "a04ad");
            return (Criteria) this;
        }

        public Criteria andA04adGreaterThanOrEqualTo(String value) {
            addCriterion("A04AD >=", value, "a04ad");
            return (Criteria) this;
        }

        public Criteria andA04adLessThan(String value) {
            addCriterion("A04AD <", value, "a04ad");
            return (Criteria) this;
        }

        public Criteria andA04adLessThanOrEqualTo(String value) {
            addCriterion("A04AD <=", value, "a04ad");
            return (Criteria) this;
        }

        public Criteria andA04adLike(String value) {
            addCriterion("A04AD like", value, "a04ad");
            return (Criteria) this;
        }

        public Criteria andA04adNotLike(String value) {
            addCriterion("A04AD not like", value, "a04ad");
            return (Criteria) this;
        }

        public Criteria andA04adIn(List<String> values) {
            addCriterion("A04AD in", values, "a04ad");
            return (Criteria) this;
        }

        public Criteria andA04adNotIn(List<String> values) {
            addCriterion("A04AD not in", values, "a04ad");
            return (Criteria) this;
        }

        public Criteria andA04adBetween(String value1, String value2) {
            addCriterion("A04AD between", value1, value2, "a04ad");
            return (Criteria) this;
        }

        public Criteria andA04adNotBetween(String value1, String value2) {
            addCriterion("A04AD not between", value1, value2, "a04ad");
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