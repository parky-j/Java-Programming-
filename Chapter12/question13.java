class Values{
	public static int minValue(int ar1[]){
		int min=ar1[0];
		for(int e:ar1){
			if(e<min)
				min=e;
		}
		return min;
	}
	public static int maxValue(int ar1[]){
		int max=ar1[0];
		for(int e:ar1){
			if(e>max)
				max=e;
		}
		return max;
	}
}

class question13{
	public static void main(String[] args){
		Values v1 = new Values();
		System.out.println(v1.minValue(new int[]{3,1,5,6,2}));
		System.out.println(v1.maxValue(new int[]{3,1,5,6,2}));
	}
}