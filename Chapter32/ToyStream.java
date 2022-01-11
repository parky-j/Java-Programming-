import java.util.List;
import java.util.ArrayList;

class ToyPriceInfo{
	private String model;
	private int price;

	public ToyPriceInfo(String m, int p){
		model = m;
		price = p;
	}
	public int getPrice(){
		return price;
	}
}

class ToyStream{
	public static void main(String[] args){
		List<ToyPriceInfo> list = new ArrayList<>();
		list.add(new ToyPriceInfo("Gun", 200));
		list.add(new ToyPriceInfo("TeddyBear", 350));
		list.add(new ToyPriceInfo("CarTransform", 550));

		int sum = list.stream()
			.filter(p -> p.getPrice()<450)
			.mapToInt(m -> m.getPrice())
			.sum();
		System.out.println("sum: "+sum);
	}
}