public class PalindromeNumbers {
    public static void main(String[] args) {
        int limit = 20; // Change this limit as needed
        
        System.out.println("Palindrome numbers up to " + limit + ":");
        
        // Loop through numbers from 1 to the limit
        for (int num = 1; num <= limit; num++) {
            if (isPalindrome(num)) {
                System.out.print(num + " ");
            }
        }
    }
    
    // Function to check if a number is palindrome
    public static boolean isPalindrome(int num) {
        int originalNum = num;
        int reverseNum = 0;
        
        // Reverse the number
        while (num > 0) {
            int digit = num % 10;
            reverseNum = reverseNum * 10 + digit;
            num /= 10;
        }
        
        // Check if the original number is equal to its reverse
        return originalNum == reverseNum;
    }
}
