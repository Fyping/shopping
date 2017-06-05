package cn.com.fangself.controller;

import java.util.Enumeration;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cn.com.fangself.model.pager.PageBean;
import cn.com.fangself.service.impl.GoodsInfoServiceImpl;

@Controller
public class GoodsInfoController {/*
	
	private final String errorJspPages = "/shopping/pages/error/404.jsp";
	@Autowired
	GoodsInfoServiceImpl goodsInfoServiceImpl;
	
	@RequestMapping(value="/testsqlconnection.action",method=RequestMethod.POST)
	public void showResult(){
		if(goodsInfoServiceImpl.testSqlConnection()==true){
			System.out.println("it is connection ok");
		}else{
			System.out.println("it is not ok");
		}
	}
	@RequestMapping(value="/goodsdetails.action",method=RequestMethod.POST)
	public ModelAndView listAllMobileDatas(javax.servlet.http.HttpServletRequest request,Model model){
		ModelAndView modeAndView = new ModelAndView();
		Enumeration<String> names =  request.getParameterNames();
		List<GoodsInfo> result = goodsInfoServiceImpl.selectAllGoodsInfo();
		PageBean<GoodsInfo> pageBean = new PageBean<GoodsInfo>(1,result.size());
		
		pageBean.setDatas(result);
		pageBean.setPageSize(100);
		
		System.out.println("helloworld");
		System.out.println(pageBean.getTotalPage());
		
		//modeAndView.addObject("pagebeans",pageBean);
		model.addAttribute("result", result);
		modeAndView.setViewName("superadmin/showallproductsforadmin");
		return modeAndView;
	}
	@RequestMapping(value="/goodsdetails.action",method=RequestMethod.GET)
	public List<GoodsInfo> getAllProcudtListFromSql(){
		List<GoodsInfo> result  =  null;
		
		return result;
	}
*/}
