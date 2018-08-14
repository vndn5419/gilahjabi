package global.sesoc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import global.sesoc.util.Ipinfomation;

@Controller
public class MemberController {

	@RequestMapping(value="/signIn", method=RequestMethod.GET)
	public String singIn() {
		
		Ipinfomation test = new Ipinfomation();
		
		test.login();
		
		
		return "member/signIn";
	}
}
