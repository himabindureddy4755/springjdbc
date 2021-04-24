package assignment2.dao;



import assignment2.Employee;

public interface EmployeeDao {
	

	 public void insert(Employee employee);
	 public void deleteby_name(String name);
	 public void deleteby_id_and_profession(int id, String name);
	 public void truncatetable();

}
