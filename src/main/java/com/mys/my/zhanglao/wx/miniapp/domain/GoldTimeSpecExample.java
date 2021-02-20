package com.mys.my.zhanglao.wx.miniapp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoldTimeSpecExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoldTimeSpecExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andFamilyIdIsNull() {
            addCriterion("family_id is null");
            return (Criteria) this;
        }

        public Criteria andFamilyIdIsNotNull() {
            addCriterion("family_id is not null");
            return (Criteria) this;
        }

        public Criteria andFamilyIdEqualTo(String value) {
            addCriterion("family_id =", value, "familyId");
            return (Criteria) this;
        }

        public Criteria andFamilyIdNotEqualTo(String value) {
            addCriterion("family_id <>", value, "familyId");
            return (Criteria) this;
        }

        public Criteria andFamilyIdGreaterThan(String value) {
            addCriterion("family_id >", value, "familyId");
            return (Criteria) this;
        }

        public Criteria andFamilyIdGreaterThanOrEqualTo(String value) {
            addCriterion("family_id >=", value, "familyId");
            return (Criteria) this;
        }

        public Criteria andFamilyIdLessThan(String value) {
            addCriterion("family_id <", value, "familyId");
            return (Criteria) this;
        }

        public Criteria andFamilyIdLessThanOrEqualTo(String value) {
            addCriterion("family_id <=", value, "familyId");
            return (Criteria) this;
        }

        public Criteria andFamilyIdLike(String value) {
            addCriterion("family_id like", value, "familyId");
            return (Criteria) this;
        }

        public Criteria andFamilyIdNotLike(String value) {
            addCriterion("family_id not like", value, "familyId");
            return (Criteria) this;
        }

        public Criteria andFamilyIdIn(List<String> values) {
            addCriterion("family_id in", values, "familyId");
            return (Criteria) this;
        }

        public Criteria andFamilyIdNotIn(List<String> values) {
            addCriterion("family_id not in", values, "familyId");
            return (Criteria) this;
        }

        public Criteria andFamilyIdBetween(String value1, String value2) {
            addCriterion("family_id between", value1, value2, "familyId");
            return (Criteria) this;
        }

        public Criteria andFamilyIdNotBetween(String value1, String value2) {
            addCriterion("family_id not between", value1, value2, "familyId");
            return (Criteria) this;
        }

        public Criteria andGenIdIsNull() {
            addCriterion("gen_id is null");
            return (Criteria) this;
        }

        public Criteria andGenIdIsNotNull() {
            addCriterion("gen_id is not null");
            return (Criteria) this;
        }

        public Criteria andGenIdEqualTo(String value) {
            addCriterion("gen_id =", value, "genId");
            return (Criteria) this;
        }

        public Criteria andGenIdNotEqualTo(String value) {
            addCriterion("gen_id <>", value, "genId");
            return (Criteria) this;
        }

        public Criteria andGenIdGreaterThan(String value) {
            addCriterion("gen_id >", value, "genId");
            return (Criteria) this;
        }

        public Criteria andGenIdGreaterThanOrEqualTo(String value) {
            addCriterion("gen_id >=", value, "genId");
            return (Criteria) this;
        }

        public Criteria andGenIdLessThan(String value) {
            addCriterion("gen_id <", value, "genId");
            return (Criteria) this;
        }

        public Criteria andGenIdLessThanOrEqualTo(String value) {
            addCriterion("gen_id <=", value, "genId");
            return (Criteria) this;
        }

        public Criteria andGenIdLike(String value) {
            addCriterion("gen_id like", value, "genId");
            return (Criteria) this;
        }

        public Criteria andGenIdNotLike(String value) {
            addCriterion("gen_id not like", value, "genId");
            return (Criteria) this;
        }

        public Criteria andGenIdIn(List<String> values) {
            addCriterion("gen_id in", values, "genId");
            return (Criteria) this;
        }

        public Criteria andGenIdNotIn(List<String> values) {
            addCriterion("gen_id not in", values, "genId");
            return (Criteria) this;
        }

        public Criteria andGenIdBetween(String value1, String value2) {
            addCriterion("gen_id between", value1, value2, "genId");
            return (Criteria) this;
        }

        public Criteria andGenIdNotBetween(String value1, String value2) {
            addCriterion("gen_id not between", value1, value2, "genId");
            return (Criteria) this;
        }

        public Criteria andSpeIdIsNull() {
            addCriterion("spe_id is null");
            return (Criteria) this;
        }

        public Criteria andSpeIdIsNotNull() {
            addCriterion("spe_id is not null");
            return (Criteria) this;
        }

        public Criteria andSpeIdEqualTo(String value) {
            addCriterion("spe_id =", value, "speId");
            return (Criteria) this;
        }

        public Criteria andSpeIdNotEqualTo(String value) {
            addCriterion("spe_id <>", value, "speId");
            return (Criteria) this;
        }

        public Criteria andSpeIdGreaterThan(String value) {
            addCriterion("spe_id >", value, "speId");
            return (Criteria) this;
        }

        public Criteria andSpeIdGreaterThanOrEqualTo(String value) {
            addCriterion("spe_id >=", value, "speId");
            return (Criteria) this;
        }

        public Criteria andSpeIdLessThan(String value) {
            addCriterion("spe_id <", value, "speId");
            return (Criteria) this;
        }

        public Criteria andSpeIdLessThanOrEqualTo(String value) {
            addCriterion("spe_id <=", value, "speId");
            return (Criteria) this;
        }

        public Criteria andSpeIdLike(String value) {
            addCriterion("spe_id like", value, "speId");
            return (Criteria) this;
        }

        public Criteria andSpeIdNotLike(String value) {
            addCriterion("spe_id not like", value, "speId");
            return (Criteria) this;
        }

        public Criteria andSpeIdIn(List<String> values) {
            addCriterion("spe_id in", values, "speId");
            return (Criteria) this;
        }

        public Criteria andSpeIdNotIn(List<String> values) {
            addCriterion("spe_id not in", values, "speId");
            return (Criteria) this;
        }

        public Criteria andSpeIdBetween(String value1, String value2) {
            addCriterion("spe_id between", value1, value2, "speId");
            return (Criteria) this;
        }

        public Criteria andSpeIdNotBetween(String value1, String value2) {
            addCriterion("spe_id not between", value1, value2, "speId");
            return (Criteria) this;
        }

        public Criteria andFamilyNameIsNull() {
            addCriterion("family_name is null");
            return (Criteria) this;
        }

        public Criteria andFamilyNameIsNotNull() {
            addCriterion("family_name is not null");
            return (Criteria) this;
        }

        public Criteria andFamilyNameEqualTo(String value) {
            addCriterion("family_name =", value, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameNotEqualTo(String value) {
            addCriterion("family_name <>", value, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameGreaterThan(String value) {
            addCriterion("family_name >", value, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameGreaterThanOrEqualTo(String value) {
            addCriterion("family_name >=", value, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameLessThan(String value) {
            addCriterion("family_name <", value, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameLessThanOrEqualTo(String value) {
            addCriterion("family_name <=", value, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameLike(String value) {
            addCriterion("family_name like", value, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameNotLike(String value) {
            addCriterion("family_name not like", value, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameIn(List<String> values) {
            addCriterion("family_name in", values, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameNotIn(List<String> values) {
            addCriterion("family_name not in", values, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameBetween(String value1, String value2) {
            addCriterion("family_name between", value1, value2, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameNotBetween(String value1, String value2) {
            addCriterion("family_name not between", value1, value2, "familyName");
            return (Criteria) this;
        }

        public Criteria andGenNameIsNull() {
            addCriterion("gen_name is null");
            return (Criteria) this;
        }

        public Criteria andGenNameIsNotNull() {
            addCriterion("gen_name is not null");
            return (Criteria) this;
        }

        public Criteria andGenNameEqualTo(String value) {
            addCriterion("gen_name =", value, "genName");
            return (Criteria) this;
        }

        public Criteria andGenNameNotEqualTo(String value) {
            addCriterion("gen_name <>", value, "genName");
            return (Criteria) this;
        }

        public Criteria andGenNameGreaterThan(String value) {
            addCriterion("gen_name >", value, "genName");
            return (Criteria) this;
        }

        public Criteria andGenNameGreaterThanOrEqualTo(String value) {
            addCriterion("gen_name >=", value, "genName");
            return (Criteria) this;
        }

        public Criteria andGenNameLessThan(String value) {
            addCriterion("gen_name <", value, "genName");
            return (Criteria) this;
        }

        public Criteria andGenNameLessThanOrEqualTo(String value) {
            addCriterion("gen_name <=", value, "genName");
            return (Criteria) this;
        }

        public Criteria andGenNameLike(String value) {
            addCriterion("gen_name like", value, "genName");
            return (Criteria) this;
        }

        public Criteria andGenNameNotLike(String value) {
            addCriterion("gen_name not like", value, "genName");
            return (Criteria) this;
        }

        public Criteria andGenNameIn(List<String> values) {
            addCriterion("gen_name in", values, "genName");
            return (Criteria) this;
        }

        public Criteria andGenNameNotIn(List<String> values) {
            addCriterion("gen_name not in", values, "genName");
            return (Criteria) this;
        }

        public Criteria andGenNameBetween(String value1, String value2) {
            addCriterion("gen_name between", value1, value2, "genName");
            return (Criteria) this;
        }

        public Criteria andGenNameNotBetween(String value1, String value2) {
            addCriterion("gen_name not between", value1, value2, "genName");
            return (Criteria) this;
        }

        public Criteria andSpeNameIsNull() {
            addCriterion("spe_name is null");
            return (Criteria) this;
        }

        public Criteria andSpeNameIsNotNull() {
            addCriterion("spe_name is not null");
            return (Criteria) this;
        }

        public Criteria andSpeNameEqualTo(String value) {
            addCriterion("spe_name =", value, "speName");
            return (Criteria) this;
        }

        public Criteria andSpeNameNotEqualTo(String value) {
            addCriterion("spe_name <>", value, "speName");
            return (Criteria) this;
        }

        public Criteria andSpeNameGreaterThan(String value) {
            addCriterion("spe_name >", value, "speName");
            return (Criteria) this;
        }

        public Criteria andSpeNameGreaterThanOrEqualTo(String value) {
            addCriterion("spe_name >=", value, "speName");
            return (Criteria) this;
        }

        public Criteria andSpeNameLessThan(String value) {
            addCriterion("spe_name <", value, "speName");
            return (Criteria) this;
        }

        public Criteria andSpeNameLessThanOrEqualTo(String value) {
            addCriterion("spe_name <=", value, "speName");
            return (Criteria) this;
        }

        public Criteria andSpeNameLike(String value) {
            addCriterion("spe_name like", value, "speName");
            return (Criteria) this;
        }

        public Criteria andSpeNameNotLike(String value) {
            addCriterion("spe_name not like", value, "speName");
            return (Criteria) this;
        }

        public Criteria andSpeNameIn(List<String> values) {
            addCriterion("spe_name in", values, "speName");
            return (Criteria) this;
        }

        public Criteria andSpeNameNotIn(List<String> values) {
            addCriterion("spe_name not in", values, "speName");
            return (Criteria) this;
        }

        public Criteria andSpeNameBetween(String value1, String value2) {
            addCriterion("spe_name between", value1, value2, "speName");
            return (Criteria) this;
        }

        public Criteria andSpeNameNotBetween(String value1, String value2) {
            addCriterion("spe_name not between", value1, value2, "speName");
            return (Criteria) this;
        }

        public Criteria andSpeImgIsNull() {
            addCriterion("spe_img is null");
            return (Criteria) this;
        }

        public Criteria andSpeImgIsNotNull() {
            addCriterion("spe_img is not null");
            return (Criteria) this;
        }

        public Criteria andSpeImgEqualTo(String value) {
            addCriterion("spe_img =", value, "speImg");
            return (Criteria) this;
        }

        public Criteria andSpeImgNotEqualTo(String value) {
            addCriterion("spe_img <>", value, "speImg");
            return (Criteria) this;
        }

        public Criteria andSpeImgGreaterThan(String value) {
            addCriterion("spe_img >", value, "speImg");
            return (Criteria) this;
        }

        public Criteria andSpeImgGreaterThanOrEqualTo(String value) {
            addCriterion("spe_img >=", value, "speImg");
            return (Criteria) this;
        }

        public Criteria andSpeImgLessThan(String value) {
            addCriterion("spe_img <", value, "speImg");
            return (Criteria) this;
        }

        public Criteria andSpeImgLessThanOrEqualTo(String value) {
            addCriterion("spe_img <=", value, "speImg");
            return (Criteria) this;
        }

        public Criteria andSpeImgLike(String value) {
            addCriterion("spe_img like", value, "speImg");
            return (Criteria) this;
        }

        public Criteria andSpeImgNotLike(String value) {
            addCriterion("spe_img not like", value, "speImg");
            return (Criteria) this;
        }

        public Criteria andSpeImgIn(List<String> values) {
            addCriterion("spe_img in", values, "speImg");
            return (Criteria) this;
        }

        public Criteria andSpeImgNotIn(List<String> values) {
            addCriterion("spe_img not in", values, "speImg");
            return (Criteria) this;
        }

        public Criteria andSpeImgBetween(String value1, String value2) {
            addCriterion("spe_img between", value1, value2, "speImg");
            return (Criteria) this;
        }

        public Criteria andSpeImgNotBetween(String value1, String value2) {
            addCriterion("spe_img not between", value1, value2, "speImg");
            return (Criteria) this;
        }

        public Criteria andSpeConIsNull() {
            addCriterion("spe_con is null");
            return (Criteria) this;
        }

        public Criteria andSpeConIsNotNull() {
            addCriterion("spe_con is not null");
            return (Criteria) this;
        }

        public Criteria andSpeConEqualTo(String value) {
            addCriterion("spe_con =", value, "speCon");
            return (Criteria) this;
        }

        public Criteria andSpeConNotEqualTo(String value) {
            addCriterion("spe_con <>", value, "speCon");
            return (Criteria) this;
        }

        public Criteria andSpeConGreaterThan(String value) {
            addCriterion("spe_con >", value, "speCon");
            return (Criteria) this;
        }

        public Criteria andSpeConGreaterThanOrEqualTo(String value) {
            addCriterion("spe_con >=", value, "speCon");
            return (Criteria) this;
        }

        public Criteria andSpeConLessThan(String value) {
            addCriterion("spe_con <", value, "speCon");
            return (Criteria) this;
        }

        public Criteria andSpeConLessThanOrEqualTo(String value) {
            addCriterion("spe_con <=", value, "speCon");
            return (Criteria) this;
        }

        public Criteria andSpeConLike(String value) {
            addCriterion("spe_con like", value, "speCon");
            return (Criteria) this;
        }

        public Criteria andSpeConNotLike(String value) {
            addCriterion("spe_con not like", value, "speCon");
            return (Criteria) this;
        }

        public Criteria andSpeConIn(List<String> values) {
            addCriterion("spe_con in", values, "speCon");
            return (Criteria) this;
        }

        public Criteria andSpeConNotIn(List<String> values) {
            addCriterion("spe_con not in", values, "speCon");
            return (Criteria) this;
        }

        public Criteria andSpeConBetween(String value1, String value2) {
            addCriterion("spe_con between", value1, value2, "speCon");
            return (Criteria) this;
        }

        public Criteria andSpeConNotBetween(String value1, String value2) {
            addCriterion("spe_con not between", value1, value2, "speCon");
            return (Criteria) this;
        }

        public Criteria andTimIsNull() {
            addCriterion("tim is null");
            return (Criteria) this;
        }

        public Criteria andTimIsNotNull() {
            addCriterion("tim is not null");
            return (Criteria) this;
        }

        public Criteria andTimEqualTo(String value) {
            addCriterion("tim =", value, "tim");
            return (Criteria) this;
        }

        public Criteria andTimNotEqualTo(String value) {
            addCriterion("tim <>", value, "tim");
            return (Criteria) this;
        }

        public Criteria andTimGreaterThan(String value) {
            addCriterion("tim >", value, "tim");
            return (Criteria) this;
        }

        public Criteria andTimGreaterThanOrEqualTo(String value) {
            addCriterion("tim >=", value, "tim");
            return (Criteria) this;
        }

        public Criteria andTimLessThan(String value) {
            addCriterion("tim <", value, "tim");
            return (Criteria) this;
        }

        public Criteria andTimLessThanOrEqualTo(String value) {
            addCriterion("tim <=", value, "tim");
            return (Criteria) this;
        }

        public Criteria andTimLike(String value) {
            addCriterion("tim like", value, "tim");
            return (Criteria) this;
        }

        public Criteria andTimNotLike(String value) {
            addCriterion("tim not like", value, "tim");
            return (Criteria) this;
        }

        public Criteria andTimIn(List<String> values) {
            addCriterion("tim in", values, "tim");
            return (Criteria) this;
        }

        public Criteria andTimNotIn(List<String> values) {
            addCriterion("tim not in", values, "tim");
            return (Criteria) this;
        }

        public Criteria andTimBetween(String value1, String value2) {
            addCriterion("tim between", value1, value2, "tim");
            return (Criteria) this;
        }

        public Criteria andTimNotBetween(String value1, String value2) {
            addCriterion("tim not between", value1, value2, "tim");
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

        public Criteria andIsDeleteIsNull() {
            addCriterion("is_delete is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(Byte value) {
            addCriterion("is_delete =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(Byte value) {
            addCriterion("is_delete <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(Byte value) {
            addCriterion("is_delete >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_delete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(Byte value) {
            addCriterion("is_delete <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(Byte value) {
            addCriterion("is_delete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<Byte> values) {
            addCriterion("is_delete in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<Byte> values) {
            addCriterion("is_delete not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(Byte value1, Byte value2) {
            addCriterion("is_delete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(Byte value1, Byte value2) {
            addCriterion("is_delete not between", value1, value2, "isDelete");
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