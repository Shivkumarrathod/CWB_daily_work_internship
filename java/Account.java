public class Account {
    private int id;
    private String firstName;
    private String lastName;
    private float balance;
    private boolean active;
    private String branch;
    
    public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    public Account(int id, String firstName, String lastName, float balance, boolean active, String branch) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
        this.active = active;
        this.branch = branch;
    }

    @Override
    public String toString(){
        return "Account [id ="+id+" , First Name ="+firstName+" , Last Name="+lastName+" , Balance = "+balance+", Active Account = "+active+" , Branch = "+branch+"]";
    }

    public void withdraw(float amount){
        if(amount<=0){
           System.out.println("You cant transfer amount which is less than or equal to zero");
           return;
        }
        else if(amount%100==0){
            System.out.println("Entered amount must be a multiple of 100");
            return;
        }
        else if((balance-amount)<=1000){
            System.out.println("Insufficient Amount");
            return;
        }
        balance-=amount;
	}
	
	public void deposit(float amount) {
			
			balance+=amount;
	}
	
	public void transfer(Account acc1,Account acc2,float amount)
	{
		acc1.withdraw(amount);
		acc2.deposit(amount);
		
	}
}
