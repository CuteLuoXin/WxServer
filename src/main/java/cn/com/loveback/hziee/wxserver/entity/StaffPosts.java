package cn.com.loveback.hziee.wxserver.entity;

import java.io.Serializable;

/**
 * (StaffPosts)实体类
 *
 * @author makejava
 * @since 2022-10-19 01:24:59
 */
public class StaffPosts implements Serializable {
    private static final long serialVersionUID = 495767250398195879L;
    
    private Integer postsId;
    
    private String postsName;
    
    private String postsGrade;


    public Integer getPostsId() {
        return postsId;
    }

    public void setPostsId(Integer postsId) {
        this.postsId = postsId;
    }

    public String getPostsName() {
        return postsName;
    }

    public void setPostsName(String postsName) {
        this.postsName = postsName;
    }

    public String getPostsGrade() {
        return postsGrade;
    }

    public void setPostsGrade(String postsGrade) {
        this.postsGrade = postsGrade;
    }

}

