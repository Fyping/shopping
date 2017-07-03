package cn.com.fangself.model.vo;

import cn.com.fangself.generator.mybatis.model.pojo.Member;

public class MemberVo extends Member {

	/**
	 * 这里仅仅是继承还不够，还必须重写要用到的字段
	 * */

	public String  username ;
	public String  userpwd ;
	public String  phonenum ;
	public String  email ;
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserpwd() {
		return userpwd;
	}
	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}
	public String getPhonenum() {
		return phonenum;
	}
	public void setPhonenum(String phonenum) {
		this.phonenum = phonenum;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "MemberVo [username=" + username + ", userpwd=" + userpwd + ", phonenum=" + phonenum + ", email=" + email
				+ "]";
	} 
	
}
