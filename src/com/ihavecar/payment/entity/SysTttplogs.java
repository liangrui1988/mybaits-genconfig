package com.ihavecar.payment.entity;

public class SysTttplogs {
    private Long id;

    private String requestUrl;

    private String requestMethod;

    private Integer requestTime;

    private String requestContent;

    private String requestParams;

    private String requestIp;

    private String requestClientid;

    private String requestAppid;

    private String responseCode;

    private Integer responseTime;

    private String responseDatatype;

    private String delFlag;

    private String responseContent;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRequestUrl() {
        return requestUrl;
    }

    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl == null ? null : requestUrl.trim();
    }

    public String getRequestMethod() {
        return requestMethod;
    }

    public void setRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod == null ? null : requestMethod.trim();
    }

    public Integer getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(Integer requestTime) {
        this.requestTime = requestTime;
    }

    public String getRequestContent() {
        return requestContent;
    }

    public void setRequestContent(String requestContent) {
        this.requestContent = requestContent == null ? null : requestContent.trim();
    }

    public String getRequestParams() {
        return requestParams;
    }

    public void setRequestParams(String requestParams) {
        this.requestParams = requestParams == null ? null : requestParams.trim();
    }

    public String getRequestIp() {
        return requestIp;
    }

    public void setRequestIp(String requestIp) {
        this.requestIp = requestIp == null ? null : requestIp.trim();
    }

    public String getRequestClientid() {
        return requestClientid;
    }

    public void setRequestClientid(String requestClientid) {
        this.requestClientid = requestClientid == null ? null : requestClientid.trim();
    }

    public String getRequestAppid() {
        return requestAppid;
    }

    public void setRequestAppid(String requestAppid) {
        this.requestAppid = requestAppid == null ? null : requestAppid.trim();
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode == null ? null : responseCode.trim();
    }

    public Integer getResponseTime() {
        return responseTime;
    }

    public void setResponseTime(Integer responseTime) {
        this.responseTime = responseTime;
    }

    public String getResponseDatatype() {
        return responseDatatype;
    }

    public void setResponseDatatype(String responseDatatype) {
        this.responseDatatype = responseDatatype == null ? null : responseDatatype.trim();
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
    }

    public String getResponseContent() {
        return responseContent;
    }

    public void setResponseContent(String responseContent) {
        this.responseContent = responseContent == null ? null : responseContent.trim();
    }
}