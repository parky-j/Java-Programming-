
class BankAccount{
	int balance=0;
	
	public int deposit(int amount){
		balance+=amount;
		return balance;
	}
	public int withdraw(int amount){
		balance-=amount;
		return balance;
	}
	public int checkMyBalance(){
		System.out.println("Balance : "+balance);
		return balance;
	}
}
class BankAccount00{
	public static void main(String[] args){
		BankAccount yoon = new BankAccount();
		BankAccount park = new BankAccount();
		
		yoon.deposit(5000);
		park.deposit(3000);
		yoon.checkMyBalance();
		park.checkMyBalance();
		
		yoon.withdraw(2000);
		park.withdraw(1000);
		yoon.checkMyBalance();
		park.checkMyBalance();
	}
}

