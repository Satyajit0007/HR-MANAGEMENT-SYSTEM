package DaoClasses;

import java.util.List;

import Model.Department;
import Model.Employee;
import Model.EmployeeLeave;

public interface DaoInterfaces {
public String regEmployee(String name, String pass);
public String updateEmpName(String name, String pass,String newName);
public String updateEmpPass(String name, String pass, String newPass);
public Employee viewEmployee(String name, String pass);
public String addNewDept();
public List<Department>  viewDept();
public String updateDept(int dept_id);
public String transferDept(int emp_id, int dept_id);
public String leaveApply( String pass);
public List<EmployeeLeave> viewEmpLeave();
public String leavePermit(int emp_id, String Status);
public EmployeeLeave getLeaveStatusById( String pass);
public int validateAdmin(String admin_name);
public List<Employee> getAllEmp();
public int validateEmployee(String emp_name);
}
