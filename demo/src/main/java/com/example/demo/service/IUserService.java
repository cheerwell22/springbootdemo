package com.example.demo.service;

import java.util.List;

import com.baomidou.mybatisplus.service.IService;
import com.example.demo.entity.User;

/**
 *
 * User 表数据服务层接口
 *
 */
public interface IUserService extends IService<User> {

	boolean deleteAll();

	public List<User> selectListBySQL();

	public List<User> findAll();
}