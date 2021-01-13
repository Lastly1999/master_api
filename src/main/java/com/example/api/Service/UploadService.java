package com.example.api.Service;
import com.example.api.Utils.ResultData;
import com.example.api.Utils.ResultUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.xml.transform.Result;
import java.io.File;
import java.io.IOException;
import java.util.Date;



@Service
public class UploadService {

    /**
     * 上传图片处理
     * @param file
     * @return
     */
    public ResultData upload(MultipartFile file){
        // 获取文件名
        String originalFilename = file.getOriginalFilename();
        // 获取文件后缀名
        String lastStr = originalFilename.substring(originalFilename.lastIndexOf("."));
        String expandName = originalFilename.substring(originalFilename.lastIndexOf("."),originalFilename.length());
        if(!expandName.equalsIgnoreCase(".jpg") && !expandName.equalsIgnoreCase(".png") && !expandName.equalsIgnoreCase(".gif") && !expandName.equalsIgnoreCase(".bmp")){
            return ResultUtils.UploadError("上传失败，照片格式有误!");
        }
        // 获取当前时间戳作为文件名
        long timeStamp = new Date().getTime();
        // 新的文件名
        String newFileName = timeStamp + lastStr;

        try {
            // 文件写入
            file.transferTo(new File("C:\\Users\\Administrator\\Desktop\\upload\\" + newFileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ResultUtils.UploadSuccess(newFileName);
    }
}
