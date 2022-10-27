package cn.com.loveback.hziee.wxserver.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * (Staff)实体类
 *
 * @author makejava
 * @since 2022-10-19 01:24:59
 */
public class Staff implements Serializable {
    private static final long serialVersionUID = -71992547723513295L;
    /**
     * 员工id
     */
    private Integer staffId;
    /**
     * 员工姓名
     */
    private String staffName;
    /**
     * 员工性别
     */
    private String staffSex;
    /**
     * 员工职位
     */
    private String staffPosts;
    /**
     * 员工权限等级
     */
    private String staffGrade;
    /**
     * 员工所属企业
     */
    private String staffCompany;
    /**
     * 员工所属部门
     */
    private String staffDepartment;
    /**
     * 员工手下的客户
     */
    private String staffClient;
    /**
     * 员工的工作表
     */
    private String staffWorktable;
    /**
     * 员工现有商机
     */
    private Date staffNowWork;
    /**
     * 员工超时商机
     */
    private Date staffTimeoutWork;
    /**
     * 员工预期商机
     */
    private Date staffExpectedWork;
    /**
     * 员工状态
     */
    private String staffState;


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

    public String getStaffSex() {
        return staffSex;
    }

    public void setStaffSex(String staffSex) {
        this.staffSex = staffSex;
    }

    public String getStaffPosts() {
        return staffPosts;
    }

    public void setStaffPosts(String staffPosts) {
        this.staffPosts = staffPosts;
    }

    public String getStaffGrade() {
        return staffGrade;
    }

    public void setStaffGrade(String staffGrade) {
        this.staffGrade = staffGrade;
    }

    public String getStaffCompany() {
        return staffCompany;
    }

    public void setStaffCompany(String staffCompany) {
        this.staffCompany = staffCompany;
    }

    public String getStaffDepartment() {
        return staffDepartment;
    }

    public void setStaffDepartment(String staffDepartment) {
        this.staffDepartment = staffDepartment;
    }

    public String getStaffClient() {
        return staffClient;
    }

    public void setStaffClient(String staffClient) {
        this.staffClient = staffClient;
    }

    public String getStaffWorktable() {
        return staffWorktable;
    }

    public void setStaffWorktable(String staffWorktable) {
        this.staffWorktable = staffWorktable;
    }

    public Date getStaffNowWork() {
        return staffNowWork;
    }

    public void setStaffNowWork(Date staffNowWork) {
        this.staffNowWork = staffNowWork;
    }

    public Date getStaffTimeoutWork() {
        return staffTimeoutWork;
    }

    public void setStaffTimeoutWork(Date staffTimeoutWork) {
        this.staffTimeoutWork = staffTimeoutWork;
    }

    public Date getStaffExpectedWork() {
        return staffExpectedWork;
    }

    public void setStaffExpectedWork(Date staffExpectedWork) {
        this.staffExpectedWork = staffExpectedWork;
    }

    public String getStaffState() {
        return staffState;
    }

    public void setStaffState(String staffState) {
        this.staffState = staffState;
    }

}

