package com.example.demo;

public class customers {
	private int cid;
	private String cname;
	private String cemail;
	
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCemail() {
		return cemail;
	}
	public void setCemail(String cemail) {
		this.cemail = cemail;
	}
	@Override
	public String toString() {
		return "customers [cid=" + cid + ", cname=" + cname + ", cemail=" + cemail + "]";
	}

	

}
