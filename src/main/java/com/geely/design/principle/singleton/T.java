package com.geely.design.principle.singleton;

public class T implements Runnable{
    @Override
    public void run() {
//        LazySingleton instance = LazySingleton.getInstance();
//        StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();
        ContainerSingleton.putInstance("object",new Object());
        Object instance = ContainerSingleton.getInstance("object");
        System.out.println(Thread.currentThread().getName()+"  " + instance);
    }
}
