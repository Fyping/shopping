package cn.com.fangself.controller;

import java.io.IOException;
import java.util.Enumeration;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.com.fangself.service.impl.AdminServiceImpl;

@Controller
public class AdminController {
	private final String registerforsupervip = "/registerforsupervip_THATISASECURITYURLFORSYSTEMSUPERVIP_CODEISSPECIFIEDFORYOU_f42e1dbedbba_41b4354e_6f95fa43311f_7311a739_JUSTIFYagain";
	//涓轰簡绯荤粺鐨勫畨鍏紝鐗规剰璁剧疆杩欐潯纭紪鐮侊紝浣滀负URL缁欏敮涓�鐨勮秴绾х鐞嗗憳浣跨敤
	private final String errorJspPages = "/shopping/pages/error/404.jsp";
	private final String successPage = "/shopping/pages/jsp/superadmin/showallproductsforadmin.jsp";
	
	@Autowired(required=true)
	AdminServiceImpl adminServiceImpl;

	@RequestMapping(value="/adminlogin.action",method=RequestMethod.POST)
	public void adminLogin(javax.servlet.http.HttpServletRequest request,javax.servlet.http.HttpServletResponse response){/*
		Enumeration<String> names =  request.getParameterNames();
		int i=0;
		boolean idValidate  = false;
		boolean loginValidate = false;
		Admin admin = new Admin();
		String adminrole = new String();
		while(names.hasMoreElements()){
			String name = names.nextElement();
			String []values = request.getParameterValues(name);
			if("adminid".equals(name)){
				String adminid =values[0];
				try{
					if(adminServiceImpl.checkIDExists(adminid)){
						///success login
						idValidate=true;
						admin.setAdminid(Integer.valueOf(adminid));
					}else{
						//
					}
				}catch(RuntimeException e){
					request.getRequestDispatcher(errorJspPages);
				}
			}
			if("adminpassword".equals(name)){
				String adminpassword= values[0];
				if(idValidate==false){
					System.out.println("failed login");
				}else{
					admin.setAdminpassword(adminpassword);
					if(null==adminServiceImpl.checkLoginValidation(admin)){
					}else{
						loginValidate = true;
						// response.set.....
					}
				}
			}
			if(loginValidate&&"adminrole".equals(name)){
				String rolename = request.getParameter(name);
				if("manager".equals(rolename)){
					adminrole = "manager";
				}else if("generalmanager".equals(rolename)){
					adminrole = "general";
				}else if("chairman".equals(rolename)){
					adminrole = "chairman";
				}else if("executivedirector".equals(rolename)){
					adminrole="director";
				}
			}
		}
		
		if(loginValidate&&!"".equals(adminrole)){
			 request.setAttribute("adminrole", adminrole);
					//request.getRequestDispatcher(successPage).forward(request, response);
			 //loginValidateThenFuncAll();
				//response.addHeader("refresh",successPage);
			    try {
					response.sendRedirect(successPage);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("okok0000");
		}
		*//**
		 *  chairman  钁ｄ簨闀�
            generalmanager 鎬荤粡鐞�
            manager 缁忕悊
            executivedirector 涓荤
		 * *//*
	*/}
	@RequestMapping(value=registerforsupervip,method=RequestMethod.GET)
	public void registerAdminBySuper(javax.servlet.http.HttpServletRequest request,javax.servlet.http.HttpServletResponse response){/*

		Enumeration<String> names =  request.getParameterNames();
		String[] nameArr = new String[3];
		int i=0;
		while(names.hasMoreElements()){
			nameArr[i++]=names.nextElement(); 
		}
		if(nameArr[0]==null||nameArr[1]==null||nameArr[2]==null){
			
			try {
				response.sendRedirect(errorJspPages);
			} catch (IOException e) {
				request.getRequestDispatcher(errorJspPages);
				e.printStackTrace();
			}
			
			return ;
		}
		int  adminid =0;
		try{
			adminid= Integer.parseInt(new String(request.getParameter(nameArr[0])));
		}catch(java.lang.NumberFormatException e){
			request.getRequestDispatcher(errorJspPages);
		}
		String adminpassword = request.getParameter(nameArr[1]);
		Admin adminDemo = new Admin();
		adminDemo.setAdminpassword(adminpassword);
		
		if("0".equals(request.getParameter(nameArr[2]).trim())){
			//Insert a Admin
			String adminuuid = UUID.randomUUID().toString();
			adminDemo.setAdminuuid(adminuuid);
			adminServiceImpl.insert(adminDemo);
		}else if("0".equals(request.getParameter(nameArr[2]).trim())){
			//Update a Admin
			adminDemo.setAdminid(adminid);
			adminServiceImpl.updateByPrimaryKey(adminDemo);
		}else{
			try {
				response.sendRedirect(errorJspPages);
			} catch (IOException e) {
				request.getRequestDispatcher(errorJspPages);
				e.printStackTrace();
			}
		}
		System.out.println(adminDemo);
	*/}
	
}
