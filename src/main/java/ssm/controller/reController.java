package ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/redirct")
public class reController {
	/**
	 * 跳转到首页
	 * @return
	 */
	@RequestMapping("/first")
	public String refirst() {
		return "firstPage";
	}
	/**
	 * 跳转到添加页面
	 * @return
	 */
	@RequestMapping("/add")
	public String readd() {
		return "addPage";
	}
	/**
	 * 跳转到删除页面
	 * @return
	 */
	@RequestMapping("/delete")
	public String redelete() {
		return "deletePage";
	}
	/**
	 * 跳转到更新页面
	 * @return
	 */
	@RequestMapping("/update")
	public String reupdate() {
		return "updatePage";
	}
	/**
	 * 跳转到更新之前页面
	 * @return
	 */
	@RequestMapping("/before")
	public String rebefore() {
		return "beforeUpdate";
	}
	/**
	 * 跳转到查询页面
	 * @return
	 */
	@RequestMapping("/select")
	public String reselect() {
		return "selectPage";
	}
	
}
