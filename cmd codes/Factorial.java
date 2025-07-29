public class Factorial {
    public static void main(String[] args) {
        int number = 5; // Change this number to calculate factorial
        
        long factorial = calculateFactorial(number);
        
        System.out.println("Factorial of " + number + " is: " + factorial);
    }
    
    // Function to calculate factorial recursively
    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
}
