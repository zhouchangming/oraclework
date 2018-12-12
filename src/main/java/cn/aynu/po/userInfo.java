package cn.aynu.po;

public class userInfo {
	
	int userid;
	String username;
	String userpassword;
	
	String lastlogin;
	String createdate;

	double riches;
	int state;
	
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserpassword() {
		return userpassword;
	}
	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}
	public String getLastlogin() {
		return lastlogin;
	}
	public void setLastlogin(String lastlogin) {
		this.lastlogin = lastlogin;
	}
	public String getCreatedate() {
		return createdate;
	}
	public void setCreatedate(String createdate) {
		this.createdate = createdate;
	}
	public double getRiches() {
		return riches;
	}
	public void setRiches(double riches) {
		this.riches = riches;
	}
	
	@Override
	public String toString() {
		return "userInfo [userid=" + userid + ", username=" + username + ", userpassword=" + userpassword
				+ ", lastlogin=" + lastlogin + ", createdate=" + createdate + ", riches=" + riches + "]";
	}
	
	
	
	
	
	
	
}
