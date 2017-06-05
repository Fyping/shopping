package cn.com.fangself.model.dao;

import java.util.List;

import cn.com.fangself.generator.mybatis.model.pojo.GoodsInfo;
import cn.com.fangself.generator.mybatis.model.pojo.Member;

public interface ShopCartOldMapper {

	   int selectTotalProductCount(Member member);
	   
	   Double selectTotalProductPrice(Member member);
	   
	   List<GoodsInfo> selectTotalProducts(Member member);
	 
}
