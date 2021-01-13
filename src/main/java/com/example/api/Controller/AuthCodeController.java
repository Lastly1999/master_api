package com.example.api.Controller;


import com.example.api.Service.AuthCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class AuthCodeController {

    @Autowired
    AuthCodeService authCodeService;

    @PostMapping("/postAuthCode")
    public String  postAuthCode(@RequestBody Map params){
        String tel = (String) params.get("telPhone");
        System.out.println(tel);
        String result = authCodeService.AuthCode(tel);
        return result;
    }
}
