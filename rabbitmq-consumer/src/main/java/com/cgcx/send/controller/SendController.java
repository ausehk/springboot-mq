package com.cgcx.send.controller;

import com.cgcx.common.utils.http.HttpUtils;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


/**
 * @version 1.0
 * @description
 * @auther 何凯
 * @create 2017/11/8 16:55
 */
@RestController
@RequestMapping("/send")
@EnableAutoConfiguration
public class SendController {
    @Autowired
    private   HttpUtils httpUtils;
    @GetMapping("test")
    public void sendInfo() throws Exception{
       Map<String, String> paramMap =new HashMap<>();
       paramMap.put("avtive","0");
       String url= "http://192.168.18.18:8088/tms/v1/order/queryWithPage";
       //httpUtils.syncGetRequest(url);
      String result= httpUtils.syncPostJSONRequest(url,null,paramMap,null);
    }

}
