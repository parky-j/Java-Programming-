class InfoHideCircle{
	public static void main(String[] args){
		Circle c=new Circle(1.5);
		System.out.println("rad: " + c.getRad());
		System.out.println("area: " + c.getArea());
		
		c.setRad(3.4);
		System.out.println("rad: " + c.getRad());
		System.out.println("area: " + c.getArea());
	}
}
class Circle{
	private double rad=0;
	final double PI=3.14;

	public Circle(double r){
		rad=r;
	}
	public void setRad(double r){
		if(r<0){
			rad=0;
			return;
		}
		rad=r;
	}
	public double getRad(){
		return rad;
	}
	public double getArea(){
		return rad*rad*PI;
	}
}
