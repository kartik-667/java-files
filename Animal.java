
// // record Person(String name, int age) {}



// // public sealed class Shape permits Circle, Sqaure, Rectangle {};


// // public final class Circle extends Shape {}

// // public final class Sqaure extends Shape {}

// // public non-sealed class Rectangle extends Shape {}


// // public class Person {
// //     private final String name;
// //     private final int age;
    
// //     public Person(String name, int age) {
// //         this.name = name;
// //         this.age = age;
// //     }
    
// //     public String getName() { return name; }
// //     public int getAge() { return age; }
    
// //     @Override
// //     public boolean equals(Object o) { /* implementation */ }
// //     @Override
// //     public int hashCode() { /* implementation */ }
// //     @Override
// //     public String toString() { /* implementation */ }
// // }


// // public class Main {
// //     public static void main(String[] args) {

// //         Person person1 = new Person("Alice", 30);
// //         Person person2 = new Person("Bob", 25);

// //         // Accessing fields using accessor methods
// //         System.out.println(person1.name()); // Outputs: Alice
// //         System.out.println(person1.age());  // Outputs: 30

// //         // Using the automatically generated toString() method
// //         System.out.println(person1); // Outputs: Person[name=Alice, age=30]

// //         // Using the automatically generated equals() method
// //         System.out.println(person1.equals(person2)); // Outputs: false

// //         // Using the automatically generated hashCode() method
// //         System.out.println(person1.hashCode());
// //         System.out.println(person2.hashCode());
        
// //     }
// // }

// // Define a sealed class Animal
// public sealed class Animal permits Dog, Cat {
//     // Common properties and methods for all animals can be defined here
//     public abstract void makeSound();
// }

// // Define a final class Dog that extends Animal
// public final class Dog extends Animal {
//     @Override
//     public void makeSound() {
//         System.out.println("Woof!");
//     }
// }

// // Define a final class Cat that extends Animal
// public final class Cat extends Animal {
//     @Override
//     public void makeSound() {
//         System.out.println("Meow!");
//     }
// }

// // Main class to test the sealed class and its subclasses
// public class Main {
//     public static void main(String[] args) {
//         Animal dog = new Dog();
//         Animal cat = new Cat();

//         dog.makeSound(); // Output: Woof!
//         cat.makeSound(); // Output: Meow!
//     }
// }
// Define a sealed class Animal



public abstract sealed class Animal permits Dog, Cat {
    // Common properties and methods for all animals can be defined here
    public abstract void makeSound();
}
// Define a final class Dog that extends Animal
public final class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}
// Define a final class Cat that extends Animal
public final class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}
// Main class to test the sealed class and its subclasses
public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound(); // Output: Woof!
        cat.makeSound(); // Output: Meow!
    }
}

