package com.lyx.pattern.factory.abstractfactory.factory;

import com.lyx.pattern.factory.HongQiCar;
import com.lyx.pattern.factory.ICar;
import com.lyx.pattern.factory.abstractfactory.HongQiBus;
import com.lyx.pattern.factory.abstractfactory.HongQiZhongQi;
import com.lyx.pattern.factory.abstractfactory.IBus;
import com.lyx.pattern.factory.abstractfactory.IZhongQi;

public class HongQiFactory implements ICarFactory {
    public ICar createCar() {
        return new HongQiCar();
    }

    public IZhongQi createZhongQi() {
        return new HongQiZhongQi();
    }

    public IBus createBus() {
        return new HongQiBus();
    }
}
