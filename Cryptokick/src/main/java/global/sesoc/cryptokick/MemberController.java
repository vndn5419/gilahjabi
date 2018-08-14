package global.sesoc.cryptokick;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import global.sesoc.util.test;

@Controller
public class MemberController {

	@RequestMapping(value="/signIn", method=RequestMethod.GET)
	public String singIn() {
		System.out.println("오니?");
		
		test test = new test();
		
		test.login();
		
		
		return "member/signIn";
	}
}
