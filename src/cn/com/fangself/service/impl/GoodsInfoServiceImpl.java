package cn.com.fangself.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.fangself.generator.mybatis.model.dao.GoodsInfoMapper;
import cn.com.fangself.generator.mybatis.model.pojo.GoodsInfo;
import cn.com.fangself.model.pager.GoodsInfoPager;
import cn.com.fangself.model.pager.PageBean;
import cn.com.fangself.model.to.queryto.GoodsInfoQueryTo;
import cn.com.fangself.service.GoodsInfoService;

@Service("GoodsInfoService")
public class GoodsInfoServiceImpl implements GoodsInfoService {
	
	@Autowired
	private GoodsInfoMapper goodsInfoMapper;

	@Override
	public List<GoodsInfoQueryTo> showAllGoodsOfRepority() {
		List<GoodsInfoQueryTo>  result = goodsInfoMapper.showAllGoodsOfRepo() ;
		return result;
	}

	@Override
	public List<GoodsInfoQueryTo> partQueryByRange(Integer startIndex, Integer endIndex) {
		GoodsInfoPager goodsInfoPager = new GoodsInfoPager();
		goodsInfoPager.setRecordEndIndex(endIndex);
		goodsInfoPager.setRecordStartIndex(startIndex);
		return goodsInfoMapper.showProductsByRange(goodsInfoPager);
	}

	@Override
	public PageBean<GoodsInfoQueryTo> fillDatasByPartQueryResult(PageBean<GoodsInfoQueryTo> pageBean) {
		int startIndex = pageBean.getPageSize()*pageBean.getPageCode();
		int endIndex = startIndex+pageBean.getPageSize();
		GoodsInfoPager goodsInfoPager = new GoodsInfoPager();
		goodsInfoPager.setRecordEndIndex(endIndex);
		goodsInfoPager.setRecordStartIndex(startIndex);
		List<GoodsInfoQueryTo> datas = goodsInfoMapper.showProductsByRange(goodsInfoPager);
		
		pageBean.setDatas(datas);
		return pageBean;
	}

	

	
}
