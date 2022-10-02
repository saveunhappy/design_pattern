package com.geely.design.principle.builder.v2;

public class Test {
    public static void main(String[] args) {
        Course course = new Course.CourseBuilder().buildCourseName("设计模式1")
                .buildCourseArticle("文章1").buildCoursePPT("PPT1").buildCourseQA("问答1").buildCourseVideo("video1").build();
        System.out.println(course);
    }
}
