
class fortest{
	public static void main(String[] args){
		Box b=new Box("hi");
		Box b1=new Box("hi!");
		Box b3=new Box("hello");
		Box b2=null;
		System.out.println(b);
	}
}
class Box{
	String ct;
	Box(String cont){
		ct=cont;
	}
}
