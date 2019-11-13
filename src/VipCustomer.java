public class VipCustomer {
    private String name;
    private int creditLimit;
    private String emailAdress;

    public VipCustomer(String name, int creditLimit, String emailAdress){
    this.name = name;
    this.creditLimit = creditLimit;
    this.emailAdress = emailAdress;
    }

    public VipCustomer(String name, int creditLimit) {
        this(name, creditLimit, "default@email.com");
        this.name = name;
        this.creditLimit = creditLimit;
    }

    public VipCustomer(){
        this("default name", 1000, "default@email.com");
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAdress() {
        return emailAdress;
    }
}
