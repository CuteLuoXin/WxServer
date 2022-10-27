package cn.com.loveback.hziee.wxserver.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * (StaffWork)实体类
 *
 * @author makejava
 * @since 2022-10-19 01:24:59
 */
public class StaffWork implements Serializable {
    private static final long serialVersionUID = -51435839320362869L;
    /**
     * 员工id
     */
    private Integer staffId;
    /**
     * 员工姓名
     */
    private String staffName;
    /**
     * 星期一预期任务
     */
    private String mondayWork;
    /**
     * 星期二预期任务
     */
    private String tuesdayWork;
    /**
     * 星期三预期任务
     */
    private String wednesdayWork;
    /**
     * 星期四预期任务
     */
    private String thursdayWork;
    /**
     * 星期五预期任务
     */
    private String fridayWork;
    /**
     * 星期六预期任务
     */
    private String saturdayWork;
    /**
     * 星期日预期任务
     */
    private String sundayWork;
    /**
     * 当前星期一的日期
     */
    private Date mondayDate;


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

    public String getMondayWork() {
        return mondayWork;
    }

    public void setMondayWork(String mondayWork) {
        this.mondayWork = mondayWork;
    }

    public String getTuesdayWork() {
        return tuesdayWork;
    }

    public void setTuesdayWork(String tuesdayWork) {
        this.tuesdayWork = tuesdayWork;
    }

    public String getWednesdayWork() {
        return wednesdayWork;
    }

    public void setWednesdayWork(String wednesdayWork) {
        this.wednesdayWork = wednesdayWork;
    }

    public String getThursdayWork() {
        return thursdayWork;
    }

    public void setThursdayWork(String thursdayWork) {
        this.thursdayWork = thursdayWork;
    }

    public String getFridayWork() {
        return fridayWork;
    }

    public void setFridayWork(String fridayWork) {
        this.fridayWork = fridayWork;
    }

    public String getSaturdayWork() {
        return saturdayWork;
    }

    public void setSaturdayWork(String saturdayWork) {
        this.saturdayWork = saturdayWork;
    }

    public String getSundayWork() {
        return sundayWork;
    }

    public void setSundayWork(String sundayWork) {
        this.sundayWork = sundayWork;
    }

    public Date getMondayDate() {
        return mondayDate;
    }

    public void setMondayDate(Date mondayDate) {
        this.mondayDate = mondayDate;
    }

}

