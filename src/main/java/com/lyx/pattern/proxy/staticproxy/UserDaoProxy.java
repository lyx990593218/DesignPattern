package com.lyx.pattern.proxy.staticproxy;

public class UserDaoProxy implements IUserDao {

    private  IUserDao target;

    public  UserDaoProxy(IUserDao target){
        this.target = target;
    }

    @Override
    public void save() {
        System.out.println("before");
        target.save();
        System.out.println("after");

    }
}
