package com.geely.design.principle.singleton;

public class LazySingleton {
    private static LazySingleton lazySingleton = null;
    private LazySingleton(){

    }
    public synchronized static LazySingleton getInstance(){
        if(lazySingleton == null){
            lazySingleton =  new LazySingleton();
        }
        return lazySingleton;
    }
}
