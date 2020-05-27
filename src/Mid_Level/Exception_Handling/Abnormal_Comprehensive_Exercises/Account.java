package Mid_Level.Exception_Handling.Abnormal_Comprehensive_Exercises;

public class Account { //账户类
    protected double balance; //属性#余额

    public Account(double balance){
        this.balance = balance;
    }

    public double getBalance(){ //方法+获取余额
        return balance;
    }

    public void deposit(double amt){//方法+存钱
        this.balance += amt;
    }
    public void withdraw(double amt) throws OverDraftException{//方法+取钱
        if (this.balance < amt)
            throw new OverDraftException("余额不足",amt-this.balance);//异常 透支异常 继承exception
        this.balance -= amt;
    }

    public static void main(String[] args) {
        Account a = new Account(1000);
        a.deposit(1000);
        System.out.println(a.getBalance());
        try{
            a.withdraw(2001);
        } catch (OverDraftException e){
            System.out.println("透支金额"+e.getDeficit());//透支额
            e.printStackTrace();
        }
    }
}
