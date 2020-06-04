package com.tiang.dependacy_loose_coupling2;

public class Safricom {
	Service service;
	
	
	public void setService(Service service) {
		this.service = service;
	}


	public void startServices(){
		service.services();
		
	}
}
