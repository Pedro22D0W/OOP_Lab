
public class UserAccount {
    private int accountNumber;
    private String name;
    private double cash = 0.0;
    private double Limit;
    private String passWord = "0000";



    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getLimit() {
        return Limit;
    }
    public void setLimit(double limit) {
        Limit = limit;
    }
    public double getCash() {
        return cash;
    }

    

    public void show(){
        System.out.println("DADOS:");
			System.out.println(this.getAccountNumber());
			System.out.println(this.getName());
			System.out.println(this.getCash());
			System.out.println(this.getLimit());
    }

    public void changPassword(String new_password){
        passWord = new_password;
        System.out.println(passWord);
	
    }
}
