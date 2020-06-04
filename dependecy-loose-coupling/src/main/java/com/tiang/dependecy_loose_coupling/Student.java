package com.tiang.dependecy_loose_coupling;

public class Student {
	int id;
	Cheat cheat;
	

	public void setId(int id) {
		this.id = id;
	}
	public void setCheat(Cheat cheat) {
		this.cheat = cheat;
	}
 public void startCheating() {
	
	 cheat.cheating();
	 System.out.println("id numb: "+id);
 }
}
