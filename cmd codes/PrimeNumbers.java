public class PrimeNumbers {
    public static void main(String[] args) {
        int limit = 50; // Change this limit as needed
        
        System.out.println("Prime numbers up to " + limit + ":");
        
        // Loop through numbers from 2 to the limit
        for (int num = 2; num <= limit; num++) {
            boolean isPrime = true;
            
            // Check if num is divisible by any number from 2 to its square root
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            
            // If num is prime, print it
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}
