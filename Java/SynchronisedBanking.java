 class AccountA{
	public int balance;
	public int accNo;
	void displayBalance(){
		System.out.println("Account No: " + accNo + " Balance: " + balance);
	}
	synchronized void deposit(int amt){
		balance += amt;
		System.out.println(amt +" is deposited");
		displayBalance();
	}
	synchronized void withdraw(int amt){
		balance -= amt;
		System.out.println(amt +" is withdrawn");
		displayBalance();
	}
}

class TransactionDeposit implements Runnable
{
	int amt;
	AccountA acc1;
	TransactionDeposit(AccountA a, int amt){
		acc1 = a;
		this.amt = amt;
		new Thread(this).start();
	}
	public void run(){
		acc1.deposit(amt);
	}
}

class TransactionWithdraw implements Runnable
{
	int amt;
	AccountA acc2;
	TransactionWithdraw(AccountA a, int amt){
		acc2 = a;
		this.amt = amt;
		new Thread(this).start();
	}
	public void run(){
		acc2.withdraw(amt);
	}
}
		
class SynchronisedBanking
{
	public static void main(String[] args)
	{
		AccountA acc = new AccountA();
		acc.balance = 1000;
		acc.accNo = 1234;
		TransactionDeposit t1;
		TransactionWithdraw t2;
		t1 = new TransactionDeposit(acc, 500);
		t2 = new TransactionWithdraw(acc, 900);
	}
		
}