package cn.com.loveback.hziee.wxserver.json.sendjson;

/**
 * @projectName: WxServer
 * @package: cn.com.loveback.hziee.wxserver.json.sendjson
 * @className: Code2Session_Send_Get
 * @author: K-Luo
 * @description: Code2Session请求接口的构造。
 * @date: 2022/10/21 17:19
 * @version: 1.0
 */
public class Code2Session_Send_Get {
    final static String url = "https://api.weixin.qq.com/sns/jscode2session";
    String appid;
    String secret;
    String js_code;
    String grant_type;

    /**
     * @param appid app的id
     * @param secret app的密码
     * @param js_code wx.login返回的code
     * @param grant_type 授予的权限，一般为authorization_code
     * @return
     * @author K-luo
     * @creed: 构造方法，给参数赋值
     * @date 2022/10/21 17:38
     */
    public Code2Session_Send_Get(String appid, String secret, String js_code, String grant_type) {
        this.appid = appid;
        this.js_code = js_code;
        this.secret = secret;
        this.grant_type = grant_type;
    }
    /**
     *
     * @param
     * @return java.lang.String
     * @author K-luo
     * @creed: 返回生成的URL
     * @date 2022/10/21 17:40
     *
     */
    public String getCode2SessionUrl() {
        String u = "";
        u = url + "?appid=" + this.appid + "&secret=" + this.secret + "&js_code=" + this.js_code + "&grant_type=" + this.grant_type;
        return u;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getJs_code() {
        return js_code;
    }

    public void setJs_code(String js_code) {
        this.js_code = js_code;
    }

    public String getGrant_type() {
        return grant_type;
    }

    public void setGrant_type(String grant_type) {
        this.grant_type = grant_type;
    }
}
