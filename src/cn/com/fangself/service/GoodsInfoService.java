package cn.com.fangself.service;

import java.util.List;

import cn.com.fangself.model.pager.PageBean;
import cn.com.fangself.model.to.queryto.GoodsInfoQueryTo;

public interface GoodsInfoService {
	
	List<GoodsInfoQueryTo> showAllGoodsOfRepority();
	
	List<GoodsInfoQueryTo> partQueryByRange(Integer startIndex , Integer endIndex);

	PageBean<GoodsInfoQueryTo> fillDatasByPartQueryResult(PageBean<GoodsInfoQueryTo> pageBean);
	
}
