package ssm.service;

import java.util.ArrayList;

import ssm.pojo.Member;

public interface MemberService {
	//根据name和phone查询
	public ArrayList<Member> findMemberByNamePhone(String namephone);
	//添加会员
	public boolean addMember(Member member);
	//删除会员通过name phone
	public int deleteMember(String namephone);
	//根据id查询内容
	public Member findMemberById(String id);
	//根据id修改会员
	public int updateMember(Member member);
	
}
