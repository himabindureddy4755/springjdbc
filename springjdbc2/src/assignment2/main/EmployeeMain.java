package assignment2.main;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import assignment2.Employee;
import assignment2.dao.EmployeeDao;
import assignment2.dao.EmployeeDaoImpl;

public class EmployeeMain {
	public static void main(String[] args) {
		
		Employee employee1 = new Employee("himani",442,30000,"software");
		Employee employee2 = new Employee("harshi",439,30000,"hardware");
		 //EmployeeDao employeeDao = new EmployeeDaoImpl();
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		EmployeeDao employeeDao = (EmployeeDao) context.getBean("employeeDao");
			employeeDao.insert(employee1);
			employeeDao.insert(employee2);
			employeeDao.deleteby_name("himani");
			employeeDao.deleteby_id_and_profession(425, "engineer");
			employeeDao.truncatetable();
       
	}

}
