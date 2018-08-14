package global.sesoc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import global.sesoc.util.CryptoCurrency;

@Controller
public class ProductController {

	@RequestMapping(value="/detailedProduct", method=RequestMethod.GET)
	public String detailedProduct() {
		System.out.println("여기까지옴.");
		
		return "product/detailedProduct";
	}
	
	@ResponseBody
	@RequestMapping(value = "getHash", method = RequestMethod.GET)
	public int idcheck() {
		 int nonce = 1;

		    while(true) {
		    		
		    if(nonce % 10000==0 ) {
		    		System.out.println("시도 : " + nonce);
		    		
		    }
		    
		     if(CryptoCurrency.getHash(nonce + "").substring(0, 6).equals("000000")) {
		    	 
		    	 System.out.println("정답: " + nonce);
		      
		    	 
		    	 return nonce;
		        

		      }

		      nonce++;
		    }
		    
	}
}
