package com.geely.design.principle.openclose;

public class Test1 {
    public static void main(String[] args) {
        ICourse course = new JavaDiscountCourse(96,"java",348d);
        JavaDiscountCourse javaDiscountCourse = (JavaDiscountCourse) course;
        System.out.println("原始价格" + javaDiscountCourse.getOriginalPrice());
        System.out.println("课程id" + course.getId() + "课程名称" + course.getName() + "课程价格" +course.getPrice());
    }
}
