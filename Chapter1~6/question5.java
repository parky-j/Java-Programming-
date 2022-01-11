class question4{
	static int bi(int a){
	if(a>0){
		int bin=a%2;
		a/=2;
		bi(a);
		System.out.println(bin);
	}
	return 0;
}
	public static void main(String[] args){
	bi(10);
}
}