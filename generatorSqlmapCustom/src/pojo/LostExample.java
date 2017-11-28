package pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LostExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LostExample() {
        oredCriteria = new ArrayList<Criteria>();
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
            criteria = new ArrayList<Criterion>();
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

        public Criteria andLostIdIsNull() {
            addCriterion("Lost_id is null");
            return (Criteria) this;
        }

        public Criteria andLostIdIsNotNull() {
            addCriterion("Lost_id is not null");
            return (Criteria) this;
        }

        public Criteria andLostIdEqualTo(Integer value) {
            addCriterion("Lost_id =", value, "lostId");
            return (Criteria) this;
        }

        public Criteria andLostIdNotEqualTo(Integer value) {
            addCriterion("Lost_id <>", value, "lostId");
            return (Criteria) this;
        }

        public Criteria andLostIdGreaterThan(Integer value) {
            addCriterion("Lost_id >", value, "lostId");
            return (Criteria) this;
        }

        public Criteria andLostIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Lost_id >=", value, "lostId");
            return (Criteria) this;
        }

        public Criteria andLostIdLessThan(Integer value) {
            addCriterion("Lost_id <", value, "lostId");
            return (Criteria) this;
        }

        public Criteria andLostIdLessThanOrEqualTo(Integer value) {
            addCriterion("Lost_id <=", value, "lostId");
            return (Criteria) this;
        }

        public Criteria andLostIdIn(List<Integer> values) {
            addCriterion("Lost_id in", values, "lostId");
            return (Criteria) this;
        }

        public Criteria andLostIdNotIn(List<Integer> values) {
            addCriterion("Lost_id not in", values, "lostId");
            return (Criteria) this;
        }

        public Criteria andLostIdBetween(Integer value1, Integer value2) {
            addCriterion("Lost_id between", value1, value2, "lostId");
            return (Criteria) this;
        }

        public Criteria andLostIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Lost_id not between", value1, value2, "lostId");
            return (Criteria) this;
        }

        public Criteria andLostDetailIsNull() {
            addCriterion("Lost_detail is null");
            return (Criteria) this;
        }

        public Criteria andLostDetailIsNotNull() {
            addCriterion("Lost_detail is not null");
            return (Criteria) this;
        }

        public Criteria andLostDetailEqualTo(String value) {
            addCriterion("Lost_detail =", value, "lostDetail");
            return (Criteria) this;
        }

        public Criteria andLostDetailNotEqualTo(String value) {
            addCriterion("Lost_detail <>", value, "lostDetail");
            return (Criteria) this;
        }

        public Criteria andLostDetailGreaterThan(String value) {
            addCriterion("Lost_detail >", value, "lostDetail");
            return (Criteria) this;
        }

        public Criteria andLostDetailGreaterThanOrEqualTo(String value) {
            addCriterion("Lost_detail >=", value, "lostDetail");
            return (Criteria) this;
        }

        public Criteria andLostDetailLessThan(String value) {
            addCriterion("Lost_detail <", value, "lostDetail");
            return (Criteria) this;
        }

        public Criteria andLostDetailLessThanOrEqualTo(String value) {
            addCriterion("Lost_detail <=", value, "lostDetail");
            return (Criteria) this;
        }

        public Criteria andLostDetailLike(String value) {
            addCriterion("Lost_detail like", value, "lostDetail");
            return (Criteria) this;
        }

        public Criteria andLostDetailNotLike(String value) {
            addCriterion("Lost_detail not like", value, "lostDetail");
            return (Criteria) this;
        }

        public Criteria andLostDetailIn(List<String> values) {
            addCriterion("Lost_detail in", values, "lostDetail");
            return (Criteria) this;
        }

        public Criteria andLostDetailNotIn(List<String> values) {
            addCriterion("Lost_detail not in", values, "lostDetail");
            return (Criteria) this;
        }

        public Criteria andLostDetailBetween(String value1, String value2) {
            addCriterion("Lost_detail between", value1, value2, "lostDetail");
            return (Criteria) this;
        }

        public Criteria andLostDetailNotBetween(String value1, String value2) {
            addCriterion("Lost_detail not between", value1, value2, "lostDetail");
            return (Criteria) this;
        }

        public Criteria andLostDateIsNull() {
            addCriterion("Lost_Date is null");
            return (Criteria) this;
        }

        public Criteria andLostDateIsNotNull() {
            addCriterion("Lost_Date is not null");
            return (Criteria) this;
        }

        public Criteria andLostDateEqualTo(Date value) {
            addCriterion("Lost_Date =", value, "lostDate");
            return (Criteria) this;
        }

        public Criteria andLostDateNotEqualTo(Date value) {
            addCriterion("Lost_Date <>", value, "lostDate");
            return (Criteria) this;
        }

        public Criteria andLostDateGreaterThan(Date value) {
            addCriterion("Lost_Date >", value, "lostDate");
            return (Criteria) this;
        }

        public Criteria andLostDateGreaterThanOrEqualTo(Date value) {
            addCriterion("Lost_Date >=", value, "lostDate");
            return (Criteria) this;
        }

        public Criteria andLostDateLessThan(Date value) {
            addCriterion("Lost_Date <", value, "lostDate");
            return (Criteria) this;
        }

        public Criteria andLostDateLessThanOrEqualTo(Date value) {
            addCriterion("Lost_Date <=", value, "lostDate");
            return (Criteria) this;
        }

        public Criteria andLostDateIn(List<Date> values) {
            addCriterion("Lost_Date in", values, "lostDate");
            return (Criteria) this;
        }

        public Criteria andLostDateNotIn(List<Date> values) {
            addCriterion("Lost_Date not in", values, "lostDate");
            return (Criteria) this;
        }

        public Criteria andLostDateBetween(Date value1, Date value2) {
            addCriterion("Lost_Date between", value1, value2, "lostDate");
            return (Criteria) this;
        }

        public Criteria andLostDateNotBetween(Date value1, Date value2) {
            addCriterion("Lost_Date not between", value1, value2, "lostDate");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("User_Id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("User_Id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("User_Id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("User_Id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("User_Id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("User_Id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("User_Id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("User_Id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("User_Id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("User_Id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("User_Id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("User_Id not between", value1, value2, "userId");
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