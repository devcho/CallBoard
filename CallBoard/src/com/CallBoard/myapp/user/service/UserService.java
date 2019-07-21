package com.CallBoard.myapp.user.service;

import java.sql.SQLException;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.CallBoard.myapp.user.Dao.UserDao;
import com.CallBoard.myapp.user.vo.UserVo;

@Service
@Transactional
public class UserService {

	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	UserDao userdao;	
	
	public int regUser(UserVo UserVo) throws SQLException {
		return userdao.regUser(UserVo);	
	}
	
	public UserVo loginCheck(UserVo UserVo) {
		return userdao.loginCheck(UserVo);
	}

}
