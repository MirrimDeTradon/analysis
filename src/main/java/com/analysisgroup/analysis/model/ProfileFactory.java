package com.analysisgroup.analysis.model;

public class ProfileFactory {
	public ProfileFactory(){
    }
    //use getShape method to get object of type shape 
    public Profile getProfile(String profileType){
       if(profileType == null){
          return null;
       }		
       if(profileType.equalsIgnoreCase("CLIENT")){
          return new Client();
       } else if(profileType.equalsIgnoreCase("MANAGER")){
          return new Manager();
       
       } else if(profileType.equalsIgnoreCase("CASHIER")){
          return new Cashier();
       }
       return null;
    }
}