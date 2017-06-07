package cn.com.fangself.service;


import java.util.List;

import cn.com.fangself.model.to.queryto.GoodsInfoQueryTo;
import cn.com.fangself.model.to.queryto.MemberQueryTo;
import cn.com.fangself.model.vo.ItemVo;
import cn.com.fangself.model.vo.MemberVo;


public interface MemberService {

	public List<GoodsInfoQueryTo> ListShopCartAllProductsOfThisMember(MemberQueryTo member);
	
	public int getCountOfShopCartOfThisMember(MemberQueryTo member);
	
	public String compileResult(ItemVo itemVo);
	
	public boolean loginValidation(MemberVo memberVo);
	
}
