package com.lyx.pattern.factory.factorymethod;

import com.lyx.pattern.factory.ChangChengCar;
import com.lyx.pattern.factory.ICar;

public class ChangChengCarFactory implements ICarFactory {
    public ICar create() {
        return new ChangChengCar();
    }
}
