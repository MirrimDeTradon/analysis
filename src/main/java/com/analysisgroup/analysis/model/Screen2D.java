package com.analysisgroup.analysis.model;

public class Screen2D implements ScreenType {
    public void printType(){
        System.out.println("This screen is 2D");
    }
    public String getType(){
        return "2D";
    }
}
