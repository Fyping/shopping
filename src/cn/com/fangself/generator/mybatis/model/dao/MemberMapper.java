package cn.com.fangself.generator.mybatis.model.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.com.fangself.generator.mybatis.model.pojo.Member;
import cn.com.fangself.generator.mybatis.model.pojo.MemberExample;
import cn.com.fangself.model.vo.MemberVo;

public interface MemberMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_Member
     *
     * @mbg.generated Mon May 29 15:39:24 GMT+08:00 2017
     */
    long countByExample(MemberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_Member
     *
     * @mbg.generated Mon May 29 15:39:24 GMT+08:00 2017
     */
    int deleteByExample(MemberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_Member
     *
     * @mbg.generated Mon May 29 15:39:24 GMT+08:00 2017
     */
    int deleteByPrimaryKey(Integer memberid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_Member
     *
     * @mbg.generated Mon May 29 15:39:24 GMT+08:00 2017
     */
    int insert(Member record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_Member
     *
     * @mbg.generated Mon May 29 15:39:24 GMT+08:00 2017
     */
    int insertSelective(Member record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_Member
     *
     * @mbg.generated Mon May 29 15:39:24 GMT+08:00 2017
     */
    List<Member> selectByExample(MemberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_Member
     *
     * @mbg.generated Mon May 29 15:39:24 GMT+08:00 2017
     */
    Member selectByPrimaryKey(Integer memberid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_Member
     *
     * @mbg.generated Mon May 29 15:39:24 GMT+08:00 2017
     */
    int updateByExampleSelective(@Param("record") Member record, @Param("example") MemberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_Member
     *
     * @mbg.generated Mon May 29 15:39:24 GMT+08:00 2017
     */
    int updateByExample(@Param("record") Member record, @Param("example") MemberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_Member
     *
     * @mbg.generated Mon May 29 15:39:24 GMT+08:00 2017
     */
    int updateByPrimaryKeySelective(Member record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_Member
     *
     * @mbg.generated Mon May 29 15:39:24 GMT+08:00 2017
     */
    int updateByPrimaryKey(Member record);
    
    
    /**
     * 验证用户登陆的合法性
     * 返回登陆成功的对象，否则返回 null
     * */
    MemberVo selectByMemberVo(MemberVo memberVo);
}