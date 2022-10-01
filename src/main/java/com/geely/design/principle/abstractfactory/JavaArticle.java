package com.geely.design.principle.abstractfactory;

public class JavaArticle implements Article{
    @Override
    public void produce() {
        System.out.println("java手记");
    }
}
