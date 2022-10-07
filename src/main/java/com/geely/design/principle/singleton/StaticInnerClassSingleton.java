package com.geely.design.principle.singleton;

public class StaticInnerClassSingleton {
    //这个静态内部类其实也是看线程几拿到了Class锁，拿到锁之后去进行创建对象，所以不用担心多线程
    private static class InnerClass{
        private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }
    public static StaticInnerClassSingleton getInstance(){
        return InnerClass.staticInnerClassSingleton;
    }
    private StaticInnerClassSingleton(){

    }
}
