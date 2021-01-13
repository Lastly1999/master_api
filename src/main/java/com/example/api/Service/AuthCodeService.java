package com.example.api.Service;

import com.zhenzi.sms.ZhenziSmsClient;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@Service
public class AuthCodeService {
    private String apiUrl = "https://sms_developer.zhenzikj.com"; // 榛子云的手机验证码接口
    private String appId = "107816";   // appId
    private String appSecret = "ff51662c-9b09-4c98-9f3c-b6d78825ae5b"; // appSecret凭证

    public String AuthCode(String telPhone){
        try{
            String code = String.valueOf(new Random().nextInt(999999)); // 生成随机验证码
            System.out.println("验证码是:"+code+".....");
            ZhenziSmsClient client = new ZhenziSmsClient(apiUrl,appId,appSecret); // 实例化榛子云实例
            Map<String, Object> params = new HashMap<>(); // 生成要提交处理的数据
            params.put("number",telPhone); // 手机号码
            params.put("templateId","3229"); // 模板id
            String [] templateParams = new String[2]; // 模板文字数组
            templateParams[0] = code; // 验证码
            templateParams[1] = "5分钟"; // 有效时长
            params.put("templateParams",templateParams);
            String result = client.send(params);
            System.out.println("发送成功!手机号码为:"+ params.get("number") + "...验证码为:"+ params.get("templateId"));
            System.out.println(result);
            System.out.println("发送成功");
        }catch (Exception e){
            e.printStackTrace();
        }
        return telPhone;
    }
}
