package UseCase;

import java.util.List;
import java.util.Scanner;

import DaoClasses.DaoImplement;
import DaoClasses.DaoInterfaces;
import Model.Department;
import Model.Employee;
import Model.EmployeeLeave;

public class AdminUseCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose Your Action :- ");
		System.out.println("===========================================");
		System.out.println("Type ( 1 ) Add Department");
		System.out.println("Type ( 2 ) View All Department");
		System.out.println("Type ( 3 ) Register New Employee");
		System.out.println("Type ( 4 ) Transfer Employee To New Department");
		System.out.println("Type ( 5 ) View All Leave Details");
		System.out.println("Type ( 6 ) Update Leave Status");
		System.out.println("Type ( 7 ) Update Department");
		
		System.out.println("===========================================");
		System.out.println(" ");
		int adminInput = sc.nextInt();
		String loop = "y";
	
		int count = 0;
	
		DaoInterfaces di = new DaoImplement();
		while(loop == "y") {
			
			if(count > 0) {
				System.out.println("Choose Your Action :- ");
				System.out.println("===========================================");
				System.out.println("Type ( 1 ) Add Department");
				System.out.println("Type ( 2 ) View All Department");
				System.out.println("Type ( 3 ) Register New Employee");
				System.out.println("Type ( 4 ) Transfer Employee To New Department");
				System.out.println("Type ( 5 ) View All Leave Details");
				System.out.println("Type ( 6 ) Update Leave Status");
				System.out.println("Type ( 7 ) Update Department");
				System.out.println("===========================================");
				System.out.println(" ");
				adminInput = sc.nextInt();
			}
		switch(adminInput) {
		case 1:
		  {
			  System.out.println("Enter Admin name");
			  String name = sc.next();
			  
			  System.out.println("Enter Admin password");
			  String pass = sc.next();
			  
			  System.out.println("Enter Detarment ID");
			  int dept_id  = sc.nextInt();
			  
			  System.out.println("Enter Department  Name");
			  String dept_name = sc.next();
			  
			  
			 
			  

			  String res = di.addNewDept(name, pass, dept_id, dept_name);
		

				System.out.println("=================================");
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
		 case 2:
		     {
		    	  System.out.println("Enter Admin name");
				  String name = sc.next();
				  
				  System.out.println("Enter Admin password");
				  String pass = sc.next();
				 
				  
				 
				  List<Department> dept = di.viewDept(name, pass);
				  
				  if(dept.size() == 0) {
					  System.out.println("Credentials Mismatch");
				  }else {
					  dept.forEach(d -> System.out.println(d));
				  }
		 		
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
		        System.out.println("Enter Employee name");
			    String name = sc.next();
			   	  
			    System.out.println("Create password");
			   	String pass = sc.next();
			   	 
			    String res = di.regEmployee(name, pass);
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
		      
				  
		    	  
				  System.out.println("Enter Admin name");
				  String name = sc.next();
				  
				  
				  System.out.println("Enter Admin password");
				  String pass = sc.next();
				  
				  
				  System.out.println("Enter Employee Id");
				  int emp_id = sc.nextInt();
				  
				  
				  System.out.println("Enter  Department Id");
				  int dept_id = sc.nextInt();
				  
				  
				
				  String msg =  di.transferDept(name, pass, emp_id, dept_id);
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
	      
			  

			  System.out.println("Enter Admin Name");
			  String admin_name = sc.next();
			  
			  System.out.println("Enter Admin Password");
			  String pass = sc.next();
			  
			  
		
			  List<EmployeeLeave> empLeave =  di.viewEmpLeave(admin_name, pass);
			  empLeave.forEach(emp -> System.out.println(emp));
		
			  
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
		 case 6:
	      {
	      
			  
	    	  
			  System.out.println("Enter Admin Name");
			  String admin_name = sc.next();
			  
			  System.out.println("Enter Admin Password");
			  String pass = sc.next();
			  
			  System.out.println("Enter Employee Id");
			  int emp_id = sc.nextInt();
			  
			  System.out.println("Update Leave status" +"\n"+ "Type (Deny) or (Grant)");
			  String status = sc.next();
			  
			  String res =  di.leavePermit(admin_name, pass, emp_id, status);
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
		 case 7:
	      {
	      
			  
	    	  
	    	  System.out.println("Enter Admin name");
			  String name = sc.next();
			  
			  System.out.println("Enter Admin password");
			  String pass = sc.next();
			  
			  System.out.println("Enter New Department Name");
			  String newDept = sc.next();
			  
			  System.out.println("Enter The DepartmentID");
			  int dept_id = sc.nextInt();
			 
			  String msg =  di.updateDept(name, pass, newDept, dept_id);
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
