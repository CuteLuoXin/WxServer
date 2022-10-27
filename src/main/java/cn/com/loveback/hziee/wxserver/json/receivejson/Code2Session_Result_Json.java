package cn.com.loveback.hziee.wxserver.json.receivejson;

/**
 * @projectName: WxServer
 * @package: cn.com.loveback.hziee.wxserver.json.resultjson
 * @className: Code2Session_Result_Json
 * @author: K-Luo
 * @description: TODO
 * @date: 2022/10/21 16:34
 * @version: 1.0
 */
public class Code2Session_Result_Json {
    String session_key;
    String unionid;
    String errmsg;
    String openid;
    int errcode;

    public String getSession_key() {
        return session_key;
    }

    public void setSession_key(String session_key) {
        this.session_key = session_key;
    }

    public String getUnionid() {
        return unionid;
    }

    public void setUnionid(String unionid) {
        this.unionid = unionid;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public int getErrcode() {
        return errcode;
    }

    public void setErrcode(int errcode) {
        this.errcode = errcode;
    }
}
