class Box<T>{
	private T ob;
	
	public void set(T t){
		ob = t;
	}
	public T get(){
		return ob;
	}
}

class BoxFactory{
	public static <A> Box<A> makeBox(A o){
		Box<A> box = new Box<>();
		box.set(o);
		return box;
	}
}

class GenericMethodBoxMaker{
	public static void main(String[] args){
		Box<String> sbox = BoxFactory.makeBox("hi");
		System.out.println(sbox.get());
	}
}