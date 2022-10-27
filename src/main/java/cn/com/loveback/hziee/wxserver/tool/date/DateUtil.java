package cn.com.loveback.hziee.wxserver.tool.date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @projectName: WxServer
 * @package: cn.com.loveback.hziee.wxserver.tool.date
 * @className: DateUtil
 * @author: K-Luo
 * @description: TODO
 * @date: 2022/10/21 16:09
 * @version: 1.0
 */
public class DateUtil {
    public static String getDate(){
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd kk:mm:ss ");
        return "服务器当前时间：" + sdf.format(d);
    }
}
