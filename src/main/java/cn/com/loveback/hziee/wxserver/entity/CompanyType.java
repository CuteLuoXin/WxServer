package cn.com.loveback.hziee.wxserver.entity;

import java.io.Serializable;

/**
 * (CompanyType)实体类
 *
 * @author makejava
 * @since 2022-10-19 01:24:59
 */
public class CompanyType implements Serializable {
    private static final long serialVersionUID = -29655579668457089L;
    /**
     * 类型id
     */
    private String typeId;
    /**
     * 类型名称
     */
    private String typeName;


    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

}

