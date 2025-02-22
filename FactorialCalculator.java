import java.util.Scanner;

public class FactorialCalculator {

        public static long calculateFactorial(int number) {
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

   
    public static int getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        return scanner.nextInt();
    }


    public static void displayResult(int number, long factorial) {
        System.out.println("The factorial of " + number + " is: " + factorial);
    }

 
    public static void main(String[] args) {
        int number = getInput(); // Get input from user

        
        if (number < 0) {
            System.out.println("Please enter a non-negative integer.");
            return;
        }

        long factorial = calculateFactorial(number);         displayResult(number, factorial);     }
}
