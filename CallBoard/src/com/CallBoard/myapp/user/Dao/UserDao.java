package com.CallBoard.myapp.user.Dao;

import com.CallBoard.myapp.user.vo.UserVo;
import java.util.Map;
import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	public SqlSession sqlSession;

	public int regUser(UserVo UserVo) {
		return sqlSession.insert("user.regUser", UserVo);
	}
	
	public UserVo loginCheck(UserVo UserVo) {
		return sqlSession.selectOne("user.loginCheck", UserVo);
	}
	
	
}
