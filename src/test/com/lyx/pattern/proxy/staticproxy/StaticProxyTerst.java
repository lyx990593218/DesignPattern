package com.lyx.pattern.proxy.staticproxy;

public class StaticProxyTerst {

    public static void main(String[] args) {
        UserDao target = new UserDao();
        UserDaoProxy proxy = new UserDaoProxy(target);
        proxy.save();
    }
}
