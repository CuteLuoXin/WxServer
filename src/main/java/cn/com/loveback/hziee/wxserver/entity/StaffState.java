package cn.com.loveback.hziee.wxserver.entity;

import java.io.Serializable;

/**
 * (StaffState)实体类
 *
 * @author makejava
 * @since 2022-10-19 01:24:59
 */
public class StaffState implements Serializable {
    private static final long serialVersionUID = -44966980437590458L;
    /**
     * 状态id 
     */
    private Integer stateId;
    /**
     * 状态名称
     */
    private String  stateName;


    public Integer getStateId() {
        return stateId;
    }

    public void setStateId(Integer stateId) {
        this.stateId = stateId;
    }

    public String getStateName() {
        return  stateName;
    }

    public void setStateName(String  stateName) {
        this. stateName =  stateName;
    }

}

