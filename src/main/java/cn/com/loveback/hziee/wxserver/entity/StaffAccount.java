package cn.com.loveback.hziee.wxserver.entity;

import java.io.Serializable;

/**
 * (StaffAccount)实体类
 *
 * @author makejava
 * @since 2022-10-19 01:24:59
 */
public class StaffAccount implements Serializable {
    private static final long serialVersionUID = 472795311904358302L;
    
    private String staffId;
    
    private String staffAccount;
    
    private String staffPassword;


    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getStaffAccount() {
        return staffAccount;
    }

    public void setStaffAccount(String staffAccount) {
        this.staffAccount = staffAccount;
    }

    public String getStaffPassword() {
        return staffPassword;
    }

    public void setStaffPassword(String staffPassword) {
        this.staffPassword = staffPassword;
    }

}

