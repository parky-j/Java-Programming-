class Box<T>{
	private T ob;

	public void set(T t){
		ob = t;
	}
	public T get(){
		return ob;
	}
}

class Unboxer{
	public static <T> T openBox(Box<T> box){
		return box.get();
	}
}

class GenericMethodBoxMaker2{
	public static void main(String[] args){
		Box<Integer> box1 = new Box<>();
		box1.set(100);
		
		double s1 = Unboxer.openBox(box1);
		System.out.println(s1);
	}
}