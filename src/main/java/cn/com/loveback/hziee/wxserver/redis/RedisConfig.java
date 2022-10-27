package cn.com.loveback.hziee.wxserver.redis;

/**
 * @projectName: WxServer
 * @package: cn.com.loveback.hziee.wxserver.redis
 * @className: RedisConfig
 * @author: K-Luo
 * @description: TODO
 * @date: 2022/10/26 21:54
 * @version: 1.0
 */
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="redis")
public class RedisConfig {
    private String host;
    private int port;
    private int timeout;//秒
    private String password;
    private int poolMaxTotal;
    private int poolMaxIdle;
    public String getHost() {
        return host;
    }
    public void setHost(String host) {
        this.host = host;
    }
    public int getPort() {
        return port;
    }
    public void setPort(int port) {
        this.port = port;
    }
    public int getTimeout() {
        return timeout;
    }
    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public int getPoolMaxTotal() {
        return poolMaxTotal;
    }
    public void setPoolMaxTotal(int poolMaxTotal) {
        this.poolMaxTotal = poolMaxTotal;
    }
    public int getPoolMaxIdle() {
        return poolMaxIdle;
    }
    public void setPoolMaxIdle(int poolMaxIdle) {
        this.poolMaxIdle = poolMaxIdle;
    }
}
