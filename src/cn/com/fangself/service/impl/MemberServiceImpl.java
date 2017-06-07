package cn.com.fangself.service.impl;

import java.io.File;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.fangself.generator.mybatis.model.dao.GoodsInfoMapper;
import cn.com.fangself.generator.mybatis.model.dao.MemberMapper;
import cn.com.fangself.model.to.queryto.GoodsInfoQueryTo;
import cn.com.fangself.model.to.queryto.MemberQueryTo;
import cn.com.fangself.model.vo.ItemVo;
import cn.com.fangself.model.vo.MemberVo;
import cn.com.fangself.service.MemberService;
import cn.com.fangself.util.CmdUtil;
import cn.com.fangself.util.CreateTempFile;

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

	@Override
	public boolean loginValidation(MemberVo memberVo) {
		boolean result = false;
		if(memberInfoMapper.selectByMemberVo(memberVo)!=null){
			System.out.println("it is validate");
			result = true;
		}
		return result;
	}
	
	@Override
	public String compileResult(ItemVo itemVo) {
		// TODO Auto-generated method stub
		System.out.println(itemVo);
		File file = CreateTempFile.createTempFile("java", itemVo.getAns());
		System.out.println(file.getAbsolutePath());
		String fileAbsulutePath = file.getAbsolutePath();
		CmdUtil.getJavaProgramRuntimeResult(fileAbsulutePath, null);
//		System.out.println(itemVo.getAns());
		return null;
	}

	
}
