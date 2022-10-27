package cn.com.loveback.hziee.wxserver.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * (Client)实体类
 *
 * @author makejava
 * @since 2022-10-19 01:24:58
 */
public class Client implements Serializable {
    private static final long serialVersionUID = -40135512001306679L;
    /**
     * 客户id
     */
    private Integer clientId;
    /**
     * 客户名称
     */
    private String clientName;
    /**
     * 联系人姓名
     */
    private String contactName;
    /**
     * 联系人身份证
     */
    private String contactIdentityCard;
    /**
     * 联系人职务
     */
    private String contactPosts;
    /**
     * 联系人性别
     */
    private String contactSex;
    /**
     * 联系人电话
     */
    private String contactPhone;
    /**
     * 来源
     */
    private String source;
    /**
     * 行业
     */
    private String industry;
    /**
     * 所属省
     */
    private String province;
    /**
     * 所属市
     */
    private String city;
    /**
     * 所属区
     */
    private String district;
    /**
     * 地址
     */
    private String address;
    /**
     * 客户状态
     */
    private String clientState;
    /**
     * 客户最近联系日期
     */
    private Date clientContactDate;
    /**
     * 客户创建时间
     */
    private Date clientCreateTime;
    /**
     * 客户所属主要员工
     */
    private String clientMainStaff;
    /**
     * 客户所属共享员工
     */
    private String clientStaffs;
    /**
     * 客户备注
     */
    private String contactNote;


    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactIdentityCard() {
        return contactIdentityCard;
    }

    public void setContactIdentityCard(String contactIdentityCard) {
        this.contactIdentityCard = contactIdentityCard;
    }

    public String getContactPosts() {
        return contactPosts;
    }

    public void setContactPosts(String contactPosts) {
        this.contactPosts = contactPosts;
    }

    public String getContactSex() {
        return contactSex;
    }

    public void setContactSex(String contactSex) {
        this.contactSex = contactSex;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getClientState() {
        return clientState;
    }

    public void setClientState(String clientState) {
        this.clientState = clientState;
    }

    public Date getClientContactDate() {
        return clientContactDate;
    }

    public void setClientContactDate(Date clientContactDate) {
        this.clientContactDate = clientContactDate;
    }

    public Date getClientCreateTime() {
        return clientCreateTime;
    }

    public void setClientCreateTime(Date clientCreateTime) {
        this.clientCreateTime = clientCreateTime;
    }

    public String getClientMainStaff() {
        return clientMainStaff;
    }

    public void setClientMainStaff(String clientMainStaff) {
        this.clientMainStaff = clientMainStaff;
    }

    public String getClientStaffs() {
        return clientStaffs;
    }

    public void setClientStaffs(String clientStaffs) {
        this.clientStaffs = clientStaffs;
    }

    public String getContactNote() {
        return contactNote;
    }

    public void setContactNote(String contactNote) {
        this.contactNote = contactNote;
    }

}

