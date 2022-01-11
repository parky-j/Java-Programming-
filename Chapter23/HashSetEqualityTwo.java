import java.util.HashSet;
import java.util.Iterator;

class Num{
	private int num;
	public Num(int n){ num = n; }
	
	@Override
	public String toString(){
		return String.valueOf(num);
	}
	public int HashCode(){
		return num%3;
	}
	@Override
	public boolean equals(Object obj){
		if(num==((Num)obj).num)
			return true;
		else
			return false;
	}
}

class HashSetEqualityTwo{
	public static void main(String[] args){
		HashSet<String> set = new HashSet<>();
		set.add("1111");
		set.add("2222");
		set.add("3333");
		set.add("1111");
		System.out.println("number of instance: "+ set.size());
		
		for(Iterator<String> itr = set.iterator(); itr.hasNext();){
			System.out.print(itr.next().toString()+'\t');
		}
		System.out.println();
	}
}