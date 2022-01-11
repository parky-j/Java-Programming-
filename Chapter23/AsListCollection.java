import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Iterator;

class AsListCollection{
	public static void main(String[] args){
		List<String> list = Arrays.asList("Car", "Box", "Robot");
		list =  new ArrayList<>(list);
		
		for(Iterator<String> itr = list.iterator(); itr.hasNext();)
			System.out.print(itr.next()+'\t');
		System.out.println();
		
		for(Iterator<String> itr = list.iterator(); itr.hasNext();){
			String st = itr.next();
				if(st.equals("Box"))
					itr.remove();
		}

		for(Iterator<String> itr = list.iterator(); itr.hasNext();)
			System.out.print(itr.next()+'\t');
		System.out.println();
	}
}