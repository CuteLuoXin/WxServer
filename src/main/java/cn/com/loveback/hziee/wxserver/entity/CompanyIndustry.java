package cn.com.loveback.hziee.wxserver.entity;

import java.io.Serializable;

/**
 * (CompanyIndustry)实体类
 *
 * @author makejava
 * @since 2022-10-19 01:24:59
 */
public class CompanyIndustry implements Serializable {
    private static final long serialVersionUID = 926295830473538510L;
    
    private String typeId;
    
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

