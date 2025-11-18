package com.core;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class User {

	private int id;
	private String name;
	private String address;
	private List<String> names;
	private Set<Integer> contact;
	private Map<Integer, String> map;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<String> getNames() {
		return names;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}

	public Set<Integer> getContact() {
		return contact;
	}

	public void setContact(Set<Integer> contact) {
		this.contact = contact;
	}

	public Map<Integer, String> getMap() {
		return map;
	}

	public void setMap(Map<Integer, String> map) {
		this.map = map;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", address=" + address + ", names=" + names + ", contact="
				+ contact + ", map=" + map + "]";
	}

}
