class OnlyClassNoInstance{
	public static void main(String[] args){
		InstCnt.instNum -= 15;
		System.out.println(InstCnt.instNum);
		InstCnt ic=new InstCnt();
	}
}
class InstCnt{
	static int instNum=100;

	InstCnt(){
		instNum++;
		System.out.println("Instance create: "+instNum);
	}
}
