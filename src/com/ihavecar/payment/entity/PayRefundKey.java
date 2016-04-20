package com.ihavecar.payment.entity;

public class PayRefundKey {
    private String refundOutNo;

    private String refundPayNo;

    public String getRefundOutNo() {
        return refundOutNo;
    }

    public void setRefundOutNo(String refundOutNo) {
        this.refundOutNo = refundOutNo == null ? null : refundOutNo.trim();
    }

    public String getRefundPayNo() {
        return refundPayNo;
    }

    public void setRefundPayNo(String refundPayNo) {
        this.refundPayNo = refundPayNo == null ? null : refundPayNo.trim();
    }
}