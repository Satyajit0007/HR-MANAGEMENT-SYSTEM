package UseCase;

import java.util.Scanner;

import DaoClasses.DaoImplement;
import DaoClasses.DaoInterfaces;
import Model.Employee;
import Model.EmployeeLeave;

public class EmployeeUseCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose Your Action :- ");
		System.out.println("===========================================");
		System.out.println("Type ( 1 ) for View Employee Profile");
		System.out.println("Type ( 2 ) for Update Your Password");
		System.out.println("Type ( 3 ) for Update Your Name");
		System.out.println("Type ( 4 ) for Apply Leave");
		System.out.println("Type ( 5 ) for Your Leave Status");
		
		System.out.println("===========================================");
		System.out.println(" ");
		int userInput = sc.nextInt();
		String loop = "y";
	
		int count = 0;
	
		DaoInterfaces di = new DaoImplement();
		while(loop == "y") {
			
			if(count > 0) {
				System.out.println("Choose Your Action :- ");
				System.out.println("===========================================");

				System.out.println("Type ( 1 ) for View Employee Profile");
				System.out.println("Type ( 2 ) for Update Your Password");
				System.out.println("Type ( 3 ) for Update Your Name");
				System.out.println("Type ( 4 ) for Apply Leave");
				System.out.println("Type ( 5 ) for Your Leave Status");
				System.out.println("===========================================");
				System.out.println(" ");
				userInput = sc.nextInt();
			}
		switch(userInput) {
//		case 1:
//		   {
//			      System.out.println("Enter Employee name");
//				  String name = sc.next();
//				  
//				  System.out.println("Create password");
//				  String pass = sc.next();
//
//				  String res = di.regEmployee(name, pass);
//				  System.out.println(res);
//		   }
//		   break; 
		case 1:
		  {
			    System.out.println("Enter Your Name");
				String name = sc.next();
				
				System.out.println("Enter Your Passsword");
				String pass = sc.next();
			
				Employee emp  = di.viewEmployee(name, pass);
				System.out.println("=================================");
				System.out.println(emp);
				System.out.println("=================================");
				System.out.println("Enter ( 0 ) to return Main Menu");
				System.out.println("Enter ( 1 ) to Exit");
				int loopValue = sc.nextInt();
				if(loopValue == 0) {
					loop = "y";
				}else {
					loop = "n";
					System.out.println("Application Closed");
					System.out.println("=================================");
				}
				
		   }
		   break;
		 case 2:
		     {
		    	System.out.println("Enter Your Name");
		 		String name = sc.next();
		 		
		 		System.out.println("Enter Your Passsword");
		 		String pass = sc.next();
		 		
		 		System.out.println("Update new Password");
		 		String newPass = sc.next();
		 		
		 		String res  = di.updateEmpPass(name, pass, newPass);
		 		System.out.println(res);
		 		
		 		System.out.println("=================================");
				System.out.println("Enter ( 0 ) to return Main Menu");
				System.out.println("Enter ( 1 ) to Exit");
		 		
		 		int loopValue = sc.nextInt();
				if(loopValue == 0) {
					loop = "y";
				}else {
					loop = "n";
					System.out.println("Application Closed");
					System.out.println("=================================");
				}
	     	 }
	 	   break;
		 case 3:
		     {
		    	System.out.println("Enter Your Name");
		 		String name = sc.next();
		 		
		 		System.out.println("Enter Your Passsword");
		 		String pass = sc.next();
		 		
		 		System.out.println("Update new Name");
		 		String newName = sc.next();
		 		
		 		String res  = di.updateEmpName(name, pass, newName);
		 		System.out.println(res);
		 		
		 		System.out.println("=================================");
				System.out.println("Enter ( 0 ) to return Main Menu");
				System.out.println("Enter ( 1 ) to Exit");
				
		 		int loopValue = sc.nextInt();
				if(loopValue == 0) {
					loop = "y";
				}else {
					loop = "n";
					System.out.println("Application Closed");
					System.out.println("=================================");
				}
		     }
			 break;
		 case 4:
		      {
		      
				  
				  System.out.println("Enter Employee Id");
				  int emp_id = sc.nextInt();
				  
				  System.out.println("Enter Employee Password");
				  String pass = sc.next();
				  
				  System.out.println("Enter Number Of Days For Leave");
				  String leave_day = sc.next();
		
				  String msg =  di.leaveApply(emp_id, pass, leave_day);
				  System.out.println(msg);
				  
				  System.out.println("=================================");
				  System.out.println("Enter ( 0 ) to return Main Menu");
				  System.out.println("Enter ( 1 ) to Exit");
					
				  int loopValue = sc.nextInt();
					if(loopValue == 0) {
						loop = "y";
					}else {
						loop = "n";
						System.out.println("Application Closed");
						System.out.println("=================================");
					}
		      }
			 break;
		 case 5:
		     { 
		    	  System.out.println("Enter Employee Id");
				  int emp_id = sc.nextInt();
				  
				  System.out.println("Enter Employee Password");
				  String pass = sc.next();
				  
				  EmployeeLeave empLeave = di.getLeaveStatusById(emp_id, pass);
				  System.out.println(empLeave);
				  
				  System.out.println("=================================");
				  System.out.println("Enter ( 0 ) to return Main Menu");
				  System.out.println("Enter ( 1 ) to Exit");
					
				  int loopValue = sc.nextInt();
					if(loopValue == 0) {
						loop = "y";
					}else {
						loop = "n";
						System.out.println("Application Closed");
						System.out.println("=================================");
					}
				  
		     }
			 break;
			default :
			   System.out.println("=================================");
			   System.out.println("Incorrect Option");
			   System.out.println("Enter Again.......");
			   System.out.println("=================================");
			   break;
		}
		count++;
		}
		sc.close();

	}

}

