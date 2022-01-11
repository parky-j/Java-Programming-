class Box{
	private String conts;

	Box(String cont){
		this.conts=cont;
	}
	public String toString(){
		return conts;
	}
}

class BoxArray{
	public static void main(String[] args){
		Box[] ar = new Box[]{new Box("First"), new Box("Second"), new Box("Third")};
		
		for(int i=0; i<3; i++)
			System.out.println(ar[i]);
	}
}