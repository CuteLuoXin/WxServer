package cn.com.loveback.hziee.wxserver.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * (StaffRecords)实体类
 *
 * @author makejava
 * @since 2022-10-19 01:24:59
 */
public class StaffRecords implements Serializable {
    private static final long serialVersionUID = 693511096348171662L;
    /**
     * 员工id 
     */
    private Integer staffId;
    /**
     * 员工姓名
     */
    private String staffName;
    /**
     * 当前的星期
     */
    private String currentWeek;
    /**
     * 当前时间
     */
    private Date currentDate;
    /**
     * 跟进记录id
     */
    private String businessRecords;


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

    public String getCurrentWeek() {
        return currentWeek;
    }

    public void setCurrentWeek(String currentWeek) {
        this.currentWeek = currentWeek;
    }

    public Date getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(Date currentDate) {
        this.currentDate = currentDate;
    }

    public String getBusinessRecords() {
        return businessRecords;
    }

    public void setBusinessRecords(String businessRecords) {
        this.businessRecords = businessRecords;
    }

}

