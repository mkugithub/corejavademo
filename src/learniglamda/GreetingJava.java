package learniglamda;

import learniglamda.Java8Tester.GreetingService;

public class GreetingJava {

	   final static String salutation = "Hello! ";	
	public static void main(String args[]){
	      GreetingService greetService1 = message -> 
	      System.out.println(salutation + message);
	      greetService1.sayMessage("Mahesh");
	   }	
		
			

	}

	/*@Override
	public void sayMessage(String message) {
		// TODO Auto-generated method stub	
		
	}*/


