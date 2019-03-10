package com.lyx.pattern.factory.abstractfactory.factory;

import com.lyx.pattern.factory.ICar;
import com.lyx.pattern.factory.abstractfactory.IBus;
import com.lyx.pattern.factory.abstractfactory.IZhongQi;

/**
 * 要求所有的子工厂都实现这个工厂
 * 一个品牌的抽象
 *
 * 抽象工厂不符合开闭原则
 * 扩展性非常强
 */
public interface ICarFactory {

    ICar createCar();

    IZhongQi createZhongQi();

    IBus createBus();
}
