class Person{
	private int regiNum;
	private int passNum;

	Person(int rnum, int pnum){
		regiNum=rnum;
		passNum=pnum;
	}
	Person(int rnum){
		regiNum=rnum;
		passNum=0;
	}
	void showPersonalInfo(){
		System.out.println("registration number: "+regiNum);
		
		if(passNum!=0)
			System.out.println("passport num: "+passNum+'\n');
		else
			System.out.println("Not has passport");
	}
}

class ConOverloading{
	public static void main(String[] args){
		Person jung=new Person(335577,112233);
		Person park=new Person(775544);

		jung.showPersonalInfo();
		park.showPersonalInfo();
	}
}
