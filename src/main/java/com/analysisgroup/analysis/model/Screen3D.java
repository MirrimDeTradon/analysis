package com.analysisgroup.analysis.model;

public class Screen3D implements ScreenType {
    public void printType(){
        System.out.println("This screen is 3D");
    }
    public String getType(){
        return "3D";
    }
}
