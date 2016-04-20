package com.ihavecar.payment.entity;

import java.util.Date;

public class PayPaytypes {
    private Integer typeid;

    private Integer id;

    private String payName;

    private String incomeNo;

    private String outcomeNo;

    private String payEnter;

    private Date payJoin;

    private Integer status;

    private String delFlag;

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPayName() {
        return payName;
    }

    public void setPayName(String payName) {
        this.payName = payName == null ? null : payName.trim();
    }

    public String getIncomeNo() {
        return incomeNo;
    }

    public void setIncomeNo(String incomeNo) {
        this.incomeNo = incomeNo == null ? null : incomeNo.trim();
    }

    public String getOutcomeNo() {
        return outcomeNo;
    }

    public void setOutcomeNo(String outcomeNo) {
        this.outcomeNo = outcomeNo == null ? null : outcomeNo.trim();
    }

    public String getPayEnter() {
        return payEnter;
    }

    public void setPayEnter(String payEnter) {
        this.payEnter = payEnter == null ? null : payEnter.trim();
    }

    public Date getPayJoin() {
        return payJoin;
    }

    public void setPayJoin(Date payJoin) {
        this.payJoin = payJoin;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
    }
}