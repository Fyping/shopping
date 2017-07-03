package cn.com.fangself.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.fangself.generator.mybatis.model.dao.AdminMapper;
import cn.com.fangself.service.AdminService;

@Service("AdminService")
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	private AdminMapper adminMapper;

}

/**
 * 
old code
	
	@Autowired(required=true)
	private AdminOldMapper adminOldMapper;
	
	public int insert(Admin adminDemo) {
		return adminOldMapper.insert(adminDemo);
	}

	public void updateByPrimaryKey(Admin admin) {
		adminOldMapper.updateAdminByPrimaryKey(admin);
	}

	public boolean checkIDExists(String adminIdStr) {
		boolean isValidate = false;
		if(adminIdStr==null||"".equals(adminIdStr)){
			throw new RuntimeException();
		}
		for (int i = 0; i < adminIdStr.length(); i++){
			   if (!Character.isDigit(adminIdStr.charAt(i))){
				   isValidate = false;
			   }
	    }
		Integer adminId = Integer.valueOf(adminIdStr);
		Admin admin = new Admin();
		admin.setAdminid(adminId);
		if(null!=adminOldMapper.selectAdminByPrimaryKey(admin)){
			isValidate= true;
		}
		return isValidate;
	}

	public Admin checkLoginValidation(Admin admin) {
		return adminOldMapper.selectAdminByAdminIdAndPwd(admin);
	}


 * 
 * */
