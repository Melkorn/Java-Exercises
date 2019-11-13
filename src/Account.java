public class Account {

    private String accountNumber;
    private double balance;
    private String name;
    private String phone;
    private String email;


    public Account(){
        System.out.println("Account created");
    }

    public Account(String accountNumber, String name, String phone, String email, double balance){
        this.accountNumber = accountNumber;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.balance = balance;


    }
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void deposite(double amount){
        this.balance = ((this.balance*100) - (amount*100))/100;
        System.out.format(String.valueOf(amount));
        System.out.print(" deposited. Current balance is ");
        System.out.print(String.valueOf(this.balance));
        System.out.println();
    }

    public void withdraw(double amount){
        if(this.balance >= amount) {
            this.balance = ((this.balance*100) - (amount*100))/100;
            System.out.format(String.valueOf(amount));
            System.out.print(" withdraw. Current balance is ");
            System.out.print(String.valueOf(this.balance));
            System.out.println();

        }else{
            System.out.println("Too low balance");
        }
    }
}
