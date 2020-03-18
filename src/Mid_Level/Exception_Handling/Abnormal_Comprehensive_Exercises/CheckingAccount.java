package Mid_Level.Exception_Handling.Abnormal_Comprehensive_Exercises;

public class CheckingAccount extends Account {

    private  double overdraftProtection;

    public CheckingAccount(double balance) {
        super(balance);
    }

    public CheckingAccount(double balance,double overdraftProtection){
        super(balance);
        this.overdraftProtection = overdraftProtection;
    }

    public void withdraw(double amt) throws OverDraftException{
        if(amt > this.balance + overdraftProtection){
            double deficit = amt - (this.balance + overdraftProtection);
            throw new OverDraftException("透支额度超标",deficit);
        }
        this.balance -=amt;
    }

    public static void main(String[] args) {
        CheckingAccount a = new CheckingAccount(1000,500);
        a.deposit(1000);
        System.out.println(a.getBalance());
        try{
            a.withdraw(600);
            System.out.println(a.getBalance());
            a.withdraw(600);
            System.out.println(a.getBalance());
            a.withdraw(600);
            System.out.println(a.getBalance());
            a.withdraw(600);
            System.out.println(a.getBalance());
            a.withdraw(600);
            System.out.println(a.getBalance());
        }catch (OverDraftException e){
            System.out.println("透支超标"+e.getDeficit());
            e.printStackTrace();
        }
    }
}
