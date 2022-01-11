class question3{
	public static void main(String[] args){
		System.out.println(min(2,3));
	}
	public static int min(int a, int b){
		int pmin=(int)((a-b)^2^(0.5));
		return pmin;
	}
}
