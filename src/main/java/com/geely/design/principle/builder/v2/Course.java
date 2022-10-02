package com.geely.design.principle.builder.v2;

public class Course {
    private String courseName;

    private String coursePPT;

    private String courseVideo;

    private String courseArticle;

    private String courseQA;

    public Course(CourseBuilder builder) {
        this.courseName = builder.courseName;
        this.coursePPT = builder.coursePPT;
        this.courseVideo = builder.courseVideo;
        this.courseArticle = builder.courseArticle;
        this.courseQA = builder.courseQA;
    }

    public static class CourseBuilder {
        private String courseName;

        private String coursePPT;

        private String courseVideo;

        private String courseArticle;

        private String courseQA;


        public CourseBuilder buildCourseName(String courseName){
            this.courseName = courseName;
            return this;
        }
        public CourseBuilder buildCoursePPT(String coursePPT){
            this.coursePPT = coursePPT;
            return this;
        }
        public CourseBuilder buildCourseVideo(String courseVideo){
            this.courseVideo = courseVideo;
            return this;
        }
        public CourseBuilder buildCourseArticle(String courseArticle){
            this.courseArticle = courseArticle;
            return this;
        }
        public CourseBuilder buildCourseQA(String courseQA){
            this.courseQA = courseQA;
            return this;
        }

        public Course build(){
            return new Course(this);
        }

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Course{");
        sb.append("courseName='").append(courseName).append('\'');
        sb.append(", coursePPT='").append(coursePPT).append('\'');
        sb.append(", courseVideo='").append(courseVideo).append('\'');
        sb.append(", courseArticle='").append(courseArticle).append('\'');
        sb.append(", courseQA='").append(courseQA).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
