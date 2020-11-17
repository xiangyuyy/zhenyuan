package com.macro.mall.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DrugReportMemberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DrugReportMemberExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andReportIdIsNull() {
            addCriterion("report_id is null");
            return (Criteria) this;
        }

        public Criteria andReportIdIsNotNull() {
            addCriterion("report_id is not null");
            return (Criteria) this;
        }

        public Criteria andReportIdEqualTo(String value) {
            addCriterion("report_id =", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdNotEqualTo(String value) {
            addCriterion("report_id <>", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdGreaterThan(String value) {
            addCriterion("report_id >", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdGreaterThanOrEqualTo(String value) {
            addCriterion("report_id >=", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdLessThan(String value) {
            addCriterion("report_id <", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdLessThanOrEqualTo(String value) {
            addCriterion("report_id <=", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdLike(String value) {
            addCriterion("report_id like", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdNotLike(String value) {
            addCriterion("report_id not like", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdIn(List<String> values) {
            addCriterion("report_id in", values, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdNotIn(List<String> values) {
            addCriterion("report_id not in", values, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdBetween(String value1, String value2) {
            addCriterion("report_id between", value1, value2, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdNotBetween(String value1, String value2) {
            addCriterion("report_id not between", value1, value2, "reportId");
            return (Criteria) this;
        }

        public Criteria andRelationIdIsNull() {
            addCriterion("relation_id is null");
            return (Criteria) this;
        }

        public Criteria andRelationIdIsNotNull() {
            addCriterion("relation_id is not null");
            return (Criteria) this;
        }

        public Criteria andRelationIdEqualTo(String value) {
            addCriterion("relation_id =", value, "relationId");
            return (Criteria) this;
        }

        public Criteria andRelationIdNotEqualTo(String value) {
            addCriterion("relation_id <>", value, "relationId");
            return (Criteria) this;
        }

        public Criteria andRelationIdGreaterThan(String value) {
            addCriterion("relation_id >", value, "relationId");
            return (Criteria) this;
        }

        public Criteria andRelationIdGreaterThanOrEqualTo(String value) {
            addCriterion("relation_id >=", value, "relationId");
            return (Criteria) this;
        }

        public Criteria andRelationIdLessThan(String value) {
            addCriterion("relation_id <", value, "relationId");
            return (Criteria) this;
        }

        public Criteria andRelationIdLessThanOrEqualTo(String value) {
            addCriterion("relation_id <=", value, "relationId");
            return (Criteria) this;
        }

        public Criteria andRelationIdLike(String value) {
            addCriterion("relation_id like", value, "relationId");
            return (Criteria) this;
        }

        public Criteria andRelationIdNotLike(String value) {
            addCriterion("relation_id not like", value, "relationId");
            return (Criteria) this;
        }

        public Criteria andRelationIdIn(List<String> values) {
            addCriterion("relation_id in", values, "relationId");
            return (Criteria) this;
        }

        public Criteria andRelationIdNotIn(List<String> values) {
            addCriterion("relation_id not in", values, "relationId");
            return (Criteria) this;
        }

        public Criteria andRelationIdBetween(String value1, String value2) {
            addCriterion("relation_id between", value1, value2, "relationId");
            return (Criteria) this;
        }

        public Criteria andRelationIdNotBetween(String value1, String value2) {
            addCriterion("relation_id not between", value1, value2, "relationId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNull() {
            addCriterion("member_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("member_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(String value) {
            addCriterion("member_id =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(String value) {
            addCriterion("member_id <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(String value) {
            addCriterion("member_id >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(String value) {
            addCriterion("member_id >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(String value) {
            addCriterion("member_id <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(String value) {
            addCriterion("member_id <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLike(String value) {
            addCriterion("member_id like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotLike(String value) {
            addCriterion("member_id not like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<String> values) {
            addCriterion("member_id in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<String> values) {
            addCriterion("member_id not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(String value1, String value2) {
            addCriterion("member_id between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(String value1, String value2) {
            addCriterion("member_id not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andDrugShopIdIsNull() {
            addCriterion("drug_shop_id is null");
            return (Criteria) this;
        }

        public Criteria andDrugShopIdIsNotNull() {
            addCriterion("drug_shop_id is not null");
            return (Criteria) this;
        }

        public Criteria andDrugShopIdEqualTo(String value) {
            addCriterion("drug_shop_id =", value, "drugShopId");
            return (Criteria) this;
        }

        public Criteria andDrugShopIdNotEqualTo(String value) {
            addCriterion("drug_shop_id <>", value, "drugShopId");
            return (Criteria) this;
        }

        public Criteria andDrugShopIdGreaterThan(String value) {
            addCriterion("drug_shop_id >", value, "drugShopId");
            return (Criteria) this;
        }

        public Criteria andDrugShopIdGreaterThanOrEqualTo(String value) {
            addCriterion("drug_shop_id >=", value, "drugShopId");
            return (Criteria) this;
        }

        public Criteria andDrugShopIdLessThan(String value) {
            addCriterion("drug_shop_id <", value, "drugShopId");
            return (Criteria) this;
        }

        public Criteria andDrugShopIdLessThanOrEqualTo(String value) {
            addCriterion("drug_shop_id <=", value, "drugShopId");
            return (Criteria) this;
        }

        public Criteria andDrugShopIdLike(String value) {
            addCriterion("drug_shop_id like", value, "drugShopId");
            return (Criteria) this;
        }

        public Criteria andDrugShopIdNotLike(String value) {
            addCriterion("drug_shop_id not like", value, "drugShopId");
            return (Criteria) this;
        }

        public Criteria andDrugShopIdIn(List<String> values) {
            addCriterion("drug_shop_id in", values, "drugShopId");
            return (Criteria) this;
        }

        public Criteria andDrugShopIdNotIn(List<String> values) {
            addCriterion("drug_shop_id not in", values, "drugShopId");
            return (Criteria) this;
        }

        public Criteria andDrugShopIdBetween(String value1, String value2) {
            addCriterion("drug_shop_id between", value1, value2, "drugShopId");
            return (Criteria) this;
        }

        public Criteria andDrugShopIdNotBetween(String value1, String value2) {
            addCriterion("drug_shop_id not between", value1, value2, "drugShopId");
            return (Criteria) this;
        }

        public Criteria andDrugTitleIdIsNull() {
            addCriterion("drug_title_id is null");
            return (Criteria) this;
        }

        public Criteria andDrugTitleIdIsNotNull() {
            addCriterion("drug_title_id is not null");
            return (Criteria) this;
        }

        public Criteria andDrugTitleIdEqualTo(String value) {
            addCriterion("drug_title_id =", value, "drugTitleId");
            return (Criteria) this;
        }

        public Criteria andDrugTitleIdNotEqualTo(String value) {
            addCriterion("drug_title_id <>", value, "drugTitleId");
            return (Criteria) this;
        }

        public Criteria andDrugTitleIdGreaterThan(String value) {
            addCriterion("drug_title_id >", value, "drugTitleId");
            return (Criteria) this;
        }

        public Criteria andDrugTitleIdGreaterThanOrEqualTo(String value) {
            addCriterion("drug_title_id >=", value, "drugTitleId");
            return (Criteria) this;
        }

        public Criteria andDrugTitleIdLessThan(String value) {
            addCriterion("drug_title_id <", value, "drugTitleId");
            return (Criteria) this;
        }

        public Criteria andDrugTitleIdLessThanOrEqualTo(String value) {
            addCriterion("drug_title_id <=", value, "drugTitleId");
            return (Criteria) this;
        }

        public Criteria andDrugTitleIdLike(String value) {
            addCriterion("drug_title_id like", value, "drugTitleId");
            return (Criteria) this;
        }

        public Criteria andDrugTitleIdNotLike(String value) {
            addCriterion("drug_title_id not like", value, "drugTitleId");
            return (Criteria) this;
        }

        public Criteria andDrugTitleIdIn(List<String> values) {
            addCriterion("drug_title_id in", values, "drugTitleId");
            return (Criteria) this;
        }

        public Criteria andDrugTitleIdNotIn(List<String> values) {
            addCriterion("drug_title_id not in", values, "drugTitleId");
            return (Criteria) this;
        }

        public Criteria andDrugTitleIdBetween(String value1, String value2) {
            addCriterion("drug_title_id between", value1, value2, "drugTitleId");
            return (Criteria) this;
        }

        public Criteria andDrugTitleIdNotBetween(String value1, String value2) {
            addCriterion("drug_title_id not between", value1, value2, "drugTitleId");
            return (Criteria) this;
        }

        public Criteria andDrugOrgIdIsNull() {
            addCriterion("drug_org_id is null");
            return (Criteria) this;
        }

        public Criteria andDrugOrgIdIsNotNull() {
            addCriterion("drug_org_id is not null");
            return (Criteria) this;
        }

        public Criteria andDrugOrgIdEqualTo(String value) {
            addCriterion("drug_org_id =", value, "drugOrgId");
            return (Criteria) this;
        }

        public Criteria andDrugOrgIdNotEqualTo(String value) {
            addCriterion("drug_org_id <>", value, "drugOrgId");
            return (Criteria) this;
        }

        public Criteria andDrugOrgIdGreaterThan(String value) {
            addCriterion("drug_org_id >", value, "drugOrgId");
            return (Criteria) this;
        }

        public Criteria andDrugOrgIdGreaterThanOrEqualTo(String value) {
            addCriterion("drug_org_id >=", value, "drugOrgId");
            return (Criteria) this;
        }

        public Criteria andDrugOrgIdLessThan(String value) {
            addCriterion("drug_org_id <", value, "drugOrgId");
            return (Criteria) this;
        }

        public Criteria andDrugOrgIdLessThanOrEqualTo(String value) {
            addCriterion("drug_org_id <=", value, "drugOrgId");
            return (Criteria) this;
        }

        public Criteria andDrugOrgIdLike(String value) {
            addCriterion("drug_org_id like", value, "drugOrgId");
            return (Criteria) this;
        }

        public Criteria andDrugOrgIdNotLike(String value) {
            addCriterion("drug_org_id not like", value, "drugOrgId");
            return (Criteria) this;
        }

        public Criteria andDrugOrgIdIn(List<String> values) {
            addCriterion("drug_org_id in", values, "drugOrgId");
            return (Criteria) this;
        }

        public Criteria andDrugOrgIdNotIn(List<String> values) {
            addCriterion("drug_org_id not in", values, "drugOrgId");
            return (Criteria) this;
        }

        public Criteria andDrugOrgIdBetween(String value1, String value2) {
            addCriterion("drug_org_id between", value1, value2, "drugOrgId");
            return (Criteria) this;
        }

        public Criteria andDrugOrgIdNotBetween(String value1, String value2) {
            addCriterion("drug_org_id not between", value1, value2, "drugOrgId");
            return (Criteria) this;
        }

        public Criteria andEducationIdIsNull() {
            addCriterion("education_id is null");
            return (Criteria) this;
        }

        public Criteria andEducationIdIsNotNull() {
            addCriterion("education_id is not null");
            return (Criteria) this;
        }

        public Criteria andEducationIdEqualTo(String value) {
            addCriterion("education_id =", value, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdNotEqualTo(String value) {
            addCriterion("education_id <>", value, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdGreaterThan(String value) {
            addCriterion("education_id >", value, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdGreaterThanOrEqualTo(String value) {
            addCriterion("education_id >=", value, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdLessThan(String value) {
            addCriterion("education_id <", value, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdLessThanOrEqualTo(String value) {
            addCriterion("education_id <=", value, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdLike(String value) {
            addCriterion("education_id like", value, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdNotLike(String value) {
            addCriterion("education_id not like", value, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdIn(List<String> values) {
            addCriterion("education_id in", values, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdNotIn(List<String> values) {
            addCriterion("education_id not in", values, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdBetween(String value1, String value2) {
            addCriterion("education_id between", value1, value2, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdNotBetween(String value1, String value2) {
            addCriterion("education_id not between", value1, value2, "educationId");
            return (Criteria) this;
        }

        public Criteria andDrugEducationIdIsNull() {
            addCriterion("drug_education_id is null");
            return (Criteria) this;
        }

        public Criteria andDrugEducationIdIsNotNull() {
            addCriterion("drug_education_id is not null");
            return (Criteria) this;
        }

        public Criteria andDrugEducationIdEqualTo(String value) {
            addCriterion("drug_education_id =", value, "drugEducationId");
            return (Criteria) this;
        }

        public Criteria andDrugEducationIdNotEqualTo(String value) {
            addCriterion("drug_education_id <>", value, "drugEducationId");
            return (Criteria) this;
        }

        public Criteria andDrugEducationIdGreaterThan(String value) {
            addCriterion("drug_education_id >", value, "drugEducationId");
            return (Criteria) this;
        }

        public Criteria andDrugEducationIdGreaterThanOrEqualTo(String value) {
            addCriterion("drug_education_id >=", value, "drugEducationId");
            return (Criteria) this;
        }

        public Criteria andDrugEducationIdLessThan(String value) {
            addCriterion("drug_education_id <", value, "drugEducationId");
            return (Criteria) this;
        }

        public Criteria andDrugEducationIdLessThanOrEqualTo(String value) {
            addCriterion("drug_education_id <=", value, "drugEducationId");
            return (Criteria) this;
        }

        public Criteria andDrugEducationIdLike(String value) {
            addCriterion("drug_education_id like", value, "drugEducationId");
            return (Criteria) this;
        }

        public Criteria andDrugEducationIdNotLike(String value) {
            addCriterion("drug_education_id not like", value, "drugEducationId");
            return (Criteria) this;
        }

        public Criteria andDrugEducationIdIn(List<String> values) {
            addCriterion("drug_education_id in", values, "drugEducationId");
            return (Criteria) this;
        }

        public Criteria andDrugEducationIdNotIn(List<String> values) {
            addCriterion("drug_education_id not in", values, "drugEducationId");
            return (Criteria) this;
        }

        public Criteria andDrugEducationIdBetween(String value1, String value2) {
            addCriterion("drug_education_id between", value1, value2, "drugEducationId");
            return (Criteria) this;
        }

        public Criteria andDrugEducationIdNotBetween(String value1, String value2) {
            addCriterion("drug_education_id not between", value1, value2, "drugEducationId");
            return (Criteria) this;
        }

        public Criteria andDrugMajorIdIsNull() {
            addCriterion("drug_major_id is null");
            return (Criteria) this;
        }

        public Criteria andDrugMajorIdIsNotNull() {
            addCriterion("drug_major_id is not null");
            return (Criteria) this;
        }

        public Criteria andDrugMajorIdEqualTo(String value) {
            addCriterion("drug_major_id =", value, "drugMajorId");
            return (Criteria) this;
        }

        public Criteria andDrugMajorIdNotEqualTo(String value) {
            addCriterion("drug_major_id <>", value, "drugMajorId");
            return (Criteria) this;
        }

        public Criteria andDrugMajorIdGreaterThan(String value) {
            addCriterion("drug_major_id >", value, "drugMajorId");
            return (Criteria) this;
        }

        public Criteria andDrugMajorIdGreaterThanOrEqualTo(String value) {
            addCriterion("drug_major_id >=", value, "drugMajorId");
            return (Criteria) this;
        }

        public Criteria andDrugMajorIdLessThan(String value) {
            addCriterion("drug_major_id <", value, "drugMajorId");
            return (Criteria) this;
        }

        public Criteria andDrugMajorIdLessThanOrEqualTo(String value) {
            addCriterion("drug_major_id <=", value, "drugMajorId");
            return (Criteria) this;
        }

        public Criteria andDrugMajorIdLike(String value) {
            addCriterion("drug_major_id like", value, "drugMajorId");
            return (Criteria) this;
        }

        public Criteria andDrugMajorIdNotLike(String value) {
            addCriterion("drug_major_id not like", value, "drugMajorId");
            return (Criteria) this;
        }

        public Criteria andDrugMajorIdIn(List<String> values) {
            addCriterion("drug_major_id in", values, "drugMajorId");
            return (Criteria) this;
        }

        public Criteria andDrugMajorIdNotIn(List<String> values) {
            addCriterion("drug_major_id not in", values, "drugMajorId");
            return (Criteria) this;
        }

        public Criteria andDrugMajorIdBetween(String value1, String value2) {
            addCriterion("drug_major_id between", value1, value2, "drugMajorId");
            return (Criteria) this;
        }

        public Criteria andDrugMajorIdNotBetween(String value1, String value2) {
            addCriterion("drug_major_id not between", value1, value2, "drugMajorId");
            return (Criteria) this;
        }

        public Criteria andDrugPositionOneIdIsNull() {
            addCriterion("drug_position_one_id is null");
            return (Criteria) this;
        }

        public Criteria andDrugPositionOneIdIsNotNull() {
            addCriterion("drug_position_one_id is not null");
            return (Criteria) this;
        }

        public Criteria andDrugPositionOneIdEqualTo(String value) {
            addCriterion("drug_position_one_id =", value, "drugPositionOneId");
            return (Criteria) this;
        }

        public Criteria andDrugPositionOneIdNotEqualTo(String value) {
            addCriterion("drug_position_one_id <>", value, "drugPositionOneId");
            return (Criteria) this;
        }

        public Criteria andDrugPositionOneIdGreaterThan(String value) {
            addCriterion("drug_position_one_id >", value, "drugPositionOneId");
            return (Criteria) this;
        }

        public Criteria andDrugPositionOneIdGreaterThanOrEqualTo(String value) {
            addCriterion("drug_position_one_id >=", value, "drugPositionOneId");
            return (Criteria) this;
        }

        public Criteria andDrugPositionOneIdLessThan(String value) {
            addCriterion("drug_position_one_id <", value, "drugPositionOneId");
            return (Criteria) this;
        }

        public Criteria andDrugPositionOneIdLessThanOrEqualTo(String value) {
            addCriterion("drug_position_one_id <=", value, "drugPositionOneId");
            return (Criteria) this;
        }

        public Criteria andDrugPositionOneIdLike(String value) {
            addCriterion("drug_position_one_id like", value, "drugPositionOneId");
            return (Criteria) this;
        }

        public Criteria andDrugPositionOneIdNotLike(String value) {
            addCriterion("drug_position_one_id not like", value, "drugPositionOneId");
            return (Criteria) this;
        }

        public Criteria andDrugPositionOneIdIn(List<String> values) {
            addCriterion("drug_position_one_id in", values, "drugPositionOneId");
            return (Criteria) this;
        }

        public Criteria andDrugPositionOneIdNotIn(List<String> values) {
            addCriterion("drug_position_one_id not in", values, "drugPositionOneId");
            return (Criteria) this;
        }

        public Criteria andDrugPositionOneIdBetween(String value1, String value2) {
            addCriterion("drug_position_one_id between", value1, value2, "drugPositionOneId");
            return (Criteria) this;
        }

        public Criteria andDrugPositionOneIdNotBetween(String value1, String value2) {
            addCriterion("drug_position_one_id not between", value1, value2, "drugPositionOneId");
            return (Criteria) this;
        }

        public Criteria andDrugPositionTwoIdIsNull() {
            addCriterion("drug_position_two_id is null");
            return (Criteria) this;
        }

        public Criteria andDrugPositionTwoIdIsNotNull() {
            addCriterion("drug_position_two_id is not null");
            return (Criteria) this;
        }

        public Criteria andDrugPositionTwoIdEqualTo(String value) {
            addCriterion("drug_position_two_id =", value, "drugPositionTwoId");
            return (Criteria) this;
        }

        public Criteria andDrugPositionTwoIdNotEqualTo(String value) {
            addCriterion("drug_position_two_id <>", value, "drugPositionTwoId");
            return (Criteria) this;
        }

        public Criteria andDrugPositionTwoIdGreaterThan(String value) {
            addCriterion("drug_position_two_id >", value, "drugPositionTwoId");
            return (Criteria) this;
        }

        public Criteria andDrugPositionTwoIdGreaterThanOrEqualTo(String value) {
            addCriterion("drug_position_two_id >=", value, "drugPositionTwoId");
            return (Criteria) this;
        }

        public Criteria andDrugPositionTwoIdLessThan(String value) {
            addCriterion("drug_position_two_id <", value, "drugPositionTwoId");
            return (Criteria) this;
        }

        public Criteria andDrugPositionTwoIdLessThanOrEqualTo(String value) {
            addCriterion("drug_position_two_id <=", value, "drugPositionTwoId");
            return (Criteria) this;
        }

        public Criteria andDrugPositionTwoIdLike(String value) {
            addCriterion("drug_position_two_id like", value, "drugPositionTwoId");
            return (Criteria) this;
        }

        public Criteria andDrugPositionTwoIdNotLike(String value) {
            addCriterion("drug_position_two_id not like", value, "drugPositionTwoId");
            return (Criteria) this;
        }

        public Criteria andDrugPositionTwoIdIn(List<String> values) {
            addCriterion("drug_position_two_id in", values, "drugPositionTwoId");
            return (Criteria) this;
        }

        public Criteria andDrugPositionTwoIdNotIn(List<String> values) {
            addCriterion("drug_position_two_id not in", values, "drugPositionTwoId");
            return (Criteria) this;
        }

        public Criteria andDrugPositionTwoIdBetween(String value1, String value2) {
            addCriterion("drug_position_two_id between", value1, value2, "drugPositionTwoId");
            return (Criteria) this;
        }

        public Criteria andDrugPositionTwoIdNotBetween(String value1, String value2) {
            addCriterion("drug_position_two_id not between", value1, value2, "drugPositionTwoId");
            return (Criteria) this;
        }

        public Criteria andDrugPositionThreeIdIsNull() {
            addCriterion("drug_position_three_id is null");
            return (Criteria) this;
        }

        public Criteria andDrugPositionThreeIdIsNotNull() {
            addCriterion("drug_position_three_id is not null");
            return (Criteria) this;
        }

        public Criteria andDrugPositionThreeIdEqualTo(String value) {
            addCriterion("drug_position_three_id =", value, "drugPositionThreeId");
            return (Criteria) this;
        }

        public Criteria andDrugPositionThreeIdNotEqualTo(String value) {
            addCriterion("drug_position_three_id <>", value, "drugPositionThreeId");
            return (Criteria) this;
        }

        public Criteria andDrugPositionThreeIdGreaterThan(String value) {
            addCriterion("drug_position_three_id >", value, "drugPositionThreeId");
            return (Criteria) this;
        }

        public Criteria andDrugPositionThreeIdGreaterThanOrEqualTo(String value) {
            addCriterion("drug_position_three_id >=", value, "drugPositionThreeId");
            return (Criteria) this;
        }

        public Criteria andDrugPositionThreeIdLessThan(String value) {
            addCriterion("drug_position_three_id <", value, "drugPositionThreeId");
            return (Criteria) this;
        }

        public Criteria andDrugPositionThreeIdLessThanOrEqualTo(String value) {
            addCriterion("drug_position_three_id <=", value, "drugPositionThreeId");
            return (Criteria) this;
        }

        public Criteria andDrugPositionThreeIdLike(String value) {
            addCriterion("drug_position_three_id like", value, "drugPositionThreeId");
            return (Criteria) this;
        }

        public Criteria andDrugPositionThreeIdNotLike(String value) {
            addCriterion("drug_position_three_id not like", value, "drugPositionThreeId");
            return (Criteria) this;
        }

        public Criteria andDrugPositionThreeIdIn(List<String> values) {
            addCriterion("drug_position_three_id in", values, "drugPositionThreeId");
            return (Criteria) this;
        }

        public Criteria andDrugPositionThreeIdNotIn(List<String> values) {
            addCriterion("drug_position_three_id not in", values, "drugPositionThreeId");
            return (Criteria) this;
        }

        public Criteria andDrugPositionThreeIdBetween(String value1, String value2) {
            addCriterion("drug_position_three_id between", value1, value2, "drugPositionThreeId");
            return (Criteria) this;
        }

        public Criteria andDrugPositionThreeIdNotBetween(String value1, String value2) {
            addCriterion("drug_position_three_id not between", value1, value2, "drugPositionThreeId");
            return (Criteria) this;
        }

        public Criteria andWorkTimeIsNull() {
            addCriterion("work_time is null");
            return (Criteria) this;
        }

        public Criteria andWorkTimeIsNotNull() {
            addCriterion("work_time is not null");
            return (Criteria) this;
        }

        public Criteria andWorkTimeEqualTo(Date value) {
            addCriterion("work_time =", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeNotEqualTo(Date value) {
            addCriterion("work_time <>", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeGreaterThan(Date value) {
            addCriterion("work_time >", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("work_time >=", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeLessThan(Date value) {
            addCriterion("work_time <", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeLessThanOrEqualTo(Date value) {
            addCriterion("work_time <=", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeIn(List<Date> values) {
            addCriterion("work_time in", values, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeNotIn(List<Date> values) {
            addCriterion("work_time not in", values, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeBetween(Date value1, Date value2) {
            addCriterion("work_time between", value1, value2, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeNotBetween(Date value1, Date value2) {
            addCriterion("work_time not between", value1, value2, "workTime");
            return (Criteria) this;
        }

        public Criteria andHealthStatusIsNull() {
            addCriterion("health_status is null");
            return (Criteria) this;
        }

        public Criteria andHealthStatusIsNotNull() {
            addCriterion("health_status is not null");
            return (Criteria) this;
        }

        public Criteria andHealthStatusEqualTo(Integer value) {
            addCriterion("health_status =", value, "healthStatus");
            return (Criteria) this;
        }

        public Criteria andHealthStatusNotEqualTo(Integer value) {
            addCriterion("health_status <>", value, "healthStatus");
            return (Criteria) this;
        }

        public Criteria andHealthStatusGreaterThan(Integer value) {
            addCriterion("health_status >", value, "healthStatus");
            return (Criteria) this;
        }

        public Criteria andHealthStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("health_status >=", value, "healthStatus");
            return (Criteria) this;
        }

        public Criteria andHealthStatusLessThan(Integer value) {
            addCriterion("health_status <", value, "healthStatus");
            return (Criteria) this;
        }

        public Criteria andHealthStatusLessThanOrEqualTo(Integer value) {
            addCriterion("health_status <=", value, "healthStatus");
            return (Criteria) this;
        }

        public Criteria andHealthStatusIn(List<Integer> values) {
            addCriterion("health_status in", values, "healthStatus");
            return (Criteria) this;
        }

        public Criteria andHealthStatusNotIn(List<Integer> values) {
            addCriterion("health_status not in", values, "healthStatus");
            return (Criteria) this;
        }

        public Criteria andHealthStatusBetween(Integer value1, Integer value2) {
            addCriterion("health_status between", value1, value2, "healthStatus");
            return (Criteria) this;
        }

        public Criteria andHealthStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("health_status not between", value1, value2, "healthStatus");
            return (Criteria) this;
        }

        public Criteria andEducationStatusIsNull() {
            addCriterion("education_status is null");
            return (Criteria) this;
        }

        public Criteria andEducationStatusIsNotNull() {
            addCriterion("education_status is not null");
            return (Criteria) this;
        }

        public Criteria andEducationStatusEqualTo(Integer value) {
            addCriterion("education_status =", value, "educationStatus");
            return (Criteria) this;
        }

        public Criteria andEducationStatusNotEqualTo(Integer value) {
            addCriterion("education_status <>", value, "educationStatus");
            return (Criteria) this;
        }

        public Criteria andEducationStatusGreaterThan(Integer value) {
            addCriterion("education_status >", value, "educationStatus");
            return (Criteria) this;
        }

        public Criteria andEducationStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("education_status >=", value, "educationStatus");
            return (Criteria) this;
        }

        public Criteria andEducationStatusLessThan(Integer value) {
            addCriterion("education_status <", value, "educationStatus");
            return (Criteria) this;
        }

        public Criteria andEducationStatusLessThanOrEqualTo(Integer value) {
            addCriterion("education_status <=", value, "educationStatus");
            return (Criteria) this;
        }

        public Criteria andEducationStatusIn(List<Integer> values) {
            addCriterion("education_status in", values, "educationStatus");
            return (Criteria) this;
        }

        public Criteria andEducationStatusNotIn(List<Integer> values) {
            addCriterion("education_status not in", values, "educationStatus");
            return (Criteria) this;
        }

        public Criteria andEducationStatusBetween(Integer value1, Integer value2) {
            addCriterion("education_status between", value1, value2, "educationStatus");
            return (Criteria) this;
        }

        public Criteria andEducationStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("education_status not between", value1, value2, "educationStatus");
            return (Criteria) this;
        }

        public Criteria andTrainStatusIsNull() {
            addCriterion("train_status is null");
            return (Criteria) this;
        }

        public Criteria andTrainStatusIsNotNull() {
            addCriterion("train_status is not null");
            return (Criteria) this;
        }

        public Criteria andTrainStatusEqualTo(Integer value) {
            addCriterion("train_status =", value, "trainStatus");
            return (Criteria) this;
        }

        public Criteria andTrainStatusNotEqualTo(Integer value) {
            addCriterion("train_status <>", value, "trainStatus");
            return (Criteria) this;
        }

        public Criteria andTrainStatusGreaterThan(Integer value) {
            addCriterion("train_status >", value, "trainStatus");
            return (Criteria) this;
        }

        public Criteria andTrainStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("train_status >=", value, "trainStatus");
            return (Criteria) this;
        }

        public Criteria andTrainStatusLessThan(Integer value) {
            addCriterion("train_status <", value, "trainStatus");
            return (Criteria) this;
        }

        public Criteria andTrainStatusLessThanOrEqualTo(Integer value) {
            addCriterion("train_status <=", value, "trainStatus");
            return (Criteria) this;
        }

        public Criteria andTrainStatusIn(List<Integer> values) {
            addCriterion("train_status in", values, "trainStatus");
            return (Criteria) this;
        }

        public Criteria andTrainStatusNotIn(List<Integer> values) {
            addCriterion("train_status not in", values, "trainStatus");
            return (Criteria) this;
        }

        public Criteria andTrainStatusBetween(Integer value1, Integer value2) {
            addCriterion("train_status between", value1, value2, "trainStatus");
            return (Criteria) this;
        }

        public Criteria andTrainStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("train_status not between", value1, value2, "trainStatus");
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