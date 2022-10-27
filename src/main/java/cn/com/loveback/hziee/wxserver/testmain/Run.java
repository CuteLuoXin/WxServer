package cn.com.loveback.hziee.wxserver.testmain;

import cn.com.loveback.hziee.wxserver.redis.RedisService;
import com.alibaba.fastjson.JSONObject;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Run {

    public static void main(String args[]){
        JSONObject body = new JSONObject();
        body.put("code","1234");
        System.out.println(body);
    }
}
