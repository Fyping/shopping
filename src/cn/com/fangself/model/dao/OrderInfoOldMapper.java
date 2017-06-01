package cn.com.fangself.model.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.com.fangself.generator.mybatis.model.pojo.OrderInfo;

public interface OrderInfoOldMapper {

	   int countOrderInfoNum(OrderInfo orderInfoDemo);

	   int deleteOrderInfo(OrderInfo orderInfoDemo);

	   int deleteOrderInfoByPrimaryKey(Integer OrderInfoId);

	   int insert(OrderInfo orderInfoDemo);

	   int insertSelective(OrderInfo orderInfoDemo);

	   List<OrderInfo> selectByOrderInfoDemo(OrderInfo orderInfoDemo);

	   OrderInfo selectByPrimaryKey(Integer OrderInfoId);

	   int updateByOrderInfoDemoSelective(@Param("record") OrderInfo record, @Param("OrderInfoDemo") OrderInfo orderInfoDemo);

	   int updateByOrderInfoDemo(@Param("record") OrderInfo record, @Param("OrderInfoDemo") OrderInfo orderInfoDemo);

	   int updateByPrimaryKeySelective(OrderInfo record);

	   int updateByPrimaryKey(OrderInfo record);
	    
	   List<OrderInfo> findOrderInfoList();
	    
}
