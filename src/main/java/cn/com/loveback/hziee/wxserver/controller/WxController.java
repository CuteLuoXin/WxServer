package cn.com.loveback.hziee.wxserver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class WxController {
    @RequestMapping("/firstWxRequest")
    @ResponseBody
    public String firReq(){
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd kk:mm:ss ");
        return "服务器当前时间：" + sdf.format(d);
    }
}
