package com.lyx.pattern.factory.factorymethod;

import com.lyx.pattern.factory.ICar;

public class FactoryMethodTest {

    public static void main(String[] args) {
        ICarFactory carFactory = new HongQiCarFactory();
        ICar car = carFactory.create();
        car.produce();

        ICarFactory carFactory2 = new ChangChengCarFactory();
        ICar car2 = carFactory2.create();
        car2.produce();
    }
}
