package basic.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;

import basic.model.Student;
@Repository("studentDao")

public class StudentDaoImpl implements StudentDao {
	@Autowired
	//private JdbcTemplate jdbcTemplate = new JdbcTemplate(getDataSource());
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

	
	@Override
	public void insert(Student student) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO Student VALUES(?,?,?,?)";
        Object[] objects= {student.getId(),student.getName(),student.getSem(),student.getAverage()};
        int no_rows_inserted =	jdbcTemplate.update(sql,objects);
		System.out.println("no of rows inserted  is:"+ no_rows_inserted);
        
	}

	
	  @Override public void delRecordById(int id) 
	  { String delSql =
	  "DELETE FROM STUDENT WHERE id=?";
	  int noRecordDeleted = jdbcTemplate.update(delSql,id);
	  System.out.println("no of rows deleted is:"+noRecordDeleted);
	  }
	  @Override
		public int delRecordByNameSem(String studentName, int sem) {
			String sql = "DELETE FROM STUDENT WHERE NAME = ? AND SEM = ?"; //replace OR with AND and see the results
			Object[] objects = {studentName,sem};
			int noRecordsDeleted = jdbcTemplate.update(sql, objects);
			System.out.println("no of records deleted ="+ noRecordsDeleted);
		    return noRecordsDeleted;
		}

	 

	public DataSource getDataSource() {
		String url ="jdbc:mysql://127.0.0.1:3306/springjdbc";
		String username ="root";
		String password="";
		DriverManagerDataSource dataSource = new DriverManagerDataSource(url,username,password);
		return dataSource;
	//	return null;
		
	}
	/*
	 * @Override public void insert(List<Student> students) { String sql =
	 * "INSERT INTO STUDENT VALUES (?,?,?,?)"; ArrayList<Object[]> sqlArgs = new
	 * ArrayList<>(); for(Student student : students) { Object[] studentData =
	 * {student.getId(),student.getName(),student.getBranch(),student.getPhone()};
	 * sqlArgs.add(studentData); }
	 * 
	 * jdbcTemplate.batchUpdate(sql, sqlArgs); }
	 */


	/*
	 * public List<Student> getAllStudents() { String sql = "SELECT * FROM STUDENT";
	 * List<Student> students = jdbcTemplate.query(sql,new StudentRowMapper());
	 * return students; }
	 */
 
	/*
	 * @Override
	 * 
	 * public Student findStudentById(int id) { String sql =
	 * "SELECT * FROM STUDENT WHERE _id = ?"; Student student =
	 * jdbcTemplate.queryForObject(sql, new
	 * BeanPropertyRowMapper<Student>(Student.class),id); return student; }
	 */

}
