package com.lmk.springsecuritydemo.sys.service.impl;

import com.lmk.springsecuritydemo.sys.entity.Permission;
import com.lmk.springsecuritydemo.sys.dao.PermissionMapper;
import com.lmk.springsecuritydemo.sys.service.IPermissionService;
import com.lmk.springsecuritydemo.base.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

/**
 * <p>
  * 权限表 服务实现类
  * </p>
 *
 * @author linmk
 * @since 2019-11-05
 */
@Service
public class PermissionServiceImpl extends BaseServiceImpl<PermissionMapper, Permission> implements IPermissionService {
    @Override
    public Wrapper<Permission> buildWrapper(Permission example) {
        QueryWrapper<Permission> q = new QueryWrapper<>();
        return q;
    }
}