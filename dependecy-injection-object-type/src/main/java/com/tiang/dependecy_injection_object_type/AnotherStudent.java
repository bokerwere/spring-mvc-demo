package com.tiang.dependecy_injection_object_type;

public class AnotherStudent {
	
		private MathCheat cheat;
		
		
		public void setCheat(MathCheat cheat) {
			this.cheat = cheat;
		}


		public void startCheating() {
			
			System.out.println("");
			cheat.mathCheat();
		}

}
