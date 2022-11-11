package Model;

public class Employee {
	private String name;
	private String pass;
    private int emp_id;
    private int dept_id;
	public Employee(String name, String pass, int emp_id, int dept_id) {
		super();
		this.name = name;
		this.pass = pass;
		this.emp_id = emp_id;
		this.dept_id = dept_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public int getDept_id() {
		return dept_id;
	}
	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}
	@Override
	public String toString() {
		return   " Employee Name         = " + name +  '\n'
				+" Employee Password     = " + pass + '\n'
				+" Employee id           = " + emp_id + "\n"
				+" Department id         = " + dept_id;
	}

	

}
