package kr.or.dgit.bigdata.mybatis_dev.service;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import kr.or.dgit.bigdata.mybatis_dev.dto.UserPic;
import kr.or.dgit.bigdata.mybatis_dev.mappers.UserPicMapper;
import kr.or.dgit.bigdata.mybatis_dev.util.MybatisSqlSessionFactory;

public class UserPicService {
	private static final Logger logger = Logger.getLogger(UserPicService.class);
	
	private static final UserPicService instance = new UserPicService();

	public static UserPicService getInstance() {
		return instance;
	}
	private UserPicService(){}
	
	public UserPic getUserPic(int id){
		if (logger.isDebugEnabled()) {
			logger.debug("getUserPic(int) - start");
		}
		SqlSession sqlSession = MybatisSqlSessionFactory.openSession();
		try{
			UserPicMapper userpicmapper = sqlSession.getMapper(UserPicMapper.class);
			return userpicmapper.getUserPic(id);
		}finally{
			sqlSession.close();
		}
	}	
	public int insertUserPic(UserPic userpic){
		if (logger.isDebugEnabled()) {
			logger.debug("insertUserPic(userpic) - start");
		}
		SqlSession sqlSession = MybatisSqlSessionFactory.openSession();
		try{
			UserPicMapper userpicmapper = sqlSession.getMapper(UserPicMapper.class);
			int res = userpicmapper.insertUserPic(userpic);
			sqlSession.commit();
			return res;
		}finally{
			sqlSession.close();
		}
	}
}
