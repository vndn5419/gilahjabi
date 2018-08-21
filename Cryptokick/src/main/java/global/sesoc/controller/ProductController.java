package global.sesoc.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import global.sesoc.dao.ProductRepository;
import global.sesoc.util.CryptoCurrency;
import global.sesoc.vo.Product;

@Controller
public class ProductController {
	
	@Autowired
	ProductRepository repository;
	
	int rownum;
	int count;

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
	@RequestMapping(value="/Projects", method=RequestMethod.GET)
	public String AllProjects(Product product, Model model) {
		System.out.println(product);
		
		ArrayList<Product> plist = new ArrayList<>();
		
		product.setProduct_num(0);
		
		model.addAttribute("category", product.getProduct_category());		

		if(product.getProduct_category().equals("All")) {
			product.setProduct_category(null);
		}
		
		plist = repository.selectAll(product);
		System.out.println(plist);
		model.addAttribute("pList",plist);
		
		rownum= 9;
		count = 0;
		
		return "product/projects";
	}
	
	@ResponseBody
	@RequestMapping(value="/scrolldown", method=RequestMethod.GET)
	public ArrayList<Product> scrolldown(String category) {
		count++;
		System.out.println(category);
		Product product = new Product();
		
		if(category.equals("All")) {
			category=null;
		}
		
		product.setProduct_num(rownum*count);
		product.setProduct_category(category);
		ArrayList<Product> plist = new ArrayList<>();
		System.out.println(product);
		plist = repository.selectAll(product);
		System.out.println(plist);
		
		return plist;
	}
}
