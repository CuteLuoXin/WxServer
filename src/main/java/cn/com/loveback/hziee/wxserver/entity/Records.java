package cn.com.loveback.hziee.wxserver.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * (Records)实体类
 *
 * @author makejava
 * @since 2022-10-19 01:24:59
 */
public class Records implements Serializable {
    private static final long serialVersionUID = 297078580356387992L;
    /**
     * 记录id
     */
    private Integer recordsId;
    /**
     * 操作者id 
     */
    private Integer operatorId;
    /**
     * 主要操对象类型（客户，商机，线索，员工）
     */
    private String mainObjectClass;
    /**
     * 次要操对象类型（客户，商机，线索，员工）
     */
    private String secondaryObjectClass;
    /**
     * 主要操作对象id
     */
    private Integer mainId;
    /**
     * 次要操作对象id
     */
    private Integer secondaryId;
    /**
     * 操作时间
     */
    private Date operateTime;
    /**
     * 操作内容
     */
    private String operateContent;
    /**
     * 操作行为（删除 添加 修改 转移）
     */
    private String operateClass;


    public Integer getRecordsId() {
        return recordsId;
    }

    public void setRecordsId(Integer recordsId) {
        this.recordsId = recordsId;
    }

    public Integer getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }

    public String getMainObjectClass() {
        return mainObjectClass;
    }

    public void setMainObjectClass(String mainObjectClass) {
        this.mainObjectClass = mainObjectClass;
    }

    public String getSecondaryObjectClass() {
        return secondaryObjectClass;
    }

    public void setSecondaryObjectClass(String secondaryObjectClass) {
        this.secondaryObjectClass = secondaryObjectClass;
    }

    public Integer getMainId() {
        return mainId;
    }

    public void setMainId(Integer mainId) {
        this.mainId = mainId;
    }

    public Integer getSecondaryId() {
        return secondaryId;
    }

    public void setSecondaryId(Integer secondaryId) {
        this.secondaryId = secondaryId;
    }

    public Date getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(Date operateTime) {
        this.operateTime = operateTime;
    }

    public String getOperateContent() {
        return operateContent;
    }

    public void setOperateContent(String operateContent) {
        this.operateContent = operateContent;
    }

    public String getOperateClass() {
        return operateClass;
    }

    public void setOperateClass(String operateClass) {
        this.operateClass = operateClass;
    }

}

