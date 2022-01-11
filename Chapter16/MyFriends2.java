class Friend{
	protected String name;
	protected String phone;

	public Friend(String na, String ph){
		name = na;
		phone = ph;
	}
	public void showInfo(){
		System.out.println("name: " + name);
		System.out.println("phone: " + phone);
		System.out.println();
	}
}

class UnivFriend extends Friend{
	private String major;
	
	public UnivFriend(String na, String ph, String ma){
		super(na, ph);
		major = ma;
	}

	public void showInfo(){
		System.out.println("name: " + name);
		System.out.println("phone: " + phone);
		System.out.println("major: " + major);
		System.out.println();
	}
}

class CompFriend extends Friend{
	private String department;
	
	public CompFriend(String na, String ph, String de){
		super(na, ph);
		department = de;
	}

	public void showInfo(){
		System.out.println("name: " + name);
		System.out.println("phone: " + phone);
		System.out.println("department: " + department);
		System.out.println();
	}
}

class MyFriends2{
	public static void main(String[] args){
		Friend[] frns = new Friend[10];
		int cnt = 0;
		
		frns[cnt++] = new UnivFriend("Lee", "Computer", "010-333-555");
		frns[cnt++] = new UnivFriend("Seo", "Electronics", "010-222-444");
		frns[cnt++] = new CompFriend("Yoon", "R&D 1", "02-123-9999");
		frns[cnt++] = new CompFriend("Park", "R&D 2", "02-123-5555");

		for(int i=0; i<cnt; i++){
			frns[i].showInfo();
		}
		System.out.println();
		System.out.println();
		
		for(int i=0; i<cnt; i++){
			if(frns[i] instanceof UnivFriend)
				frns[i].showInfo();
			
		}
	}
}
		

		