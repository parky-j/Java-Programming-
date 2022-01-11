class Box<T>{
	private T ob;
	public void set(T o){ ob = o; }
	public T get(){ return ob; }
	
	@Override
	public String toString(){
		return ob.toString();
	}
}

class Unboxer{
	public static void peekBox(Box<? super Integer> box){
		System.out.println(box);
	}
}

class LowerBoundedWildcard{
	public static void main(String[] args){
		Box<Integer> box = new Box<>();
		box.set(100);
		Box<Number> box1 = new Box<>();
		box1.set(10.20);
		Box<Object> box2 = new Box<>();
		box2.set("hello");

		Unboxer.peekBox(box);
		Unboxer.peekBox(box1);
		Unboxer.peekBox(box2);
	}
}

