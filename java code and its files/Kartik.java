
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}
 class PolymorphismExample {
    // Method to add two integers
    static int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    static int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to concatenate two strings
    static String add(String a, String b) {
        return a + b;
    }
}



class Vehicle {
    void move() {
        System.out.println("Vehicle is moving...");
    }
}

class Car extends Vehicle {
    void accelerate() {
        System.out.println("Car is accelerating...");
    }
}

// Multilevel Inheritance
class Airplane extends Vehicle {
    void fly() {
        System.out.println("Airplane is flying...");
    }
}

class Jet extends Airplane {
    void supersonic() {
        System.out.println("Jet is flying at supersonic speed...");
    }
}

// Hierarchical Inheritance
class Bicycle extends Vehicle {
    void pedal() {
        System.out.println("Bicycle is being pedaled...");
    }
}

class Motorcycle extends Vehicle {
    void revEngine() {
        System.out.println("Motorcycle is revving its engine...");
    }
}
//     public static void main(String[] args) {
    //         MathOperations mathObj = new MathOperations();
    
    //         // Calling instance method
    //         double result1 = mathObj.square(5.5); // we have to use "." operator
    //         System.out.println("Square of 5.5 is: " + result1); // Output: Square of 5.5 is: 30.25
    
    //         // Calling static method
    //         int result2 = factorial(5); // we can call directly without using "." operator
    //         System.out.println("Factorial of 5 is: " + result2); // Output: Factorial of 5 is: 120
    //     }
    // }
    
    
class MathOperations {
        // Instance method to calculate the square of a number
        double square(double num) {
            return num * num;
        }
        // Static method to calculate the factorial of a number
        static int factorial(int n) {
            if (n == 0)
                return 1;
            else
                return n * factorial(n - 1);
        }
    }

// public class Kartik{
//     public static void main(String args[]){
//         MathOperations mathObj = new MathOperations();

//         // Calling instance method
//         double result1 = mathObj.square(5.5); // we have to use "." operator
//         System.out.println("Square of 5.5 is: " + result1); // Output: Square of 5.5 is: 30.25

//         // Calling static method
//         int result2 = factorial(5); // we can call directly without using "." operator
//         System.out.println("Factorial of 5 is: " + result2); // Output: Factorial of 5 is: 120
//     }
// }

// PolymorphismExample p1=new PolymorphismExample();
// Single level Inheritance
// Car car = new Car();
// car.move(); // Output: Vehicle is moving...
// car.accelerate(); // Output: Car is accelerating...
// System.out.println();

// // Multilevel Inheritance
// Jet jet = new Jet();
// jet.move(); // Output: Vehicle is moving...
// jet.fly(); // Output: Airplane is flying...
// jet.supersonic(); // Output: Jet is flying at supersonic speed...
// System.out.println();
// // Hierarchical Inheritance
// Bicycle bicycle = new Bicycle();
// bicycle.move(); // Output: Vehicle is moving...
// bicycle.pedal(); // Output: Bicycle is being pedaled...
// System.out.println();
// Motorcycle motorcycle = new Motorcycle();
// motorcycle.move(); // Output: Vehicle is moving...
// motorcycle.revEngine();


// int sum1 = p1.add(5, 10); // Invokes the first add method
// int sum2 = p1.add(5, 10, 15); // Invokes the second add method
// String result = p1.add("Hello, ", "world!"); // Invokes the third add method

// System.out.println("Sum of two integers: " + sum1); // Output: Sum of two integers: 15
// System.out.println("Sum of three integers: " + sum2); // Output: Sum of three integers: 30
// System.out.println("Concatenated string: " + result);

// Animal animal1 = new Animal();
// Animal animal2 = new Dog(); // constructor of "DOG" class will be called
// Animal animal3 = new Cat(); // constructor of "Cat" class will be called
// // but the object is of Animal class---


// animal1.sound(); // Output: Animal makes a sound
// animal2.sound(); // Output: Dog barks
// animal3.sound(); // Output: Cat meows


public class Kartik {
    // Instance method to calculate the square of a number
    double square(double num) {
        return num * num;
    }

    // Static method to calculate the factorial of a number
    static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Kartik mathObj = new Kartik();

        // Calling instance method
        double result1 = mathObj.square(5.5);
        System.out.println("Square of 5.5 is: " + result1); // Output: Square of 5.5 is: 30.25

        // Calling static method
        int result2 = factorial(5);
        System.out.println("Factorial of 5 is: " + result2); // Output: Factorial of 5 is: 120
    }
}