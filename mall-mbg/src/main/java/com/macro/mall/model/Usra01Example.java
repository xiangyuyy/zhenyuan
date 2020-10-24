package com.macro.mall.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Usra01Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Usra01Example() {
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

        public Criteria andB0110IsNull() {
            addCriterion("B0110 is null");
            return (Criteria) this;
        }

        public Criteria andB0110IsNotNull() {
            addCriterion("B0110 is not null");
            return (Criteria) this;
        }

        public Criteria andB0110EqualTo(String value) {
            addCriterion("B0110 =", value, "b0110");
            return (Criteria) this;
        }

        public Criteria andB0110NotEqualTo(String value) {
            addCriterion("B0110 <>", value, "b0110");
            return (Criteria) this;
        }

        public Criteria andB0110GreaterThan(String value) {
            addCriterion("B0110 >", value, "b0110");
            return (Criteria) this;
        }

        public Criteria andB0110GreaterThanOrEqualTo(String value) {
            addCriterion("B0110 >=", value, "b0110");
            return (Criteria) this;
        }

        public Criteria andB0110LessThan(String value) {
            addCriterion("B0110 <", value, "b0110");
            return (Criteria) this;
        }

        public Criteria andB0110LessThanOrEqualTo(String value) {
            addCriterion("B0110 <=", value, "b0110");
            return (Criteria) this;
        }

        public Criteria andB0110Like(String value) {
            addCriterion("B0110 like", value, "b0110");
            return (Criteria) this;
        }

        public Criteria andB0110NotLike(String value) {
            addCriterion("B0110 not like", value, "b0110");
            return (Criteria) this;
        }

        public Criteria andB0110In(List<String> values) {
            addCriterion("B0110 in", values, "b0110");
            return (Criteria) this;
        }

        public Criteria andB0110NotIn(List<String> values) {
            addCriterion("B0110 not in", values, "b0110");
            return (Criteria) this;
        }

        public Criteria andB0110Between(String value1, String value2) {
            addCriterion("B0110 between", value1, value2, "b0110");
            return (Criteria) this;
        }

        public Criteria andB0110NotBetween(String value1, String value2) {
            addCriterion("B0110 not between", value1, value2, "b0110");
            return (Criteria) this;
        }

        public Criteria andA0111IsNull() {
            addCriterion("A0111 is null");
            return (Criteria) this;
        }

        public Criteria andA0111IsNotNull() {
            addCriterion("A0111 is not null");
            return (Criteria) this;
        }

        public Criteria andA0111EqualTo(Date value) {
            addCriterion("A0111 =", value, "a0111");
            return (Criteria) this;
        }

        public Criteria andA0111NotEqualTo(Date value) {
            addCriterion("A0111 <>", value, "a0111");
            return (Criteria) this;
        }

        public Criteria andA0111GreaterThan(Date value) {
            addCriterion("A0111 >", value, "a0111");
            return (Criteria) this;
        }

        public Criteria andA0111GreaterThanOrEqualTo(Date value) {
            addCriterion("A0111 >=", value, "a0111");
            return (Criteria) this;
        }

        public Criteria andA0111LessThan(Date value) {
            addCriterion("A0111 <", value, "a0111");
            return (Criteria) this;
        }

        public Criteria andA0111LessThanOrEqualTo(Date value) {
            addCriterion("A0111 <=", value, "a0111");
            return (Criteria) this;
        }

        public Criteria andA0111In(List<Date> values) {
            addCriterion("A0111 in", values, "a0111");
            return (Criteria) this;
        }

        public Criteria andA0111NotIn(List<Date> values) {
            addCriterion("A0111 not in", values, "a0111");
            return (Criteria) this;
        }

        public Criteria andA0111Between(Date value1, Date value2) {
            addCriterion("A0111 between", value1, value2, "a0111");
            return (Criteria) this;
        }

        public Criteria andA0111NotBetween(Date value1, Date value2) {
            addCriterion("A0111 not between", value1, value2, "a0111");
            return (Criteria) this;
        }

        public Criteria andA0141IsNull() {
            addCriterion("A0141 is null");
            return (Criteria) this;
        }

        public Criteria andA0141IsNotNull() {
            addCriterion("A0141 is not null");
            return (Criteria) this;
        }

        public Criteria andA0141EqualTo(Date value) {
            addCriterion("A0141 =", value, "a0141");
            return (Criteria) this;
        }

        public Criteria andA0141NotEqualTo(Date value) {
            addCriterion("A0141 <>", value, "a0141");
            return (Criteria) this;
        }

        public Criteria andA0141GreaterThan(Date value) {
            addCriterion("A0141 >", value, "a0141");
            return (Criteria) this;
        }

        public Criteria andA0141GreaterThanOrEqualTo(Date value) {
            addCriterion("A0141 >=", value, "a0141");
            return (Criteria) this;
        }

        public Criteria andA0141LessThan(Date value) {
            addCriterion("A0141 <", value, "a0141");
            return (Criteria) this;
        }

        public Criteria andA0141LessThanOrEqualTo(Date value) {
            addCriterion("A0141 <=", value, "a0141");
            return (Criteria) this;
        }

        public Criteria andA0141In(List<Date> values) {
            addCriterion("A0141 in", values, "a0141");
            return (Criteria) this;
        }

        public Criteria andA0141NotIn(List<Date> values) {
            addCriterion("A0141 not in", values, "a0141");
            return (Criteria) this;
        }

        public Criteria andA0141Between(Date value1, Date value2) {
            addCriterion("A0141 between", value1, value2, "a0141");
            return (Criteria) this;
        }

        public Criteria andA0141NotBetween(Date value1, Date value2) {
            addCriterion("A0141 not between", value1, value2, "a0141");
            return (Criteria) this;
        }

        public Criteria andA0107IsNull() {
            addCriterion("A0107 is null");
            return (Criteria) this;
        }

        public Criteria andA0107IsNotNull() {
            addCriterion("A0107 is not null");
            return (Criteria) this;
        }

        public Criteria andA0107EqualTo(String value) {
            addCriterion("A0107 =", value, "a0107");
            return (Criteria) this;
        }

        public Criteria andA0107NotEqualTo(String value) {
            addCriterion("A0107 <>", value, "a0107");
            return (Criteria) this;
        }

        public Criteria andA0107GreaterThan(String value) {
            addCriterion("A0107 >", value, "a0107");
            return (Criteria) this;
        }

        public Criteria andA0107GreaterThanOrEqualTo(String value) {
            addCriterion("A0107 >=", value, "a0107");
            return (Criteria) this;
        }

        public Criteria andA0107LessThan(String value) {
            addCriterion("A0107 <", value, "a0107");
            return (Criteria) this;
        }

        public Criteria andA0107LessThanOrEqualTo(String value) {
            addCriterion("A0107 <=", value, "a0107");
            return (Criteria) this;
        }

        public Criteria andA0107Like(String value) {
            addCriterion("A0107 like", value, "a0107");
            return (Criteria) this;
        }

        public Criteria andA0107NotLike(String value) {
            addCriterion("A0107 not like", value, "a0107");
            return (Criteria) this;
        }

        public Criteria andA0107In(List<String> values) {
            addCriterion("A0107 in", values, "a0107");
            return (Criteria) this;
        }

        public Criteria andA0107NotIn(List<String> values) {
            addCriterion("A0107 not in", values, "a0107");
            return (Criteria) this;
        }

        public Criteria andA0107Between(String value1, String value2) {
            addCriterion("A0107 between", value1, value2, "a0107");
            return (Criteria) this;
        }

        public Criteria andA0107NotBetween(String value1, String value2) {
            addCriterion("A0107 not between", value1, value2, "a0107");
            return (Criteria) this;
        }

        public Criteria andA0177IsNull() {
            addCriterion("A0177 is null");
            return (Criteria) this;
        }

        public Criteria andA0177IsNotNull() {
            addCriterion("A0177 is not null");
            return (Criteria) this;
        }

        public Criteria andA0177EqualTo(String value) {
            addCriterion("A0177 =", value, "a0177");
            return (Criteria) this;
        }

        public Criteria andA0177NotEqualTo(String value) {
            addCriterion("A0177 <>", value, "a0177");
            return (Criteria) this;
        }

        public Criteria andA0177GreaterThan(String value) {
            addCriterion("A0177 >", value, "a0177");
            return (Criteria) this;
        }

        public Criteria andA0177GreaterThanOrEqualTo(String value) {
            addCriterion("A0177 >=", value, "a0177");
            return (Criteria) this;
        }

        public Criteria andA0177LessThan(String value) {
            addCriterion("A0177 <", value, "a0177");
            return (Criteria) this;
        }

        public Criteria andA0177LessThanOrEqualTo(String value) {
            addCriterion("A0177 <=", value, "a0177");
            return (Criteria) this;
        }

        public Criteria andA0177Like(String value) {
            addCriterion("A0177 like", value, "a0177");
            return (Criteria) this;
        }

        public Criteria andA0177NotLike(String value) {
            addCriterion("A0177 not like", value, "a0177");
            return (Criteria) this;
        }

        public Criteria andA0177In(List<String> values) {
            addCriterion("A0177 in", values, "a0177");
            return (Criteria) this;
        }

        public Criteria andA0177NotIn(List<String> values) {
            addCriterion("A0177 not in", values, "a0177");
            return (Criteria) this;
        }

        public Criteria andA0177Between(String value1, String value2) {
            addCriterion("A0177 between", value1, value2, "a0177");
            return (Criteria) this;
        }

        public Criteria andA0177NotBetween(String value1, String value2) {
            addCriterion("A0177 not between", value1, value2, "a0177");
            return (Criteria) this;
        }

        public Criteria andA0121IsNull() {
            addCriterion("A0121 is null");
            return (Criteria) this;
        }

        public Criteria andA0121IsNotNull() {
            addCriterion("A0121 is not null");
            return (Criteria) this;
        }

        public Criteria andA0121EqualTo(String value) {
            addCriterion("A0121 =", value, "a0121");
            return (Criteria) this;
        }

        public Criteria andA0121NotEqualTo(String value) {
            addCriterion("A0121 <>", value, "a0121");
            return (Criteria) this;
        }

        public Criteria andA0121GreaterThan(String value) {
            addCriterion("A0121 >", value, "a0121");
            return (Criteria) this;
        }

        public Criteria andA0121GreaterThanOrEqualTo(String value) {
            addCriterion("A0121 >=", value, "a0121");
            return (Criteria) this;
        }

        public Criteria andA0121LessThan(String value) {
            addCriterion("A0121 <", value, "a0121");
            return (Criteria) this;
        }

        public Criteria andA0121LessThanOrEqualTo(String value) {
            addCriterion("A0121 <=", value, "a0121");
            return (Criteria) this;
        }

        public Criteria andA0121Like(String value) {
            addCriterion("A0121 like", value, "a0121");
            return (Criteria) this;
        }

        public Criteria andA0121NotLike(String value) {
            addCriterion("A0121 not like", value, "a0121");
            return (Criteria) this;
        }

        public Criteria andA0121In(List<String> values) {
            addCriterion("A0121 in", values, "a0121");
            return (Criteria) this;
        }

        public Criteria andA0121NotIn(List<String> values) {
            addCriterion("A0121 not in", values, "a0121");
            return (Criteria) this;
        }

        public Criteria andA0121Between(String value1, String value2) {
            addCriterion("A0121 between", value1, value2, "a0121");
            return (Criteria) this;
        }

        public Criteria andA0121NotBetween(String value1, String value2) {
            addCriterion("A0121 not between", value1, value2, "a0121");
            return (Criteria) this;
        }

        public Criteria andA0114IsNull() {
            addCriterion("A0114 is null");
            return (Criteria) this;
        }

        public Criteria andA0114IsNotNull() {
            addCriterion("A0114 is not null");
            return (Criteria) this;
        }

        public Criteria andA0114EqualTo(String value) {
            addCriterion("A0114 =", value, "a0114");
            return (Criteria) this;
        }

        public Criteria andA0114NotEqualTo(String value) {
            addCriterion("A0114 <>", value, "a0114");
            return (Criteria) this;
        }

        public Criteria andA0114GreaterThan(String value) {
            addCriterion("A0114 >", value, "a0114");
            return (Criteria) this;
        }

        public Criteria andA0114GreaterThanOrEqualTo(String value) {
            addCriterion("A0114 >=", value, "a0114");
            return (Criteria) this;
        }

        public Criteria andA0114LessThan(String value) {
            addCriterion("A0114 <", value, "a0114");
            return (Criteria) this;
        }

        public Criteria andA0114LessThanOrEqualTo(String value) {
            addCriterion("A0114 <=", value, "a0114");
            return (Criteria) this;
        }

        public Criteria andA0114Like(String value) {
            addCriterion("A0114 like", value, "a0114");
            return (Criteria) this;
        }

        public Criteria andA0114NotLike(String value) {
            addCriterion("A0114 not like", value, "a0114");
            return (Criteria) this;
        }

        public Criteria andA0114In(List<String> values) {
            addCriterion("A0114 in", values, "a0114");
            return (Criteria) this;
        }

        public Criteria andA0114NotIn(List<String> values) {
            addCriterion("A0114 not in", values, "a0114");
            return (Criteria) this;
        }

        public Criteria andA0114Between(String value1, String value2) {
            addCriterion("A0114 between", value1, value2, "a0114");
            return (Criteria) this;
        }

        public Criteria andA0114NotBetween(String value1, String value2) {
            addCriterion("A0114 not between", value1, value2, "a0114");
            return (Criteria) this;
        }

        public Criteria andA0171IsNull() {
            addCriterion("A0171 is null");
            return (Criteria) this;
        }

        public Criteria andA0171IsNotNull() {
            addCriterion("A0171 is not null");
            return (Criteria) this;
        }

        public Criteria andA0171EqualTo(String value) {
            addCriterion("A0171 =", value, "a0171");
            return (Criteria) this;
        }

        public Criteria andA0171NotEqualTo(String value) {
            addCriterion("A0171 <>", value, "a0171");
            return (Criteria) this;
        }

        public Criteria andA0171GreaterThan(String value) {
            addCriterion("A0171 >", value, "a0171");
            return (Criteria) this;
        }

        public Criteria andA0171GreaterThanOrEqualTo(String value) {
            addCriterion("A0171 >=", value, "a0171");
            return (Criteria) this;
        }

        public Criteria andA0171LessThan(String value) {
            addCriterion("A0171 <", value, "a0171");
            return (Criteria) this;
        }

        public Criteria andA0171LessThanOrEqualTo(String value) {
            addCriterion("A0171 <=", value, "a0171");
            return (Criteria) this;
        }

        public Criteria andA0171Like(String value) {
            addCriterion("A0171 like", value, "a0171");
            return (Criteria) this;
        }

        public Criteria andA0171NotLike(String value) {
            addCriterion("A0171 not like", value, "a0171");
            return (Criteria) this;
        }

        public Criteria andA0171In(List<String> values) {
            addCriterion("A0171 in", values, "a0171");
            return (Criteria) this;
        }

        public Criteria andA0171NotIn(List<String> values) {
            addCriterion("A0171 not in", values, "a0171");
            return (Criteria) this;
        }

        public Criteria andA0171Between(String value1, String value2) {
            addCriterion("A0171 between", value1, value2, "a0171");
            return (Criteria) this;
        }

        public Criteria andA0171NotBetween(String value1, String value2) {
            addCriterion("A0171 not between", value1, value2, "a0171");
            return (Criteria) this;
        }

        public Criteria andA0101IsNull() {
            addCriterion("A0101 is null");
            return (Criteria) this;
        }

        public Criteria andA0101IsNotNull() {
            addCriterion("A0101 is not null");
            return (Criteria) this;
        }

        public Criteria andA0101EqualTo(String value) {
            addCriterion("A0101 =", value, "a0101");
            return (Criteria) this;
        }

        public Criteria andA0101NotEqualTo(String value) {
            addCriterion("A0101 <>", value, "a0101");
            return (Criteria) this;
        }

        public Criteria andA0101GreaterThan(String value) {
            addCriterion("A0101 >", value, "a0101");
            return (Criteria) this;
        }

        public Criteria andA0101GreaterThanOrEqualTo(String value) {
            addCriterion("A0101 >=", value, "a0101");
            return (Criteria) this;
        }

        public Criteria andA0101LessThan(String value) {
            addCriterion("A0101 <", value, "a0101");
            return (Criteria) this;
        }

        public Criteria andA0101LessThanOrEqualTo(String value) {
            addCriterion("A0101 <=", value, "a0101");
            return (Criteria) this;
        }

        public Criteria andA0101Like(String value) {
            addCriterion("A0101 like", value, "a0101");
            return (Criteria) this;
        }

        public Criteria andA0101NotLike(String value) {
            addCriterion("A0101 not like", value, "a0101");
            return (Criteria) this;
        }

        public Criteria andA0101In(List<String> values) {
            addCriterion("A0101 in", values, "a0101");
            return (Criteria) this;
        }

        public Criteria andA0101NotIn(List<String> values) {
            addCriterion("A0101 not in", values, "a0101");
            return (Criteria) this;
        }

        public Criteria andA0101Between(String value1, String value2) {
            addCriterion("A0101 between", value1, value2, "a0101");
            return (Criteria) this;
        }

        public Criteria andA0101NotBetween(String value1, String value2) {
            addCriterion("A0101 not between", value1, value2, "a0101");
            return (Criteria) this;
        }

        public Criteria andA0174IsNull() {
            addCriterion("A0174 is null");
            return (Criteria) this;
        }

        public Criteria andA0174IsNotNull() {
            addCriterion("A0174 is not null");
            return (Criteria) this;
        }

        public Criteria andA0174EqualTo(String value) {
            addCriterion("A0174 =", value, "a0174");
            return (Criteria) this;
        }

        public Criteria andA0174NotEqualTo(String value) {
            addCriterion("A0174 <>", value, "a0174");
            return (Criteria) this;
        }

        public Criteria andA0174GreaterThan(String value) {
            addCriterion("A0174 >", value, "a0174");
            return (Criteria) this;
        }

        public Criteria andA0174GreaterThanOrEqualTo(String value) {
            addCriterion("A0174 >=", value, "a0174");
            return (Criteria) this;
        }

        public Criteria andA0174LessThan(String value) {
            addCriterion("A0174 <", value, "a0174");
            return (Criteria) this;
        }

        public Criteria andA0174LessThanOrEqualTo(String value) {
            addCriterion("A0174 <=", value, "a0174");
            return (Criteria) this;
        }

        public Criteria andA0174Like(String value) {
            addCriterion("A0174 like", value, "a0174");
            return (Criteria) this;
        }

        public Criteria andA0174NotLike(String value) {
            addCriterion("A0174 not like", value, "a0174");
            return (Criteria) this;
        }

        public Criteria andA0174In(List<String> values) {
            addCriterion("A0174 in", values, "a0174");
            return (Criteria) this;
        }

        public Criteria andA0174NotIn(List<String> values) {
            addCriterion("A0174 not in", values, "a0174");
            return (Criteria) this;
        }

        public Criteria andA0174Between(String value1, String value2) {
            addCriterion("A0174 between", value1, value2, "a0174");
            return (Criteria) this;
        }

        public Criteria andA0174NotBetween(String value1, String value2) {
            addCriterion("A0174 not between", value1, value2, "a0174");
            return (Criteria) this;
        }

        public Criteria andA0112IsNull() {
            addCriterion("A0112 is null");
            return (Criteria) this;
        }

        public Criteria andA0112IsNotNull() {
            addCriterion("A0112 is not null");
            return (Criteria) this;
        }

        public Criteria andA0112EqualTo(Integer value) {
            addCriterion("A0112 =", value, "a0112");
            return (Criteria) this;
        }

        public Criteria andA0112NotEqualTo(Integer value) {
            addCriterion("A0112 <>", value, "a0112");
            return (Criteria) this;
        }

        public Criteria andA0112GreaterThan(Integer value) {
            addCriterion("A0112 >", value, "a0112");
            return (Criteria) this;
        }

        public Criteria andA0112GreaterThanOrEqualTo(Integer value) {
            addCriterion("A0112 >=", value, "a0112");
            return (Criteria) this;
        }

        public Criteria andA0112LessThan(Integer value) {
            addCriterion("A0112 <", value, "a0112");
            return (Criteria) this;
        }

        public Criteria andA0112LessThanOrEqualTo(Integer value) {
            addCriterion("A0112 <=", value, "a0112");
            return (Criteria) this;
        }

        public Criteria andA0112In(List<Integer> values) {
            addCriterion("A0112 in", values, "a0112");
            return (Criteria) this;
        }

        public Criteria andA0112NotIn(List<Integer> values) {
            addCriterion("A0112 not in", values, "a0112");
            return (Criteria) this;
        }

        public Criteria andA0112Between(Integer value1, Integer value2) {
            addCriterion("A0112 between", value1, value2, "a0112");
            return (Criteria) this;
        }

        public Criteria andA0112NotBetween(Integer value1, Integer value2) {
            addCriterion("A0112 not between", value1, value2, "a0112");
            return (Criteria) this;
        }

        public Criteria andA0103IsNull() {
            addCriterion("A0103 is null");
            return (Criteria) this;
        }

        public Criteria andA0103IsNotNull() {
            addCriterion("A0103 is not null");
            return (Criteria) this;
        }

        public Criteria andA0103EqualTo(String value) {
            addCriterion("A0103 =", value, "a0103");
            return (Criteria) this;
        }

        public Criteria andA0103NotEqualTo(String value) {
            addCriterion("A0103 <>", value, "a0103");
            return (Criteria) this;
        }

        public Criteria andA0103GreaterThan(String value) {
            addCriterion("A0103 >", value, "a0103");
            return (Criteria) this;
        }

        public Criteria andA0103GreaterThanOrEqualTo(String value) {
            addCriterion("A0103 >=", value, "a0103");
            return (Criteria) this;
        }

        public Criteria andA0103LessThan(String value) {
            addCriterion("A0103 <", value, "a0103");
            return (Criteria) this;
        }

        public Criteria andA0103LessThanOrEqualTo(String value) {
            addCriterion("A0103 <=", value, "a0103");
            return (Criteria) this;
        }

        public Criteria andA0103Like(String value) {
            addCriterion("A0103 like", value, "a0103");
            return (Criteria) this;
        }

        public Criteria andA0103NotLike(String value) {
            addCriterion("A0103 not like", value, "a0103");
            return (Criteria) this;
        }

        public Criteria andA0103In(List<String> values) {
            addCriterion("A0103 in", values, "a0103");
            return (Criteria) this;
        }

        public Criteria andA0103NotIn(List<String> values) {
            addCriterion("A0103 not in", values, "a0103");
            return (Criteria) this;
        }

        public Criteria andA0103Between(String value1, String value2) {
            addCriterion("A0103 between", value1, value2, "a0103");
            return (Criteria) this;
        }

        public Criteria andA0103NotBetween(String value1, String value2) {
            addCriterion("A0103 not between", value1, value2, "a0103");
            return (Criteria) this;
        }

        public Criteria andA0148IsNull() {
            addCriterion("A0148 is null");
            return (Criteria) this;
        }

        public Criteria andA0148IsNotNull() {
            addCriterion("A0148 is not null");
            return (Criteria) this;
        }

        public Criteria andA0148EqualTo(String value) {
            addCriterion("A0148 =", value, "a0148");
            return (Criteria) this;
        }

        public Criteria andA0148NotEqualTo(String value) {
            addCriterion("A0148 <>", value, "a0148");
            return (Criteria) this;
        }

        public Criteria andA0148GreaterThan(String value) {
            addCriterion("A0148 >", value, "a0148");
            return (Criteria) this;
        }

        public Criteria andA0148GreaterThanOrEqualTo(String value) {
            addCriterion("A0148 >=", value, "a0148");
            return (Criteria) this;
        }

        public Criteria andA0148LessThan(String value) {
            addCriterion("A0148 <", value, "a0148");
            return (Criteria) this;
        }

        public Criteria andA0148LessThanOrEqualTo(String value) {
            addCriterion("A0148 <=", value, "a0148");
            return (Criteria) this;
        }

        public Criteria andA0148Like(String value) {
            addCriterion("A0148 like", value, "a0148");
            return (Criteria) this;
        }

        public Criteria andA0148NotLike(String value) {
            addCriterion("A0148 not like", value, "a0148");
            return (Criteria) this;
        }

        public Criteria andA0148In(List<String> values) {
            addCriterion("A0148 in", values, "a0148");
            return (Criteria) this;
        }

        public Criteria andA0148NotIn(List<String> values) {
            addCriterion("A0148 not in", values, "a0148");
            return (Criteria) this;
        }

        public Criteria andA0148Between(String value1, String value2) {
            addCriterion("A0148 between", value1, value2, "a0148");
            return (Criteria) this;
        }

        public Criteria andA0148NotBetween(String value1, String value2) {
            addCriterion("A0148 not between", value1, value2, "a0148");
            return (Criteria) this;
        }

        public Criteria andA0183IsNull() {
            addCriterion("A0183 is null");
            return (Criteria) this;
        }

        public Criteria andA0183IsNotNull() {
            addCriterion("A0183 is not null");
            return (Criteria) this;
        }

        public Criteria andA0183EqualTo(String value) {
            addCriterion("A0183 =", value, "a0183");
            return (Criteria) this;
        }

        public Criteria andA0183NotEqualTo(String value) {
            addCriterion("A0183 <>", value, "a0183");
            return (Criteria) this;
        }

        public Criteria andA0183GreaterThan(String value) {
            addCriterion("A0183 >", value, "a0183");
            return (Criteria) this;
        }

        public Criteria andA0183GreaterThanOrEqualTo(String value) {
            addCriterion("A0183 >=", value, "a0183");
            return (Criteria) this;
        }

        public Criteria andA0183LessThan(String value) {
            addCriterion("A0183 <", value, "a0183");
            return (Criteria) this;
        }

        public Criteria andA0183LessThanOrEqualTo(String value) {
            addCriterion("A0183 <=", value, "a0183");
            return (Criteria) this;
        }

        public Criteria andA0183Like(String value) {
            addCriterion("A0183 like", value, "a0183");
            return (Criteria) this;
        }

        public Criteria andA0183NotLike(String value) {
            addCriterion("A0183 not like", value, "a0183");
            return (Criteria) this;
        }

        public Criteria andA0183In(List<String> values) {
            addCriterion("A0183 in", values, "a0183");
            return (Criteria) this;
        }

        public Criteria andA0183NotIn(List<String> values) {
            addCriterion("A0183 not in", values, "a0183");
            return (Criteria) this;
        }

        public Criteria andA0183Between(String value1, String value2) {
            addCriterion("A0183 between", value1, value2, "a0183");
            return (Criteria) this;
        }

        public Criteria andA0183NotBetween(String value1, String value2) {
            addCriterion("A0183 not between", value1, value2, "a0183");
            return (Criteria) this;
        }

        public Criteria andA0142IsNull() {
            addCriterion("A0142 is null");
            return (Criteria) this;
        }

        public Criteria andA0142IsNotNull() {
            addCriterion("A0142 is not null");
            return (Criteria) this;
        }

        public Criteria andA0142EqualTo(Date value) {
            addCriterion("A0142 =", value, "a0142");
            return (Criteria) this;
        }

        public Criteria andA0142NotEqualTo(Date value) {
            addCriterion("A0142 <>", value, "a0142");
            return (Criteria) this;
        }

        public Criteria andA0142GreaterThan(Date value) {
            addCriterion("A0142 >", value, "a0142");
            return (Criteria) this;
        }

        public Criteria andA0142GreaterThanOrEqualTo(Date value) {
            addCriterion("A0142 >=", value, "a0142");
            return (Criteria) this;
        }

        public Criteria andA0142LessThan(Date value) {
            addCriterion("A0142 <", value, "a0142");
            return (Criteria) this;
        }

        public Criteria andA0142LessThanOrEqualTo(Date value) {
            addCriterion("A0142 <=", value, "a0142");
            return (Criteria) this;
        }

        public Criteria andA0142In(List<Date> values) {
            addCriterion("A0142 in", values, "a0142");
            return (Criteria) this;
        }

        public Criteria andA0142NotIn(List<Date> values) {
            addCriterion("A0142 not in", values, "a0142");
            return (Criteria) this;
        }

        public Criteria andA0142Between(Date value1, Date value2) {
            addCriterion("A0142 between", value1, value2, "a0142");
            return (Criteria) this;
        }

        public Criteria andA0142NotBetween(Date value1, Date value2) {
            addCriterion("A0142 not between", value1, value2, "a0142");
            return (Criteria) this;
        }

        public Criteria andA0146IsNull() {
            addCriterion("A0146 is null");
            return (Criteria) this;
        }

        public Criteria andA0146IsNotNull() {
            addCriterion("A0146 is not null");
            return (Criteria) this;
        }

        public Criteria andA0146EqualTo(String value) {
            addCriterion("A0146 =", value, "a0146");
            return (Criteria) this;
        }

        public Criteria andA0146NotEqualTo(String value) {
            addCriterion("A0146 <>", value, "a0146");
            return (Criteria) this;
        }

        public Criteria andA0146GreaterThan(String value) {
            addCriterion("A0146 >", value, "a0146");
            return (Criteria) this;
        }

        public Criteria andA0146GreaterThanOrEqualTo(String value) {
            addCriterion("A0146 >=", value, "a0146");
            return (Criteria) this;
        }

        public Criteria andA0146LessThan(String value) {
            addCriterion("A0146 <", value, "a0146");
            return (Criteria) this;
        }

        public Criteria andA0146LessThanOrEqualTo(String value) {
            addCriterion("A0146 <=", value, "a0146");
            return (Criteria) this;
        }

        public Criteria andA0146Like(String value) {
            addCriterion("A0146 like", value, "a0146");
            return (Criteria) this;
        }

        public Criteria andA0146NotLike(String value) {
            addCriterion("A0146 not like", value, "a0146");
            return (Criteria) this;
        }

        public Criteria andA0146In(List<String> values) {
            addCriterion("A0146 in", values, "a0146");
            return (Criteria) this;
        }

        public Criteria andA0146NotIn(List<String> values) {
            addCriterion("A0146 not in", values, "a0146");
            return (Criteria) this;
        }

        public Criteria andA0146Between(String value1, String value2) {
            addCriterion("A0146 between", value1, value2, "a0146");
            return (Criteria) this;
        }

        public Criteria andA0146NotBetween(String value1, String value2) {
            addCriterion("A0146 not between", value1, value2, "a0146");
            return (Criteria) this;
        }

        public Criteria andA0119IsNull() {
            addCriterion("A0119 is null");
            return (Criteria) this;
        }

        public Criteria andA0119IsNotNull() {
            addCriterion("A0119 is not null");
            return (Criteria) this;
        }

        public Criteria andA0119EqualTo(String value) {
            addCriterion("A0119 =", value, "a0119");
            return (Criteria) this;
        }

        public Criteria andA0119NotEqualTo(String value) {
            addCriterion("A0119 <>", value, "a0119");
            return (Criteria) this;
        }

        public Criteria andA0119GreaterThan(String value) {
            addCriterion("A0119 >", value, "a0119");
            return (Criteria) this;
        }

        public Criteria andA0119GreaterThanOrEqualTo(String value) {
            addCriterion("A0119 >=", value, "a0119");
            return (Criteria) this;
        }

        public Criteria andA0119LessThan(String value) {
            addCriterion("A0119 <", value, "a0119");
            return (Criteria) this;
        }

        public Criteria andA0119LessThanOrEqualTo(String value) {
            addCriterion("A0119 <=", value, "a0119");
            return (Criteria) this;
        }

        public Criteria andA0119Like(String value) {
            addCriterion("A0119 like", value, "a0119");
            return (Criteria) this;
        }

        public Criteria andA0119NotLike(String value) {
            addCriterion("A0119 not like", value, "a0119");
            return (Criteria) this;
        }

        public Criteria andA0119In(List<String> values) {
            addCriterion("A0119 in", values, "a0119");
            return (Criteria) this;
        }

        public Criteria andA0119NotIn(List<String> values) {
            addCriterion("A0119 not in", values, "a0119");
            return (Criteria) this;
        }

        public Criteria andA0119Between(String value1, String value2) {
            addCriterion("A0119 between", value1, value2, "a0119");
            return (Criteria) this;
        }

        public Criteria andA0119NotBetween(String value1, String value2) {
            addCriterion("A0119 not between", value1, value2, "a0119");
            return (Criteria) this;
        }

        public Criteria andA0130IsNull() {
            addCriterion("A0130 is null");
            return (Criteria) this;
        }

        public Criteria andA0130IsNotNull() {
            addCriterion("A0130 is not null");
            return (Criteria) this;
        }

        public Criteria andA0130EqualTo(String value) {
            addCriterion("A0130 =", value, "a0130");
            return (Criteria) this;
        }

        public Criteria andA0130NotEqualTo(String value) {
            addCriterion("A0130 <>", value, "a0130");
            return (Criteria) this;
        }

        public Criteria andA0130GreaterThan(String value) {
            addCriterion("A0130 >", value, "a0130");
            return (Criteria) this;
        }

        public Criteria andA0130GreaterThanOrEqualTo(String value) {
            addCriterion("A0130 >=", value, "a0130");
            return (Criteria) this;
        }

        public Criteria andA0130LessThan(String value) {
            addCriterion("A0130 <", value, "a0130");
            return (Criteria) this;
        }

        public Criteria andA0130LessThanOrEqualTo(String value) {
            addCriterion("A0130 <=", value, "a0130");
            return (Criteria) this;
        }

        public Criteria andA0130Like(String value) {
            addCriterion("A0130 like", value, "a0130");
            return (Criteria) this;
        }

        public Criteria andA0130NotLike(String value) {
            addCriterion("A0130 not like", value, "a0130");
            return (Criteria) this;
        }

        public Criteria andA0130In(List<String> values) {
            addCriterion("A0130 in", values, "a0130");
            return (Criteria) this;
        }

        public Criteria andA0130NotIn(List<String> values) {
            addCriterion("A0130 not in", values, "a0130");
            return (Criteria) this;
        }

        public Criteria andA0130Between(String value1, String value2) {
            addCriterion("A0130 between", value1, value2, "a0130");
            return (Criteria) this;
        }

        public Criteria andA0130NotBetween(String value1, String value2) {
            addCriterion("A0130 not between", value1, value2, "a0130");
            return (Criteria) this;
        }

        public Criteria andA0134IsNull() {
            addCriterion("A0134 is null");
            return (Criteria) this;
        }

        public Criteria andA0134IsNotNull() {
            addCriterion("A0134 is not null");
            return (Criteria) this;
        }

        public Criteria andA0134EqualTo(String value) {
            addCriterion("A0134 =", value, "a0134");
            return (Criteria) this;
        }

        public Criteria andA0134NotEqualTo(String value) {
            addCriterion("A0134 <>", value, "a0134");
            return (Criteria) this;
        }

        public Criteria andA0134GreaterThan(String value) {
            addCriterion("A0134 >", value, "a0134");
            return (Criteria) this;
        }

        public Criteria andA0134GreaterThanOrEqualTo(String value) {
            addCriterion("A0134 >=", value, "a0134");
            return (Criteria) this;
        }

        public Criteria andA0134LessThan(String value) {
            addCriterion("A0134 <", value, "a0134");
            return (Criteria) this;
        }

        public Criteria andA0134LessThanOrEqualTo(String value) {
            addCriterion("A0134 <=", value, "a0134");
            return (Criteria) this;
        }

        public Criteria andA0134Like(String value) {
            addCriterion("A0134 like", value, "a0134");
            return (Criteria) this;
        }

        public Criteria andA0134NotLike(String value) {
            addCriterion("A0134 not like", value, "a0134");
            return (Criteria) this;
        }

        public Criteria andA0134In(List<String> values) {
            addCriterion("A0134 in", values, "a0134");
            return (Criteria) this;
        }

        public Criteria andA0134NotIn(List<String> values) {
            addCriterion("A0134 not in", values, "a0134");
            return (Criteria) this;
        }

        public Criteria andA0134Between(String value1, String value2) {
            addCriterion("A0134 between", value1, value2, "a0134");
            return (Criteria) this;
        }

        public Criteria andA0134NotBetween(String value1, String value2) {
            addCriterion("A0134 not between", value1, value2, "a0134");
            return (Criteria) this;
        }

        public Criteria andA0144IsNull() {
            addCriterion("A0144 is null");
            return (Criteria) this;
        }

        public Criteria andA0144IsNotNull() {
            addCriterion("A0144 is not null");
            return (Criteria) this;
        }

        public Criteria andA0144EqualTo(String value) {
            addCriterion("A0144 =", value, "a0144");
            return (Criteria) this;
        }

        public Criteria andA0144NotEqualTo(String value) {
            addCriterion("A0144 <>", value, "a0144");
            return (Criteria) this;
        }

        public Criteria andA0144GreaterThan(String value) {
            addCriterion("A0144 >", value, "a0144");
            return (Criteria) this;
        }

        public Criteria andA0144GreaterThanOrEqualTo(String value) {
            addCriterion("A0144 >=", value, "a0144");
            return (Criteria) this;
        }

        public Criteria andA0144LessThan(String value) {
            addCriterion("A0144 <", value, "a0144");
            return (Criteria) this;
        }

        public Criteria andA0144LessThanOrEqualTo(String value) {
            addCriterion("A0144 <=", value, "a0144");
            return (Criteria) this;
        }

        public Criteria andA0144Like(String value) {
            addCriterion("A0144 like", value, "a0144");
            return (Criteria) this;
        }

        public Criteria andA0144NotLike(String value) {
            addCriterion("A0144 not like", value, "a0144");
            return (Criteria) this;
        }

        public Criteria andA0144In(List<String> values) {
            addCriterion("A0144 in", values, "a0144");
            return (Criteria) this;
        }

        public Criteria andA0144NotIn(List<String> values) {
            addCriterion("A0144 not in", values, "a0144");
            return (Criteria) this;
        }

        public Criteria andA0144Between(String value1, String value2) {
            addCriterion("A0144 between", value1, value2, "a0144");
            return (Criteria) this;
        }

        public Criteria andA0144NotBetween(String value1, String value2) {
            addCriterion("A0144 not between", value1, value2, "a0144");
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