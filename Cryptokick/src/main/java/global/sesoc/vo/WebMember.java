package global.sesoc.vo;

public class WebMember {
		private String userid;
		private String username;
		private String userpwd;
		private String gender;
		private String birthday;
		private String address;
		private String phone;
		private String email;
		private String hobby;
		private String image;

		public WebMember() {
			// TODO Auto-generated constructor stub
		}

		public WebMember(String userid, String username, String userpwd, String gender, String birthday, String address,
				String phone, String email, String hobby, String image) {
			super();
			this.userid = userid;
			this.username = username;
			this.userpwd = userpwd;
			this.gender = gender;
			this.birthday = birthday;
			this.address = address;
			this.phone = phone;
			this.email = email;
			this.hobby = hobby;
			this.image = image;
		}

		public String getUserid() {
			return userid;
		}

		public void setUserid(String userid) {
			this.userid = userid;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getUserpwd() {
			return userpwd;
		}

		public void setUserpwd(String userpwd) {
			this.userpwd = userpwd;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public String getBirthday() {
			return birthday;
		}

		public void setBirthday(String birthday) {
			this.birthday = birthday;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getHobby() {
			return hobby;
		}

		public void setHobby(String hobby) {
			this.hobby = hobby;
		}

		public String getImage() {
			return image;
		}

		public void setImage(String image) {
			this.image = image;
		}

		@Override
		public String toString() {
			return "WebMember [userid=" + userid + ", username=" + username + ", userpwd=" + userpwd + ", gender="
					+ gender + ", birthday=" + birthday + ", address=" + address + ", phone=" + phone + ", email="
					+ email + ", hobby=" + hobby + ", image=" + image + "]";
		}
		
		
}
