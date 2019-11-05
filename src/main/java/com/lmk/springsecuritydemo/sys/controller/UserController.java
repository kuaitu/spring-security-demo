package com.lmk.springsecuritydemo.sys.controller;


import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import com.lmk.springsecuritydemo.base.controller.BaseController;
import com.lmk.springsecuritydemo.sys.entity.User;
import com.lmk.springsecuritydemo.sys.service.IUserService;
/**
 * <p>
  *  前端控制器
  * </p>
 *
 * @author linmk
 * @since 2019-11-05
 */
@RestController
@RequestMapping("/sys/user")
public class UserController extends BaseController<User, User, IUserService> {
    public UserController() {
        super(User.class);
    }
}
