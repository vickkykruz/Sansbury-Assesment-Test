public class FizzBuzz {
  public static void main(String[]arg) {

    // Define the loop
    for (int i = 1; i <= 20; i++) {
     if (i % 3 == 0 && i % 5 == 0) {
        System.out.println(i + " = FizzBuzz");
      } else if (i % 5 == 0) {
        System.out.println(i + " = Buzz");
      } else if (i % 3 == 0) {
        System.out.println(i + " = Fizz");
      }
    }

  }
}
