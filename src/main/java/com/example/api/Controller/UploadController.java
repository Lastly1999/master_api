package com.example.api.Controller;


import com.example.api.Service.UploadService;
import com.example.api.Utils.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class UploadController {

    /**
     * Service自动装配
     */
    @Autowired
    UploadService uploadService;

    /**
     * 上传接口 只支持上传图片
     * @param file
     * @return
     */
    @PostMapping("/upload")
    public ResultData upload(@RequestParam("file") MultipartFile file){
        ResultData resultData = uploadService.upload(file);
        return resultData;
    }
}
