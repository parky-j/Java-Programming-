import java.util.HashSet;
import java.util.Objects;
import java.util.Iterator;

class Person{
	private String name;
	private int age;
	public Person(String na, int age){
		name = na;
		this.age = age;
	}
	@Override
	public String toString(){
		return name+"(" + age + "age)";
	}
	public int HashCode(){
		return Objects.hash(name,age);
	}

	public void how(){
		Object obj = new Object();
		String n = ((Person)obj).name;
		int a = ((Person)obj).age;

		System.out.println(a);
		System.out.println(n);
	}
	@Override
	public boolean equals(Object obj){
		String n = ((Person)obj).name;
		int a = ((Person)obj).age;

		System.out.println(a);
		System.out.println(n);
		if((name.equals(n))){
			System.out.println("true");
			return true;
		}
		if((a==age)){
			System.out.println(a);
			return true;
		}
		else
			return false;
	}
}

class question2311{
	public static void main(String[] args){
		HashSet<Person> set = new HashSet<>();
		Object obj = new Object();
		set.add(new Person("Park", 10));
		set.add(new Person("Lee", 20));
		set.add(new Person("Choi", 10));
		set.add(new Person("Choi", 10));	
		for(Iterator<Person> itr = set.iterator(); itr.hasNext();)
			System.out.println();
		System.out.println(set);
	}
}
		