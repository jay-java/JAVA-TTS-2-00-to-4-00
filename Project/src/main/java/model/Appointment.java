package model;

import java.sql.Date;

public class Appointment {
	private int aid, pid, did;
	private String image, dname, dcategory, daddress, pname, disease, status;
	private Date date;
	private long pcontact;

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getDcategory() {
		return dcategory;
	}

	public void setDcategory(String dcategory) {
		this.dcategory = dcategory;
	}

	public String getDaddress() {
		return daddress;
	}

	public void setDaddress(String daddress) {
		this.daddress = daddress;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public long getPcontact() {
		return pcontact;
	}

	public void setPcontact(long pcontact) {
		this.pcontact = pcontact;
	}

	@Override
	public String toString() {
		return "Appointment [aid=" + aid + ", pid=" + pid + ", did=" + did + ", image=" + image + ", dname=" + dname
				+ ", dcategory=" + dcategory + ", daddress=" + daddress + ", pname=" + pname + ", disease=" + disease
				+ ", status=" + status + ", date=" + date + ", pcontact=" + pcontact + "]";
	}

}
