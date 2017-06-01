package cn.com.fangself.service;


import java.util.List;

import cn.com.fangself.model.to.queryto.GoodsInfoQueryTo;
import cn.com.fangself.model.to.queryto.MemberQueryTo;


public interface MemberService {

	public List<GoodsInfoQueryTo> ListShopCartAllProductsOfThisMember(MemberQueryTo member);
	
	public int getCountOfShopCartOfThisMember(MemberQueryTo member);
	
}
