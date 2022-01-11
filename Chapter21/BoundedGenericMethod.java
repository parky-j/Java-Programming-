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
	public static <T extends Number> Box<T> makeBox(T o){
		Box<T> box = new Box<>();
		box.set(o);

		System.out.println("Boxed data: "+o.intValue());
		return box;
	}
}

class Unboxer{
	public static <T extends Number> T openBox(Box<T> box){
		System.out.println("Unboxed data: "+box.get().intValue());
		return box.get();
	}
}

class BoundedGenericMethod{
	public static void main(String[] args){
		Box<Integer> box1 = BoxFactory.makeBox(100);
		System.out.println(box1.get());
		
		int n = Unboxer.openBox(box1);		
		System.out.println(n);

		box1.set(1000);
		System.out.println(box1.get());
	}
}