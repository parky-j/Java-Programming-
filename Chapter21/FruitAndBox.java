class Apple{
	public String toString(){
		return "It's Apple!";
	}
}
class Orange{
	public String toString(){
		return "It's Orange!";
	}
}

class Box<T>{
	private T ob;

	public void set(T t){
		ob = t;
	}
	public T get(){
		return ob;
	}
}

class FruitAndBox{
	public static void main(String[] args){
		Apple a = new Apple();
		Orange o = new Orange();
		Box<Apple> b1 = new Box<Apple>();
		Box<Orange> b2 = new Box<Orange>();

		b1.set(a);
		b2.set(o);

		System.out.println(b1.get());
		System.out.println(b2.get());
	}
}
		