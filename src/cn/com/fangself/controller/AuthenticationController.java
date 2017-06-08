package cn.com.fangself.controller;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.com.fangself.model.vo.MemberVo;
import cn.com.fangself.service.impl.MemberServiceImpl;
import cn.com.fangself.util.Vcode;
import cn.com.fangself.wrapper.request.RequestForMember;
import cn.com.fangself.wrapper.response.ResponseForMember;
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
	public void memberLogin(HttpServletRequest request,HttpServletResponse response){
		System.out.println("okokokokooooooooooooo");
		RequestForMember requestForMember  = new RequestForMember(request);
		MemberVo memberVo = requestForMember.memberVo;
		System.out.println(memberVo);
		MemberVo memberNotCharactor = new MemberVo();
		memberNotCharactor.setUsername(request.getParameter("username"));
		ResponseForMember responseForMember = new ResponseForMember(response);
		try {
			responseForMember.getWriter().print(memberVo.toString());
			responseForMember.getWriter().print("<hr/>");
			responseForMember.getWriter().print(memberNotCharactor.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
		/*if(memberServiceImpl.loginValidation(memberVo)==true){
			
		}else{
			System.out.println("failed");
		}*/
	}
	/**
	 * 验证码控制器
	 * 一次性验证码
	 * */
	@RequestMapping(value="/vcode.action",method=RequestMethod.GET)
	public void memberLoginVcode(HttpServletRequest request,HttpServletResponse response){
		System.out.println("vcode is starting ");
		Vcode vcode = new Vcode();
		try {
			vcode.create(response.getOutputStream());
			Cookie code = new Cookie("vcode",vcode.getCode());
			response.addCookie(code);
			//response.getWriter().println("验证码是:"+vcode.getCode());
			Enumeration<String> names = request.getParameterNames();
			String name = null;
			String value = null;
			while(names.hasMoreElements()){
				name = names.nextElement();
				value = request.getParameter(name);
			}
			System.out.println("name is "+name+"  value is " + value);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
