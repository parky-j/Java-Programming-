class BankAccountUniID{
	public static void main(String[] args){
		BankAccount yoon=new BankAccount();
		yoon.initAccount("12-34-56","990990-9090990",10000);

		BankAccount park=new BankAccount();
		park.initAccount("33-55-77","778899-1234567",10000);

		yoon.deposit(4000);
		yoon.withdraw(1000);
		
		park.deposit(3000);
		park.withdraw(1000);

		yoon.checkMyBalance();
		park.checkMyBalance();
	}
}
class BankAccount{
	String accNumber;
	String ssNumber;
	int balance = 0;

	public void initAccount(String acc, String ss, int bal){
		accNumber=acc;
		ssNumber=ss;
		balance=bal;
	}

	public int deposit(int amount){
		balance+=amount;
		return balance;
	}
	public int withdraw(int amount){
		balance-=amount;
		return balance;
	}
	public int checkMyBalance(){
		System.out.println("Balance: "+balance);
		return balance;
	}
}