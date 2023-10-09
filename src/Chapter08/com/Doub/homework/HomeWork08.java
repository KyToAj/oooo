package Chapter08.com.Doub.homework;

public class HomeWork08 {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(25000);
        bankAccount.deposit(500);
        System.out.println(bankAccount.getBalance());
        bankAccount.withdraw(4800);
        System.out.println(bankAccount.getBalance());
        CheckingAccount checkingAccount = new CheckingAccount(25000);
        checkingAccount.deposit(500);
        System.out.println(checkingAccount.getBalance());
        checkingAccount.withdraw(4800);
        System.out.println(checkingAccount.getBalance());
        SavingsAccount savingsAccount = new SavingsAccount(25000);
        savingsAccount.deposit(500);
        System.out.println(savingsAccount.getBalance());
        savingsAccount.withdraw(4800);
        System.out.println(savingsAccount.getBalance());
        savingsAccount.deposit(500);
        System.out.println(savingsAccount.getBalance());
        savingsAccount.withdraw(4800);
        System.out.println(savingsAccount.getBalance());
        savingsAccount.earnMonthlyInterest();
        System.out.println(savingsAccount.getBalance());
        savingsAccount.deposit(500);
        System.out.println(savingsAccount.getBalance());
    }
}
class BankAccount{
private double balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }
    //存款
    public void deposit(double amount){
        balance +=amount;
    }
    //取款
    public void withdraw(double amount){
        balance-=amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

class CheckingAccount extends BankAccount{

    public CheckingAccount(int balance) {
        super(balance);
    }
    //重写，每次收取一块钱手续费
    @Override
    public void deposit(double amount) {
        super.deposit(amount - 1);
//        setBalance(getBalance()-1);
    }
//重写，每次收取一块钱手续费
    @Override
    public void withdraw(double amount) {
        super.withdraw(amount + 1);
//        setBalance(getBalance()-1);
    }
}
class SavingsAccount extends BankAccount{
    private int count = 0;
    private double rate = 0.15;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public SavingsAccount(int balance) {
        super(balance);
    }
    public void earnMonthlyInterest(){
        setCount(0);
        super.deposit(getBalance()*rate);
    }

    @Override
    public void deposit(double amount) {
        if(count < 3){
            super.deposit(amount);
            count++;
        }
        else
        {
            super.deposit(amount-1);
        }
    }

    @Override
    public void withdraw(double amount) {
        if(count < 3){
            super.withdraw(amount);
            count++;
        }else
        {
            super.withdraw(amount+ 1);
        }
    }
}