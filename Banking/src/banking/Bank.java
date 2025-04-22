package banking;

import java.util.Scanner;

/**
 * Represents a bank for managing customers and their bank accounts.
 * @author Ming Chai
 */
public class Bank {
  public static void main(String[] args){
    Bank bank = new Bank();
    bank.run();
  }

  private void run() {
    System.out.println("Program is running...");

    /**
     * Gets the customer's name
     */
    System.out.println("Welcome to the bank. Please provide your name: ");
    Scanner scanner = new Scanner(System.in);
    String name = scanner.next();
    
    /**
     * Get the customer's address
     */
    System.out.println("Nice to meet you, " + name + "! To continue, please provide your address: ");
    String address = scanner.next();
    
    /**
     * Create a new customer
     */
    Customer customer = new Customer(name);
    customer.setAddress(address);

    System.out.println("Thank you. What type of account are you setting up today?");
    String accountType = scanner.next();
    BankAccount account = new BankAccount(accountType, customer);
    System.out.println(account.getAccountInfo());
    System.out.println(account.getCustomerInfo());

    System.out.println("How much would you like to deposit into your account today?");
    double depositAmount = scanner.nextDouble();
    account.deposit(depositAmount);
    System.out.println(depositAmount + " deposited.");
    System.out.println("Here is your updated account info: " + account.getAccountInfo());

    System.out.println("\nHow much would you like to withdraw from your account today?");
    double withdrawalAmount = scanner.nextDouble();
    try {
      account.withdraw(withdrawalAmount);
      System.out.println(withdrawalAmount + " withdrawn.");
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    System.out.println("Here is your updated account info: " + account.getAccountInfo());
    System.out.println("Here is your updated customer info: " + account.getCustomerInfo());
    System.out.println("Thank you for banking with us, " + customer.getName() + "!");
    System.out.println("Have a great day!");
    scanner.close();
  }
}
