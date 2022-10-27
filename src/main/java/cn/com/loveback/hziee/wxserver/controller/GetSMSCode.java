package cn.com.loveback.hziee.wxserver.controller;

import cn.com.loveback.hziee.wxserver.json.callbackdata.Rcode;
import cn.com.loveback.hziee.wxserver.json.callbackdata.TelNum;
import cn.com.loveback.hziee.wxserver.json.receivejson.Receive_CallBack_Json;
import cn.com.loveback.hziee.wxserver.redis.RCodeKey;
import cn.com.loveback.hziee.wxserver.redis.RedisService;
import cn.com.loveback.hziee.wxserver.tool.SMS.SendSMS;
import cn.com.loveback.hziee.wxserver.tool.result.ErrorCodeEntity;
import cn.com.loveback.hziee.wxserver.tool.result.Result;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.ApplicationScope;

/**
 * @projectName: WxServer
 * @package: cn.com.loveback.hziee.wxserver.controller
 * @className: GetSMSCode
 * @author: K-Luo
 * @description: TODO
 * @date: 2022/10/25 14:50
 * @version: 1.0
 */
@RestController
@RequestMapping("sms")
public class GetSMSCode {
    @Autowired
    RedisService redisService;
    @RequestMapping("getRcode")
    public Result<String> getRcode(@RequestBody Receive_CallBack_Json r){
        TelNum t= JSONObject.parseObject(r.getData(),TelNum.class);
        int ccm=(int)((Math.random()+1)*1000);
        redisService.set(RCodeKey.reCode,r.getOpenid(),ccm);
        SendSMS.send("【CRM】您的验证码是,"+ccm+",五分钟内有效.",t.getTelnum());
        return Result.success("ok");
    }
    @RequestMapping("checkRcode")
    public Result<String> checkRcode(@RequestBody Receive_CallBack_Json r){
        Rcode rcode=JSONObject.parseObject(r.getData(),Rcode.class);
        String openid=r.getOpenid();
        String c=rcode.getRcode();
        if(c.equals(redisService.get(RCodeKey.reCode,openid,String.class))){
            return Result.success("ok");
        }
        return Result.error(ErrorCodeEntity.CODE_ERROR);
    }

}
