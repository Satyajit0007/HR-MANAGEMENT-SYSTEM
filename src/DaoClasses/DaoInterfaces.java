package DaoClasses;

import java.util.List;

import Model.Department;
import Model.Employee;
import Model.EmployeeLeave;

public interface DaoInterfaces {
public String regEmployee(String name, String pass);
public String updateEmpName(String name, String pass,String setName);
public String updateEmpPass(String name, String pass,String setPass);
public Employee viewEmployee(String name, String pass);
public String addNewDept(String name, String pass, int dept_id, String dept_name);
public List<Department>  viewDept(String name, String pass);
public String updateDept(String name, String pass,String dept_name, int dept_id);
public String transferDept(String name,String pass,int emp_id, int dept_id);
public String leaveApply(int emp_id, String pass,String days);
public List<EmployeeLeave> viewEmpLeave(String name, String pass);
public String leavePermit(String name, String pass,int emp_id, String Status);
public EmployeeLeave getLeaveStatusById(int emp_id, String pass);
}
