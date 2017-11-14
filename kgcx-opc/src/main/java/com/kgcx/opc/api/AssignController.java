package com.kgcx.opc.api;

import com.kgcx.opc.common.dto.DataResponse;
import com.kgcx.opc.entity.Message;
import com.kgcx.opc.service.AssignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 何凯
 * @version 0.1
 * @description
 * @time 2017/11/14 11:05
 * @since 0.1
 */
@RestController
@EnableAutoConfiguration
@RequestMapping("opc/v1/assign")
public class AssignController{

    @Autowired
    private AssignService assignService;
    @PostMapping(value="api")
    public Object forwardApi(@RequestBody Message message){
        if(null!=message){
            assignService.forwordApi(message);
            return DataResponse.createSuccessResponse(DataResponse.SUCCESS_CODE,"成功！");
        }else{
            return DataResponse.createSuccessResponse(DataResponse.ERROR_CODE,"失败！");
        }




    }


}
