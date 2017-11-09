package com.cgcx.common.query;

import java.io.Serializable;

/**
 * 查询的基类
 *
 * @author 苏晓蒙
 * @version 0.1
 * @time 2017/4/21 11:12
 * @since 0.1
 */
public class BaseQuery implements Serializable {

    private static final long serialVersionUID = 1L;

    private int pageNumber = 1;

    private int pageSize = 10;

    /**
     * 排序的字段名称
     */
    private String sortName;

    /**
     * 排序规则，默认DESC
     */
    private String sortOrder;

    public void setPageNumber(Integer pageNumber) {
        if (pageNumber != null && pageNumber.intValue() > 0) {
            this.pageNumber = pageNumber;
        }
    }

    public void setCurPage(Integer pageNumber) {
        if (pageNumber != null && pageNumber.intValue() > 0) {
            this.pageNumber = pageNumber;
        }
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageSize(Integer pageSize) {
        if (pageSize != null && pageSize.intValue() > 0) {
            this.pageSize = pageSize;
        }
    }

    public int getPageSize() {
        return pageSize;
    }

    protected boolean isBlank(String value) {
        return null == value || "".equals(value.trim());
    }

    public String getSortName() {
        return sortName;
    }

    public void setSortName(String sortName) {
        this.sortName = sortName;
    }

    public String getSortOrder() {
        return sortOrder == null || "".equals(sortOrder.trim()) ? "DESC" : sortOrder;
    }

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

}
