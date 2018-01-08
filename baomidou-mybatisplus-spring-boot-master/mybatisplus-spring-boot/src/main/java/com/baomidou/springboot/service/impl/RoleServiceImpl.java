package com.baomidou.springboot.service.impl;

import com.baomidou.springboot.entity.Role;
import com.baomidou.springboot.mapper.RoleMapper;
import com.baomidou.springboot.service.IRoleService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author K神带你飞123
 * @since 2018-01-08
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

}
