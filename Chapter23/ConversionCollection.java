import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;

class ConversionCollection{
	public static void main(String[] args){
		List<String> list = Arrays.asList("Car", "Box", "Robot");
		list = new ArrayList<>(list);

		for(Iterator<String> itr = list.iterator(); itr.hasNext();)
			System.out.print(itr.next()+'\t');
		System.out.println();

		list = new LinkedList<>(list);
	
		for(Iterator<String> itr = list.iterator(); itr.hasNext();)
			System.out.print(itr.next()+'\t');
		System.out.println();
	}
}