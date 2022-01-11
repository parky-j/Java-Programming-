class Question9{
	public static void main(String[] args){
		Circle c=new Circle(2,2,4);
		c.showCircleInfo();
	}
}

class Point{
	int xPos, yPos;
	public Point(int x, int y){
		xPos=x;
		yPos=y;
	}
	public void showPointInfo(){
		System.out.println("[" + xPos + ", " + yPos + "]");
	}
}

class Circle{
	Point p1;
	int rad;
	public Circle(int x,int y,int r){
		p1=new Point(x,y);
		rad=r;
	}
	public void showCircleInfo(){
		p1.showPointInfo();
		System.out.println("rad: "+rad);
	}
}
	