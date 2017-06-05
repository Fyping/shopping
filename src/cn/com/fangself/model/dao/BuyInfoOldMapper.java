package cn.com.fangself.model.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.com.fangself.generator.mybatis.model.pojo.BuyInfo;

public interface BuyInfoOldMapper {

	   int countBuyInfoNum(BuyInfo buyInfoDemo);

	   int deleteBuyInfo(BuyInfo buyInfoDemo);

	   int deleteBuyInfoByPrimaryKey(Integer buyInfoId);

	   int insert(BuyInfo buyInfoDemo);

	   int insertSelective(BuyInfo buyInfoDemo);

	   List<BuyInfo> selectByBuyInfoDemo(BuyInfo buyInfoDemo);

	   BuyInfo selectByPrimaryKey(Integer buyInfoId);

	   int updateByBuyInfoDemoSelective(@Param("record") BuyInfo record, @Param("BuyInfoDemo") BuyInfo buyInfoDemo);

	   int updateByBuyInfoDemo(@Param("record") BuyInfo record, @Param("BuyInfoDemo") BuyInfo buyInfoDemo);

	   int updateByPrimaryKeySelective(BuyInfo record);

	   int updateByPrimaryKey(BuyInfo record);
	    
	   List<BuyInfo> findBuyInfoList();
	    
}
