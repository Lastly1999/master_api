package com.example.api.Service;


import com.example.api.Utils.ResultData;
import com.example.api.Utils.ResultUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Date;

@Service
public class UploadService {
    public ResultData upload(MultipartFile file){
        // 获取图片原文件名
        String fileName = file.getOriginalFilename();
        // 用时间戳来为图片命名
        long fileDateName = new Date().getTime();
        // 获取文件后缀名
        String suffixName = fileName.substring(fileName.lastIndexOf("."));
        // 判断是否为图片格式
        if(!suffixName.equalsIgnoreCase(".jpg") && !suffixName.equalsIgnoreCase(".png") && !suffixName.equalsIgnoreCase(".gif")){
            return ResultUtils.UploadError("格式有误,只支持上传图片格式");
        }
        // 文件夹路径
        String targetFilePath = "D:\\";
        // 创建file文件
        File destFile = new File(targetFilePath+ fileDateName + suffixName);
        try {
            file.transferTo(destFile);
            return ResultUtils.UploadSuccess(targetFilePath.replaceAll("\\\\","/")+ fileDateName + suffixName);
        } catch (IOException e) {
            e.printStackTrace();
            return ResultUtils.UploadError("上传异常");
        }
    }
}
