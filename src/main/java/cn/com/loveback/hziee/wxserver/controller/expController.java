package cn.com.loveback.hziee.wxserver.controller;

import cn.com.loveback.hziee.wxserver.redis.RCodeKey;
import cn.com.loveback.hziee.wxserver.redis.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @projectName: WxServer
 * @package: cn.com.loveback.hziee.wxserver.controller
 * @className: expController
 * @author: K-Luo
 * @description: TODO
 * @date: 2022/10/23 22:33
 * @version: 1.0
 */
@Controller
public class expController {
    @Autowired
    RedisService redisService;
    @RequestMapping("/")
    @ResponseBody
    public String exp(){
        redisService.set(RCodeKey.reCode,"value","123456");
        return "";
    }
}
