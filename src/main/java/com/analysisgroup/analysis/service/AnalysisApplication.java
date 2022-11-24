package com.analysisgroup.analysis.service;
import com.analysisgroup.analysis.model.*;
import com.analysisgroup.analysis.view.*;
import com.analysisgroup.analysis.test.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AnalysisApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnalysisApplication.class, args);
		ObserverTest observerTest = new ObserverTest();
		FactoryTest factoryTest = new FactoryTest();
		DecoratorTest decoratorTest = new DecoratorTest();
		StateTest stateTest = new StateTest();
	}
}