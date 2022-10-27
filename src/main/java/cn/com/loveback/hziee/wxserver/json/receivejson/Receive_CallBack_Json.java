package cn.com.loveback.hziee.wxserver.json.receivejson;




/**
 * @projectName: WxServer
 * @package: cn.com.loveback.hziee.wxserver.json.resultjson
 * @className: Receive_CallBack_Json
 * @author: K-Luo
 * @description: TODO
 * @date: 2022/10/21 17:57
 * @version: 1.0
 */
public class Receive_CallBack_Json {
    String openid;
    String data;
    String localtime;

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getLocaltime() {
        return localtime;
    }

    public void setLocaltime(String localtime) {
        this.localtime = localtime;
    }
}
