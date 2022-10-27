package cn.com.loveback.hziee.wxserver.redis;

/**
 * @projectName: WxServer
 * @package: cn.com.loveback.hziee.wxserver.redis
 * @className: RCodeKey
 * @author: K-Luo
 * @description: TODO
 * @date: 2022/10/26 22:04
 * @version: 1.0
 */
public class RCodeKey extends SimplePrefix{
    public RCodeKey(int expireSeconds, String prefix) {
        super(expireSeconds, prefix);
    }
    public static RCodeKey reCode=new RCodeKey(60*2,"rcode");
}
