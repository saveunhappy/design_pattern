package com.geely.design.principle.singleton;

import java.io.Serializable;

public class HungrySingleton implements Serializable,Cloneable {
    private static final HungrySingleton HUNGRY_SINGLETON;
    static {
        HUNGRY_SINGLETON = new HungrySingleton();
    }
    private HungrySingleton(){

    }
    public static HungrySingleton getInstance(){
        return HUNGRY_SINGLETON;
    }

    private Object readResolve(){
        return HUNGRY_SINGLETON;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
