package com.lyx.pattern.factory.simplefactory;

import com.lyx.pattern.factory.ICar;

public class CarFactory {

    public ICar create(Class<? extends ICar> clazz){
        try {
            if(null != clazz) {
                return clazz.newInstance();
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
