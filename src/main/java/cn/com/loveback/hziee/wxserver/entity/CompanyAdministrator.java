package cn.com.loveback.hziee.wxserver.entity;

import java.io.Serializable;

/**
 * (CompanyAdministrator)实体类
 *
 * @author makejava
 * @since 2022-10-19 01:24:59
 */
public class CompanyAdministrator implements Serializable {
    private static final long serialVersionUID = 654948835577321122L;
    /**
     * 管理员id
     */
    private Integer administratorId;
    /**
     * 管理员账号
     */
    private String administratorAccount;
    /**
     * 管理员密码
     */
    private String administratorPassword;
    /**
     * 管理员所属企业id
     */
    private String administratorCompany;


    public Integer getAdministratorId() {
        return administratorId;
    }

    public void setAdministratorId(Integer administratorId) {
        this.administratorId = administratorId;
    }

    public String getAdministratorAccount() {
        return administratorAccount;
    }

    public void setAdministratorAccount(String administratorAccount) {
        this.administratorAccount = administratorAccount;
    }

    public String getAdministratorPassword() {
        return administratorPassword;
    }

    public void setAdministratorPassword(String administratorPassword) {
        this.administratorPassword = administratorPassword;
    }

    public String getAdministratorCompany() {
        return administratorCompany;
    }

    public void setAdministratorCompany(String administratorCompany) {
        this.administratorCompany = administratorCompany;
    }

}

