package cn.com.loveback.hziee.wxserver.controller;

import cn.com.loveback.hziee.wxserver.json.callbackdata.LoginCode;
import cn.com.loveback.hziee.wxserver.json.param.FinalParam;
import cn.com.loveback.hziee.wxserver.json.receivejson.Code2Session_Result_Json;
import cn.com.loveback.hziee.wxserver.json.receivejson.Receive_CallBack_Json;
import cn.com.loveback.hziee.wxserver.json.sendjson.Code2Session_Send_Get;
import cn.com.loveback.hziee.wxserver.redis.RedisService;
import cn.com.loveback.hziee.wxserver.redis.UserKey;
import cn.com.loveback.hziee.wxserver.tool.http.HttpUtil;
import cn.com.loveback.hziee.wxserver.tool.result.Result;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @projectName: WxServer
 * @package: cn.com.loveback.hziee.wxserver.controller
 * @className: LoginController
 * @author: K-Luo
 * @description: 微信小程序登录控制器
 * @date: 2022/10/21 16:25
 * @version: 1.0
 */
@RestController
@RequestMapping("/login")
public class LoginController {
    @Autowired
    RedisService redisService;
    @RequestMapping("getCode")
    public Result<JSONObject> Code2Session(@RequestBody Receive_CallBack_Json r) {
        String Response="";
        String js_code = JSONObject.parseObject(r.getData(), LoginCode.class).getCode();
        Code2Session_Send_Get code2SessionSendGet = new
                Code2Session_Send_Get(FinalParam.APP_ID, FinalParam.APP_SECRET, js_code, FinalParam.GRANT_TYPE);
        String url = code2SessionSendGet.getCode2SessionUrl();
        try {
           Response = HttpUtil.REQUEST_Post(url,"GET",null);
        }catch (Exception e) {
            System.out.println(e.toString());
        }
        Code2Session_Result_Json crj=JSONObject.parseObject(Response,Code2Session_Result_Json.class);
        JSONObject body = new JSONObject();
        body.put("openid",crj.getOpenid());
        redisService.set(UserKey.UserList,crj.getOpenid(),String.class);
        return Result.success(body);
    }

}



//15867107679
