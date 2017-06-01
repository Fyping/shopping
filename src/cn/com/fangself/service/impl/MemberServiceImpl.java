package cn.com.fangself.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.fangself.generator.mybatis.model.dao.GoodsInfoMapper;
import cn.com.fangself.generator.mybatis.model.dao.MemberMapper;
import cn.com.fangself.model.to.queryto.GoodsInfoQueryTo;
import cn.com.fangself.model.to.queryto.MemberQueryTo;
import cn.com.fangself.model.vo.GoodsInfoVo;
import cn.com.fangself.service.MemberService;

@Service("MemberService")
public class MemberServiceImpl implements MemberService {

	@Autowired(required=true)
	private GoodsInfoMapper goodsInfoMapper;
	
	@Autowired(required=true)
	private MemberMapper memberInfoMapper;
	@Override
	public List<GoodsInfoQueryTo> ListShopCartAllProductsOfThisMember(MemberQueryTo member) {
		// TODO Auto-generated method stub
		
		Object goodsInfoQuery =  goodsInfoMapper.selectByPrimaryKey(1);
		/*GoodsInfoVo goodsInfoVo = (GoodsInfoVo)goodsInfoQuery;
		System.out.println(goodsInfoVo);*/
		System.out.println(goodsInfoQuery.getClass().getName());
		return null;
	}

	@Override
	public int getCountOfShopCartOfThisMember(MemberQueryTo member) {
		// TODO Auto-generated method stub
		return 0;
	}
}
