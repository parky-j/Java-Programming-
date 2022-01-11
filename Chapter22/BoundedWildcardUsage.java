class Box<T>{
	private T ob;
	public void set(T o){ ob = o; }
	public T get(){ return ob; }
}
class Toy{
	@Override
	public String toString(){
		return "It's SImple Toy";
	}
}

class BoxHandler{
	public static void outBox(Box<? extends Toy> box){
		Toy t = box.get();
		System.out.println(t);
	}
	public static void inBox(Box<? super Toy> box, Toy n){
		box.set(n);
	}
}

class BoundedWildcardUsage{
	public static void main(String[] args){
		Box<Toy> box = new Box<>();
		BoxHandler.inBox(box,new Toy());
		BoxHandler.outBox(box);
	}
}