package com.lmk.springsecuritydemo.sys.controller;


import com.lmk.springsecuritydemo.base.controller.BaseController;
import com.lmk.springsecuritydemo.sys.entity.RoleUser;
import com.lmk.springsecuritydemo.sys.service.IRoleUserService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * <p>
  * 角色用户关系表 前端控制器
  * </p>
 *
 * @author linmk
 * @since 2019-11-05
 */
@Api(tags = { "角色用户关系表" })
@RestController
@RequestMapping("/sys/role-user")
public class RoleUserController extends BaseController<RoleUser, RoleUser, IRoleUserService> {
    public RoleUserController() {
        super(RoleUser.class);
    }
}
