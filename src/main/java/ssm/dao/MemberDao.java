package ssm.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;
import ssm.pojo.Member;

/**
 * member接口文件
 * @author Administrator
 *
 */

@Repository
public interface MemberDao {
	/**
	 * 根据name和phone查询信息
	 */
	@Select("select * from member where (name like concat('%',#{name},'%') or phone like concat('%',#{phone},'%'))")
	public ArrayList<Member> findMemberByNamePhone(String namephone);
	/**
	 * 添加会员
	 */
	@Insert("insert into member values(#{id},#{name},#{age},#{sex},#{phone},#{address},#{hobby},#{date},#{remarks})")
	public boolean addMember(Member member);
	/**
	 * 根据name和phone删除会员
	 */
	@Delete("delete from member where (name = #{name} or phone = #{phone})")
	public int deleteMember(String namephone);
	/**
	 * 根据id查询内容
	 */
	@Select("select * from member where id=#{id}")
	public Member findMemberById(String id);
	/**
	 * 根据id修改
	 */
	@Update("update member set name=#{name},age=#{age},sex=#{sex},phone=#{phone},address=#{address},hobby=#{hobby}\n" +
			"\t\t,date=#{date},remarks=#{remarks} where id=#{id}")
	public int updateMember(Member member);
}
