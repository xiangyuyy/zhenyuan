package com.macro.mall.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CodeitemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CodeitemExample() {
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

        public Criteria andCodesetidIsNull() {
            addCriterion("codesetid is null");
            return (Criteria) this;
        }

        public Criteria andCodesetidIsNotNull() {
            addCriterion("codesetid is not null");
            return (Criteria) this;
        }

        public Criteria andCodesetidEqualTo(String value) {
            addCriterion("codesetid =", value, "codesetid");
            return (Criteria) this;
        }

        public Criteria andCodesetidNotEqualTo(String value) {
            addCriterion("codesetid <>", value, "codesetid");
            return (Criteria) this;
        }

        public Criteria andCodesetidGreaterThan(String value) {
            addCriterion("codesetid >", value, "codesetid");
            return (Criteria) this;
        }

        public Criteria andCodesetidGreaterThanOrEqualTo(String value) {
            addCriterion("codesetid >=", value, "codesetid");
            return (Criteria) this;
        }

        public Criteria andCodesetidLessThan(String value) {
            addCriterion("codesetid <", value, "codesetid");
            return (Criteria) this;
        }

        public Criteria andCodesetidLessThanOrEqualTo(String value) {
            addCriterion("codesetid <=", value, "codesetid");
            return (Criteria) this;
        }

        public Criteria andCodesetidLike(String value) {
            addCriterion("codesetid like", value, "codesetid");
            return (Criteria) this;
        }

        public Criteria andCodesetidNotLike(String value) {
            addCriterion("codesetid not like", value, "codesetid");
            return (Criteria) this;
        }

        public Criteria andCodesetidIn(List<String> values) {
            addCriterion("codesetid in", values, "codesetid");
            return (Criteria) this;
        }

        public Criteria andCodesetidNotIn(List<String> values) {
            addCriterion("codesetid not in", values, "codesetid");
            return (Criteria) this;
        }

        public Criteria andCodesetidBetween(String value1, String value2) {
            addCriterion("codesetid between", value1, value2, "codesetid");
            return (Criteria) this;
        }

        public Criteria andCodesetidNotBetween(String value1, String value2) {
            addCriterion("codesetid not between", value1, value2, "codesetid");
            return (Criteria) this;
        }

        public Criteria andCodeitemidIsNull() {
            addCriterion("codeitemid is null");
            return (Criteria) this;
        }

        public Criteria andCodeitemidIsNotNull() {
            addCriterion("codeitemid is not null");
            return (Criteria) this;
        }

        public Criteria andCodeitemidEqualTo(String value) {
            addCriterion("codeitemid =", value, "codeitemid");
            return (Criteria) this;
        }

        public Criteria andCodeitemidNotEqualTo(String value) {
            addCriterion("codeitemid <>", value, "codeitemid");
            return (Criteria) this;
        }

        public Criteria andCodeitemidGreaterThan(String value) {
            addCriterion("codeitemid >", value, "codeitemid");
            return (Criteria) this;
        }

        public Criteria andCodeitemidGreaterThanOrEqualTo(String value) {
            addCriterion("codeitemid >=", value, "codeitemid");
            return (Criteria) this;
        }

        public Criteria andCodeitemidLessThan(String value) {
            addCriterion("codeitemid <", value, "codeitemid");
            return (Criteria) this;
        }

        public Criteria andCodeitemidLessThanOrEqualTo(String value) {
            addCriterion("codeitemid <=", value, "codeitemid");
            return (Criteria) this;
        }

        public Criteria andCodeitemidLike(String value) {
            addCriterion("codeitemid like", value, "codeitemid");
            return (Criteria) this;
        }

        public Criteria andCodeitemidNotLike(String value) {
            addCriterion("codeitemid not like", value, "codeitemid");
            return (Criteria) this;
        }

        public Criteria andCodeitemidIn(List<String> values) {
            addCriterion("codeitemid in", values, "codeitemid");
            return (Criteria) this;
        }

        public Criteria andCodeitemidNotIn(List<String> values) {
            addCriterion("codeitemid not in", values, "codeitemid");
            return (Criteria) this;
        }

        public Criteria andCodeitemidBetween(String value1, String value2) {
            addCriterion("codeitemid between", value1, value2, "codeitemid");
            return (Criteria) this;
        }

        public Criteria andCodeitemidNotBetween(String value1, String value2) {
            addCriterion("codeitemid not between", value1, value2, "codeitemid");
            return (Criteria) this;
        }

        public Criteria andCodeitemdescIsNull() {
            addCriterion("codeitemdesc is null");
            return (Criteria) this;
        }

        public Criteria andCodeitemdescIsNotNull() {
            addCriterion("codeitemdesc is not null");
            return (Criteria) this;
        }

        public Criteria andCodeitemdescEqualTo(String value) {
            addCriterion("codeitemdesc =", value, "codeitemdesc");
            return (Criteria) this;
        }

        public Criteria andCodeitemdescNotEqualTo(String value) {
            addCriterion("codeitemdesc <>", value, "codeitemdesc");
            return (Criteria) this;
        }

        public Criteria andCodeitemdescGreaterThan(String value) {
            addCriterion("codeitemdesc >", value, "codeitemdesc");
            return (Criteria) this;
        }

        public Criteria andCodeitemdescGreaterThanOrEqualTo(String value) {
            addCriterion("codeitemdesc >=", value, "codeitemdesc");
            return (Criteria) this;
        }

        public Criteria andCodeitemdescLessThan(String value) {
            addCriterion("codeitemdesc <", value, "codeitemdesc");
            return (Criteria) this;
        }

        public Criteria andCodeitemdescLessThanOrEqualTo(String value) {
            addCriterion("codeitemdesc <=", value, "codeitemdesc");
            return (Criteria) this;
        }

        public Criteria andCodeitemdescLike(String value) {
            addCriterion("codeitemdesc like", value, "codeitemdesc");
            return (Criteria) this;
        }

        public Criteria andCodeitemdescNotLike(String value) {
            addCriterion("codeitemdesc not like", value, "codeitemdesc");
            return (Criteria) this;
        }

        public Criteria andCodeitemdescIn(List<String> values) {
            addCriterion("codeitemdesc in", values, "codeitemdesc");
            return (Criteria) this;
        }

        public Criteria andCodeitemdescNotIn(List<String> values) {
            addCriterion("codeitemdesc not in", values, "codeitemdesc");
            return (Criteria) this;
        }

        public Criteria andCodeitemdescBetween(String value1, String value2) {
            addCriterion("codeitemdesc between", value1, value2, "codeitemdesc");
            return (Criteria) this;
        }

        public Criteria andCodeitemdescNotBetween(String value1, String value2) {
            addCriterion("codeitemdesc not between", value1, value2, "codeitemdesc");
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