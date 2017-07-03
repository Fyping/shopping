package cn.com.fangself.model.vo;

import cn.com.fangself.model.to.queryto.GoodsInfoQueryTo;

public class GoodsInfoVo extends GoodsInfoQueryTo {

	@Override
	public String toString() {
		return "GoodsInfoVo [getGoodsid()=" + getGoodsid() + ", getGoodsuuid()=" + getGoodsuuid() + ", getGoodsbrand()="
				+ getGoodsbrand() + ", getGoodsprice()=" + getGoodsprice() + ", getGoodsurl()=" + getGoodsurl()
				+ ", getGoodsdescript()=" + getGoodsdescript() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

}
