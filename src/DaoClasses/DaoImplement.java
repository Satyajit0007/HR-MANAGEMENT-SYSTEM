package DaoClasses;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.Department;
import Model.Employee;
import Model.EmployeeLeave;


public class DaoImplement implements DaoInterfaces{

	@Override
	public String regEmployee(String name, String pass) {
	
		String msg = "Insertion Unsuccessful...";
		
		
		try(Connection con = DaoConnection.provideConnection()){
			
			PreparedStatement ps = con.prepareStatement("insert into Employee(emp_name,emp_pass) value(?,?)");
			ps.setString(1, name);
			ps.setString(2,pass);
			
			
			
			int x = ps.executeUpdate();
			if(x>0) 
				msg = "Insertion Successful....";
			
			
		}catch(SQLException e) {
			 e.printStackTrace();
		}
		
		
		
		return msg;
	}

	@Override
	public String updateEmpName(String name, String pass, String setName) {
		String msg = "Name Changed Unsuccessful...";
		
		
		try(Connection con = DaoConnection.provideConnection()){
			
			PreparedStatement ps = con.prepareStatement("select * from Employee where emp_name = ? and emp_pass = ?");
			ps.setString(1, name);
			ps.setString(2,pass);
			
			
			
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				PreparedStatement ps1 = con.prepareStatement("update Employee set emp_name = ? where emp_pass = ?");
				ps1.setString(1, setName);
				ps1.setString(2, pass);
				
				int x1  = ps1.executeUpdate();
				if(x1 > 0)
					msg = "Name Changed Successfully";	
			}
			
			
			
		}catch(SQLException e) {
			 e.printStackTrace();
		}
		
		
		
