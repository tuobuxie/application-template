package com.tddata.core.entity;

import java.io.Serializable;

/**
 * test表(Test)实体类
 *
 * @author makejava
 * @since 2022-02-14 17:53:43
 */
public class Test implements Serializable {
    private static final long serialVersionUID = -25386367389483424L;
    /**
     * 自增id
     */
    private String id;
    
    private String name;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

