package banking;
/**
 * Represents a chequing or savings account for a customer
 * @author Ming Chai
 */
public class BankAccount {
  /**
   * Type of account; chequing or savings
   */
  String accountType;

  /**
   * Balance for bank account
   */
  double balance;

  /**
   * Customer for this account
   */
  Customer customer;

  // Constructor
  /**
   * Creates the given account type for the given customer
   * @param accountType for bank account
   * @param customer for bank account
   */
  public BankAccount(String accountType, Customer customer){
    this.accountType = accountType;
    this.customer = customer;

  }

  // Methods
  /**
   * Adds the specified amount to the account's balance
   * @param amount
   */
  public void deposit(double amount){
    this.balance += amount;
  }
  /**
   * Deducts the specified amount from the account's balance
   * @param amount to be withdrawn
   * @throws Exception if the amount to be withdrawn is greater than the available balance
   */
  public void withdraw(double amount) throws Exception{
    if(amount > this.balance){
      throw new Exception("Amount is greater than the available balance");
    }
    this.balance -= amount;
  }

  /**
   * Get the account type and balance
   * @return the account type and balance as a string
   */
  public String getAccountInfo(){
    return this.accountType + ": " + this.balance;
  }

  /**
   * Get the customer's name and address
   * @return the customer name and address as a string
   */
  public String getCustomerInfo(){
    return this.customer.getName() + ": " + this.customer.getAddress();
  }
}
