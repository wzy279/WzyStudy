package com.soft.Test1.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "`user`")
public class User {
    /**
     * 用户id
     */
    @TableId(value = "user_id", type = IdType.INPUT)
    private Integer userId;

    /**
     * 用户名称
     */
    @TableField(value = "user_name")
    private String userName;

    /**
     * 用户密码
     */
    @TableField(value = "user_password")
    private String userPassword;

    /**
     * 用户邮箱（用户账号）
     */
    @TableField(value = "user_email")
    private String userEmail;

    /**
     * 用户角色
     */
    @TableField(value = "user_role")
    private String userRole;

    /**
     * 用户状态（0:正常,1:禁用）
     */
    @TableField(value = "user_status")
    private String userStatus;

    public static final String COL_USER_ID = "user_id";

    public static final String COL_USER_NAME = "user_name";

    public static final String COL_USER_PASSWORD = "user_password";

    public static final String COL_USER_EMAIL = "user_email";

    public static final String COL_USER_ROLE = "user_role";

    public static final String COL_USER_STATUS = "user_status";
}