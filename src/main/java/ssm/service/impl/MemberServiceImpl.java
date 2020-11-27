package ssm.service.impl;


import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ssm.dao.MemberDao;
import ssm.pojo.Member;
import ssm.service.MemberService;

/**
 * service
 */
@Service("memberService")
@Transactional
public class MemberServiceImpl implements MemberService {

	//注解注入memberDao
	
	@Autowired
	private MemberDao md;
	//通过名字或者手机号查找会员
	public ArrayList<Member> findMemberByNamePhone(String namephone) {
		// TODO Auto-generated method stub
		return this.md.findMemberByNamePhone(namephone);
	}
	//添加会员
	@Override
	public boolean addMember(Member member) {
		// TODO Auto-generated method stub
		return this.md.addMember(member);
	}
	//通过名字 或者手机号删除会员
	@Override
	public int deleteMember(String namephone) {
		// TODO Auto-generated method stub
		return this.md.deleteMember(namephone);
	}
	//根据id修改会员
	@Override
	public int updateMember(Member member) {
		// TODO Auto-generated method stub
		return this.md.updateMember(member);
	}
	@Override
	public Member findMemberById(String id) {
		// TODO Auto-generated method stub
		return this.md.findMemberById(id);
	}
	
}
