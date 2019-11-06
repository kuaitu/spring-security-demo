package com.lmk.springsecuritydemo.sys.controller;

import com.lmk.springsecuritydemo.base.utils.Msg;
import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Api(tags = {"登录模块"})
public class HomeController {

    @RequestMapping("/hello")
    public String index(Model model){
        Msg msg =  new Msg("测试标题","测试内容","欢迎来到HOME页面,您拥有 ROLE_HOME 权限");
        model.addAttribute("msg", msg);
        return "login";
    }

    @RequestMapping("/admin")
    public String hello(){
        return "hello admin";
    }

}
