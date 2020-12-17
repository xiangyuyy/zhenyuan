package com.macro.mall.model;

import java.util.ArrayList;
import java.util.List;

public class YjjgExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YjjgExample() {
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

        public Criteria andYjhdsIsNull() {
            addCriterion("yjhds is null");
            return (Criteria) this;
        }

        public Criteria andYjhdsIsNotNull() {
            addCriterion("yjhds is not null");
            return (Criteria) this;
        }

        public Criteria andYjhdsEqualTo(Integer value) {
            addCriterion("yjhds =", value, "yjhds");
            return (Criteria) this;
        }

        public Criteria andYjhdsNotEqualTo(Integer value) {
            addCriterion("yjhds <>", value, "yjhds");
            return (Criteria) this;
        }

        public Criteria andYjhdsGreaterThan(Integer value) {
            addCriterion("yjhds >", value, "yjhds");
            return (Criteria) this;
        }

        public Criteria andYjhdsGreaterThanOrEqualTo(Integer value) {
            addCriterion("yjhds >=", value, "yjhds");
            return (Criteria) this;
        }

        public Criteria andYjhdsLessThan(Integer value) {
            addCriterion("yjhds <", value, "yjhds");
            return (Criteria) this;
        }

        public Criteria andYjhdsLessThanOrEqualTo(Integer value) {
            addCriterion("yjhds <=", value, "yjhds");
            return (Criteria) this;
        }

        public Criteria andYjhdsIn(List<Integer> values) {
            addCriterion("yjhds in", values, "yjhds");
            return (Criteria) this;
        }

        public Criteria andYjhdsNotIn(List<Integer> values) {
            addCriterion("yjhds not in", values, "yjhds");
            return (Criteria) this;
        }

        public Criteria andYjhdsBetween(Integer value1, Integer value2) {
            addCriterion("yjhds between", value1, value2, "yjhds");
            return (Criteria) this;
        }

        public Criteria andYjhdsNotBetween(Integer value1, Integer value2) {
            addCriterion("yjhds not between", value1, value2, "yjhds");
            return (Criteria) this;
        }

        public Criteria andZyzysIsNull() {
            addCriterion("zyzys is null");
            return (Criteria) this;
        }

        public Criteria andZyzysIsNotNull() {
            addCriterion("zyzys is not null");
            return (Criteria) this;
        }

        public Criteria andZyzysEqualTo(Integer value) {
            addCriterion("zyzys =", value, "zyzys");
            return (Criteria) this;
        }

        public Criteria andZyzysNotEqualTo(Integer value) {
            addCriterion("zyzys <>", value, "zyzys");
            return (Criteria) this;
        }

        public Criteria andZyzysGreaterThan(Integer value) {
            addCriterion("zyzys >", value, "zyzys");
            return (Criteria) this;
        }

        public Criteria andZyzysGreaterThanOrEqualTo(Integer value) {
            addCriterion("zyzys >=", value, "zyzys");
            return (Criteria) this;
        }

        public Criteria andZyzysLessThan(Integer value) {
            addCriterion("zyzys <", value, "zyzys");
            return (Criteria) this;
        }

        public Criteria andZyzysLessThanOrEqualTo(Integer value) {
            addCriterion("zyzys <=", value, "zyzys");
            return (Criteria) this;
        }

        public Criteria andZyzysIn(List<Integer> values) {
            addCriterion("zyzys in", values, "zyzys");
            return (Criteria) this;
        }

        public Criteria andZyzysNotIn(List<Integer> values) {
            addCriterion("zyzys not in", values, "zyzys");
            return (Criteria) this;
        }

        public Criteria andZyzysBetween(Integer value1, Integer value2) {
            addCriterion("zyzys between", value1, value2, "zyzys");
            return (Criteria) this;
        }

        public Criteria andZyzysNotBetween(Integer value1, Integer value2) {
            addCriterion("zyzys not between", value1, value2, "zyzys");
            return (Criteria) this;
        }

        public Criteria andZyysIsNull() {
            addCriterion("zyys is null");
            return (Criteria) this;
        }

        public Criteria andZyysIsNotNull() {
            addCriterion("zyys is not null");
            return (Criteria) this;
        }

        public Criteria andZyysEqualTo(Integer value) {
            addCriterion("zyys =", value, "zyys");
            return (Criteria) this;
        }

        public Criteria andZyysNotEqualTo(Integer value) {
            addCriterion("zyys <>", value, "zyys");
            return (Criteria) this;
        }

        public Criteria andZyysGreaterThan(Integer value) {
            addCriterion("zyys >", value, "zyys");
            return (Criteria) this;
        }

        public Criteria andZyysGreaterThanOrEqualTo(Integer value) {
            addCriterion("zyys >=", value, "zyys");
            return (Criteria) this;
        }

        public Criteria andZyysLessThan(Integer value) {
            addCriterion("zyys <", value, "zyys");
            return (Criteria) this;
        }

        public Criteria andZyysLessThanOrEqualTo(Integer value) {
            addCriterion("zyys <=", value, "zyys");
            return (Criteria) this;
        }

        public Criteria andZyysIn(List<Integer> values) {
            addCriterion("zyys in", values, "zyys");
            return (Criteria) this;
        }

        public Criteria andZyysNotIn(List<Integer> values) {
            addCriterion("zyys not in", values, "zyys");
            return (Criteria) this;
        }

