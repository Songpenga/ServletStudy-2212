package com.study.springboot20221peng.IocAndi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IocController {

    @Autowired(required = false) // 기본값은 true, required 생략될 수 있음
    @Qualifier("usi2")
    private UserService userService;

    @ResponseBody
    @GetMapping("/ioc")
    public String iocTest(){
        userService.createUser();
        userService.geteUser();
        userService.updateUser();
        userService.deleteUser();

        return null;
    }

}
