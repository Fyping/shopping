package cn.com.fangself.model.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.com.fangself.generator.mybatis.model.pojo.GoodsInfo;

public interface GoodsInfoOldMapper {

	   int testSqlConnection();
	
	   int countGoodsInfoNum(GoodsInfo goodsInfoDemo);

	   int insertAGoodsInfoRecord(GoodsInfo record);
	   
	   void deleteAGoodsInfoRecord(GoodsInfo goodsInfoDemo);

	   void deleteGoodsInfoByPrimaryKey(Integer goodsInfoId);

	   void updateBygoodsInfoDemoSelective(@Param("record") GoodsInfo record, @Param("goodsInfoDemo") GoodsInfo goodsInfoDemo);

	   int updateBygoodsInfoDemo(@Param("record") GoodsInfo record, @Param("goodsInfoDemo") GoodsInfo goodsInfoDemo);

	   int updateByPrimaryKeySelective(GoodsInfo record);

	   int updateByPrimaryKey(GoodsInfo record);
	   
	   GoodsInfo selectByPrimaryKey(GoodsInfo goodsInfo);
	   
	   List<GoodsInfo> selectByPartOfBrandName(GoodsInfo goodsInfo);
	   
	   List<GoodsInfo> selectByPartStringOfGoodsDescript(GoodsInfo goodsInfo);
	   
	   List<GoodsInfo> selectAllGoodsInfo();
	   
	    
}