		return msg;
	}

	@Override
	public String updateEmpPass(String name, String pass, String setPass) {
	String msg = "Password Changed Unsuccessful...";
		
		
		try(Connection con = DaoConnection.provideConnection()){
			
			PreparedStatement ps = con.prepareStatement("select * from Employee where emp_name = ? and emp_pass = ?");
			ps.setString(1, name);
			ps.setString(2,pass);
			
			
			
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				PreparedStatement ps1 = con.prepareStatement("update Employee set emp_pass = ? where emp_pass = ?");
				ps1.setString(1, setPass);
				ps1.setString(2, pass);
				
				int x1  = ps1.executeUpdate();
				if(x1 > 0)
					msg = "Password Changed Successfully";	
			}
			
			
			
		}catch(SQLException e) {
			 e.printStackTrace();
		}
		
		
		
		return msg;
	}



	@Override
	public Employee viewEmployee(String name, String pass) {

		Employee  emp = null;
		
		
		try(Connection con = DaoConnection.provideConnection()){
			
			PreparedStatement ps = con.prepareStatement("select * from Employee where  emp_pass = ?");
			ps.setString(1,pass);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
			emp = new Employee( rs.getString("emp_name"),rs.getString("emp_pass"), rs.getInt("emp_id"), rs.getInt("emp_dept_id"));
			
			}
			
		}catch(SQLException e) {
			 e.printStackTrace();
		}
		
		
		
		return emp;
	}

	@Override
	public String addNewDept(String name, String pass,int dept_id, String dept_name) {
String msg = "Department Insertion Unsuccessful...";
		
		
		try(Connection con = DaoConnection.provideConnection()){
			
			PreparedStatement ps = con.prepareStatement("select * from Admin where admin_name = ? and admin_pass = ?");
			ps.setString(1, name);
			ps.setString(2,pass);
			
			
			
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				PreparedStatement ps1 = con.prepareStatement("insert into Department values(?,?)");
				ps1.setInt(1, dept_id);
				ps1.setString(2, dept_name);
				
				int x1  = ps1.executeUpdate();
				if(x1 > 0)
					msg = "Department inserted Successfully...";	
			}
			
			
			
		}catch(SQLException e) {
			 e.printStackTrace();
		}
		
		
		
		return msg;

	}

	@Override
	public List<Department>  viewDept(String name, String pass ) {
        List<Department> dept = new ArrayList<>();
		
		
		try(Connection con = DaoConnection.provideConnection()){
			
			PreparedStatement ps = con.prepareStatement("select * from Admin where  admin_name = ? and admin_pass = ? ");
			ps.setString(1, name);
			ps.setString(2,pass);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				PreparedStatement ps1 = con.prepareStatement("select * from Department ");
				ResultSet rs1 = ps1.executeQuery();
				while(rs1.next()) {
				Department d = new Department( rs1.getInt("dept_id"),rs1.getString("dept_name"));
			    dept.add(d);
				}
			
			}
			
		}catch(SQLException e) {
			 e.printStackTrace();
		}
		
		
		
		return dept;
	}

	@Override
	public String updateDept(String name, String pass, String dept_name, int dept_id) {
		
        String msg = "Department Updation Unsuccessful...";
		
		
		try(Connection con = DaoConnection.provideConnection()){
			
			PreparedStatement ps = con.prepareStatement("select * from Admin where admin_name = ? and admin_pass = ?");
			ps.setString(1, name);
			ps.setString(2,pass);
			
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				PreparedStatement ps1 = con.prepareStatement("update Department set dept_name  = ? where dept_id = ?");
				ps1.setString(1, dept_name);
				ps1.setInt(2, dept_id);
				
				int x1  = ps1.executeUpdate();
				if(x1 > 0)
					msg = "Department Updated Successfully...";	
			}
			
			
			
		}catch(SQLException e) {
			 e.printStackTrace();
		}
		
		
		
		return msg;
	}

	@Override
	public String transferDept(String name, String pass, int emp_id, int dept_id) {
	
		 String msg = "Employee Transfer  Unsuccessful...";
			
			
			try(Connection con = DaoConnection.provideConnection()){
				
				PreparedStatement ps = con.prepareStatement("select * from Admin where admin_name = ? and admin_pass = ?");
				ps.setString(1, name);
				ps.setString(2,pass);
				
				ResultSet rs = ps.executeQuery();
				if(rs.next()) {
					PreparedStatement ps1 = con.prepareStatement("update Employee set emp_dept_id  = ? where emp_id = ?");
					ps1.setInt(1,emp_id);
					ps1.setInt(2, dept_id);
					
					int x1  = ps1.executeUpdate();
					if(x1 > 0)
						msg = "Department Updated Successfully...";	
				}
					
				
			}catch(SQLException e) {
				 e.printStackTrace();
			}
			
			return msg;
	}

	@Override
	public String leaveApply(int emp_id, String pass, String days) {
		 
		String msg = "Leave Apply Unsuccessful...";
			
			
			try(Connection con = DaoConnection.provideConnection()){
				
				PreparedStatement ps = con.prepareStatement("select * from Employee where emp_id = ? and emp_pass = ? ");
				ps.setInt(1, emp_id);
				ps.setString(2,pass);
				
				ResultSet rs = ps.executeQuery();
				if(rs.next()) {
					PreparedStatement ps1 = con.prepareStatement("insert into leaveapllication(leave_day,emp_id) values(?,?)");
					ps1.setString(1,days);
					ps1.setInt(2, emp_id);
					
					int x1  = ps1.executeUpdate();
					if(x1 > 0)
						msg = "Leave Applied Successfully...";
					else {
						msg = "Not Eligible For Leave";
					}
				}else {
					msg = "Credentials Mismatch";
				}
					
				
			}catch(SQLException e) {
				 e.printStackTrace();
			}
			
			return msg;
	}

	@Override
	public List<EmployeeLeave> viewEmpLeave(String name, String pass) {
		List<EmployeeLeave> empLeave = new ArrayList<>();
		
		
		
		try(Connection con = DaoConnection.provideConnection()){
			
			PreparedStatement ps = con.prepareStatement("select * from Admin where admin_name = ? and admin_pass = ? ");
			ps.setString(1,name);
			ps.setString(2,pass);
			
			
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				PreparedStatement ps1 = con.prepareStatement("select employee.emp_id, employee.emp_name,leaveApllication.leave_day,leaveApllication.status from employee inner join leaveApllication on employee.emp_id = leaveApllication.emp_id;");				
			    
				ResultSet rs1 = ps1.executeQuery();
				while(rs1.next()) {
					empLeave.add(new EmployeeLeave(rs1.getInt("emp_id"),rs1.getString("emp_name"), rs1.getString("leave_day"), rs1.getString("status")));
				}
			}
				
			
		}catch(SQLException e) {
			 e.printStackTrace();
		}
		
		return empLeave;
	}

	@Override
	public String leavePermit(String name, String pass, int emp_id, String Status) {
		String msg = "Error in Processing";
		try(Connection con = DaoConnection.provideConnection()){
			PreparedStatement ps = con.prepareStatement("select * from  admin where admin_name = ? and admin_pass = ?  ");
			ps.setString(1,name);
			ps.setString(2, pass);
			
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				PreparedStatement ps1 = con.prepareStatement("update leaveApllication set status = ? where emp_id = ?  ");
				ps1.setString(1,Status);
				ps1.setInt(2,emp_id );
				
				int x = ps1.executeUpdate();
				if(x > 0) {
					msg = "Leave updated";
				}else{
					msg = "No leave Application Found";
				}
			}
			
			
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		
		return msg;
	}

	@Override
	public EmployeeLeave getLeaveStatusById(int emp_id, String pass) {

		EmployeeLeave empLeave = null;


		try(Connection con = DaoConnection.provideConnection()){
			PreparedStatement ps = con.prepareStatement("select * from  Employee where emp_id = ? and emp_pass = ?  ");
			ps.setInt(1,emp_id);
			ps.setString(2,pass);
			
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				PreparedStatement ps1 = con.prepareStatement("select employee.emp_id, employee.emp_name, leaveApllication.leave_day,leaveApllication.status from employee inner join leaveApllication on employee.emp_id = leaveApllication.emp_id where employee.emp_id = ? ;");				
			    ps1.setInt(1, emp_id);
				ResultSet rs1 = ps1.executeQuery();
				while(rs1.next()) {
					empLeave = new EmployeeLeave(rs1.getInt("emp_id"),rs1.getString("emp_name"), rs1.getString("leave_day"), rs1.getString("status"));
				}
			
			}			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return empLeave;
		
	}

	

}
