package cn.com.fangself.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.com.fangself.model.vo.MemberVo;
import cn.com.fangself.service.impl.MemberServiceImpl;
import cn.com.fangself.wrapper.request.RequestForMember;
/**
 * AuthenticationController的需求：
 * 带安全认证的注册、登陆
 * 
 * */
@Controller
public class AuthenticationController {
	@Autowired(required=true)
	MemberServiceImpl memberServiceImpl;
	
	@RequestMapping(value="/memberLoginAuthentication",method=RequestMethod.POST)
	public void memberLogin(javax.servlet.http.HttpServletRequest request){
		System.out.println("okokokokooooooooooooo");
		RequestForMember requestForMember  = new RequestForMember(request);
		MemberVo memberVo = requestForMember.memberVo;
		System.out.println(memberVo);
		if(memberServiceImpl.loginValidation(memberVo)==true){
			
		}else{
			System.out.println("failed");
		}
	}
	
}
