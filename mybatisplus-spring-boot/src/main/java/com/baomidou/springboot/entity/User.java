package com.baomidou.springboot.entity;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

/**
 * 用户表
 */
@SuppressWarnings("serial")
@Data
@TableName("USER")
public class User extends Model<User> {

    private Long test_id;

    private Long tenant_id;

    private String name;

    private Integer age;

    private Integer test_type;

    private Date test_date;

    private Long role;

    private String phone;

    @Override
    protected Serializable pkVal() {
        return this.test_id;
    }


}
