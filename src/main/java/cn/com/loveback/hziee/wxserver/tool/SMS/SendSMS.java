package cn.com.loveback.hziee.wxserver.tool.SMS;

import cn.com.loveback.hziee.wxserver.json.param.FinalParam;
import cn.com.loveback.hziee.wxserver.tool.http.HttpUtil;

/**
 * @projectName: WxServer
 * @package: cn.com.loveback.hziee.wxserver.tool
 * @className: SendSMS
 * @author: K-Luo
 * @description: TODO
 * @date: 2022/10/25 14:14
 * @version: 1.0
 */
public class SendSMS {
    public static String send(String content,String telNum){
        StringBuffer httpArg = new StringBuffer();
        httpArg.append("u=").append(FinalParam.USER_NUM).append("&");
        httpArg.append("p=").append(HttpUtil.md5(FinalParam.USER_PASSWORD)).append("&");
        httpArg.append("m=").append(telNum).append("&");
        httpArg.append("c=").append(HttpUtil.encodeUrlString(content, "UTF-8"));
        String result = HttpUtil.REQUEST_GET(FinalParam.SMS_URL, httpArg.toString());
       switch (result){
           case "30":return "密码错误";
           case "40":return "账号不存在";
           case "41":return "余额不足";
           case "43":return "ip地址限制";
           case "50":return "发送含有敏感词";
           case "51":return "手机号不存在";
           default:return "ok";
       }
    }
}
