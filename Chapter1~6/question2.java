class Question2{
	public static void main(String[] args){
		int target=1;
		int a, b;
		a=target<<27;
		b=target<<5;
		System.out.println(a);
		if(a<0){
			System.out.println("1");
		}
		else{
			System.out.println("0");
		}
		if(b<0){
			System.out.println("1");
		}
		else{
			System.out.println("0");
		}
	}
}