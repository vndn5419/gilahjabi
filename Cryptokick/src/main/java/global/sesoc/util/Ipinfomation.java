package global.sesoc.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Ipinfomation {
	 
	 
	    public String login() {
	 
	         
	        StringBuffer sbuf = new StringBuffer();
	        
	        try {
	             
	            // URL 객체 생성
	            URL url = new URL("http://ip-api.com/line");
	             
	            // URLConnection 생성
	            URLConnection urlConn = url.openConnection();
	             
	             
	            InputStream is = urlConn.getInputStream();
	            InputStreamReader isr = new InputStreamReader(is, "UTF-8");
	            BufferedReader br = new BufferedReader(isr);
	             
	            String str ;
	            String country = null;
	            String city = null;
	            String ip = null;
	            int count =0;
	            while((str=br.readLine()) != null){
	                 
	            	if(count == 1) {
	            		country = str;
	            	}
	            	if(count == 4) {
	            		city = str;
	            	}
	            	if(count == 13) {
	            		ip = str;
	            	}
	            	
	            	
	                sbuf.append(str + "\r\n") ;
	                count++; 
	            }
	            
	             
	            // 콘솔에 출력하기
	            System.out.println(country) ;
	            System.out.println(city);
	            System.out.println(ip);
	            
	             
	        } catch (MalformedURLException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
			return sbuf.toString();
	         
	 
	    }
	 

}
