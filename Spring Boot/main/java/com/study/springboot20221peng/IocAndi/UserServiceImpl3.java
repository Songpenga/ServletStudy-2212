package com.study.springboot20221peng.IocAndi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("usi3")
public class UserServiceImpl3 implements UserService{

    @Override
    public void createUser() { System.out.println("사용자등록3"); }
    @Override
    public void geteUser() {
        System.out.println("사용자 조회3");
    }

    @Override
    public void updateUser() {
        System.out.println("사용자수정3");
    }

    @Override
    public void deleteUser() {
        System.out.println("사용자 삭제3");
    }
}
