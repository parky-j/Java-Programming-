class DBox<L,R>{
	private L left;
	private R right;
	public void set(L l, R r){
		left = l;
		right = r;
	}
	public String toString(){ return left+" & "+right; }
}

class DDBox<L,R>{
	private L left;
	private R right;
	public void set(L l, R r){
		left = l;
		right = r;
	}
	public String toString(){ return left.toString() +"\n"+ right.toString(); }
}

class question2111{
	public static void main(String[] args){
		DBox<String, Integer> db1 = new DBox<>();
		db1.set("Apple",25);
		DBox<String, Integer> db2 = new DBox<>();
		db2.set("Orange",20);
		DBox<DBox<String, Integer>,DBox<String, Integer>> ddb1 = new DBox<>();
		ddb1.set(db1, db2);
		System.out.println(ddb1);
	}
}