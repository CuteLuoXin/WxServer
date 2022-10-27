package cn.com.loveback.hziee.wxserver.tool.http;

import java.util.Map;

public class RequestProperty {
    Map<String,String> header;
    public RequestProperty(String headerInfo){
        String rowSplit[]=headerInfo.split("\n");
        for (int i=0;i<rowSplit.length;i++){
            this.header.put(rowSplit[i].split(":")[0],rowSplit[i].split(":")[1]);
        }
    }
    public Map<String, String> getHeader() {
        return header;
    }

    public void setHeader(Map<String, String> header) {
        this.header = header;
    }
}
