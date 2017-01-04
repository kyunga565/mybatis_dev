package kr.or.dgit.bigdata.mybatis_dev;

import static org.junit.Assert.*;

import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.dgit.bigdata.mybatis_dev.dto.Course;
import kr.or.dgit.bigdata.mybatis_dev.service.CourseService;

public class CoursesServiceTest {
private static CourseService courseservice;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		courseservice = CourseService.getInstance();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		courseservice = null;
	}

/*	@Test
	public void testSearchCourse() {
		GregorianCalendar cal = new GregorianCalendar(2013,01,01);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("tutor_id", 1);
		map.put("courseName", "%java%");
		map.put("StartDate", cal.getTime());
		map.put("endDate", "2013-07-05");
		List<Course> course = courseservice.searchCourses(map);
		Assert.assertNotNull(course);
	}
*/
	
	@Test
	public void testsearchCaseCourses() {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("SearchBy", "Tutor");
		map.put("tutorId", 1);
		
		List<Course> course = courseservice.searchCourses(map);
		System.out.println("testsearchCaseCourses"+map);
		Assert.assertNotNull(course);
		
		map.replace("SearchBy", "CourseName");
		map.remove("tutorId");
		map.put("courseName", "%java%");
		course = courseservice.searchCaseCourses(map);
		System.out.println("testsearchCaseCourses"+map);
		Assert.assertNotNull(course);
		
	}
}
