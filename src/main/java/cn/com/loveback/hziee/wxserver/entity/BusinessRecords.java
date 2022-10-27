package cn.com.loveback.hziee.wxserver.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * (BusinessRecords)实体类
 *
 * @author makejava
 * @since 2022-10-19 01:24:58
 */
public class BusinessRecords implements Serializable {
    private static final long serialVersionUID = 459097876087890219L;
    /**
     * 记录id
     */
    private Integer recordId;
    /**
     * 商机id
     */
    private Integer businessId;
    /**
     * 员工id
     */
    private Integer staffId;
    /**
     * 员工姓名
     */
    private String staffName;
    /**
     * 联系人姓名
     */
    private String contactName;
    /**
     * 联系时间
     */
    private Date contactTime;
    /**
     * 联系方式
     */
    private String contactWay;
    /**
     * 完成程度
     */
    private String completionLevel;
    /**
     * 下次联系时间
     */
    private Date contactNextTime;
    /**
     * 联系主题
     */
    private String contactThem;
    /**
     * 联系内容
     */
    private String contactContent;
    /**
     * 附件
     */
    private String contactAnnex;


    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public Integer getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Integer businessId) {
        this.businessId = businessId;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public Date getContactTime() {
        return contactTime;
    }

    public void setContactTime(Date contactTime) {
        this.contactTime = contactTime;
    }

    public String getContactWay() {
        return contactWay;
    }

    public void setContactWay(String contactWay) {
        this.contactWay = contactWay;
    }

    public String getCompletionLevel() {
        return completionLevel;
    }

    public void setCompletionLevel(String completionLevel) {
        this.completionLevel = completionLevel;
    }

    public Date getContactNextTime() {
        return contactNextTime;
    }

    public void setContactNextTime(Date contactNextTime) {
        this.contactNextTime = contactNextTime;
    }

    public String getContactThem() {
        return contactThem;
    }

    public void setContactThem(String contactThem) {
        this.contactThem = contactThem;
    }

    public String getContactContent() {
        return contactContent;
    }

    public void setContactContent(String contactContent) {
        this.contactContent = contactContent;
    }

    public String getContactAnnex() {
        return contactAnnex;
    }

    public void setContactAnnex(String contactAnnex) {
        this.contactAnnex = contactAnnex;
    }

}

