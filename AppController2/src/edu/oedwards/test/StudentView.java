package edu.oedwards.test;

class StudentView implements DoListCommand 
{ 
	
	@Override
    public void doCommand() 
    { 
        System.out.println("Student View"); 
    } 
} 