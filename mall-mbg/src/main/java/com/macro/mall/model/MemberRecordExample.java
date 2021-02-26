package com.macro.mall.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MemberRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemberRecordExample() {
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

        public Criteria andReportShopIdIsNull() {
            addCriterion("report_shop_id is null");
            return (Criteria) this;
        }

        public Criteria andReportShopIdIsNotNull() {
            addCriterion("report_shop_id is not null");
            return (Criteria) this;
        }

        public Criteria andReportShopIdEqualTo(String value) {
            addCriterion("report_shop_id =", value, "reportShopId");
            return (Criteria) this;
        }

        public Criteria andReportShopIdNotEqualTo(String value) {
            addCriterion("report_shop_id <>", value, "reportShopId");
            return (Criteria) this;
        }

        public Criteria andReportShopIdGreaterThan(String value) {
            addCriterion("report_shop_id >", value, "reportShopId");
            return (Criteria) this;
        }

        public Criteria andReportShopIdGreaterThanOrEqualTo(String value) {
            addCriterion("report_shop_id >=", value, "reportShopId");
            return (Criteria) this;
        }

        public Criteria andReportShopIdLessThan(String value) {
            addCriterion("report_shop_id <", value, "reportShopId");
            return (Criteria) this;
        }

        public Criteria andReportShopIdLessThanOrEqualTo(String value) {
            addCriterion("report_shop_id <=", value, "reportShopId");
            return (Criteria) this;
        }

        public Criteria andReportShopIdLike(String value) {
            addCriterion("report_shop_id like", value, "reportShopId");
            return (Criteria) this;
        }

        public Criteria andReportShopIdNotLike(String value) {
            addCriterion("report_shop_id not like", value, "reportShopId");
            return (Criteria) this;
        }

        public Criteria andReportShopIdIn(List<String> values) {
            addCriterion("report_shop_id in", values, "reportShopId");
            return (Criteria) this;
        }

        public Criteria andReportShopIdNotIn(List<String> values) {
            addCriterion("report_shop_id not in", values, "reportShopId");
            return (Criteria) this;
        }

        public Criteria andReportShopIdBetween(String value1, String value2) {
            addCriterion("report_shop_id between", value1, value2, "reportShopId");
            return (Criteria) this;
        }

        public Criteria andReportShopIdNotBetween(String value1, String value2) {
            addCriterion("report_shop_id not between", value1, value2, "reportShopId");
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

        public Criteria andDrugSchoolIsNull() {
            addCriterion("drug_school is null");
            return (Criteria) this;
        }

        public Criteria andDrugSchoolIsNotNull() {
            addCriterion("drug_school is not null");
            return (Criteria) this;
        }

        public Criteria andDrugSchoolEqualTo(String value) {
            addCriterion("drug_school =", value, "drugSchool");
            return (Criteria) this;
        }

        public Criteria andDrugSchoolNotEqualTo(String value) {
            addCriterion("drug_school <>", value, "drugSchool");
            return (Criteria) this;
        }

        public Criteria andDrugSchoolGreaterThan(String value) {
            addCriterion("drug_school >", value, "drugSchool");
            return (Criteria) this;
        }

        public Criteria andDrugSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("drug_school >=", value, "drugSchool");
            return (Criteria) this;
        }

        public Criteria andDrugSchoolLessThan(String value) {
            addCriterion("drug_school <", value, "drugSchool");
            return (Criteria) this;
        }

        public Criteria andDrugSchoolLessThanOrEqualTo(String value) {
            addCriterion("drug_school <=", value, "drugSchool");
            return (Criteria) this;
        }

        public Criteria andDrugSchoolLike(String value) {
            addCriterion("drug_school like", value, "drugSchool");
            return (Criteria) this;
        }

        public Criteria andDrugSchoolNotLike(String value) {
            addCriterion("drug_school not like", value, "drugSchool");
            return (Criteria) this;
        }

        public Criteria andDrugSchoolIn(List<String> values) {
            addCriterion("drug_school in", values, "drugSchool");
            return (Criteria) this;
        }

        public Criteria andDrugSchoolNotIn(List<String> values) {
            addCriterion("drug_school not in", values, "drugSchool");
            return (Criteria) this;
        }

        public Criteria andDrugSchoolBetween(String value1, String value2) {
            addCriterion("drug_school between", value1, value2, "drugSchool");
            return (Criteria) this;
        }

        public Criteria andDrugSchoolNotBetween(String value1, String value2) {
            addCriterion("drug_school not between", value1, value2, "drugSchool");
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

        public Criteria andChangeReasonIsNull() {
            addCriterion("change_reason is null");
            return (Criteria) this;
        }

        public Criteria andChangeReasonIsNotNull() {
            addCriterion("change_reason is not null");
            return (Criteria) this;
        }

        public Criteria andChangeReasonEqualTo(String value) {
            addCriterion("change_reason =", value, "changeReason");
            return (Criteria) this;
        }

        public Criteria andChangeReasonNotEqualTo(String value) {
            addCriterion("change_reason <>", value, "changeReason");
            return (Criteria) this;
        }

        public Criteria andChangeReasonGreaterThan(String value) {
            addCriterion("change_reason >", value, "changeReason");
            return (Criteria) this;
        }

        public Criteria andChangeReasonGreaterThanOrEqualTo(String value) {
            addCriterion("change_reason >=", value, "changeReason");
            return (Criteria) this;
        }

        public Criteria andChangeReasonLessThan(String value) {
            addCriterion("change_reason <", value, "changeReason");
            return (Criteria) this;
        }

        public Criteria andChangeReasonLessThanOrEqualTo(String value) {
            addCriterion("change_reason <=", value, "changeReason");
            return (Criteria) this;
        }

        public Criteria andChangeReasonLike(String value) {
            addCriterion("change_reason like", value, "changeReason");
            return (Criteria) this;
        }

        public Criteria andChangeReasonNotLike(String value) {
            addCriterion("change_reason not like", value, "changeReason");
            return (Criteria) this;
        }

        public Criteria andChangeReasonIn(List<String> values) {
            addCriterion("change_reason in", values, "changeReason");
            return (Criteria) this;
        }

        public Criteria andChangeReasonNotIn(List<String> values) {
            addCriterion("change_reason not in", values, "changeReason");
            return (Criteria) this;
        }

        public Criteria andChangeReasonBetween(String value1, String value2) {
            addCriterion("change_reason between", value1, value2, "changeReason");
            return (Criteria) this;
        }

        public Criteria andChangeReasonNotBetween(String value1, String value2) {
            addCriterion("change_reason not between", value1, value2, "changeReason");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andOperatorIdIsNull() {
            addCriterion("operator_id is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIdIsNotNull() {
            addCriterion("operator_id is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorIdEqualTo(String value) {
            addCriterion("operator_id =", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotEqualTo(String value) {
            addCriterion("operator_id <>", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdGreaterThan(String value) {
            addCriterion("operator_id >", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdGreaterThanOrEqualTo(String value) {
            addCriterion("operator_id >=", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdLessThan(String value) {
            addCriterion("operator_id <", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdLessThanOrEqualTo(String value) {
            addCriterion("operator_id <=", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdLike(String value) {
            addCriterion("operator_id like", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotLike(String value) {
            addCriterion("operator_id not like", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdIn(List<String> values) {
            addCriterion("operator_id in", values, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotIn(List<String> values) {
            addCriterion("operator_id not in", values, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdBetween(String value1, String value2) {
            addCriterion("operator_id between", value1, value2, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotBetween(String value1, String value2) {
            addCriterion("operator_id not between", value1, value2, "operatorId");
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