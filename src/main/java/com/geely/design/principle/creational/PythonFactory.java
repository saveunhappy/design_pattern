package com.geely.design.principle.creational;

public class PythonFactory extends VideoFactory{
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
