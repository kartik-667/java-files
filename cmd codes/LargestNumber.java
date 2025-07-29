public class LargestNumber {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 15;
        
        int largest = findLargest(num1, num2, num3);
        
        System.out.println("The largest number is: " + largest);
    }
    
    // Function to find the largest of three numbers
    public static int findLargest(int num1, int num2, int num3) {
        int largest = num1;
        
        if (num2 > largest) {
            largest = num2;
        }
        
        if (num3 > largest) {
            largest = num3;
        }
        
        return largest;
    }
}
