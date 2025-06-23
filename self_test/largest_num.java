import java.util.Scanner;

public class LargestNum {
  public static void main(String[]arg) {

    // Define a variable called largest num
    int largest_num;

    // Collect the input from the user
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter your frist number");
    int num1 = scanner.nextInt();

    System.out.println("Enter your second number");
    int num2 = scanner.nextInt();

    System.out.println("Enter yout third number");
    int num3 = scanner.nextInt();

    if (num1 > num2) {
      largest_num = num1;
    } else {
      largest_num = num2;
    }

    // Second check
    if (num3 > largest_num) {
      largest_num = num3;
    }

    System.out.println("The largest number is " + largest_num);
  }
}
