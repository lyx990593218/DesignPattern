package com.lyx.pattern.singleton.lazy;

/**
 * 懒汉式单例
 * 在外部需要使用的时候才进行实例化
 */
public class LazySimpleSingleton {
    //静态块，公共内存区域
    private static LazySimpleSingleton lazySimpleton = null;

    private LazySimpleSingleton(){}

    /**
     * 这个方法会出现线程安全的问题
     * 如果同时进入if中，会有两次生成实例，有可能会出现不同的地址，有可能相同，相同的是假象的单例
     * @return
     */
    /*public static LazySimpleSingleton getInstance(){
        if (null == lazySimpleton){
            lazySimpleton = new LazySimpleSingleton();
        }
        return lazySimpleton;
    }*/

    /**
     * 由于线程安全问题，需要添加synchronized关键字
     * 但是此关键字加在方法层面，粒度太大，影响执行效率
     * @return
     */
    public synchronized static LazySimpleSingleton getInstance(){
        if (null == lazySimpleton){
            lazySimpleton = new LazySimpleSingleton();
        }
        return lazySimpleton;
    }
}
