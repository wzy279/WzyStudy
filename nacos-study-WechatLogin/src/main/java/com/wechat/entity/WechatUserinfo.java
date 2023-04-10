package com.wechat.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class WechatUserinfo implements Serializable {
    private static final long serialVersionUID = -4681067645282292327L;

    // openId，标识该公众号下面的该用户的唯一Id
    private String openid;
    // 用户昵称
    private String nickname;
    // 性别
    private int sex;
    // 省份
    private String province;
    // 诚实
    private String city;
    // 区
    private String country;
    // 头像图片地址
    private String headImgurl;
}
