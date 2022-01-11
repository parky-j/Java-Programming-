class INum{
	private int num;

	public INum(int num){
		this.num = num;
	}
	
	@Override
	public boolean equals(Object obj){
		if(this.num == ((INum)obj).num)
			return true;
		else
			return false;
	}
}

class ObjectEquality{
	public static void main(String[] args){
		String s1 = "hi";
		String s2 = "hi";
		INum n1 = new INum(10);
		INum n2 = new INum(10);
		INum n3 = new INum(20);

		if(s1==s2)
			System.out.println("s1 = s2");
		else 
			System.out.println("s1 != s2");
		if(n1.equals(n2))
			System.out.println("n1 = n2");
		else 
			System.out.println("n1 != n2");
		if(n1.equals(n3))
			System.out.println("n1 = n3");
		else
			System.out.println("n1 != n3");
	}
}