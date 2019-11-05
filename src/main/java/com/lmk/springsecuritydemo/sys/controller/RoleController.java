package com.lmk.springsecuritydemo.sys.controller;


import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import com.lmk.springsecuritydemo.base.controller.BaseController;
import com.lmk.springsecuritydemo.sys.entity.Role;
import com.lmk.springsecuritydemo.sys.service.IRoleService;
/**
 * <p>
  * 角色表 前端控制器
  * </p>
 *
 * @author linmk
 * @since 2019-11-05
 */
@RestController
@RequestMapping("/sys/role")
public class RoleController extends BaseController<Role, Role, IRoleService> {
    public RoleController() {
        super(Role.class);
    }
}
