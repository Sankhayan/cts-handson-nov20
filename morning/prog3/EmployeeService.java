package prog3;

import java.util.*;

public class EmployeeService {
	List<EmployeeModel> employeelist = new ArrayList<EmployeeModel>();

	public void addEmployee(EmployeeModel emp) {
		employeelist.add(emp);
	}

	public EmployeeModel findEmployee(int id) {
		for (EmployeeModel emp : employeelist) {
			if (emp.getId() == id)
				return emp;
		}
		return null;
	}

	public List<EmployeeModel> getEmployees() {
		return employeelist;
	}

	public List<EmployeeModel> getSortedEmployeesById() {
		Collections.sort(employeelist, (e1, e2) -> e1.getId() - e2.getId());
		return employeelist;

	}

	public List<EmployeeModel> getSortedEmployeesByName() {
		Collections.sort(employeelist, (e1, e2) -> e1.getName().compareTo(e2.getName()));
		return employeelist;
	}

	public List<EmployeeModel> getSortedEmployeesBySalary() {

		Collections.sort(employeelist, (e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()));
		return employeelist;
	}

	public List<EmployeeModel> getEmployeesByDob() {

		Collections.sort(employeelist, (e1, e2) -> e1.getDob().compareTo(e2.getDob()));
		return employeelist;
	}
}
