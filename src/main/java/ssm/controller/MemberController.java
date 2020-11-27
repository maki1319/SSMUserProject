package ssm.controller;

import java.util.ArrayList;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ssm.pojo.Member;
import ssm.service.MemberService;
import unit.U;

@Controller
public class MemberController {

	@Resource
	private MemberService memberService;

	/**
	 * 根据name和phone查询客户详情，如果为空，则查询所有
	 */
	@RequestMapping("/findMemberByNamePhone")
	public String findMemberByNamePhone(String namephone, Model model,HttpServletRequest request) {
		ArrayList<Member> member = memberService.findMemberByNamePhone(namephone);
		if (member == null || member.size() == 0) { // 查询不出数据
			model.addAttribute("b", false);
			return "selectPage";
		}
		String str = "";
		//获得项目的路径
//		String path = request.getScheme()+"://"+request.getServerName() 
//		+":"+request.getServerPort()+request.getContextPath()+ "/";
		String path = request.getContextPath();
		for (int i = 0; i < member.size(); i++) {
			str = str + "<tr>\r\n" + "			<td>" + member.get(i).getId() + "</td>\r\n" + "			<td>"
					+ member.get(i).getName() + "</td>\r\n" + "			<td>" + member.get(i).getAge() + "</td>\r\n"
					+ "			<td>" + member.get(i).getSex() + "</td>\r\n" + "			<td>"
					+ member.get(i).getPhone() + "</td>\r\n" + "			<td>" + member.get(i).getAddress()
					+ "</td>\r\n" + "			<td>" + member.get(i).getHobby() + "</td>\r\n" + "			<td>"
					+ member.get(i).getDate() + "</td>\r\n" + "			<td>" + member.get(i).getRemarks() + "</td>\r\n"
					+ " <td><a href=\""+path+"/findMemberById?id="+member.get(i).getId()+"\">修改</a></td>\r\n"+ "	</tr>";
		}
		model.addAttribute("str", str);
		return "member";
	}

	/**
	 * 添加会员
	 */
	@RequestMapping("/addMember")
	public String addMember(Model model, Member member) {

		member.setId(U.getUUID());
		member.setDate(U.formatDate());
//		System.out.println(member.getHobby());
		boolean b = memberService.addMember(member);
		if (b) { // 添加成功

			return "firstPage";
		}
		model.addAttribute("b", b);
		return "addPage";
	}

	/**
	 * 通过name或者手机号删除会员
	 */
	@RequestMapping("/deleteMember")
	public String deleteMember(String namephone, Model model) {
		int rows = memberService.deleteMember(namephone);
		if (rows > 0) { // 删除成功
			return "firstPage";
		}
		model.addAttribute("b", false);
		return "deletePage";
	}
	/**
	 * 修改之前查询
	 */
	@RequestMapping("/beforeUpdate")
	public String beforeUpdate(String namephone, Model model,HttpServletRequest request) {
		ArrayList<Member> member = memberService.findMemberByNamePhone(namephone);
		if (member == null || member.size() == 0) { // 查询不出数据
			model.addAttribute("b", 0);
			return "beforeUpdate";
		}
		String str = "";
		//获得项目的路径
//		String path = request.getScheme()+"://"+request.getServerName() 
//		+":"+request.getServerPort()+request.getContextPath()+ "/";
		String path = request.getContextPath();
		for (int i = 0; i < member.size(); i++) {
			str = str + "<tr>\r\n" + "			<td>" + member.get(i).getId() + "</td>\r\n" + "			<td>"
					+ member.get(i).getName() + "</td>\r\n" + "			<td>" + member.get(i).getAge() + "</td>\r\n"
					+ "			<td>" + member.get(i).getSex() + "</td>\r\n" + "			<td>"
					+ member.get(i).getPhone() + "</td>\r\n" + "			<td>" + member.get(i).getAddress()
					+ "</td>\r\n" + "			<td>" + member.get(i).getHobby() + "</td>\r\n" + "			<td>"
					+ member.get(i).getDate() + "</td>\r\n" + "			<td>" + member.get(i).getRemarks() + "</td>\r\n"
					+ " <td><a href=\""+path+"/findMemberById?id="+member.get(i).getId()+"\">修改</a></td>\r\n"+ "	</tr>";
		}
		model.addAttribute("str", str);
		return "member";
	}
	/**
	 * 修改之前最后一步，通过id查询member，通过上一个方法的member页面的操作传来的id查询member传给updatePage页面再传给下面方法
	 */
	@RequestMapping("/findMemberById")
	public String findMemberById(String id,Model model) {
		Member member = memberService.findMemberById(id);
		if(member != null) {
			model.addAttribute("member", member);
			return "updatePage";
		}
		model.addAttribute("b", 0);
		return "beforeUpdate";
	}
	/**
	 * 修改
	 */
	@RequestMapping("/updateMember")
	public String updateMember(Member member,Model model) {
//		Member member = (Member)request.getAttribute("member");
		int rows = memberService.updateMember(member);
		if(rows>0) {
			return "firstPage";
		}
		model.addAttribute("b", false);
		return "updatePage";
	}
	
}
