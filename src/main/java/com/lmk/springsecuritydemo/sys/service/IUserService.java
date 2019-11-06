package com.lmk.springsecuritydemo.sys.service;

import com.lmk.springsecuritydemo.base.service.IBaseService;
import com.lmk.springsecuritydemo.sys.entity.User;

/**
 * <p>
  *  服务类
  * </p>
 *
 * @author linmk
 * @since 2019-11-05
 */
public interface IUserService extends IBaseService<User> {

    User findByUserName(String username);
}