        public Criteria andZyysBetween(Integer value1, Integer value2) {
            addCriterion("zyys between", value1, value2, "zyys");
            return (Criteria) this;
        }

        public Criteria andZyysNotBetween(Integer value1, Integer value2) {
            addCriterion("zyys not between", value1, value2, "zyys");
            return (Criteria) this;
        }

        public Criteria andZysIsNull() {
            addCriterion("zys is null");
            return (Criteria) this;
        }

        public Criteria andZysIsNotNull() {
            addCriterion("zys is not null");
            return (Criteria) this;
        }

        public Criteria andZysEqualTo(Integer value) {
            addCriterion("zys =", value, "zys");
            return (Criteria) this;
        }

        public Criteria andZysNotEqualTo(Integer value) {
            addCriterion("zys <>", value, "zys");
            return (Criteria) this;
        }

        public Criteria andZysGreaterThan(Integer value) {
            addCriterion("zys >", value, "zys");
            return (Criteria) this;
        }

        public Criteria andZysGreaterThanOrEqualTo(Integer value) {
            addCriterion("zys >=", value, "zys");
            return (Criteria) this;
        }

        public Criteria andZysLessThan(Integer value) {
            addCriterion("zys <", value, "zys");
            return (Criteria) this;
        }

        public Criteria andZysLessThanOrEqualTo(Integer value) {
            addCriterion("zys <=", value, "zys");
            return (Criteria) this;
        }

        public Criteria andZysIn(List<Integer> values) {
            addCriterion("zys in", values, "zys");
            return (Criteria) this;
        }

        public Criteria andZysNotIn(List<Integer> values) {
            addCriterion("zys not in", values, "zys");
            return (Criteria) this;
        }

        public Criteria andZysBetween(Integer value1, Integer value2) {
            addCriterion("zys between", value1, value2, "zys");
            return (Criteria) this;
        }

        public Criteria andZysNotBetween(Integer value1, Integer value2) {
            addCriterion("zys not between", value1, value2, "zys");
            return (Criteria) this;
        }

        public Criteria andYsIsNull() {
            addCriterion("ys is null");
            return (Criteria) this;
        }

        public Criteria andYsIsNotNull() {
            addCriterion("ys is not null");
            return (Criteria) this;
        }

        public Criteria andYsEqualTo(Integer value) {
            addCriterion("ys =", value, "ys");
            return (Criteria) this;
        }

        public Criteria andYsNotEqualTo(Integer value) {
            addCriterion("ys <>", value, "ys");
            return (Criteria) this;
        }

        public Criteria andYsGreaterThan(Integer value) {
            addCriterion("ys >", value, "ys");
            return (Criteria) this;
        }

        public Criteria andYsGreaterThanOrEqualTo(Integer value) {
            addCriterion("ys >=", value, "ys");
            return (Criteria) this;
        }

        public Criteria andYsLessThan(Integer value) {
            addCriterion("ys <", value, "ys");
            return (Criteria) this;
        }

        public Criteria andYsLessThanOrEqualTo(Integer value) {
            addCriterion("ys <=", value, "ys");
            return (Criteria) this;
        }

        public Criteria andYsIn(List<Integer> values) {
            addCriterion("ys in", values, "ys");
            return (Criteria) this;
        }

        public Criteria andYsNotIn(List<Integer> values) {
            addCriterion("ys not in", values, "ys");
            return (Criteria) this;
        }

        public Criteria andYsBetween(Integer value1, Integer value2) {
            addCriterion("ys between", value1, value2, "ys");
            return (Criteria) this;
        }

        public Criteria andYsNotBetween(Integer value1, Integer value2) {
            addCriterion("ys not between", value1, value2, "ys");
            return (Criteria) this;
        }

        public Criteria andJgIsNull() {
            addCriterion("jg is null");
            return (Criteria) this;
        }

        public Criteria andJgIsNotNull() {
            addCriterion("jg is not null");
            return (Criteria) this;
        }

        public Criteria andJgEqualTo(Integer value) {
            addCriterion("jg =", value, "jg");
            return (Criteria) this;
        }

        public Criteria andJgNotEqualTo(Integer value) {
            addCriterion("jg <>", value, "jg");
            return (Criteria) this;
        }

        public Criteria andJgGreaterThan(Integer value) {
            addCriterion("jg >", value, "jg");
            return (Criteria) this;
        }

        public Criteria andJgGreaterThanOrEqualTo(Integer value) {
            addCriterion("jg >=", value, "jg");
            return (Criteria) this;
        }

        public Criteria andJgLessThan(Integer value) {
            addCriterion("jg <", value, "jg");
            return (Criteria) this;
        }

        public Criteria andJgLessThanOrEqualTo(Integer value) {
            addCriterion("jg <=", value, "jg");
            return (Criteria) this;
        }

        public Criteria andJgIn(List<Integer> values) {
            addCriterion("jg in", values, "jg");
            return (Criteria) this;
        }

        public Criteria andJgNotIn(List<Integer> values) {
            addCriterion("jg not in", values, "jg");
            return (Criteria) this;
        }

        public Criteria andJgBetween(Integer value1, Integer value2) {
            addCriterion("jg between", value1, value2, "jg");
            return (Criteria) this;
        }

        public Criteria andJgNotBetween(Integer value1, Integer value2) {
            addCriterion("jg not between", value1, value2, "jg");
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