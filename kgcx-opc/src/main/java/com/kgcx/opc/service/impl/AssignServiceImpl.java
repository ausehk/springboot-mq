package com.kgcx.opc.service.impl;

import com.kgcx.opc.common.utils.http.HttpUtils;
import com.kgcx.opc.constans.MsgConstants;
import com.kgcx.opc.entity.Message;
import com.kgcx.opc.service.AssignService;
import okhttp3.CacheControl;
import okhttp3.Callback;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 何凯
 * @version 0.1
 * @description
 * @time 2017/11/14 11:30
 * @since 0.1
 */
@Service
public class AssignServiceImpl implements AssignService{
    private static final Logger LOGGER = LoggerFactory.getLogger(AssignServiceImpl.class);

    /**
     * 对过来的消息进行转发
     * @param message
     * @return
     */
    @Override
    public Object forwordApi(Message message) {
        switch (message.getType()){
            case MsgConstants.BASEINFO_COMPANY :
            // 发送请求
            break;

            case "1":
            break;



        }

        return null;
    }

    /**
     * 发送请求
      */
    public void sendMsg(){

        String url="";
        Map<String, String> headerMap = new HashMap<>();
        Map<String, String> paramMap = new HashMap<>();
        CacheControl cacheControl =null;
        Callback callback =null;
        String tag ="";
        try {
            HttpUtils.getInstance().asyncPostJSONRequest(url,headerMap,paramMap,cacheControl,callback,tag);
        }catch (Exception e){
            LOGGER.debug("");
        }
    }
}
