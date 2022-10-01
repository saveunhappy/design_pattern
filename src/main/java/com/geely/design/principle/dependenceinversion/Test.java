package com.geely.design.principle.dependenceinversion;

public class Test {
    public static void main(String[] args) {
        Geely geely = new Geely();
        geely.studyCourse(new JavaCourse());
        geely.studyCourse(new FECourse());
    }
}
