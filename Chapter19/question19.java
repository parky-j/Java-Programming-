class Point{
	private int xPos;
	private int yPos;
	public Point(int x, int y){
		xPos = x;
		yPos = y;
	}
	@Override
	public boolean equals(Object obj){
		if((this.xPos==((Point)obj).xPos) && (this.yPos==((Point)obj).yPos))
			return true;
		else
			return false;
	}
}
class Rectangle{
	private Point upperLeft;
	private Point lowerRight;
	public Rectangle(int x1, int y1, int x2, int y2){
		upperLeft = new Point(x1, y1);
		lowerRight = new Point(x2, y2);
	}
	@Override
	public boolean equals(Object obj){
		boolean b1 = this.upperLeft.equals(((Rectangle)obj).upperLeft);
		boolean b2 = this.lowerRight.equals(((Rectangle)obj).lowerRight);
		if(b1==true)
			System.out.println("b1true");
		else
			System.out.println("b1false");
		if(b2==true)
			System.out.println("b2true");
		else
			System.out.println("b2false");
		if((this.upperLeft.equals(((Rectangle)obj).upperLeft)) && (this.lowerRight.equals(((Rectangle)obj).lowerRight))){
			return true;
		}
		else{
			return false;
		}
	}
}

class question19{
	public static void main(String[] args){
		Rectangle r1 = new Rectangle(0,0,4,4);
		Rectangle r2 = new Rectangle(0,0,4,4);
		Rectangle r3 = new Rectangle(0,0,1,1);

		Point p1 = new Point(0,0);
		Point p2 = new Point(0,0);
		Point p3 = new Point(1,0);

		if(r1.equals(r2))
			System.out.println("r1 = r2");
		else 
			System.out.println("r1 != r2");
		if(r1.equals(r3))
			System.out.println("r1 = r3");
		else
			System.out.println("r1 != r3");

		if(p1.equals(p2))
			System.out.println("p1 = p2");
		else 
			System.out.println("p1 != p2");
		if(p1.equals(p3))
			System.out.println("p1 = p3");
		else
			System.out.println("p1 != p3");
	}
}
