package com.analysisgroup.analysis.model;

public class Cashier extends Account{

    @Override
    public void signIn() {
        System.out.println("Cashier::signIn() method.");
    }
    
}
