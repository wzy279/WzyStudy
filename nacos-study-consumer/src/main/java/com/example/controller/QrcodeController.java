package com.example.controller;

import org.example.QrCodeUtils;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
@RestController
//@CrossOrigin
public class QrcodeController {

    @GetMapping("/qrCode")
    @CrossOrigin
    public void qrCodeTest(HttpServletResponse response) throws Exception {
        System.out.println("生成二维码");
        // context是二维码里面的内容，如果是网址则会跳转到网址界面
        String context = "lixianhe";
        // 获取类路径下的logo文件
        ClassPathResource resource = new ClassPathResource("static/logo.jpg");
        //获logo.jpg的绝对路径
        String logoPath = resource.getFile().getPath();
        // String destPath = "D:\\qrCode\\csdn.jpg";
        QrCodeUtils.encode(context, logoPath, response.getOutputStream(), true);
    }
}



