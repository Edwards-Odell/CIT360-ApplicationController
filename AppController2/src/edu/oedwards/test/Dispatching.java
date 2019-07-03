package edu.oedwards.test;

import java.util.HashMap;

import javax.swing.text.View;

public class Dispatching {
	
	public static HashMap<String, DoListCommand>request = new HashMap<>();
		
	public Object dispatch(String selection) {
		request.put("Student", new StudentView());
		request.put("Teacher", new TeacherView());
		//return request.get(selection);
		 DoListCommand command2 = request.get(selection);
	    //This is the application controller launching the appropriate command.
	        command2.doCommand();
	        return "Finish";

	}
	
	
}
