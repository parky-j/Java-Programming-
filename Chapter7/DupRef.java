class DupRef{
	public static void main(String[] args){
		BankAccount ref1=new BankAccount();
		BankAccount ref2=ref1;
	
		ref1.deposit(3000);
		ref2.withdraw(1000);
		ref1.deposit(1000);

		ref1.checkMyBalance();
		ref2.checkMyBalance();
	}
}
class BankAccount{
	int balance = 0;

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
