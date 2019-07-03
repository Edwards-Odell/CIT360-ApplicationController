package edu.oedwards.test;

import java.util.HashMap;


class FrontControllerPattern 
{ 
    public static void main(String[] args)  
    { 

//Map<String, String> userRequestMapping = new HashMap<>();

    	//userRequestMapping.put("Student","studentView"):
    	//userRequestMapping.put("Teacher","teacherView"); 
        FrontController frontController = new FrontController(); 
        
        promptForEnter("press enter to run teacher test");
        frontController.dispatchRequest("Teacher"); 
        
        promptForEnter("press enter to run student test");
        frontController.dispatchRequest("Student"); 
        
        
    }
    public static void promptForEnter(String message){
        System.out.println(message);
        try {
            int readKey = System.in.read(new byte[2]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

} 