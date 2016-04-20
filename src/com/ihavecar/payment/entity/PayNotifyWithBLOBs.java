package com.ihavecar.payment.entity;

public class PayNotifyWithBLOBs extends PayNotify {
    private String content;

    private String signContent;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getSignContent() {
        return signContent;
    }

    public void setSignContent(String signContent) {
        this.signContent = signContent == null ? null : signContent.trim();
    }
}