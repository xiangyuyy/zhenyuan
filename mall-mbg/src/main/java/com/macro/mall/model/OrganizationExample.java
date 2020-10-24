package com.macro.mall.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrganizationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrganizationExample() {
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

        public Criteria andParentidIsNull() {
            addCriterion("parentid is null");
            return (Criteria) this;
        }

        public Criteria andParentidIsNotNull() {
            addCriterion("parentid is not null");
            return (Criteria) this;
        }

        public Criteria andParentidEqualTo(String value) {
            addCriterion("parentid =", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotEqualTo(String value) {
            addCriterion("parentid <>", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThan(String value) {
            addCriterion("parentid >", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThanOrEqualTo(String value) {
            addCriterion("parentid >=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThan(String value) {
            addCriterion("parentid <", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThanOrEqualTo(String value) {
            addCriterion("parentid <=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLike(String value) {
            addCriterion("parentid like", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotLike(String value) {
            addCriterion("parentid not like", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidIn(List<String> values) {
            addCriterion("parentid in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotIn(List<String> values) {
            addCriterion("parentid not in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidBetween(String value1, String value2) {
            addCriterion("parentid between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotBetween(String value1, String value2) {
            addCriterion("parentid not between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andChildidIsNull() {
            addCriterion("childid is null");
            return (Criteria) this;
        }

        public Criteria andChildidIsNotNull() {
            addCriterion("childid is not null");
            return (Criteria) this;
        }

        public Criteria andChildidEqualTo(String value) {
            addCriterion("childid =", value, "childid");
            return (Criteria) this;
        }

        public Criteria andChildidNotEqualTo(String value) {
            addCriterion("childid <>", value, "childid");
            return (Criteria) this;
        }

        public Criteria andChildidGreaterThan(String value) {
            addCriterion("childid >", value, "childid");
            return (Criteria) this;
        }

        public Criteria andChildidGreaterThanOrEqualTo(String value) {
            addCriterion("childid >=", value, "childid");
            return (Criteria) this;
        }

        public Criteria andChildidLessThan(String value) {
            addCriterion("childid <", value, "childid");
            return (Criteria) this;
        }

        public Criteria andChildidLessThanOrEqualTo(String value) {
            addCriterion("childid <=", value, "childid");
            return (Criteria) this;
        }

        public Criteria andChildidLike(String value) {
            addCriterion("childid like", value, "childid");
            return (Criteria) this;
        }

        public Criteria andChildidNotLike(String value) {
            addCriterion("childid not like", value, "childid");
            return (Criteria) this;
        }

        public Criteria andChildidIn(List<String> values) {
            addCriterion("childid in", values, "childid");
            return (Criteria) this;
        }

        public Criteria andChildidNotIn(List<String> values) {
            addCriterion("childid not in", values, "childid");
            return (Criteria) this;
        }

        public Criteria andChildidBetween(String value1, String value2) {
            addCriterion("childid between", value1, value2, "childid");
            return (Criteria) this;
        }

        public Criteria andChildidNotBetween(String value1, String value2) {
            addCriterion("childid not between", value1, value2, "childid");
            return (Criteria) this;
        }

        public Criteria andGradeIsNull() {
            addCriterion("grade is null");
            return (Criteria) this;
        }

        public Criteria andGradeIsNotNull() {
            addCriterion("grade is not null");
            return (Criteria) this;
        }

        public Criteria andGradeEqualTo(Integer value) {
            addCriterion("grade =", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotEqualTo(Integer value) {
            addCriterion("grade <>", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThan(Integer value) {
            addCriterion("grade >", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("grade >=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThan(Integer value) {
            addCriterion("grade <", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThanOrEqualTo(Integer value) {
            addCriterion("grade <=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeIn(List<Integer> values) {
            addCriterion("grade in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotIn(List<Integer> values) {
            addCriterion("grade not in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeBetween(Integer value1, Integer value2) {
            addCriterion("grade between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("grade not between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNull() {
            addCriterion("start_date is null");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNotNull() {
            addCriterion("start_date is not null");
            return (Criteria) this;
        }

        public Criteria andStartDateEqualTo(Date value) {
            addCriterion("start_date =", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotEqualTo(Date value) {
            addCriterion("start_date <>", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThan(Date value) {
            addCriterion("start_date >", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(Date value) {
            addCriterion("start_date >=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThan(Date value) {
            addCriterion("start_date <", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThanOrEqualTo(Date value) {
            addCriterion("start_date <=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIn(List<Date> values) {
            addCriterion("start_date in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotIn(List<Date> values) {
            addCriterion("start_date not in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateBetween(Date value1, Date value2) {
            addCriterion("start_date between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotBetween(Date value1, Date value2) {
            addCriterion("start_date not between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNull() {
            addCriterion("end_date is null");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNotNull() {
            addCriterion("end_date is not null");
            return (Criteria) this;
        }

        public Criteria andEndDateEqualTo(Date value) {
            addCriterion("end_date =", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotEqualTo(Date value) {
            addCriterion("end_date <>", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThan(Date value) {
            addCriterion("end_date >", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("end_date >=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThan(Date value) {
            addCriterion("end_date <", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThanOrEqualTo(Date value) {
            addCriterion("end_date <=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIn(List<Date> values) {
            addCriterion("end_date in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotIn(List<Date> values) {
            addCriterion("end_date not in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateBetween(Date value1, Date value2) {
            addCriterion("end_date between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotBetween(Date value1, Date value2) {
            addCriterion("end_date not between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNull() {
            addCriterion("modify_time is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(Date value) {
            addCriterion("modify_time =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(Date value) {
            addCriterion("modify_time <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(Date value) {
            addCriterion("modify_time >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("modify_time >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(Date value) {
            addCriterion("modify_time <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("modify_time <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<Date> values) {
            addCriterion("modify_time in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<Date> values) {
            addCriterion("modify_time not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(Date value1, Date value2) {
            addCriterion("modify_time between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("modify_time not between", value1, value2, "modifyTime");
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