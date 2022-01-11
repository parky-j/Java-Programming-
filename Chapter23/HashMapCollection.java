import java.util.HashMap;

class HashMapCollection{
	public static void main(String[] args){
		HashMap<Integer,String> map = new HashMap<>();
		
		map.put(23,"Brown");
		map.put(37,"James");
		map.put(45,"Martin");
	
		System.out.println("Num.23: "+map.get(23));
		System.out.println("Num.45: "+map.get(45));
		System.out.println("Num.37: "+map.get(37));
		System.out.println();
		
		map.remove(37);

		System.out.println("Num.37: "+map.get(37));
	}
}
	
