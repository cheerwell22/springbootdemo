package com.baomidou.springboot.service.impl;

import java.util.Map;
import java.util.List;

import com.baomidou.springboot.entity.User;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.baomidou.springboot.mapper.UserMapper;
import com.baomidou.springboot.service.IUserService;

/**
 *
 * User 表数据服务层接口实现类
 *
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

	@Override
	public boolean deleteAll() {
		return retBool(baseMapper.deleteAll());
	}

	@Override
	public List<User> selectListBySQL() {
		return baseMapper.selectListBySQL();
	}

	@Override
	public List<Map> testFind() {
		return baseMapper.testFind();
	}

}