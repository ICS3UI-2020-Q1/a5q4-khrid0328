import java.util.Scanner;
/**
 * This  program that asks the user how much money they wish to invest, what their interest rate is (as a full percentage), and how many years they want to invest. It will then determine what their final balance would be.
 * @author Dafna Khripun
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    // create scanner for user input
    Scanner input = new Scanner(System.in);

    // ask the user what their starting balance is
    System.out.println("Please enter a starting balance");

    // declare a variable for users input
    double balance = input.nextDouble();

    // ask the user what their inteterest rate is
    System.out.println("Please enter your interest rate");
  
    // declare a variable for users input
    double interestRate = input.nextDouble();

    // ask the user what numbers of year would they invest for
    System.out.println("Please enter the number of years you will invest for");

    // declare a variable for users input
    int numYears = input.nextInt();

    // use a loop to determine the final balance of the investment
    for(int i = 1; i <= numYears; i++){

      // calculate the amount of money in interest
      double interest = balance * (interestRate / 100);

      // calculate the final balance for this year
      balance = balance + interest ;
    } 
    // print the final balance to the screen
    System.out.println("Your final balance would be $" + balance);
  }
}
