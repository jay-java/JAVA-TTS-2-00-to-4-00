package reference;

import org.springframework.context.annotation.Bean;

public class Address {

	private int aid;
	private String address;

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Address [aid=" + aid + ", address=" + address + "]";
	}

}
