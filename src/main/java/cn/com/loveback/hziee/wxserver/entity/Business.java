package cn.com.loveback.hziee.wxserver.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * (Business)实体类
 *
 * @author makejava
 * @since 2022-10-19 01:24:58
 */
public class Business implements Serializable {
    private static final long serialVersionUID = 694197631780331414L;
    /**
     * 商机id 
     */
    private Integer businessId;
    /**
     * *商机名称
     */
    private String businessName;
    /**
     * *客户id
     */
    private Integer clientId;
    /**
     * 商机意向产品
     */
    private String businessIntendedProducts;
    /**
     * 商机规模人数
     */
    private Integer businessNumber;
    /**
     * 商机重要程度
     */
    private String businessImportance;
    /**
     * 商机预估金额
     */
    private String businessEstimatedAmount;
    /**
     * 商机开始时间
     */
    private Date businessStartTime;
    /**
     * 商机结束时间
     */
    private Date businessEndTime;
    /**
     * 商机预估结束时间 
     */
    private Date businessForecastEndTime;
    /**
     * 商机风险程度
     */
    private String businessRiskLevel;
    /**
     * 商机销售方式
     */
    private String businessSalesWay;
    /**
     * 商机采购方式
     */
    private String businessPurchaseWay;
    /**
     * 商机竞争对手
     */
    private String businessCompetitors;
    /**
     * 商机负责主要员工id
     */
    private String businessMainStaff;
    /**
     * 商机负责共享员工id
     */
    private String businessStaffs;
    /**
     * 商机跟进记录（见表）
     */
    private String businessFollowRecords;
    /**
     * 商机备注
     */
    private String businessNote;


    public Integer getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Integer businessId) {
        this.businessId = businessId;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public String getBusinessIntendedProducts() {
        return businessIntendedProducts;
    }

    public void setBusinessIntendedProducts(String businessIntendedProducts) {
        this.businessIntendedProducts = businessIntendedProducts;
    }

    public Integer getBusinessNumber() {
        return businessNumber;
    }

    public void setBusinessNumber(Integer businessNumber) {
        this.businessNumber = businessNumber;
    }

    public String getBusinessImportance() {
        return businessImportance;
    }

    public void setBusinessImportance(String businessImportance) {
        this.businessImportance = businessImportance;
    }

    public String getBusinessEstimatedAmount() {
        return businessEstimatedAmount;
    }

    public void setBusinessEstimatedAmount(String businessEstimatedAmount) {
        this.businessEstimatedAmount = businessEstimatedAmount;
    }

    public Date getBusinessStartTime() {
        return businessStartTime;
    }

    public void setBusinessStartTime(Date businessStartTime) {
        this.businessStartTime = businessStartTime;
    }

    public Date getBusinessEndTime() {
        return businessEndTime;
    }

    public void setBusinessEndTime(Date businessEndTime) {
        this.businessEndTime = businessEndTime;
    }

    public Date getBusinessForecastEndTime() {
        return businessForecastEndTime;
    }

    public void setBusinessForecastEndTime(Date businessForecastEndTime) {
        this.businessForecastEndTime = businessForecastEndTime;
    }

    public String getBusinessRiskLevel() {
        return businessRiskLevel;
    }

    public void setBusinessRiskLevel(String businessRiskLevel) {
        this.businessRiskLevel = businessRiskLevel;
    }

    public String getBusinessSalesWay() {
        return businessSalesWay;
    }

    public void setBusinessSalesWay(String businessSalesWay) {
        this.businessSalesWay = businessSalesWay;
    }

    public String getBusinessPurchaseWay() {
        return businessPurchaseWay;
    }

    public void setBusinessPurchaseWay(String businessPurchaseWay) {
        this.businessPurchaseWay = businessPurchaseWay;
    }

    public String getBusinessCompetitors() {
        return businessCompetitors;
    }

    public void setBusinessCompetitors(String businessCompetitors) {
        this.businessCompetitors = businessCompetitors;
    }

    public String getBusinessMainStaff() {
        return businessMainStaff;
    }

    public void setBusinessMainStaff(String businessMainStaff) {
        this.businessMainStaff = businessMainStaff;
    }

    public String getBusinessStaffs() {
        return businessStaffs;
    }

    public void setBusinessStaffs(String businessStaffs) {
        this.businessStaffs = businessStaffs;
    }

    public String getBusinessFollowRecords() {
        return businessFollowRecords;
    }

    public void setBusinessFollowRecords(String businessFollowRecords) {
        this.businessFollowRecords = businessFollowRecords;
    }

    public String getBusinessNote() {
        return businessNote;
    }

    public void setBusinessNote(String businessNote) {
        this.businessNote = businessNote;
    }

}

