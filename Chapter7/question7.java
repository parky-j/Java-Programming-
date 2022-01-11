class question71{
	public static void main(String[] args){
		Triangle t1=new Triangle(10, 5);
		Triangle t2=new Triangle(20, 2);
		
		t1.changeHeight(20);
		t2.changeHeight(10);
		
		t1.changeBase(2);
		t2.changeBase(5);
		
		System.out.println(t1.calArea());
		System.out.println(t2.calArea());
	}
}
class Triangle{
	int height;
	int base;

	public Triangle(int h, int b){
		height=h;
		base=b;
	}
	public int changeHeight(int h){
		height=h;
		return height;
	}
	public int changeBase(int b){
		base=b;
		return base;
	}
	public int calArea(){
		int area=height*base/2;
		return area;
	}
}
