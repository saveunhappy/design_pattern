package com.geely.design.principle.dependenceinversion;

public class Geely {
    public void studyCourse(ICourse course){
        course.studyCourse();
    }
}
