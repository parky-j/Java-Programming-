class Box<T>{
	private T ob;
	public void set(T o){
		ob = o;
	}
	public T get(){
		return ob;
	}
}

class EmptyBoxFactory{
	public static <T> Box<T> makeBox(){
		Box<T> box = new Box<>();
		return box;
	}
}

class TargetTypes{
	public static void main(String[] args){
		Box<Integer> box = EmptyBoxFactory.<Integer>makeBox();
		box.set(100);
		System.out.println(box.get());
	}
}