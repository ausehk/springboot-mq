package com.cgcx.common.enums;

/**
 * 定义异常时，需要先确定异常所属模块。
 *
 * @author 苏晓蒙
 * @version 0.1
 * @time 2017/7/30 17:35
 * @since 0.1
 */
public enum ModuleCodeEnum {

    /**
     * 默认模块
     */
    DEFAULT_Module(0000, "其他模块"),//
    /**
     * 基础模块
     */
    BASIC_Module(1001, "基础模块"),//
    /**
     * 仓储模块
     */
    WMS_Module(1002, "仓储模块"), //
    /**
     * 物流模块
     */
    TMS_Module(1003, "物流模块"), //
    /**
     * 微信模块
     */
    WECHAT_Module(1004, "微信模块"),//
    /**
     * 接口模块
     */
    API_Module(1005, "接口模块"); //

    /**
     * 模块编码
     */
    private int moduleCode;
    /**
     * 模块名称
     */
    private String moduleName;

    ModuleCodeEnum(int moduleCode, String moduleName) {
        this.moduleCode = moduleCode;
        this.moduleName = moduleName;
    }

    public int getModuleCode() {
        return moduleCode;
    }

}
