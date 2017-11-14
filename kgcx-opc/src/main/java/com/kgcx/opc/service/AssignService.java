package com.kgcx.opc.service;

import com.kgcx.opc.entity.Message;

/**
 * @author 何凯
 * @version 0.1
 * @description
 * @time 2017/11/14 11:28
 * @since 0.1
 */
public interface AssignService {
    /**
     * 对过来的消息进行处理
     * @param message
     * @return
     */
    public Object forwordApi(Message message);


}
