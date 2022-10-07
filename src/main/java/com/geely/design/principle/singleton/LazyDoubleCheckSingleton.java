package com.geely.design.principle.singleton;

public class LazyDoubleCheckSingleton {
    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;
    private LazyDoubleCheckSingleton(){

    }
    public synchronized static LazyDoubleCheckSingleton getInstance(){
        if(lazyDoubleCheckSingleton == null){
            synchronized (LazyDoubleCheckSingleton.class){
                if(lazyDoubleCheckSingleton == null){
                    lazyDoubleCheckSingleton =  new LazyDoubleCheckSingleton();
                    //1.分配内存给这个对象
                    //3.设置lazyDoubleCheckSingleton指向刚创建的对象
                    //2.初始化对象
                    //这个顺序是有可能变化的，所以要在这个对象上加上volatile禁止指令重排序
                    //在单线程中，允许重排序，因为效率可能会更高，但是多线程可能会有问题，
                    /**
                     * 第一次进入if，多线程，挡不住，所以都到 synchronized (LazyDoubleCheckSingleton.class)
                     * 这一层了，然后这里是只有一个线程能进去，但是，后边那个还等着呢，如果没有第二次判空，那不和
                     * 第一次懒汉式一样了么，所以要双重检查，而且synchronized没有锁住所有的代码，如果锁住所有的
                     * 那么就和在方法上加synchronize一样了，如果是静态的，那么就和加在类上一样了，所以。这样很好。
                     */
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }
}
