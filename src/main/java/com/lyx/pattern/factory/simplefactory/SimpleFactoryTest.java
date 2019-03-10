package com.lyx.pattern.factory.simplefactory;

import com.lyx.pattern.factory.ChangChengCar;
import com.lyx.pattern.factory.HongQiCar;
import com.lyx.pattern.factory.ICar;

/**
 * 小作坊式的工厂模型
 * Created by lyx1.
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {

        CarFactory factory = new CarFactory();
        ICar car = factory.create(HongQiCar.class);
        car.produce();

        ICar car2 = factory.create(ChangChengCar.class);
        car2.produce();

    }
}
