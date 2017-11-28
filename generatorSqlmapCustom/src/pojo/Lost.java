package pojo;

import java.util.Date;

public class Lost {
    private Integer lostId;

    private String lostDetail;

    private Date lostDate;

    private Integer userId;

    public Integer getLostId() {
        return lostId;
    }

    public void setLostId(Integer lostId) {
        this.lostId = lostId;
    }

    public String getLostDetail() {
        return lostDetail;
    }

    public void setLostDetail(String lostDetail) {
        this.lostDetail = lostDetail == null ? null : lostDetail.trim();
    }

    public Date getLostDate() {
        return lostDate;
    }

    public void setLostDate(Date lostDate) {
        this.lostDate = lostDate;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}