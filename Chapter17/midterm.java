import java.util.Scanner;

class Passenger{
	String type;
	int ntransfer, km,fee;

	public Passenger(String type, int ntransfer, int km){
		this.type = type;
		this.ntransfer = ntransfer;
		this.km = km;
		fee=0;
	}
	public void calFee(){
		if(type.equals("adult"){
			fee+=1200;
		}
		else if(type.equals("youth"){
			fee+=720;
		}
		else if(type.equals("child"){
			fee+=450;
		}
		if(km>10){
			fee+=(int)(km-10)/5*100;
		}
			
}

class midterm{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String type;
		int ntsf, km;
		Passenger[] pags = new Passenger[10];
		int cnt = 0;
		
		for(; ;cnt++){
			System.out.println("    Type    NTransfer    km");
			System.out.println("   ------   ----------  -----");
			for(int i=0; i<cnt; i++){
				System.out.printf("    %s        %d        %d",pags[i].type, pags[i].ntransfer, pags[i].km);
				System.out.println();
			}
			System.out.printf("No.%d Passenger's type(0 to exit): ", cnt);
			type = sc.nextLine();
			if(type.equals("0"))
				break;
			System.out.printf("No.%d Passenger's NTransfer(0 to exit): ", cnt);
			ntsf = sc.nextInt();
			if(ntsf==0)
				break;
			System.out.printf("No.%d Passenger's Km(0 to exit): ", cnt);
			km = sc.nextInt();
			if(km==0)
				break;
			pags[cnt] = new Passenger(type,ntsf,km);
			type=sc.nextLine();
		}
	}
}
			
			