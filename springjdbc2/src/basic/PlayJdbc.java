package basic;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import basic.dao.StudentDao;
import basic.dao.StudentDaoHelper;
import basic.dao.StudentDaoImpl;
import basic.model.Student;

public class PlayJdbc {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		StudentDaoImpl studentDao = (StudentDaoImpl) context.getBean("studentDao");
		//StudentDaoHelper helper = context.getBean("studentDaoHelper",StudentDaoHelper.class);
		//helper.insertStudents();
		List<Student> students = studentDao.getAllStudents();
		printStudents(students);
		

		 
	
		//StudentDao studentDao = (StudentDao) context.getBean("studentDao");
		//Student myStudent = new Student(1, "himani", 7, 96);
		//Student anotherStudent = new Student(2,"bindu",8,88);
		
		//studentDao.delRecordById(2);
		
		//StudentDao studentDao = new StudentDaoImpl();
		//studentDao.insert(anotherStudent);
		/*studentDao.insert(myStudent);
		studentDao.cleanUp();
		
		studentDao.delRecordByNameSem("himani", 8);*/
		
		//StudentDaoImpl studentDao = (StudentDaoImpl) context.getBean("studentDao");
		//studentDao.insert(anotherStudent);
		//studentDao.insert(myStudent);
		
		//StudentDaoHelper helper = context.getBean("studentDaoHelper",StudentDaoHelper.class);
		
		//helper.insertStudents();
		
		
		
	}

	private static void printStudents(List<Student> students) {
		// TODO Auto-generated method stub
		for(Student s : students) {
			System.out.println(s);
		}
	}

	

}