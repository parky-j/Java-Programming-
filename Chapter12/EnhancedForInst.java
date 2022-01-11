class Box{
	private String contents;
	private int boxNum;

	Box(int num, String cont){
		boxNum=num;
		contents=cont;
	}
	
	public int getBoxNum(){
		return boxNum;
	}
	@Override
	public String toString(){
		return contents;
	}
}

class EnhancedForInst{
	public static void main(String[] args){
		Box[] ar = new Box[]{new Box(101,"Coffee"), new Box(202, "Computer"), new Box(303,"Apple")};
		String st1=ar[1].toString();
		System.out.println(st1);
		for(Box e:ar){
			if(e.getBoxNum()==202)
				System.out.println(e);
		}
	}
}