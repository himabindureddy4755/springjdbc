package assignment2.dao;

import javax.sql.DataSource;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import assignment2.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
     
	// private JdbcTemplate jdbcTemplate = new JdbcTemplate();
	private JdbcTemplate jdbcTemplate ;






	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	
	@Override
	public void insert(Employee employee) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO Employee VALUES(?,?,?,?)";
		Object[] objects= {employee.getName(),employee.getId(),employee.getSalary(),employee.getProfession()};
		int no_ofrows = jdbcTemplate.update(sql, objects);
		System.out.println("no.of rows inserted " +no_ofrows);
}
	

	public DataSource getDataSource() {
		String url ="jdbc:mysql://127.0.0.1:3306/employeejdbc";
		String username ="root";
		String password="";
		DriverManagerDataSource dataSource = new DriverManagerDataSource(url,username,password);
		return dataSource;
	
		
	}


	@Override
	public void deleteby_name(String name) {
		// TODO Auto-generated method stub
		String del = "DELETE FROM EMPLOYEE WHERE name=?";
		int deleterow = jdbcTemplate.update(del,name);
	    System.out.println("no.of rows deletd are "+deleterow);
	}
}