package com.geely.design.principle.abstractfactory;

public class PythonArticle implements Article{
    @Override
    public void produce() {
        System.out.println("pythons手记");

    }
}
