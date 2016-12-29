package kr.or.dgit.bigdata.mybatis_dev;


import java.util.Calendar;
import java.util.Date;
import java.util.List;

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
		Assert.assertSame(1, result);
	}
	@Test
	public void testinsertAutoInc(){
		Student std = new Student();
		std.setName("이유진2");
		std.setEmail("lyj@test.com");
		std.setPhonenumber(new PhoneNumber("010-2222-2222"));
		std.setDob(new Date());
		
		int result = studentservice.insertStudentAutoInc(std);
		Assert.assertSame(1, result);
	}
	@Test
	public void testupdateStudent(){
		Student std = new Student();
		std.setStudId(4);
		std.setName("박경아2");
		std.setEmail("lyj@test.com");
		std.setPhonenumber(new PhoneNumber("010-2222-2222"));
		std.setDob(new Date());
		
		int result = studentservice.updateStudent(std);
		Assert.assertSame(1, result);
	}
	@Test
	public void testdeleteStudent(){
		int deleteStudent = studentservice.deleteStudent(6);
		
		Assert.assertSame(1, deleteStudent);
	}
	@Test
	public void testfindStudentByAll(){
		List<Student> selectAll = studentservice.findStudentByAll();
		
		Assert.assertNotNull(selectAll);
	}
}
