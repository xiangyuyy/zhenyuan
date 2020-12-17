package com.macro.mall.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class YjyqExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YjyqExample() {
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

        public Criteria andJgbmIsNull() {
            addCriterion("jgbm is null");
            return (Criteria) this;
        }

        public Criteria andJgbmIsNotNull() {
            addCriterion("jgbm is not null");
            return (Criteria) this;
        }

        public Criteria andJgbmEqualTo(String value) {
            addCriterion("jgbm =", value, "jgbm");
            return (Criteria) this;
        }

        public Criteria andJgbmNotEqualTo(String value) {
            addCriterion("jgbm <>", value, "jgbm");
            return (Criteria) this;
        }

        public Criteria andJgbmGreaterThan(String value) {
            addCriterion("jgbm >", value, "jgbm");
            return (Criteria) this;
        }

        public Criteria andJgbmGreaterThanOrEqualTo(String value) {
            addCriterion("jgbm >=", value, "jgbm");
            return (Criteria) this;
        }

        public Criteria andJgbmLessThan(String value) {
            addCriterion("jgbm <", value, "jgbm");
            return (Criteria) this;
        }

        public Criteria andJgbmLessThanOrEqualTo(String value) {
            addCriterion("jgbm <=", value, "jgbm");
            return (Criteria) this;
        }

        public Criteria andJgbmLike(String value) {
            addCriterion("jgbm like", value, "jgbm");
            return (Criteria) this;
        }

        public Criteria andJgbmNotLike(String value) {
            addCriterion("jgbm not like", value, "jgbm");
            return (Criteria) this;
        }

        public Criteria andJgbmIn(List<String> values) {
            addCriterion("jgbm in", values, "jgbm");
            return (Criteria) this;
        }

        public Criteria andJgbmNotIn(List<String> values) {
            addCriterion("jgbm not in", values, "jgbm");
            return (Criteria) this;
        }

        public Criteria andJgbmBetween(String value1, String value2) {
            addCriterion("jgbm between", value1, value2, "jgbm");
            return (Criteria) this;
        }

        public Criteria andJgbmNotBetween(String value1, String value2) {
            addCriterion("jgbm not between", value1, value2, "jgbm");
            return (Criteria) this;
        }

        public Criteria andSfybmdIsNull() {
            addCriterion("sfybmd is null");
            return (Criteria) this;
        }

        public Criteria andSfybmdIsNotNull() {
            addCriterion("sfybmd is not null");
            return (Criteria) this;
        }

        public Criteria andSfybmdEqualTo(String value) {
            addCriterion("sfybmd =", value, "sfybmd");
            return (Criteria) this;
        }

        public Criteria andSfybmdNotEqualTo(String value) {
            addCriterion("sfybmd <>", value, "sfybmd");
            return (Criteria) this;
        }

        public Criteria andSfybmdGreaterThan(String value) {
            addCriterion("sfybmd >", value, "sfybmd");
            return (Criteria) this;
        }

        public Criteria andSfybmdGreaterThanOrEqualTo(String value) {
            addCriterion("sfybmd >=", value, "sfybmd");
            return (Criteria) this;
        }

        public Criteria andSfybmdLessThan(String value) {
            addCriterion("sfybmd <", value, "sfybmd");
            return (Criteria) this;
        }

        public Criteria andSfybmdLessThanOrEqualTo(String value) {
            addCriterion("sfybmd <=", value, "sfybmd");
            return (Criteria) this;
        }

        public Criteria andSfybmdLike(String value) {
            addCriterion("sfybmd like", value, "sfybmd");
            return (Criteria) this;
        }

        public Criteria andSfybmdNotLike(String value) {
            addCriterion("sfybmd not like", value, "sfybmd");
            return (Criteria) this;
        }

        public Criteria andSfybmdIn(List<String> values) {
            addCriterion("sfybmd in", values, "sfybmd");
            return (Criteria) this;
        }

        public Criteria andSfybmdNotIn(List<String> values) {
            addCriterion("sfybmd not in", values, "sfybmd");
            return (Criteria) this;
        }

        public Criteria andSfybmdBetween(String value1, String value2) {
            addCriterion("sfybmd between", value1, value2, "sfybmd");
            return (Criteria) this;
        }

        public Criteria andSfybmdNotBetween(String value1, String value2) {
            addCriterion("sfybmd not between", value1, value2, "sfybmd");
            return (Criteria) this;
        }

        public Criteria andYcsfIsNull() {
            addCriterion("ycsf is null");
            return (Criteria) this;
        }

        public Criteria andYcsfIsNotNull() {
            addCriterion("ycsf is not null");
            return (Criteria) this;
        }

        public Criteria andYcsfEqualTo(String value) {
            addCriterion("ycsf =", value, "ycsf");
            return (Criteria) this;
        }

        public Criteria andYcsfNotEqualTo(String value) {
            addCriterion("ycsf <>", value, "ycsf");
            return (Criteria) this;
        }

        public Criteria andYcsfGreaterThan(String value) {
            addCriterion("ycsf >", value, "ycsf");
            return (Criteria) this;
        }

        public Criteria andYcsfGreaterThanOrEqualTo(String value) {
            addCriterion("ycsf >=", value, "ycsf");
            return (Criteria) this;
        }

        public Criteria andYcsfLessThan(String value) {
            addCriterion("ycsf <", value, "ycsf");
            return (Criteria) this;
        }

        public Criteria andYcsfLessThanOrEqualTo(String value) {
            addCriterion("ycsf <=", value, "ycsf");
            return (Criteria) this;
        }

        public Criteria andYcsfLike(String value) {
            addCriterion("ycsf like", value, "ycsf");
            return (Criteria) this;
        }

        public Criteria andYcsfNotLike(String value) {
            addCriterion("ycsf not like", value, "ycsf");
            return (Criteria) this;
        }

        public Criteria andYcsfIn(List<String> values) {
            addCriterion("ycsf in", values, "ycsf");
            return (Criteria) this;
        }

        public Criteria andYcsfNotIn(List<String> values) {
            addCriterion("ycsf not in", values, "ycsf");
            return (Criteria) this;
        }

        public Criteria andYcsfBetween(String value1, String value2) {
            addCriterion("ycsf between", value1, value2, "ycsf");
            return (Criteria) this;
        }

        public Criteria andYcsfNotBetween(String value1, String value2) {
            addCriterion("ycsf not between", value1, value2, "ycsf");
            return (Criteria) this;
        }

        public Criteria andYwzyIsNull() {
            addCriterion("ywzy is null");
            return (Criteria) this;
        }

        public Criteria andYwzyIsNotNull() {
            addCriterion("ywzy is not null");
            return (Criteria) this;
        }

        public Criteria andYwzyEqualTo(String value) {
            addCriterion("ywzy =", value, "ywzy");
            return (Criteria) this;
        }

        public Criteria andYwzyNotEqualTo(String value) {
            addCriterion("ywzy <>", value, "ywzy");
            return (Criteria) this;
        }

        public Criteria andYwzyGreaterThan(String value) {
            addCriterion("ywzy >", value, "ywzy");
            return (Criteria) this;
        }

        public Criteria andYwzyGreaterThanOrEqualTo(String value) {
            addCriterion("ywzy >=", value, "ywzy");
            return (Criteria) this;
        }

        public Criteria andYwzyLessThan(String value) {
            addCriterion("ywzy <", value, "ywzy");
            return (Criteria) this;
        }

        public Criteria andYwzyLessThanOrEqualTo(String value) {
            addCriterion("ywzy <=", value, "ywzy");
            return (Criteria) this;
        }

        public Criteria andYwzyLike(String value) {
            addCriterion("ywzy like", value, "ywzy");
            return (Criteria) this;
        }

        public Criteria andYwzyNotLike(String value) {
            addCriterion("ywzy not like", value, "ywzy");
            return (Criteria) this;
        }

        public Criteria andYwzyIn(List<String> values) {
            addCriterion("ywzy in", values, "ywzy");
            return (Criteria) this;
        }

        public Criteria andYwzyNotIn(List<String> values) {
            addCriterion("ywzy not in", values, "ywzy");
            return (Criteria) this;
        }

        public Criteria andYwzyBetween(String value1, String value2) {
            addCriterion("ywzy between", value1, value2, "ywzy");
            return (Criteria) this;
        }

        public Criteria andYwzyNotBetween(String value1, String value2) {
            addCriterion("ywzy not between", value1, value2, "ywzy");
            return (Criteria) this;
        }

        public Criteria andMdmjIsNull() {
            addCriterion("mdmj is null");
            return (Criteria) this;
        }

        public Criteria andMdmjIsNotNull() {
            addCriterion("mdmj is not null");
            return (Criteria) this;
        }

        public Criteria andMdmjEqualTo(BigDecimal value) {
            addCriterion("mdmj =", value, "mdmj");
            return (Criteria) this;
        }

        public Criteria andMdmjNotEqualTo(BigDecimal value) {
            addCriterion("mdmj <>", value, "mdmj");
            return (Criteria) this;
        }

        public Criteria andMdmjGreaterThan(BigDecimal value) {
            addCriterion("mdmj >", value, "mdmj");
            return (Criteria) this;
        }

        public Criteria andMdmjGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("mdmj >=", value, "mdmj");
            return (Criteria) this;
        }

        public Criteria andMdmjLessThan(BigDecimal value) {
            addCriterion("mdmj <", value, "mdmj");
            return (Criteria) this;
        }

        public Criteria andMdmjLessThanOrEqualTo(BigDecimal value) {
            addCriterion("mdmj <=", value, "mdmj");
            return (Criteria) this;
        }

        public Criteria andMdmjIn(List<BigDecimal> values) {
            addCriterion("mdmj in", values, "mdmj");
            return (Criteria) this;
        }

        public Criteria andMdmjNotIn(List<BigDecimal> values) {
            addCriterion("mdmj not in", values, "mdmj");
            return (Criteria) this;
        }

        public Criteria andMdmjBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mdmj between", value1, value2, "mdmj");
            return (Criteria) this;
        }

        public Criteria andMdmjNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mdmj not between", value1, value2, "mdmj");
            return (Criteria) this;
        }

        public Criteria andLsgxIsNull() {
            addCriterion("lsgx is null");
            return (Criteria) this;
        }

        public Criteria andLsgxIsNotNull() {
            addCriterion("lsgx is not null");
            return (Criteria) this;
        }

        public Criteria andLsgxEqualTo(String value) {
            addCriterion("lsgx =", value, "lsgx");
            return (Criteria) this;
        }

        public Criteria andLsgxNotEqualTo(String value) {
            addCriterion("lsgx <>", value, "lsgx");
            return (Criteria) this;
        }

        public Criteria andLsgxGreaterThan(String value) {
            addCriterion("lsgx >", value, "lsgx");
            return (Criteria) this;
        }

        public Criteria andLsgxGreaterThanOrEqualTo(String value) {
            addCriterion("lsgx >=", value, "lsgx");
            return (Criteria) this;
        }

        public Criteria andLsgxLessThan(String value) {
            addCriterion("lsgx <", value, "lsgx");
            return (Criteria) this;
        }

        public Criteria andLsgxLessThanOrEqualTo(String value) {
            addCriterion("lsgx <=", value, "lsgx");
            return (Criteria) this;
        }

        public Criteria andLsgxLike(String value) {
            addCriterion("lsgx like", value, "lsgx");
            return (Criteria) this;
        }

        public Criteria andLsgxNotLike(String value) {
            addCriterion("lsgx not like", value, "lsgx");
            return (Criteria) this;
        }

        public Criteria andLsgxIn(List<String> values) {
            addCriterion("lsgx in", values, "lsgx");
            return (Criteria) this;
        }

        public Criteria andLsgxNotIn(List<String> values) {
            addCriterion("lsgx not in", values, "lsgx");
            return (Criteria) this;
        }

        public Criteria andLsgxBetween(String value1, String value2) {
            addCriterion("lsgx between", value1, value2, "lsgx");
            return (Criteria) this;
        }

        public Criteria andLsgxNotBetween(String value1, String value2) {
            addCriterion("lsgx not between", value1, value2, "lsgx");
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