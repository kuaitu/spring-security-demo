package com.lmk.springsecuritydemo.sys.controller;


import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import com.lmk.springsecuritydemo.base.controller.BaseController;
import com.lmk.springsecuritydemo.sys.entity.Permission;
import com.lmk.springsecuritydemo.sys.service.IPermissionService;
/**
 * <p>
  * 权限表 前端控制器
  * </p>
 *
 * @author linmk
 * @since 2019-11-05
 */
@RestController
@RequestMapping("/sys/permission")
public class PermissionController extends BaseController<Permission, Permission, IPermissionService> {
    public PermissionController() {
        super(Permission.class);
    }
}
