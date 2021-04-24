package assignment2;



public class Employee {
	String name;
	int id;
	int salary;
	String profession;
	public Employee(String name, int id, int salary, String profession) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.profession = profession;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	
}
