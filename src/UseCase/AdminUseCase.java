package UseCase;

import java.util.List;
import java.util.Scanner;

import CustomColour.ConsoleColors;
import DaoClasses.DaoImplement;
import DaoClasses.DaoInterfaces;
import Model.Department;
import Model.Employee;
//import Model.Employee;
import Model.EmployeeLeave;

public class AdminUseCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(ConsoleColors.BLUE_BACKGROUND_BRIGHT +"* Welcome To Admin Portal *  ");
		System.out.println("   ");
		System.out.println(ConsoleColors.WHITE_UNDERLINED +"Please Enter Your Name");
		String adm_name = sc.next();

	   
		DaoInterfaces di = new DaoImplement();
		int admin_access = di.validateAdmin(adm_name);
		
	    
		if(admin_access == 123) {
			System.out.println(ConsoleColors.RED_BACKGROUND_BRIGHT +"Admin Name Not Found");
		}else if(admin_access == 345) {
			System.out.println(ConsoleColors.RED_BACKGROUND_BRIGHT +"Password Do Not Matched");
		}else {
			System.out.println(ConsoleColors.WHITE_BACKGROUND +"|*----------****-------------|");
			System.out.println(ConsoleColors.GREEN_BOLD+"|    welcome" + " " + adm_name);
			System.out.println(ConsoleColors.GREEN_BOLD+"|*----------****-------------|");
		
			System.out.println(" ");
		
		
	    System.out.println(ConsoleColors.WHITE_BACKGROUND +"-------------------------------------------|");
		System.out.println(ConsoleColors.GREEN_BOLD+"|| Please Choose Your Action :-            |");
		System.out.println(ConsoleColors.GREEN_BOLD+"-------------------------------------------|");
		System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT+ConsoleColors.BLACK_BOLD+"[ 1 ] Add Department                       |");
		System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT+ConsoleColors.BLACK_BOLD+"[ 2 ] View All Department                  |");
		System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT+ConsoleColors.BLACK_BOLD+"[ 3 ] Register New Employee                |");
		System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT+ConsoleColors.BLACK_BOLD+"[ 4 ] Transfer Employee To New Department  |");
		System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT+ConsoleColors.BLACK_BOLD+"[ 5 ] View All Leave Details               |");
		System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT+ConsoleColors.BLACK_BOLD+"[ 6 ] Update Leave Status                  |");
		System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT+ConsoleColors.BLACK_BOLD+"[ 7 ] Update Department                    |");
		System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT+ConsoleColors.BLACK_BOLD+"[ 8 ] View All Employee Details            |");
		System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT +"-------------------------------------------|"+ConsoleColors.RESET);
		System.out.println(" ");
		System.out.println(ConsoleColors.WHITE_UNDERLINED + "Please Enter Your Chouice..");
		int adminInput = sc.nextInt();
		String loop = "y";
	
		int count = 0;
	
		
		while(loop == "y") {
			
			if(count > 0) {
				System.out.println(ConsoleColors.WHITE_BACKGROUND +"-------------------------------------------|");
				System.out.println(ConsoleColors.GREEN_BOLD+"|| Please Choose Your Action :-            |");
				System.out.println(ConsoleColors.GREEN_BOLD+"-------------------------------------------|");
				System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT+ConsoleColors.BLACK_BOLD+"[ 1 ] Add Department                       |");
				System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT+ConsoleColors.BLACK_BOLD+"[ 2 ] View All Department                  |");
				System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT+ConsoleColors.BLACK_BOLD+"[ 3 ] Register New Employee                |");
				System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT+ConsoleColors.BLACK_BOLD+"[ 4 ] Transfer Employee To New Department  |");
				System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT+ConsoleColors.BLACK_BOLD+"[ 5 ] View All Leave Details               |");
				System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT+ConsoleColors.BLACK_BOLD+"[ 6 ] Update Leave Status                  |");
				System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT+ConsoleColors.BLACK_BOLD+"[ 7 ] Update Department                    |");
				System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT+ConsoleColors.BLACK_BOLD+"[ 8 ] View All Employee Details            |");
				System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT +"-------------------------------------------|"+ConsoleColors.RESET);
				System.out.println(" ");
				System.out.println(ConsoleColors.WHITE_UNDERLINED+"Please Enter Your Chouice..");
				adminInput = sc.nextInt();
			}
		switch(adminInput) {
		case 1:
		  {
			  
			  //////////////// Add New Department /////////////
			  
		
			   String res = di.addNewDept();
		

				System.out.println(ConsoleColors.WHITE_BACKGROUND +"|---------------------------------------------------------|");
				System.out.println(ConsoleColors.GREEN_BOLD+"|"             +res+                                     "|");
				System.out.println(ConsoleColors.GREEN_BOLD+"|---------------------------------------------------------|");
				 System.out.println(ConsoleColors.WHITE_BACKGROUND +"|-----------------------------------|");
				  System.out.println(ConsoleColors.YELLOW_BACKGROUND_BRIGHT +ConsoleColors.RED_BOLD +"Enter [ 0 ] to return Main Menu     |");
				  System.out.println(ConsoleColors.YELLOW_BACKGROUND_BRIGHT +ConsoleColors.RED_BOLD +"Enter [ 1 ] to Exit                   |");
				  System.out.println(ConsoleColors.WHITE_BACKGROUND +"|-----------------------------------|");	
				int loopValue = sc.nextInt();
				if(loopValue == 0) {
					loop = "y";
				}else {
					loop = "n";
					System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT+ConsoleColors.GREEN_BOLD+"---------Logging Out-----------");
					System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT+ConsoleColors.GREEN_BOLD+"<-----Application Closed------>");
					System.out.println("  ");
				}
				
		   }
		   break;
		 case 2:
		     {
		    	  
				 //<-------------View All Department ------>//
		    	 
				  List<Department> dept = di.viewDept();
				  
				  if(dept.size() == 0) {
					  System.out.println(ConsoleColors.BLACK_BOLD +"No Deparment Exist" +'\n'
					  		+ConsoleColors.BLACK_BOLD +"Choose 1 From Menu To Create New Department");
				  }else {
					  System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT +ConsoleColors.BLACK_BOLD+ "    ::Department Details ::   ");
					  dept.forEach(d -> System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT +ConsoleColors.BLACK_BOLD +  d));
				  }
		 		
				  System.out.println(ConsoleColors.WHITE_BACKGROUND +"|-----------------------------------|");
				  System.out.println(ConsoleColors.YELLOW_BACKGROUND_BRIGHT +ConsoleColors.RED_BOLD +"Enter [ 0 ] to return Main Menu     |");
				  System.out.println(ConsoleColors.YELLOW_BACKGROUND_BRIGHT +ConsoleColors.RED_BOLD +"Enter [ 1 ] to Exit                   |");
				  System.out.println(ConsoleColors.WHITE_BACKGROUND +"|-----------------------------------|");	
		 		
		 		int loopValue = sc.nextInt();
				if(loopValue == 0) {
					loop = "y";
				}else {
					loop = "n";
					System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT+ConsoleColors.GREEN_BOLD+"---------Logging Out-----------");
					System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT+ConsoleColors.GREEN_BOLD+"<-----Application Closed------>");
					System.out.println("  ");
				}
	     	 }
	 	   break;
		 case 3:
		     {
		    	 
		    	 //<-------------Register New Employee  ------>//
		    	 
		        System.out.println(ConsoleColors.WHITE_UNDERLINED +"Enter Employee name");
			    String name = sc.next();
			   	  
			    System.out.println(ConsoleColors.WHITE_UNDERLINED + "Create password");
			   	String pass = sc.next();
			   	 
			    String res = di.regEmployee(name, pass);
			    System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT +ConsoleColors.BLACK_BOLD + res);
		 		
			    System.out.println(ConsoleColors.WHITE_BACKGROUND +"|-----------------------------------|");
				  System.out.println(ConsoleColors.YELLOW_BACKGROUND_BRIGHT +ConsoleColors.RED_BOLD +"Enter [ 0 ] to return Main Menu     |");
				  System.out.println(ConsoleColors.YELLOW_BACKGROUND_BRIGHT +ConsoleColors.RED_BOLD +"Enter [ 1 ] to Exit                   |");
				  System.out.println(ConsoleColors.WHITE_BACKGROUND +"|-----------------------------------|");	
				
		 		int loopValue = sc.nextInt();
				if(loopValue == 0) {
					loop = "y";
				}else {
					loop = "n";
					System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT+ConsoleColors.GREEN_BOLD+"---------Logging Out-----------");
					System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT+ConsoleColors.GREEN_BOLD+"<-----Application Closed------>");
					System.out.println("  ");
				}
		     }
			 break;
		 case 4:
		      {
		      
				  
//<----------------Transfer Employee Another Department ----------------->//
				  
				  
				  System.out.println(ConsoleColors.WHITE_UNDERLINED + "Enter Employee Id");
				  int emp_id = sc.nextInt();
				  
				  
				  System.out.println(ConsoleColors.WHITE_UNDERLINED + "Enter  Department Id");
				  int dept_id = sc.nextInt();
				  
				  
				
				  String msg =  di.transferDept(emp_id, dept_id);
				  System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT +ConsoleColors.BLACK_BOLD + msg);
				  
				  System.out.println(ConsoleColors.WHITE_BACKGROUND +"|-----------------------------------|");
				  System.out.println(ConsoleColors.YELLOW_BACKGROUND_BRIGHT +ConsoleColors.RED_BOLD +"Enter [ 0 ] to return Main Menu     |");
				  System.out.println(ConsoleColors.YELLOW_BACKGROUND_BRIGHT +ConsoleColors.RED_BOLD +"Enter [ 1 ] to Exit                   |");
				  System.out.println(ConsoleColors.WHITE_BACKGROUND +"|-----------------------------------|");	
					
				  int loopValue = sc.nextInt();
					if(loopValue == 0) {
						loop = "y";
					}else {
						loop = "n";
						System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT+ConsoleColors.GREEN_BOLD+"---------Logging Out-----------");
						System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT+ConsoleColors.GREEN_BOLD+"<-----Application Closed------>");
						System.out.println("  ");
					}
		      }
			 break;
			 
		 case 5:
	      {
	      
			  

	    	//<----------------View All  Leaves ----------------->//
			  
			  
		
			  List<EmployeeLeave> empLeave =  di.viewEmpLeave();
			  if(empLeave.size() == 0) {
				  System.out.println(ConsoleColors.BLACK_BOLD +"No One Has Applied For Leave ");
			  }else {
				  empLeave.forEach(d -> System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT +ConsoleColors.BLACK_BOLD + d));
			  }
		
			  
			  System.out.println(ConsoleColors.WHITE_BACKGROUND +"|-----------------------------------|");
			  System.out.println(ConsoleColors.YELLOW_BACKGROUND_BRIGHT +ConsoleColors.RED_BOLD +"Enter [ 0 ] to return Main Menu     |");
			  System.out.println(ConsoleColors.YELLOW_BACKGROUND_BRIGHT +ConsoleColors.RED_BOLD +"Enter [ 1 ] to Exit                   |");
			  System.out.println(ConsoleColors.WHITE_BACKGROUND +"|-----------------------------------|");
				
			  int loopValue = sc.nextInt();
				if(loopValue == 0) {
					loop = "y";
				}else {
					loop = "n";
					System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT+ConsoleColors.GREEN_BOLD+"---------Logging Out-----------");
					System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT+ConsoleColors.GREEN_BOLD+"<-----Application Closed------>");
					System.out.println("  ");
				}
	      }
		 break;
		 case 6:
	      {
		    	//<----------------Update   Leaves Status ----------------->//
			  
			  System.out.println(ConsoleColors.WHITE_UNDERLINED + "Enter Employee Id");
			  int emp_id = sc.nextInt();
			  
			  System.out.println(ConsoleColors.WHITE_UNDERLINED + "Update Leave status" +"\n"+ "Type [ Deny ] or [ Grant ]");
			  String status = sc.next();
			  
			  String res =  di.leavePermit(emp_id, status);
			  System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT +ConsoleColors.BLACK_BOLD + res);
		
			  
			  System.out.println(ConsoleColors.WHITE_BACKGROUND +"|-----------------------------------|");
			  System.out.println(ConsoleColors.YELLOW_BACKGROUND_BRIGHT +ConsoleColors.RED_BOLD +"Enter [ 0 ] to return Main Menu     |");
			  System.out.println(ConsoleColors.YELLOW_BACKGROUND_BRIGHT +ConsoleColors.RED_BOLD +"Enter [ 1 ] to Exit                   |");
			  System.out.println(ConsoleColors.WHITE_BACKGROUND +"|-----------------------------------|");	
				
			  int loopValue = sc.nextInt();
				if(loopValue == 0) {
					loop = "y";
				}else {
					loop = "n";
					System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT+ConsoleColors.GREEN_BOLD+"---------Logging Out-----------");
					System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT+ConsoleColors.GREEN_BOLD+"<-----Application Closed------>");
					System.out.println("  ");;
				}
	      }
		 break;
		 case 7:
	      {
			  
			  System.out.println(ConsoleColors.WHITE_UNDERLINED + "Enter The DepartmentID");
			  int dept_id = sc.nextInt();
			 
			  String msg =  di.updateDept( dept_id);
			  System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT +ConsoleColors.BLACK_BOLD + msg);
		
			  
			  System.out.println(ConsoleColors.WHITE_BACKGROUND +"|-----------------------------------|");
			  System.out.println(ConsoleColors.YELLOW_BACKGROUND_BRIGHT +ConsoleColors.RED_BOLD +"Enter [ 0 ] to return Main Menu     |");
			  System.out.println(ConsoleColors.YELLOW_BACKGROUND_BRIGHT +ConsoleColors.RED_BOLD +"Enter [ 1 ] to Exit                   |");
			  System.out.println(ConsoleColors.WHITE_BACKGROUND +"|-----------------------------------|");	
			  int loopValue = sc.nextInt();
				if(loopValue == 0) {
					loop = "y";
				}else {
					loop = "n";
					System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT+ConsoleColors.GREEN_BOLD+"---------Logging Out-----------");
					System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT+ConsoleColors.GREEN_BOLD+"<-----Application Closed------>");
					System.out.println("  ");
				}
	      }
		 break;
		 case 8:
		     {
		    	 //<-------------View All Employee ------>//
		    	 
				  List<Employee> empList = di.getAllEmp();
				  
				  if(empList.size() == 0) {
					  System.out.println(ConsoleColors.BLACK_BOLD + "No Employee Exist" +'\n'
					  		+ConsoleColors.BLACK_BOLD + "Choose 3 From Menu To Register New Employee");
				  }else {
					  System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT +ConsoleColors.BLACK_BOLD +"    ::Employee Details ::   ");
					  empList.forEach(d -> System.out.println( ConsoleColors.WHITE_BACKGROUND_BRIGHT +ConsoleColors.BLACK_BOLD + d));
				  }
		 		
				  System.out.println(ConsoleColors.WHITE_BACKGROUND +"|-----------------------------------|");
				  System.out.println(ConsoleColors.YELLOW_BACKGROUND_BRIGHT +ConsoleColors.RED_BOLD +"Enter [ 0 ] to return Main Menu     |");
				  System.out.println(ConsoleColors.YELLOW_BACKGROUND_BRIGHT +ConsoleColors.RED_BOLD +"Enter [ 1 ] to Exit                   |");
				  System.out.println(ConsoleColors.WHITE_BACKGROUND +"|-----------------------------------|");	
		 		
		 		int loopValue = sc.nextInt();
				if(loopValue == 0) {
					loop = "y";
				}else {
					loop = "n";
					System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT+ConsoleColors.GREEN_BOLD+"---------Logging Out-----------");
					System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT+ConsoleColors.GREEN_BOLD+"<-----Application Closed------>");
					System.out.println("  ");
				}
		     }
			 break;
			default :
				   System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT+ConsoleColors.RED_BOLD+"|---------------------|");
				   System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT+ConsoleColors.RED_BOLD+"|    Incorrect Option.|");
				   System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT+ConsoleColors.RED_BOLD+"|    Enter Again......|");
				   System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT+ConsoleColors.RED_BOLD+"|---------------------|");
			   break;
		}
		count++;
		}
	}
		sc.close();

	}

}
