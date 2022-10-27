package cn.com.loveback.hziee.wxserver.entity;

import java.io.Serializable;

/**
 * (WxUser)实体类
 *
 * @author makejava
 * @since 2022-10-22 21:39:33
 */
public class WxUser implements Serializable {
    private static final long serialVersionUID = 557079367351053580L;

    private String telnum;

    private String nickname;

    private String avatarurl;

    private Integer gender;

    private String country;

    private String province;

    private String city;

    private String language;


    public String getTelnum() {
        return telnum;
    }

    public void setTelnum(String telnum) {
        this.telnum = telnum;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getAvatarurl() {
        return avatarurl;
    }

    public void setAvatarurl(String avatarurl) {
        this.avatarurl = avatarurl;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
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

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

}

