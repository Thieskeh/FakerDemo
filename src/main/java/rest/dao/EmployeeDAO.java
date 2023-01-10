package rest.dao;

import com.github.javafaker.Faker;
import rest.model.Employee;
import rest.model.Employees;
import org.springframework.stereotype.Repository;

import java.util.Locale;


@Repository
public class EmployeeDAO {


	private static final Employees list = new Employees();

	static {
		Faker nlFaker = new Faker(new Locale("nl"));
		list.getEmployeeList().add(new Employee(1, nlFaker.name().firstName(), nlFaker.name().lastName(), nlFaker.internet().emailAddress()));
		list.getEmployeeList().add(new Employee(2, nlFaker.name().firstName(), nlFaker.name().lastName(), nlFaker.internet().emailAddress()));
		list.getEmployeeList().add(new Employee(3, nlFaker.name().firstName(), nlFaker.name().lastName(), nlFaker.internet().emailAddress()));
		list.getEmployeeList().add(new Employee(4, nlFaker.name().firstName(), nlFaker.name().lastName(), nlFaker.internet().emailAddress()));
		list.getEmployeeList().add(new Employee(5, nlFaker.name().firstName(), nlFaker.name().lastName(), nlFaker.internet().emailAddress()));
		list.getEmployeeList().add(new Employee(6, nlFaker.name().firstName(), nlFaker.name().lastName(), nlFaker.internet().emailAddress()));
		list.getEmployeeList().add(new Employee(7, nlFaker.name().firstName(), nlFaker.name().lastName(), nlFaker.internet().emailAddress()));
		list.getEmployeeList().add(new Employee(8, nlFaker.name().firstName(), nlFaker.name().lastName(), nlFaker.internet().emailAddress()));
		list.getEmployeeList().add(new Employee(9, nlFaker.name().firstName(), nlFaker.name().lastName(), nlFaker.internet().emailAddress()));
		list.getEmployeeList().add(new Employee(10, nlFaker.name().firstName(), nlFaker.name().lastName(), nlFaker.internet().emailAddress()));
		list.getEmployeeList().add(new Employee(11, nlFaker.name().firstName(), nlFaker.name().lastName(), nlFaker.internet().emailAddress()));

	}

	public Employees getAllEmployees() {
		return list;
	}

	public void addEmployee(Employee employee) {
		list.getEmployeeList().add(employee);
	}
}
