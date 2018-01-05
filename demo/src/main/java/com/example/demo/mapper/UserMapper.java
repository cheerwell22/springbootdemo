package com.example.demo.mapper;

import java.util.List;

import com.example.demo.SuperMapper;
import org.apache.ibatis.annotations.Select;
import com.example.demo.entity.User;
import com.baomidou.mybatisplus.mapper.BaseMapper;
/**
 * User 表数据库控制层接口
 */
public interface UserMapper extends SuperMapper<User> {

    /**
     * 自定义注入方法
     */
    int deleteAll();

    @Select("select test_id as id, name, age, test_type from user")
    List<User> selectListBySQL();

}