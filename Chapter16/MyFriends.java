class UnivFriend{
	private String name;
	private String major;
	private String phone;
	
	public UnivFriend(String na, String ma, String ph){
		name = na;
		major = ma;
		phone = ph;
	}
	public void showInfo(){
		System.out.println("name: " +name);
		System.out.println("major: " +major);
		System.out.println("phone: " +phone);
	}
}

class CompFriend{
	private String name;
	private String department;
	private String phone;
	
	public CompFriend(String na, String de, String ph){
		name = na;
		department = de;
		phone = ph;
	}
	public void showInfo(){
		System.out.println("name: " +name);
		System.out.println("department: " +department);
		System.out.println("phone: " +phone);
	}
}

class MyFriends{
	public static void main(String[] args){
		UnivFriend[] ufrns = new UnivFriend[5];
		int ucnt = 0;
	
		CompFriend[] cfrns = new CompFriend[5];
		int ccnt = 0;
		
		ufrns[ucnt++] = new UnivFriend("Lee", "Computer", " 010-333-444");
		ufrns[ucnt++] = new UnivFriend("Seo", "Electronics", "010-222-444");
		
		cfrns[ccnt++] = new CompFriend("Yoon", "R&D 1", "02-123-9999");
		cfrns[ccnt++] = new CompFriend("Park", "R&D 2", "02-123-5555");

		for(int i=0; i<ucnt; i++){
			ufrns[i].showInfo();
			System.out.println();
		}
		for(int i=0; i<ccnt; i++){
			cfrns[i].showInfo();
			System.out.println();
		}
	}
}