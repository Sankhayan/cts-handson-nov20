package prog3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Employee {

	public static void main(String[] args) {
		EmployeeService service = new EmployeeService();
		try (Scanner sc = new Scanner(System.in)) {
			List<EmployeeModel> list = new ArrayList<EmployeeModel>();
			int op;
			do {
				System.out.println("Enter your option from the menu:");
				System.out.println(
						"1. Add employee:  \n2. Display employee by Id: \n3. Display all employees: \n4. Sort employee by Id: \n"
								+ "5. Sort employee by name: \n6. Sort employee by salary: \n7. Sort employee by DOB: \n8. Exit ");
				op = sc.nextInt();
				switch (op) {
				case 1:
					System.out.println("Enter Id:");
					int id = sc.nextInt();
					System.out.println("Enter Name: ");
					String name = sc.next();
					System.out.println("Enter salary: ");
					double salary = sc.nextDouble();
					System.out.println("Enter DOB:");
					String date = sc.next();
					DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
					LocalDate dob = LocalDate.parse(date, formatter);
					EmployeeModel employee = new EmployeeModel(id, name, salary, dob);
					service.addEmployee(employee);

					break;
				case 2:
					System.out.println("Enter id of employee need to see details");
					EmployeeModel em = service.findEmployee(sc.nextInt());
					System.out.println("Details are: " + em.getName() + "\n " + em.getSalary() + "\n " + em.getDob());

					break;
				case 3:
					System.out.println("All employees list: ");
					list = service.getEmployees();
					for (EmployeeModel e : list)
						System.out.println(e);
					break;
				case 4:
					System.out.println("Sortedlist by Id: ");
					list = service.getSortedEmployeesById();
					list.forEach(e -> System.out.println(e));
					break;
				case 5:
					System.out.println("sorted list by Name: ");
					list = service.getSortedEmployeesByName();
					list.forEach(e -> System.out.println(e));
					break;
				case 6:
					System.out.println("Sorted list by Salary");
					list = service.getSortedEmployeesBySalary();
					list.forEach(e -> System.out.println(e));
					break;
				case 7:
					System.out.println("Sorted list by Dob");
					list = service.getEmployeesByDob();
					list.forEach(e -> System.out.println(e));
					break;
				case 8:
					System.out.println("-----------Exiting-------- ");
					System.exit(0);
					break;
				}
			} while (op <= 8);
		}

	}

}
