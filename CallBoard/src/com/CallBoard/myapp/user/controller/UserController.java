package com.CallBoard.myapp.user.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.CallBoard.myapp.infra.commons.core.BaseController;
import com.CallBoard.myapp.user.service.UserService;
import com.CallBoard.myapp.user.vo.UserVo;


@Controller 
@RequestMapping("/user/*")
public class UserController extends BaseController{
	
	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private UserService userService; 
	
	@RequestMapping(value="/user/MemEntry")
	public String mainPage(HttpServletRequest request, HttpSession session, Model model) throws Exception {
		
		return "/user/MemEntry";
	}	

	@ResponseBody
	@RequestMapping
	public String loginCheck(HttpServletRequest request, HttpSession session, UserVo UserVo) throws Exception {
		// 1. 로그인폼에서 입력된 비밀번호를 암호화
		//String enPassword = FileSecu.encryptPassword(user.getPassword());
		//user.setPassword(enPassword);

		// 2. 디비의 ID/PW와 로그인폼에서 입력된 ID, 암호화된 PW의 비교
		UserVo checkedUser = userService.loginCheck(UserVo);
		String check = "F";
		
		if(checkedUser != null) {
			if(checkedUser.getStatus().equals("Y")) {
				// 로그인 성공
				session.setAttribute("loginUser", checkedUser);
				check = "Y";
			} else if(checkedUser.getStatus().equals("N") || checkedUser.getStatus().equals("D")) {
				// 가입 미승인 단계. 로그인 실패
				check = "N";
			}
		} else {
			// 로그인 실패
			check = "F";
		}

		return check;
	}
	
	@RequestMapping(value="/user/reguser")
	public String regUser(HttpServletRequest request, UserVo UserVo, Model model) throws Throwable {
		
		int resultReg; 
		
		try{
			userService.regUser(UserVo); // insert를 하였으면...
			resultReg = 1;
		}catch(Exception e){
			resultReg = 0;
			e.printStackTrace();
		}
		
		model.addAttribute("resultReg", resultReg);
		
		return "/user/reguser";
	}

}
