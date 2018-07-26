package cn.yuchen.bigdate.rs.utility;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

/**
 * 发送http请求   提供GET、POST两种请求方式
 * Created by wzx on 2018/7/25.
 */
public class HttpRequest {

    private static final Logger log = LoggerFactory.getLogger(HttpRequest.class);


    /**
     * http get请求方式
     * @param urlStr
     * @param params
     *
     **/
    public static String get(String urlStr,Map<String,Object> params){
        InputStream is = null;
        BufferedReader reader = null;
        String resultStr ="";
        try {
            String paramsStr = "";
            for(String param : params.keySet()){
                paramsStr += "&" + param + "=" + params.get(param);
            }
            if(!paramsStr.isEmpty()){
                paramsStr = paramsStr.substring(1);
                urlStr += "?" + paramsStr;
            }
            URL url = new URL(urlStr);
            HttpURLConnection httpCon = (HttpURLConnection) url.openConnection();
            httpCon.setRequestMethod("GET");
            is = httpCon.getInputStream();
            reader = new BufferedReader(new InputStreamReader(is,"UTF-8"));
            StringBuilder sb = new StringBuilder();
            String line = null;
            while ((line = reader.readLine()) != null) {
                sb.append(line);
            }
            resultStr = sb.toString();

        } catch (Exception e) {
            log.error("发送http协议get请求失败，失败原因：{}",e);
            e.printStackTrace();
        } finally {
            try {
                if(reader!=null)reader.close();
                if(is!=null)is.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return resultStr;
    }

    /**
     * http post请求方式
     * @param urlStr
     * @param params
     *
     **/
    public static String post(String urlStr,Map<String,Object> params){
        URL connect;
        StringBuffer data = new StringBuffer();
        try {
            connect = new URL(urlStr);
            HttpURLConnection connection = (HttpURLConnection)connect.openConnection();
            connection.setRequestMethod("POST");
            connection.setDoOutput(true);
            connection.setDoInput(true);
            connection.setRequestProperty("accept", "*/*");
            connection.setRequestProperty("connection", "Keep-Alive");
            connection.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            //conn.setRequestProperty("Cookie", cookiesAll.toString()); 设置cookie  若需要登录操作
            OutputStreamWriter paramout = new OutputStreamWriter(connection.getOutputStream(),"UTF-8");
            String paramsStr = "";
            for(String param : params.keySet()){
                paramsStr += "&" + param + "=" + params.get(param);
            }
            if(!paramsStr.isEmpty()){
                paramsStr = paramsStr.substring(1);
            }
            paramout.write(paramsStr);
            paramout.flush();
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream(), "UTF-8"));
            String line;
            while ((line = reader.readLine()) != null) {
                data.append(line);
            }

            paramout.close();
            reader.close();
        } catch (Exception e) {
            log.error("发送http协议post请求失败，失败原因：{}",e);
            e.printStackTrace();
        }
        return data.toString();
    }

}
