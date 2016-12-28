package kr.or.dgit.bigdata.mybatis_dev;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

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

}
