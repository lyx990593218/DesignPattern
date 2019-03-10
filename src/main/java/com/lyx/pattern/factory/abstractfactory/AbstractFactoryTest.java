package com.lyx.pattern.factory.abstractfactory;

import com.lyx.pattern.factory.abstractfactory.factory.HongQiFactory;
import com.lyx.pattern.factory.abstractfactory.factory.ICarFactory;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        ICarFactory hongQiCarFactory = new HongQiFactory();
        hongQiCarFactory.createCar().produce();
        hongQiCarFactory.createBus();
        hongQiCarFactory.createZhongQi();
    }
}
