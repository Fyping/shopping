package cn.com.fangself.util;

import java.io.StringWriter;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import cn.com.fangself.generator.mybatis.model.pojo.Member;


public class TestJson {

	public void testJSONObject(){
		JSONObject obj = new JSONObject();
		try {
			obj.put("name", "foo");
			obj.put("hello", "ok");

			StringWriter out = new StringWriter();
			obj.write(out);
		} catch (JSONException e) {
			e.printStackTrace();
		}
		
	}
	public JSONArray testJSONArray(){
		JSONArray jsonarray  = new JSONArray();
		jsonarray.put("fang");
		jsonarray.put("yan");
		jsonarray.put("ping");
		Member member = new Member();
		member.setAddress("江西省上犹县 ");
		member.setEmail("110@187.com");
		member.setMemberid(11);
		member.setPhonenum("1101010000");
		member.setMemberuuid("101010100101010");
		member.setPostcode("101010");
		JSONObject obj = new JSONObject();
		try{
			obj.put("address",member.getAddress());
			obj.put("email", member.getEmail());
			obj.put("memberid",member.getMemberid());
			obj.put("phonenum", member.getPhonenum());
			obj.put("memberuuid", member.getMemberuuid());
			obj.put("postcode", member.getPostcode());
		}catch(JSONException e){
		}
		jsonarray.put(obj);
		return jsonarray;
	}
}
