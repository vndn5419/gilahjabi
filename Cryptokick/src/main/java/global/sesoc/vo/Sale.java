package global.sesoc.vo;

public class Sale {
	
	private int sale_num;
	private int sale_priceinfo;
	private int sale_amount;
	private int product_num;
	private String userid;
	private String sale_date;
	
	public Sale() {
		// TODO Auto-generated constructor stub
	}

	public Sale(int sale_num, int sale_priceinfo, int sale_amount, int product_num, String userid, String sale_date) {
		super();
		this.sale_num = sale_num;
		this.sale_priceinfo = sale_priceinfo;
		this.sale_amount = sale_amount;
		this.product_num = product_num;
		this.userid = userid;
		this.sale_date = sale_date;
	}

	public int getSale_num() {
		return sale_num;
	}

	public void setSale_num(int sale_num) {
		this.sale_num = sale_num;
	}

	public int getSale_priceinfo() {
		return sale_priceinfo;
	}

	public void setSale_priceinfo(int sale_priceinfo) {
		this.sale_priceinfo = sale_priceinfo;
	}

	public int getSale_amount() {
		return sale_amount;
	}

	public void setSale_amount(int sale_amount) {
		this.sale_amount = sale_amount;
	}

	public int getProduct_num() {
		return product_num;
	}

	public void setProduct_num(int product_num) {
		this.product_num = product_num;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getSale_date() {
		return sale_date;
	}

	public void setSale_date(String sale_date) {
		this.sale_date = sale_date;
	}

	@Override
	public String toString() {
		return "Sale [sale_num=" + sale_num + ", sale_priceinfo=" + sale_priceinfo + ", sale_amount=" + sale_amount
				+ ", product_num=" + product_num + ", userid=" + userid + ", sale_date=" + sale_date + "]";
	}
	
	

}
