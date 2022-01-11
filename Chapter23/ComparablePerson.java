import java.util.TreeSet;
import java.util.Iterator;

class Person implements Comparable<Person>{
	private String name;
	private int age;
	public Person(String n, int a){
		name = n;
		age = a;
	}
	
	@Override
	public String toString(){ return name+" : "+age;}

	public int compareTo(Person p){
		return this.age-p.age;
	}
}

class ComparablePerson{
	public static void main(String[] args){
		TreeSet<Person> set =new TreeSet<>();
		set.add(new Person("Park", 10)); 	set.add(new Person("Lee", 11));
		set.add(new Person("Choi", 13)); 	set.add(new Person("Kim'", 9));
		for(Person p : set)
			System.out.println(p);
	}
}