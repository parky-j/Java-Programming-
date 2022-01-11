class Box<T>{
	private T ob;
	public void set(T o){ ob=o; }
	public T get(){ return ob; }
}
class BoundedWildcardGeneric{
	public static <T> boolean compBox(Box<? extends T> box, T con){
		T bc = box.get();
		return bc.equals(con);
	}
	public static void main(String[] args){
		Box<Integer> box1 =  new Box<>();
		box1.set(25);
		Box<String> box2 = new Box<>();
		box2.set("Poly");
		
		if(compBox(box1, 25))
			System.out.println("25 in box");
		if(compBox(box2, "Poly"))
			System.out.println("Poly in box");

		System.out.println(box1.get());
		System.out.println(box2.get());
	}
}
