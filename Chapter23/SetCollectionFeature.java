import java.util.Iterator;
import java.util.HashSet;
import java.util.Set;

class SetCollectionFeature{
	public static void main(String[] args){
		Set<String> set = new HashSet<>();
		set.add("Robot");
		set.add("Box");
		set.add("Car");
		set.add("Robot");
		System.out.println("number of instance: "+set.size());
		
		for(Iterator<String> itr = set.iterator(); itr.hasNext();){
			System.out.print(itr.next()+'\t');
		}
		System.out.println();

		for(String e : set){
			System.out.print(e+'\t');
		}
	}
}