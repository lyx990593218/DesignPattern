package com.lyx.pattern.factory.abstractfactory.factory;

import com.lyx.pattern.factory.ChangChengCar;
import com.lyx.pattern.factory.ICar;
import com.lyx.pattern.factory.abstractfactory.ChangChengBus;
import com.lyx.pattern.factory.abstractfactory.ChangChengZhongQi;
import com.lyx.pattern.factory.abstractfactory.IBus;
import com.lyx.pattern.factory.abstractfactory.IZhongQi;

public class ChangChengFactory implements ICarFactory {
    public ICar createCar() {
        return new ChangChengCar();
    }

    public IZhongQi createZhongQi() {
        return new ChangChengZhongQi();
    }

    public IBus createBus() {
        return new ChangChengBus();
    }
}
