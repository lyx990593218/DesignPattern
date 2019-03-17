package com.lyx.pattern.singleton.lazy;

/**
 *静态内部类实现单例
 *
 * 这种形式兼顾饿汉式的内存浪费， 也兼顾 synchronized 性能问题
 * 完美地屏蔽了这两个缺点
 *
 * 性能最优的一种写法
 */
public class LazyInnerClassSingleton {
    //如果没使用的话， 内部类是不加载的

    //虽然构造方法私有了，但是逃不过反射的法眼
    private LazyInnerClassSingleton(){
        if(LazyHolder.LAZY != null){
            throw new RuntimeException("不允许构建多个实例！");
        }
    }


    //每一个关键字都不是多余的
    //static 是为了使单例的空间共享
    //保证这个方法不会被重写， 重载


    //LazyHolder的里面的逻辑需要等到被外部方法调用的时候才被执行
    //巧妙地的运用了内部类的特性
    //JVM底层执行逻辑，完美的避免的了线程安全的问题
    public static final LazyInnerClassSingleton getInstance(){
        //在返回结果以前， 一定会先加载内部类
        return LazyHolder.LAZY;
    }

    //默认不加载
    private static class LazyHolder {
        private static final LazyInnerClassSingleton LAZY = new LazyInnerClassSingleton();
    }
}
