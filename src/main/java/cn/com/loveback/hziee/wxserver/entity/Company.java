package cn.com.loveback.hziee.wxserver.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * (Company)实体类
 *
 * @author makejava
 * @since 2022-10-19 01:24:59
 */
public class Company implements Serializable {
    private static final long serialVersionUID = 463081747646258445L;
    /**
     * 企业id 
     */
    private Integer companyId;
    /**
     * 企业名称
     */
    private String companyName;
    /**
     * 企业的法定代表人
     */
    private String companyLegalRepresentative;
    /**
     * 企业注册时间
     */
    private Date companyRegistrationTime;
    /**
     * 企业的secret
     */
    private String companySecret;
    /**
     * 企业行业
     */
    private String companyIndustry;
    /**
     * 企业人员数量
     */
    private Integer companyPersonNumber;
    /**
     * 企业旗下产品
     */
    private String companyProducts;
    /**
     * 企业管理员id
     */
    private String companyAdministrator;
    /**
     * 企业类型
     */
    private String companyType;
    /**
     * 企业简介
     */
    private String companyIntroduction;


    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyLegalRepresentative() {
        return companyLegalRepresentative;
    }

    public void setCompanyLegalRepresentative(String companyLegalRepresentative) {
        this.companyLegalRepresentative = companyLegalRepresentative;
    }

    public Date getCompanyRegistrationTime() {
        return companyRegistrationTime;
    }

    public void setCompanyRegistrationTime(Date companyRegistrationTime) {
        this.companyRegistrationTime = companyRegistrationTime;
    }

    public String getCompanySecret() {
        return companySecret;
    }

    public void setCompanySecret(String companySecret) {
        this.companySecret = companySecret;
    }

    public String getCompanyIndustry() {
        return companyIndustry;
    }

    public void setCompanyIndustry(String companyIndustry) {
        this.companyIndustry = companyIndustry;
    }

    public Integer getCompanyPersonNumber() {
        return companyPersonNumber;
    }

    public void setCompanyPersonNumber(Integer companyPersonNumber) {
        this.companyPersonNumber = companyPersonNumber;
    }

    public String getCompanyProducts() {
        return companyProducts;
    }

    public void setCompanyProducts(String companyProducts) {
        this.companyProducts = companyProducts;
    }

    public String getCompanyAdministrator() {
        return companyAdministrator;
    }

    public void setCompanyAdministrator(String companyAdministrator) {
        this.companyAdministrator = companyAdministrator;
    }

    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }

    public String getCompanyIntroduction() {
        return companyIntroduction;
    }

    public void setCompanyIntroduction(String companyIntroduction) {
        this.companyIntroduction = companyIntroduction;
    }

}

