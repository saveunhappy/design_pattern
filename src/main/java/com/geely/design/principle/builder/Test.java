package com.geely.design.principle.builder;

import java.util.Set;

public class Test {
    public static void main(String[] args) {
        CourseBuilder courseBuilder = new CourseActualBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(courseBuilder);
        Course course = coach.makeCourse("设计模式", "PPT", "视屏", "文章", "问答");
        System.out.println(course);

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("1").append("2").append("3");
        System.out.println(stringBuilder);
    }
}
