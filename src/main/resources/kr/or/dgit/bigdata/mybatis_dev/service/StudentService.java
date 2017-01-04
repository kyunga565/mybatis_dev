package kr.or.dgit.bigdata.mybatis_dev.service;

import java.util.List;
import java.util.Map;

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
			//insert ------
			int res = studentMapper.insertStudent(std);
			sqlSession.commit();
			return res;
			// ------------
		}finally{
			sqlSession.close();
		}
	}
	
	public int insertStudentAutoInc(Student std){
		if (logger.isDebugEnabled()) {
			logger.debug("insertStudent(Student) - start");
		}
		SqlSession sqlSession = MybatisSqlSessionFactory.openSession();
		try{
			StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
			int res = studentMapper.insertStudentAutoInc(std);
			sqlSession.commit();
			return res;
		}finally{
			sqlSession.close();
		}
	}
	
	public int updateStudent(Student std){
		if (logger.isDebugEnabled()) {
			logger.debug("insertStudentInc(Student) - start");
		}
		SqlSession sqlSession = MybatisSqlSessionFactory.openSession();
		try{
			StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
			int res = studentMapper.updateStudent(std);
			sqlSession.commit();
			return res;
		}finally{
			sqlSession.close();
		}
	}
	public int deleteStudent(int idx){
		if (logger.isDebugEnabled()) {
			logger.debug("deleteStudent(Student) - start");
		}
		SqlSession sqlSession = MybatisSqlSessionFactory.openSession();
		try{
			StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
			int res = studentMapper.deleteStudent(idx);
			sqlSession.commit();
			return res;
		}finally{
			sqlSession.close();
		}
	}
	public List<Student> findStudentByAll(){ //log this method
		if (logger.isDebugEnabled()) {
			logger.debug("findStudentById(int) - start");
		}
		
		SqlSession sqlSession = MybatisSqlSessionFactory.openSession();
		try{
			StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
			return studentMapper.findStudentByAll();
		}finally{
			sqlSession.close();
		}
		
	}
	public Map<String,Object> findStudentByIdForMap(int studId){ //log this method
		if (logger.isDebugEnabled()) {
			logger.debug("findStudentByIdForMap(int) - start");
		}
		
		SqlSession sqlSession = MybatisSqlSessionFactory.openSession();
		try{
			StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
			return studentMapper.findStudentByIdForMap(studId);
		}finally{
			sqlSession.close();
		}
		
	}
	public List<Map<String,Object>> findStudentByAllForMap(int studId){ //log this method
		if (logger.isDebugEnabled()) {
			logger.debug("findStudentByAllForMap(int) - start");
		}
		
		SqlSession sqlSession = MybatisSqlSessionFactory.openSession();
		try{
			StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
			return studentMapper.findStudentByAllForMap();
		}finally{
			sqlSession.close();
		}
		
	}

	public Student selectStudentWithAddress(int studId){ //log this method
		if (logger.isDebugEnabled()) {
			logger.debug("selectStudentWithAddress(int) - start");
		}
		
		SqlSession sqlSession = MybatisSqlSessionFactory.openSession();
		try{
			StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
			return studentMapper.selectStudentWithAddress(studId);
		}finally{
			sqlSession.close();
		}
	}
	
	
	public Student selectStudentWithAddressResult(int studId){ 
		if (logger.isDebugEnabled()) {
			logger.debug("selectStudentWithAddressResult(int) - start");
		}
		
		SqlSession sqlSession = MybatisSqlSessionFactory.openSession();
		try{
			StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
			return studentMapper.selectStudentWithAddressResult(studId);
		}finally{
			sqlSession.close();
		}
	}
}
