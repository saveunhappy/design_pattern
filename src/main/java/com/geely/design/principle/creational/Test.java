package com.geely.design.principle.creational;

public class Test {
    public static void main(String[] args) {
        VideoFactory javaVideoFactory = new JavaVideoFactory();
        VideoFactory pythonFactory = new PythonFactory();
        Video javaVideoFactoryVideo = javaVideoFactory.getVideo();
        Video pythonFactoryVideo = pythonFactory.getVideo();
        javaVideoFactoryVideo.produce();
        pythonFactoryVideo.produce();

    }
}
