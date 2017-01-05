package kr.or.dgit.bigdata.mybatis_dev.mappers;

import kr.or.dgit.bigdata.mybatis_dev.dto.UserPic;

public interface UserPicMapper {
	int insertUserPic(UserPic userpic);
	UserPic getUserPic(int id);
}
