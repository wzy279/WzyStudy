package com.example.controller;

import com.wechat.entity.WeChatAccessToken;
import com.wechat.entity.WechatUserinfo;
import com.wechat.utils.WeChatUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/wechat")
public class WeChatOauthController {

    @GetMapping("login")
    public WechatUserinfo getUserInfo(){

        return null;
    }





    @GetMapping("/callback")
    public void callback(HttpServletRequest request){
        System.out.println("codeee");
        String code = request.getParameter("code");
        String state = request.getParameter("state");
        System.out.println(state);
        System.out.println(code);
//        System.out.println("AccessToken:"+WeChatUtils.getAccessToken(code));
        WeChatAccessToken accessToken = WeChatUtils.getAccessToken(code);
        System.out.println(accessToken.toString());
        WechatUserinfo userInfo = WeChatUtils.getWXUserInfoUrl(accessToken.getOpenid(),accessToken.getAccess_token());
        System.out.println("userInfo: "+WeChatUtils.getWXUserInfoUrl(accessToken.getOpenid(),accessToken.getAccess_token()));
//        System.out.println(userInfo.toString());
    }
    //http://gxuurw.natappfree.cc
    //https://open.weixin.qq.com/connect/oauth2/authorize?appid=wxf9f88c032121d358&redirect_uri=http://gxuurw.natappfree.cc/wechat/callback&response_type=code&scope=snsapi_userinfo&state=STATE#wechat_redirect
}
