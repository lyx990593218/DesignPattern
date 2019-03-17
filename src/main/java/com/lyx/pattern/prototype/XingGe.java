package com.lyx.pattern.prototype;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class XingGe implements Serializable {
    public float h = 100;
    public float d = 10;

    public void big(){
        this.d *= 2;
        this.h *= 2;
    }

    public void small(){
        this.d /= 2;
        this.h /= 2;
    }
}
