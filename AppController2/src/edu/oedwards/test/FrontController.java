package edu.oedwards.test;

import javax.swing.text.View;

class FrontController  
{ 
    private Dispatching Dispatching; 
  
    public FrontController() 
    { 
        Dispatching = new Dispatching(); 
    } 
  
    private boolean isAuthenticUser() 
    { 
        System.out.println("Authentication successful."); 
        return true; 
    } 
  
    private void trackRequest(String request) 
    { 
        System.out.println("Requested View: " + request); 
    } 
  
    public void dispatchRequest(String request) 
    { 
        trackRequest(request); 
        
        if(isAuthenticUser()) 
        { 
     //       Object view1 = Dispatching.dispatch(request); 
    //        view1.showView();
        	 Dispatching handler = new Dispatching();
        	 //handler.dispatch(request);
        	 Object s= handler.dispatch(request);
        	 System.out.println("returned " + s);
        	 
        	 
          
            
        }     
    } 

   }

 
