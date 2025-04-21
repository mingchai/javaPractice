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
}
