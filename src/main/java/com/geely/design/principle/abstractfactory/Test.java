package com.geely.design.principle.abstractfactory;

public class Test {
    public static void main(String[] args) {
        CourseFactory javaCourseFactory = new JavaCourseFactory();
        Article article = javaCourseFactory.getArticle();
        Video video = javaCourseFactory.getVideo();
        article.produce();
        video.produce();
    }
}
