import java.util.*;

class Car implements Comparable<Car>{
	private int disp;

	public Car(int d){ disp = d; }
	
	@Override
	public String toString(){
		return "cc: " + disp;
	}
	@Override
	public int compareTo(Car o){
		return disp-o.disp;
	}
}

class CarSortCollections{
	public static void main(String[] args){
		List<Car> list = new ArrayList<>();
		list.add(new Car(2000));
		list.add(new Car(3000));
		list.add(new Car(1000));
		Collections.sort(list);
	
		for(Iterator<Car> itr = list.iterator(); itr.hasNext(); ){
			System.out.print(itr.next().toString()+'\t');
		}
	}
}