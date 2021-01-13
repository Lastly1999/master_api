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

    @Autowired
    UploadService uploadService;

    /**
     * 上传图片接口
     * @param file
     * @return
     */
    @PostMapping("/upload")
    public ResultData uoLoad( @RequestParam("file") MultipartFile file){
        ResultData resultData = uploadService.upload(file);
        return resultData;
    }

}
