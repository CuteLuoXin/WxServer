package cn.com.loveback.hziee.wxserver.entity;

import java.io.Serializable;

/**
 * (Department)实体类
 *
 * @author makejava
 * @since 2022-10-19 01:24:59
 */
public class Department implements Serializable {
    private static final long serialVersionUID = 229092638775060528L;
    /**
     * 企业id
     */
    private String companyId;
    /**
     * 部门id
     */
    private String departmentId;
    /**
     * 部门名称
     */
    private String departmentName;
    /**
     * 部门等级
     */
    private String departmentGrade;
    /**
     * 部门负责人
     */
    private String departmentStaff;
    /**
     * 部门上级部门
     */
    private String departmentParent;
    /**
     * 部门员工人数
     */
    private Integer departmentNumber;
    /**
     * 部门员工id
     */
    private String departmentStaffs;


    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentGrade() {
        return departmentGrade;
    }

    public void setDepartmentGrade(String departmentGrade) {
        this.departmentGrade = departmentGrade;
    }

    public String getDepartmentStaff() {
        return departmentStaff;
    }

    public void setDepartmentStaff(String departmentStaff) {
        this.departmentStaff = departmentStaff;
    }

    public String getDepartmentParent() {
        return departmentParent;
    }

    public void setDepartmentParent(String departmentParent) {
        this.departmentParent = departmentParent;
    }

    public Integer getDepartmentNumber() {
        return departmentNumber;
    }

    public void setDepartmentNumber(Integer departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    public String getDepartmentStaffs() {
        return departmentStaffs;
    }

    public void setDepartmentStaffs(String departmentStaffs) {
        this.departmentStaffs = departmentStaffs;
    }

}

