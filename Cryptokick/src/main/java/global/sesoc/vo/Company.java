package global.sesoc.vo;

public class Company {
		
		private String co_id;
		private String co_name;
		private String co_pwd;
		private String co_address;
		private String co_phone;
		private String co_ceo;
		private String co_email;
		private String co_website;
		private String co_image;
		
		public Company() {
			// TODO Auto-generated constructor stub
		}

		public Company(String co_id, String co_name, String co_pwd, String co_address, String co_phone, String co_ceo,
				String co_email, String co_website, String co_image) {
			super();
			this.co_id = co_id;
			this.co_name = co_name;
			this.co_pwd = co_pwd;
			this.co_address = co_address;
			this.co_phone = co_phone;
			this.co_ceo = co_ceo;
			this.co_email = co_email;
			this.co_website = co_website;
			this.co_image = co_image;
		}

		public String getCo_id() {
			return co_id;
		}

		public void setCo_id(String co_id) {
			this.co_id = co_id;
		}

		public String getCo_name() {
			return co_name;
		}

		public void setCo_name(String co_name) {
			this.co_name = co_name;
		}

		public String getCo_pwd() {
			return co_pwd;
		}

		public void setCo_pwd(String co_pwd) {
			this.co_pwd = co_pwd;
		}

		public String getCo_address() {
			return co_address;
		}

		public void setCo_address(String co_address) {
			this.co_address = co_address;
		}

		public String getCo_phone() {
			return co_phone;
		}

		public void setCo_phone(String co_phone) {
			this.co_phone = co_phone;
		}

		public String getCo_ceo() {
			return co_ceo;
		}

		public void setCo_ceo(String co_ceo) {
			this.co_ceo = co_ceo;
		}

		public String getCo_email() {
			return co_email;
		}

		public void setCo_email(String co_email) {
			this.co_email = co_email;
		}

		public String getCo_website() {
			return co_website;
		}

		public void setCo_website(String co_website) {
			this.co_website = co_website;
		}

		public String getCo_image() {
			return co_image;
		}

		public void setCo_image(String co_image) {
			this.co_image = co_image;
		}

		@Override
		public String toString() {
			return "Company [co_id=" + co_id + ", co_name=" + co_name + ", co_pwd=" + co_pwd + ", co_address="
					+ co_address + ", co_phone=" + co_phone + ", co_ceo=" + co_ceo + ", co_email=" + co_email
					+ ", co_website=" + co_website + ", co_image=" + co_image + "]";
		}
		
}
