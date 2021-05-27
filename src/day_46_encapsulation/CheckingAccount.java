package day_46_encapsulation;

public class CheckingAccount {
    private long balance;
    private int accountNumber;
    private String accountHolder;
    private String type = "checking";
    public void setBalance(long balance){
        this.balance=balance;
    }
    public double getBalance(){
        return balance;
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber=accountNumber;
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public void setAccountHolder(String accountHolder){
        this.accountHolder=accountHolder;
    }
    public String getAccountHolder(){
        return accountHolder;
    }
    public void setType(String type){
        this.type=type;
    }
    public String getType(){
        return type;
    }

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "balance=" + balance +"$"+
                ", accountNumber=" + accountNumber +
                ", accountHolder='" + accountHolder + '\'' +
                ", type='" + type + '\'' +
                '}';
        // right click->generate->Getter and Setter->select all(shift+last element)->all
        //Ctrl+Backspace will delete the whole word
    }
}
