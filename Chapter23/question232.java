import java.util.TreeSet;
import java.util.Iterator;
import java.util.Comparator;

class HowAreYou implements Comparator<Integer>{
	public int compare(Integer n1, Integer n2){
		return n2.intValue()-n1.intValue();
	}
}

class question232{
	public static void main(String[] args){
		TreeSet<Integer> tree = new TreeSet<>();
		tree.add(10); 	tree.add(13);
		tree.add(12); 	tree.add(11);
		
		for(Integer i : tree)
			System.out.print(i+" ");
		System.out.println();
	
		tree = new TreeSet<>(new HowAreYou());
		tree.add(10); 	tree.add(13);
		tree.add(12); 	tree.add(11);

		for(Integer i : tree)
			System.out.print(i+" ");
	}
}