package banking;

/**
 * Represents a customer of a bank
 */
public class Customer {
  // instance variables
  /**
   * Name of customer
   */
  String name;

  /**
   * Address of customer
   */
  String address;

  // Constructor
  /**
   * creates a customer with the given name
   * @param name of customer
   */
  public Customer(String name){
    this.name = name;
  }

  // Methods
  /**
   * Sets the address of customer to the given address
   * @param address
   */
  public void setAddress(String address){
    this.address = address;
  }

  /**
   * Retrieves the customer's name
   * @return the name of the customer as a String
   */
  public String getName(){
    return this.name;
  }


}
