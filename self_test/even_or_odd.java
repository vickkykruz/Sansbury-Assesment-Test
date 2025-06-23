import java.util.Scanner;

public class EvenOrOdd {
  public static void main(String[]arg) {

    // Ask the user for a Whole number
    System.out.println("Enter an Integer Number");
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();

    if (number % 2 == 0) {
      System.out.println("This number is an Even number");
    } else {
      System.out.println("This number is an Odd number");
    }
  }
}
