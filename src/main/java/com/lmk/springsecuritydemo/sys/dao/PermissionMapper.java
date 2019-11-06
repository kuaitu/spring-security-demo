package com.lmk.springsecuritydemo.sys.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lmk.springsecuritydemo.sys.entity.Permission;

import java.util.List;

/**
 * <p>
 * 权限表 Mapper 接口
 * </p>
 *
 * @author linmk
 * @since 2019-11-05
 */
public interface PermissionMapper extends BaseMapper<Permission> {
    List<Permission> findAll();
    List<Permission> findByAdminUserId(int userId);
}
