package com.lyx.pattern.factory.factorymethod;

import com.lyx.pattern.factory.HongQiCar;
import com.lyx.pattern.factory.ICar;

public class HongQiCarFactory implements ICarFactory {
    public ICar create() {
        return new HongQiCar();
    }
}
