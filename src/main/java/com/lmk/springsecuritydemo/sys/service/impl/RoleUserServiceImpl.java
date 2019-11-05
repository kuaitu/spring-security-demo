package com.lmk.springsecuritydemo.sys.service.impl;

import com.lmk.springsecuritydemo.sys.entity.RoleUser;
import com.lmk.springsecuritydemo.sys.dao.RoleUserMapper;
import com.lmk.springsecuritydemo.sys.service.IRoleUserService;
import com.lmk.springsecuritydemo.base.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

/**
 * <p>
  * 角色用户关系表 服务实现类
  * </p>
 *
 * @author linmk
 * @since 2019-11-05
 */
@Service
public class RoleUserServiceImpl extends BaseServiceImpl<RoleUserMapper, RoleUser> implements IRoleUserService {
    @Override
    public Wrapper<RoleUser> buildWrapper(RoleUser example) {
        QueryWrapper<RoleUser> q = new QueryWrapper<>();
        return q;
    }
}
