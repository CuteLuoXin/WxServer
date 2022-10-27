package cn.com.loveback.hziee.wxserver.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * (Clues)实体类
 *
 * @author makejava
 * @since 2022-10-19 01:24:59
 */
public class Clues implements Serializable {
    private static final long serialVersionUID = -41262675567016645L;
    /**
     * *线索id
     */
    private String cluesId;
    /**
     * *线索名称
     */
    private String cluesName;
    /**
     * *联系人姓名
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
     * 联系人电话
     */
    private String contactPhone;
    /**
     * 线索创建时间
     */
    private Date contactCreateTime;
    /**
     * 来源
     */
    private String source;
    /**
     * 行业
     */
    private String industry;
    /**
     * 线索创建者
     */
    private String contactCreateStaff;
    /**
     * 线索备注
     */
    private String contactNote;


    public String getCluesId() {
        return cluesId;
    }

    public void setCluesId(String cluesId) {
        this.cluesId = cluesId;
    }

    public String getCluesName() {
        return cluesName;
    }

    public void setCluesName(String cluesName) {
        this.cluesName = cluesName;
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

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public Date getContactCreateTime() {
        return contactCreateTime;
    }

    public void setContactCreateTime(Date contactCreateTime) {
        this.contactCreateTime = contactCreateTime;
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

    public String getContactCreateStaff() {
        return contactCreateStaff;
    }

    public void setContactCreateStaff(String contactCreateStaff) {
        this.contactCreateStaff = contactCreateStaff;
    }

    public String getContactNote() {
        return contactNote;
    }

    public void setContactNote(String contactNote) {
        this.contactNote = contactNote;
    }

}

