package basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import basic.dao.StudentDao;
import basic.dao.StudentDaoImpl;
import basic.model.Student;

public class PlayJdbc {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		StudentDao studentDao = (StudentDao) context.getBean("studentDao");
		Student myStudent = new Student(1, "himani", 7, 96);
		Student anotherStudent = new Student(2,"bindu",8,88);
		studentDao.delRecordById(2);
		
		//StudentDao studentDao = new StudentDaoImpl();
		//studentDao.insert(anotherStudent);
		studentDao.insert(myStudent);
		studentDao.delRecordByNameSem("himani", 7);
		
		
	}

}