package model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Branch {
	private String bid, bname, bcity;

	public String getBid() {
		return bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getBcity() {
		return bcity;
	}

	public void setBcity(String bcity) {
		this.bcity = bcity;
	}

	@Override
	public String toString() {
		return "Branch [bid=" + bid + ", bname=" + bname + ", bcity=" + bcity + "]";
	}
	public Branch() {
		
	}
}
