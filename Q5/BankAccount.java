class BankAccount{
    String name;
    double deposit;
    double withdraw;
    double balance;

    void setDeposit(double deposit){
        this.deposit=deposit;
    }

    void setWithdraw(double withdraw){
        this.withdraw=withdraw;
    }

    void setBalance(double balance){
        this.balance=balance;
    }

    double Deposit(){
        
        return deposit;
    }

    double Withdraw(){
        
        return withdraw;
    }

    void DisplayBalance(){
        System.out.println("Your balance is "+ balance);
    }

}

class App{
    public static void main(String[] args){
        BankAccount ba=new BankAccount();
        
        System.out.println("Your Deposit is Rs. "+ba.Deposit());
        System.out.println("You have withdrawn Rs. "+ba.Withdraw());
        ba.DisplayBalance();
    }
}