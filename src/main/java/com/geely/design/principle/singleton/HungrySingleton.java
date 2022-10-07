package com.geely.design.principle.singleton;

public class HungrySingleton {
    private static final HungrySingleton HUNGRY_SINGLETON;
    static {
        HUNGRY_SINGLETON = new HungrySingleton();
    }
    private HungrySingleton(){

    }
    public static HungrySingleton getInstance(){
        return HUNGRY_SINGLETON;
    }
}
