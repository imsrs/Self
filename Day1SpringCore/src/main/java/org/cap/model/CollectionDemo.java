package org.cap.model;

import java.util.List;

public class CollectionDemo {

	private List<String> names;
	private List<Address> addresses;

	public List<String> getNames() {
		return names;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	@Override
	public String toString() {
		return "CollectionDemo [names=" + names + ", addresses=" + addresses + "]";
	}
	
	
	
	
}
