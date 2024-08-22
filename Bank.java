

package bank;

class Account {
    public String name;
    protected String password;

    //getters and setters
    public String gePassword() {
        return this.password;
    }

    public void setPassword(String pass ) {
        this.password = pass;
    }


} 
  


public class Bank {
    public static void main (String args[] ) {
        Account account1 =  new Account();
        account1.name = "apna collage";
        account1.setPassword("abcd");
        System.out.println(account1.gePassword());

    }
}