package kr.or.dgit.bigdata.mybatis_dev;


import java.util.Calendar;
import java.util.Date;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.dgit.bigdata.mybatis_dev.dto.PhoneNumber;
import kr.or.dgit.bigdata.mybatis_dev.dto.Student;
import kr.or.dgit.bigdata.mybatis_dev.service.StudentService;

public class StudentServiceTest {
	private static StudentService studentservice;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		studentservice = StudentService.getInstance();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		studentservice = null;
	}

	@Test
	public void testfindStudentById() {
		Student student = studentservice.findStudentById(1);
		Assert.assertNotNull(student);
	}
	@Test
	public void testinsertStudent(){
		Student std = new Student();
		std.setStudId(4);
		std.setName("이유진");
		std.setEmail("lyj@test.com");
		std.setPhonenumber(new PhoneNumber("010-2222-2222"));
		
/*		Calendar cal = Calendar.getInstance();
		cal.clear();
		cal.set(1980,01,05);
		std.setDob(cal.getTime());*/
		std.setDob(new Date());
		int result = studentservice.insertStudent(std);
	//	System.out.printf("testinsertStudent $s : result %d%n",std ,result);
		Assert.assertSame(1, result);
	}
}
