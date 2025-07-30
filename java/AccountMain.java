public class AccountMain {
 
	public static void main(String[] args) {
		Account account1=new Account(101, "Ramesh", "Sharma", 3000, true, "Mumbai");
		System.out.println(account1);
 
		Account account2=new Account(101, "Amitabh", "Bachan", 5000, true, "Mumbai");
		System.out.println(account2);
		account2.withdraw(500);
		System.out.println(account2);
		System.out.println("Transfer");
		account2.transfer(account2, account1, 4500);
		System.out.println(account1);
		System.out.println(account2);
		
	}
}