class Box<T>{
	private T ob;
	private int t;
	public void set(T o){
		ob = o;
	}
	public void set(int i){
		t=i;
	}
	public T get(){
		return ob;
	}
	public int gett(){
		return t;
	}
}
class Toy{
	@Override
	public String toString(){
		return "It's Simple Toy";
	}
}
class Robot{
	@Override
	public String toString(){
		return "It's Simple Robot";
	}
}
class BoxHandler{
	public static <T> void outBox(Box<? extends T> box){
		T t = box.get();
		box.set(12);
		System.out.println(t);
		System.out.println(box.gett());
	}
	public static <T> void inBox(Box<? super T> box, T n){
		box.set(n);
	}
}

class BoundedWildcardGenericMethod{
	public static void main(String[] args){
		Box<Toy> tBox = new Box<>();
		Box<Robot> rBox = new Box<>();
		Toy t = new Toy();
		Robot r = new Robot();

		BoxHandler.inBox(tBox, t);
		BoxHandler.inBox(rBox, r);
		
		BoxHandler.outBox(tBox);
		BoxHandler.outBox(rBox);
	}
}