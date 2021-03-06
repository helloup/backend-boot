/*
 * Copyright (c) 2017. <a href="http://www.lufengc.com">lufengc</a> All rights reserved.
 */
package com.bdfint.backend.modules.sys.bean;

import com.bdfint.backend.framework.common.TreeEntity;

import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * 区域Entity
 *
 * @author fengcheng
 * @version 2016/7/28
 */
@Table(name = "sys_area")
public class Area extends TreeEntity<Area> {

    private static final long serialVersionUID = 1L;
    private String code;    // 区域编码
    private String type;    // 区域类型（1：国家；2：省份、直辖市；3：地市；4：区县）

    @Transient
    private String parentName;

    public Area() {
        super();
    }

    public Area(String id) {
        super(id);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    @Override
    public String toString() {
        return name;
    }
}