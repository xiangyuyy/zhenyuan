package com.macro.mall.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DrugCountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DrugCountExample() {
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

        public Criteria andShopIdIsNull() {
            addCriterion("shop_id is null");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNotNull() {
            addCriterion("shop_id is not null");
            return (Criteria) this;
        }

        public Criteria andShopIdEqualTo(String value) {
            addCriterion("shop_id =", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotEqualTo(String value) {
            addCriterion("shop_id <>", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThan(String value) {
            addCriterion("shop_id >", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThanOrEqualTo(String value) {
            addCriterion("shop_id >=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThan(String value) {
            addCriterion("shop_id <", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThanOrEqualTo(String value) {
            addCriterion("shop_id <=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLike(String value) {
            addCriterion("shop_id like", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotLike(String value) {
            addCriterion("shop_id not like", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdIn(List<String> values) {
            addCriterion("shop_id in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotIn(List<String> values) {
            addCriterion("shop_id not in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdBetween(String value1, String value2) {
            addCriterion("shop_id between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotBetween(String value1, String value2) {
            addCriterion("shop_id not between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andSubjectionIsNull() {
            addCriterion("subjection is null");
            return (Criteria) this;
        }

        public Criteria andSubjectionIsNotNull() {
            addCriterion("subjection is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectionEqualTo(Integer value) {
            addCriterion("subjection =", value, "subjection");
            return (Criteria) this;
        }

        public Criteria andSubjectionNotEqualTo(Integer value) {
            addCriterion("subjection <>", value, "subjection");
            return (Criteria) this;
        }

        public Criteria andSubjectionGreaterThan(Integer value) {
            addCriterion("subjection >", value, "subjection");
            return (Criteria) this;
        }

        public Criteria andSubjectionGreaterThanOrEqualTo(Integer value) {
            addCriterion("subjection >=", value, "subjection");
            return (Criteria) this;
        }

        public Criteria andSubjectionLessThan(Integer value) {
            addCriterion("subjection <", value, "subjection");
            return (Criteria) this;
        }

        public Criteria andSubjectionLessThanOrEqualTo(Integer value) {
            addCriterion("subjection <=", value, "subjection");
            return (Criteria) this;
        }

        public Criteria andSubjectionIn(List<Integer> values) {
            addCriterion("subjection in", values, "subjection");
            return (Criteria) this;
        }

        public Criteria andSubjectionNotIn(List<Integer> values) {
            addCriterion("subjection not in", values, "subjection");
            return (Criteria) this;
        }

        public Criteria andSubjectionBetween(Integer value1, Integer value2) {
            addCriterion("subjection between", value1, value2, "subjection");
            return (Criteria) this;
        }

        public Criteria andSubjectionNotBetween(Integer value1, Integer value2) {
            addCriterion("subjection not between", value1, value2, "subjection");
            return (Criteria) this;
        }

        public Criteria andChineseMedicineIsNull() {
            addCriterion("chinese_medicine is null");
            return (Criteria) this;
        }

        public Criteria andChineseMedicineIsNotNull() {
            addCriterion("chinese_medicine is not null");
            return (Criteria) this;
        }

        public Criteria andChineseMedicineEqualTo(Integer value) {
            addCriterion("chinese_medicine =", value, "chineseMedicine");
            return (Criteria) this;
        }

        public Criteria andChineseMedicineNotEqualTo(Integer value) {
            addCriterion("chinese_medicine <>", value, "chineseMedicine");
            return (Criteria) this;
        }

        public Criteria andChineseMedicineGreaterThan(Integer value) {
            addCriterion("chinese_medicine >", value, "chineseMedicine");
            return (Criteria) this;
        }

        public Criteria andChineseMedicineGreaterThanOrEqualTo(Integer value) {
            addCriterion("chinese_medicine >=", value, "chineseMedicine");
            return (Criteria) this;
        }

        public Criteria andChineseMedicineLessThan(Integer value) {
            addCriterion("chinese_medicine <", value, "chineseMedicine");
            return (Criteria) this;
        }

        public Criteria andChineseMedicineLessThanOrEqualTo(Integer value) {
            addCriterion("chinese_medicine <=", value, "chineseMedicine");
            return (Criteria) this;
        }

        public Criteria andChineseMedicineIn(List<Integer> values) {
            addCriterion("chinese_medicine in", values, "chineseMedicine");
            return (Criteria) this;
        }

        public Criteria andChineseMedicineNotIn(List<Integer> values) {
            addCriterion("chinese_medicine not in", values, "chineseMedicine");
            return (Criteria) this;
        }

        public Criteria andChineseMedicineBetween(Integer value1, Integer value2) {
            addCriterion("chinese_medicine between", value1, value2, "chineseMedicine");
            return (Criteria) this;
        }

        public Criteria andChineseMedicineNotBetween(Integer value1, Integer value2) {
            addCriterion("chinese_medicine not between", value1, value2, "chineseMedicine");
            return (Criteria) this;
        }

        public Criteria andLongRangeIsNull() {
            addCriterion("long_range is null");
            return (Criteria) this;
        }

        public Criteria andLongRangeIsNotNull() {
            addCriterion("long_range is not null");
            return (Criteria) this;
        }

        public Criteria andLongRangeEqualTo(Integer value) {
            addCriterion("long_range =", value, "longRange");
            return (Criteria) this;
        }

        public Criteria andLongRangeNotEqualTo(Integer value) {
            addCriterion("long_range <>", value, "longRange");
            return (Criteria) this;
        }

        public Criteria andLongRangeGreaterThan(Integer value) {
            addCriterion("long_range >", value, "longRange");
            return (Criteria) this;
        }

        public Criteria andLongRangeGreaterThanOrEqualTo(Integer value) {
            addCriterion("long_range >=", value, "longRange");
            return (Criteria) this;
        }

        public Criteria andLongRangeLessThan(Integer value) {
            addCriterion("long_range <", value, "longRange");
            return (Criteria) this;
        }

        public Criteria andLongRangeLessThanOrEqualTo(Integer value) {
            addCriterion("long_range <=", value, "longRange");
            return (Criteria) this;
        }

        public Criteria andLongRangeIn(List<Integer> values) {
            addCriterion("long_range in", values, "longRange");
            return (Criteria) this;
        }

        public Criteria andLongRangeNotIn(List<Integer> values) {
            addCriterion("long_range not in", values, "longRange");
            return (Criteria) this;
        }

        public Criteria andLongRangeBetween(Integer value1, Integer value2) {
            addCriterion("long_range between", value1, value2, "longRange");
            return (Criteria) this;
        }

        public Criteria andLongRangeNotBetween(Integer value1, Integer value2) {
            addCriterion("long_range not between", value1, value2, "longRange");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(BigDecimal value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(BigDecimal value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(BigDecimal value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(BigDecimal value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<BigDecimal> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<BigDecimal> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andPraPharmacistIsNull() {
            addCriterion("pra_pharmacist is null");
            return (Criteria) this;
        }

        public Criteria andPraPharmacistIsNotNull() {
            addCriterion("pra_pharmacist is not null");
            return (Criteria) this;
        }

        public Criteria andPraPharmacistEqualTo(Integer value) {
            addCriterion("pra_pharmacist =", value, "praPharmacist");
            return (Criteria) this;
        }

        public Criteria andPraPharmacistNotEqualTo(Integer value) {
            addCriterion("pra_pharmacist <>", value, "praPharmacist");
            return (Criteria) this;
        }

        public Criteria andPraPharmacistGreaterThan(Integer value) {
            addCriterion("pra_pharmacist >", value, "praPharmacist");
            return (Criteria) this;
        }

        public Criteria andPraPharmacistGreaterThanOrEqualTo(Integer value) {
            addCriterion("pra_pharmacist >=", value, "praPharmacist");
            return (Criteria) this;
        }

        public Criteria andPraPharmacistLessThan(Integer value) {
            addCriterion("pra_pharmacist <", value, "praPharmacist");
            return (Criteria) this;
        }

        public Criteria andPraPharmacistLessThanOrEqualTo(Integer value) {
            addCriterion("pra_pharmacist <=", value, "praPharmacist");
            return (Criteria) this;
        }

        public Criteria andPraPharmacistIn(List<Integer> values) {
            addCriterion("pra_pharmacist in", values, "praPharmacist");
            return (Criteria) this;
        }

        public Criteria andPraPharmacistNotIn(List<Integer> values) {
            addCriterion("pra_pharmacist not in", values, "praPharmacist");
            return (Criteria) this;
        }

        public Criteria andPraPharmacistBetween(Integer value1, Integer value2) {
            addCriterion("pra_pharmacist between", value1, value2, "praPharmacist");
            return (Criteria) this;
        }

        public Criteria andPraPharmacistNotBetween(Integer value1, Integer value2) {
            addCriterion("pra_pharmacist not between", value1, value2, "praPharmacist");
            return (Criteria) this;
        }

        public Criteria andPraChinesePharmacistIsNull() {
            addCriterion("pra_chinese_pharmacist is null");
            return (Criteria) this;
        }

        public Criteria andPraChinesePharmacistIsNotNull() {
            addCriterion("pra_chinese_pharmacist is not null");
            return (Criteria) this;
        }

        public Criteria andPraChinesePharmacistEqualTo(Integer value) {
            addCriterion("pra_chinese_pharmacist =", value, "praChinesePharmacist");
            return (Criteria) this;
        }

        public Criteria andPraChinesePharmacistNotEqualTo(Integer value) {
            addCriterion("pra_chinese_pharmacist <>", value, "praChinesePharmacist");
            return (Criteria) this;
        }

        public Criteria andPraChinesePharmacistGreaterThan(Integer value) {
            addCriterion("pra_chinese_pharmacist >", value, "praChinesePharmacist");
            return (Criteria) this;
        }

        public Criteria andPraChinesePharmacistGreaterThanOrEqualTo(Integer value) {
            addCriterion("pra_chinese_pharmacist >=", value, "praChinesePharmacist");
            return (Criteria) this;
        }

        public Criteria andPraChinesePharmacistLessThan(Integer value) {
            addCriterion("pra_chinese_pharmacist <", value, "praChinesePharmacist");
            return (Criteria) this;
        }

        public Criteria andPraChinesePharmacistLessThanOrEqualTo(Integer value) {
            addCriterion("pra_chinese_pharmacist <=", value, "praChinesePharmacist");
            return (Criteria) this;
        }

        public Criteria andPraChinesePharmacistIn(List<Integer> values) {
            addCriterion("pra_chinese_pharmacist in", values, "praChinesePharmacist");
            return (Criteria) this;
        }

        public Criteria andPraChinesePharmacistNotIn(List<Integer> values) {
            addCriterion("pra_chinese_pharmacist not in", values, "praChinesePharmacist");
            return (Criteria) this;
        }

        public Criteria andPraChinesePharmacistBetween(Integer value1, Integer value2) {
            addCriterion("pra_chinese_pharmacist between", value1, value2, "praChinesePharmacist");
            return (Criteria) this;
        }

        public Criteria andPraChinesePharmacistNotBetween(Integer value1, Integer value2) {
            addCriterion("pra_chinese_pharmacist not between", value1, value2, "praChinesePharmacist");
            return (Criteria) this;
        }

        public Criteria andPharmacistIsNull() {
            addCriterion("pharmacist is null");
            return (Criteria) this;
        }

        public Criteria andPharmacistIsNotNull() {
            addCriterion("pharmacist is not null");
            return (Criteria) this;
        }

        public Criteria andPharmacistEqualTo(Integer value) {
            addCriterion("pharmacist =", value, "pharmacist");
            return (Criteria) this;
        }

        public Criteria andPharmacistNotEqualTo(Integer value) {
            addCriterion("pharmacist <>", value, "pharmacist");
            return (Criteria) this;
        }

        public Criteria andPharmacistGreaterThan(Integer value) {
            addCriterion("pharmacist >", value, "pharmacist");
            return (Criteria) this;
        }

        public Criteria andPharmacistGreaterThanOrEqualTo(Integer value) {
            addCriterion("pharmacist >=", value, "pharmacist");
            return (Criteria) this;
        }

        public Criteria andPharmacistLessThan(Integer value) {
            addCriterion("pharmacist <", value, "pharmacist");
            return (Criteria) this;
        }

        public Criteria andPharmacistLessThanOrEqualTo(Integer value) {
            addCriterion("pharmacist <=", value, "pharmacist");
            return (Criteria) this;
        }

        public Criteria andPharmacistIn(List<Integer> values) {
            addCriterion("pharmacist in", values, "pharmacist");
            return (Criteria) this;
        }

        public Criteria andPharmacistNotIn(List<Integer> values) {
            addCriterion("pharmacist not in", values, "pharmacist");
            return (Criteria) this;
        }

        public Criteria andPharmacistBetween(Integer value1, Integer value2) {
            addCriterion("pharmacist between", value1, value2, "pharmacist");
            return (Criteria) this;
        }

        public Criteria andPharmacistNotBetween(Integer value1, Integer value2) {
            addCriterion("pharmacist not between", value1, value2, "pharmacist");
            return (Criteria) this;
        }

        public Criteria andMechanicIsNull() {
            addCriterion("mechanic is null");
            return (Criteria) this;
        }

        public Criteria andMechanicIsNotNull() {
            addCriterion("mechanic is not null");
            return (Criteria) this;
        }

        public Criteria andMechanicEqualTo(Integer value) {
            addCriterion("mechanic =", value, "mechanic");
            return (Criteria) this;
        }

        public Criteria andMechanicNotEqualTo(Integer value) {
            addCriterion("mechanic <>", value, "mechanic");
            return (Criteria) this;
        }

        public Criteria andMechanicGreaterThan(Integer value) {
            addCriterion("mechanic >", value, "mechanic");
            return (Criteria) this;
        }

        public Criteria andMechanicGreaterThanOrEqualTo(Integer value) {
            addCriterion("mechanic >=", value, "mechanic");
            return (Criteria) this;
        }

        public Criteria andMechanicLessThan(Integer value) {
            addCriterion("mechanic <", value, "mechanic");
            return (Criteria) this;
        }

        public Criteria andMechanicLessThanOrEqualTo(Integer value) {
            addCriterion("mechanic <=", value, "mechanic");
            return (Criteria) this;
        }

        public Criteria andMechanicIn(List<Integer> values) {
            addCriterion("mechanic in", values, "mechanic");
            return (Criteria) this;
        }

        public Criteria andMechanicNotIn(List<Integer> values) {
            addCriterion("mechanic not in", values, "mechanic");
            return (Criteria) this;
        }

        public Criteria andMechanicBetween(Integer value1, Integer value2) {
            addCriterion("mechanic between", value1, value2, "mechanic");
            return (Criteria) this;
        }

        public Criteria andMechanicNotBetween(Integer value1, Integer value2) {
            addCriterion("mechanic not between", value1, value2, "mechanic");
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