package cn.com.fangself.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cn.com.fangself.model.pager.PageBean;
import cn.com.fangself.model.to.queryto.GoodsInfoQueryTo;
import cn.com.fangself.model.to.queryto.MemberQueryTo;
import cn.com.fangself.service.impl.GoodsInfoServiceImpl;
import cn.com.fangself.service.impl.MemberServiceImpl;
/**
 * member的需求：
 * 注册、登陆
 * 查看库里的所有的商品:分页显示，分页查询
 * 查看自己购物车中的所有商品
 * 
 * */
@Controller
public class MemberController {
	@Autowired(required=true)
	MemberServiceImpl memberServiceImpl;
	
	@Autowired(required=true)
	GoodsInfoServiceImpl goodsInfoServiceImpl;
	
	@RequestMapping(value="/test",method=RequestMethod.GET)
	public void sayHello(){
		System.out.println("okokoko");
		MemberQueryTo member = new MemberQueryTo();
		memberServiceImpl.ListShopCartAllProductsOfThisMember(member);
	}
	@RequestMapping(value="/goodsdetails.action",method=RequestMethod.POST)
	public ModelAndView  ListAllGoodsInfoForMember(javax.servlet.http.HttpServletRequest request){
		System.out.println("start show goods details !!!!!!!!!!");
		String pageCodeStr = request.getParameter("pagecode");
		System.out.println(pageCodeStr);
		int pageCode = 2;//Integer.valueOf(pageCodeStr);
		PageBean<GoodsInfoQueryTo> pageBean = new PageBean();
		pageBean.setPageCode(pageCode);
		PageBean<GoodsInfoQueryTo>   pageBeanResult = goodsInfoServiceImpl.fillDatasByPartQueryResult(pageBean);
		//System.out.println(pageBeanResult.getDatas());
		
		PageBean<GoodsInfoQueryTo> pageWithOutDatas = new PageBean<GoodsInfoQueryTo>();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("datas",pageBeanResult.getDatas());
		modelAndView.addObject("pagebean",pageBeanResult.getDatas());
		modelAndView.addObject("srcpath", "pages/");
		modelAndView.setViewName("categories");
		return modelAndView;
	}
	/*
		public ModelAndView memberLogin(javax.servlet.http.HttpServletRequest request){
		ModelAndView modelAndView = new ModelAndView();
		
		return modelAndView;
	}
	
	@RequestMapping(value="/getMyShopCartList",method=RequestMethod.POST)
	public void fillShopCartPage(javax.servlet.http.HttpServletRequest request){
		
		Member thisMember = null;
		Enumeration<String> enumeration =  request.getParameterNames();
		//String names[] = new String[ 鍏堝幓鍐檓ember pojo
		while(enumeration.hasMoreElements()){
			
		}
		
	}
	public 	ModelAndView fillShopcartTableOfThisMember(Member member){
		System.out.println("test");
		ModelAndView modelAndView = new ModelAndView();
		Member membernew = new Member();
		
		membernew.setMemberid(member.getMemberid());
		List<GoodsInfo> shopcartList = memberServiceImpl.ListShopCartAllProductsOfThisMember(member);
		for(GoodsInfo bianma:shopcartList){
			String desc = bianma.getGoodsdescript();
			String brand = bianma.getGoodsbrand();
			try {
				bianma.setGoodsbrand(new String(brand.getBytes(),"UTF-8"));
				bianma.setGoodsdescript(new String(desc.getBytes(),"UTF-8"));
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		PageBean pageBean = new PageBean();
		pageBean.setDatas(shopcartList);
		pageBean.setPageSize(20);
		pageBean.setPageCode(0);
		System.out.print(pageBean);
		modelAndView.addObject("shopCartListPagebean", pageBean);
		modelAndView.addObject("srcpath", "pages/");
		modelAndView.setViewName("cart");
		return modelAndView;
	}
	@RequestMapping(value="/testMemberShopcart.action",method=RequestMethod.POST)
	public void testActual(){
		System.out.println("start test member shopcart ");
		
	}


*/}
