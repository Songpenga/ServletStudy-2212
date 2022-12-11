package com.study.springboot20221peng.IocAndi;

public class Main {

    private final UserService userService;

    public Main() {
        this.userService = UserServiceImpl.getInstance();
    }

    public void run(){
        userService.createUser();
        userService.geteUser();
        userService.updateUser();
        userService.deleteUser();
    }
    public static void main(String[] args) {
        Main main = new Main();
        main.run();

    }

    /*
        private final UserService userService;

    public Main() {
        this.userService = UserServiceImpl.getInstance();
    }

    public void run(){
        userService.createUser();
        userService.geteUser();
        userService.updateUser();
        userService.deleteUser();
    }
    public static void main(String[] args) {
        Main main = new Main();
        main.run();

    }
    * */
}
