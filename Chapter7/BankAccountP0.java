class BankAccountP0{
	static int balance=0;
	
	public static void main(String[] args){
		deposit(10000);
		checkMyBalance();
		withdraw(3000);
		checkMyBalance();
	}
	
	public static int deposit(int amount){
		balance += amount;
		return balance;
	}
	public static int withdraw(int amount){
		balance -= amount;
		return balance;
	}
	public static int checkMyBalance(){
		System.out.println("Balance : " + balance);
		return balance;
	}
}
