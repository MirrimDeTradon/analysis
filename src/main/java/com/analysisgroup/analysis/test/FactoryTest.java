package com.analysisgroup.analysis.test;
import com.analysisgroup.analysis.model.*;
import com.analysisgroup.analysis.controller.*;
import com.analysisgroup.analysis.service.*;
import com.analysisgroup.analysis.view.*;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class FactoryTest {
    public FactoryTest(){
		ProfileFactory profileFactory = new ProfileFactory();

      	//get an object of Client and call its signIn method.
      	Profile profile1 = profileFactory.getProfile("CLIENT");

      	//call signIn method of Client
      	profile1.signIn();

      	//get an object of Account and call its signIn method.
      	Profile profile2 = profileFactory.getProfile("MANAGER");
		

      	//call signIN method of Account
      	profile2.signIn();

		Profile profile3 = profileFactory.getProfile("CASHIER");

		profile3.signIn();
    }
}
