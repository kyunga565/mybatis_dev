package kr.or.dgit.bigdata.mybatis_dev.service;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import kr.or.dgit.bigdata.mybatis_dev.dto.Student;
import kr.or.dgit.bigdata.mybatis_dev.mappers.StudentMapper;
import kr.or.dgit.bigdata.mybatis_dev.util.MybatisSqlSessionFactory;

public class StudentService {
	/**
	* Logger for this class
	*/
	private static final Logger logger = Logger.getLogger(StudentService.class); //declare logger

	private final static StudentService instance =  new StudentService();

	public static StudentService getInstance() {
		return instance;
	}
	private StudentService(){}
	
	public Student findStudentById(int studId){ //log this method
		if (logger.isDebugEnabled()) {
			logger.debug("findStudentById(int) - start");
		}
		
		SqlSession sqlSession = MybatisSqlSessionFactory.openSession();
		try{
			StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
			return studentMapper.findStudentById(studId);
		}finally{
			sqlSession.close();
		}
		
	}
	public int insertStudent(Student std){
		if (logger.isDebugEnabled()) {
			logger.debug("insertStudent(Student) - start");
		}
		SqlSession sqlSession = MybatisSqlSessionFactory.openSession();
		try{
			StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
			int res = studentMapper.insertStudent(std);
			sqlSession.commit();
			return res;
		}finally{
			sqlSession.close();
		}
	}
}
