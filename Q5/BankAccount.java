class BankAccount{
    String name;
    double deposit;
    double withdraw;
    double balance;

}

SetDeposit(double deposit){
    this.deposit=deposit;
}

SetWithdraw(double withdraw){
    this.withdraw=withdraw;
}

SetBalance(double balance){
    this.balance=balance;
}

int Deposit(){
    
    return deposit;
}

int Withdraw(){
    
    return withdraw;
}

void DisplayBalance(){
    System.out.println("Your balance is "+ balance);
}

class App{
    public static void main(String[] args){
        BankAccount ba=new BankAccount();
        
        System.out.println("Your Deposit is Rs. "+ba.Deposit());
        System.out.println("You have withdrawn Rs. "+ba.Withdraw);
        ba.DisplayBalance();
    }
}