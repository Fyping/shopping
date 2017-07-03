package cn.com.fangself.model.dao;

import cn.com.fangself.generator.mybatis.model.pojo.Admin;

public interface AdminOldMapper {
	
	int insert(Admin adminDemo);
	
	Admin selectAdminByPrimaryKey(Admin admin);
	
	void updateAdminByPrimaryKey(Admin admin);
	
	Admin selectAdminByAdminIdAndPwd(Admin admin);
	
}


