class Account {  

  private long accountNumber;  
  private String name;
  private String email;  
  private float amount;

  public long getAccountNumber() {  
    return accountNumber;  
  }  

  public void setAccountNumber(long accountNumber) {  
    this.accountNumber = accountNumber;  
  }  

  public String getName() {  
      return name;  
  }  

  public void setName(String name) {  
      this.name = name;  
  }  

  public String getEmail() {  
      return email;  
  }  

  public void setEmail(String email) {  
      this.email = email;  
  }  

  public float getAmount() {  
      return amount;  
  }  

  public void setAmount(float amount) {  
      this.amount = amount;  
  }  
}

public class Encapsulation {
  public static void main(String[] args) {
    Account account = new Account();
  
    //account.accountNumber = 112233;

    account.setAccountNumber(112233);
  }
}