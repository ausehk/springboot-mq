package com.cgcx.common.dto;

import java.io.Serializable;

/**
 * Ajax响应,数据响应，包括行数
 *
 * @author 苏晓蒙
 * @version 0.1
 * @time 2017/7/30 17:35
 * @since 0.1
 */
public class DataResponse extends BaseResponse {

    /**
     * 数据总数
     */
    protected long count;

    /**
     * 构造函数，具有多个参数的构造函数
     *
     * @param code  结果状态码
     * @param data  异步结果数据
     * @param count 数据总数
     * @param msg   异步处理信息
     */
    private DataResponse(int code, Object data, long count, String msg) {
        super(code, data, msg);
        this.count = count;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    /**
     * 构造正确结果的Ajax返回对象
     *
     * @param data 数据对象
     * @return ajax对象信息
     */
    public static <T extends Serializable> DataResponse createSuccessResponse(Object data, long count) {
        return new DataResponse(SUCCESS_CODE, data, count, null);
    }

    /**
     * 构造正确结果的Ajax返回对象
     *
     * @param data 数据对象
     * @param msg  操作提示消息
     * @return ajax对象信息
     */
    public static <T extends Serializable> DataResponse createSuccessResponse(Object data, long count, String msg) {
        return new DataResponse(SUCCESS_CODE, data, count, msg);
    }

}
