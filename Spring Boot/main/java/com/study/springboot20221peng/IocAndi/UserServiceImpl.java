package com.study.springboot20221peng.IocAndi;

public class UserServiceImpl implements UserService{
    //싱글톤
    private static UserService instance = null;
    private UserServiceImpl() {}
    public static UserService getInstance() {
        if(instance == null){
            instance = new UserServiceImpl();
        }
        return instance;
    }

    @Override
    public void createUser() {
        System.out.println("사용자등록2");

    }

    @Override
    public void geteUser() {
        System.out.println("사용자 조회2");
    }

    @Override
    public void updateUser() {
        System.out.println("사용자수정2");
    }

    @Override
    public void deleteUser() {
        System.out.println("사용자 삭제2");
    }
}
