class OneclassEncapsulation{
	public static void main(String[] args){
		ColdPatient suf = new ColdPatient();
		suf.takeSinus(new SinusCap());
	}
}
class SinusCap{
	void sniTake(){
		System.out.println("sniff gone");
	}
	void sneTake(){
		System.out.println("sneeze gone");
	}
	void snuTake(){
		System.out.println("what is snu?");
	}

	void take(){
		sniTake();
		sneTake();
		snuTake();
	}
}
class ColdPatient{
	void takeSinus(SinusCap cap){
		cap.take();
	}
}

