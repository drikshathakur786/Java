package bank;

class  Account{
    public String  name;
    protected String email;
    private String password;

    // getters & setters
    public String getPassword(){
        return this.password;
    }
    public void setPassword(String pass){
        this.password=pass;
    }
}

public class Bank{
    public static void main(String[] args) {
        Account account1= new Account();
        account1.name= "Apna college";
        account1.email="apnacollege@gmail.com";
        account1.password="abcd"; // private h esliye error
        
        account1.setPassword("abcd");
        System.out.println(account1.getPassword());
    }
}

