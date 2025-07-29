
import java.util.*;

sealed class A permits B,C {
    void fnc(){
        System.out.println("this is a fnc of class A");
    }
}

final class B extends A{

}
final  class C extends A{

}
final class D {

}


record Car(String name,int miles, int year){}

record Bike(String nm, int cost){
    //passing nothing
}


// record Bike(String nm, int price){}







// record Car2(String nm,int age){}




class OddNumberException extends Exception{

    OddNumberException(String msg){
        super(msg);
    }

}



public class Main{
    public static void main(String[] args) {
        //records and sealed classes:-

        // Bike b1=new Bike("ktm",1234);
        
        // Bike nb=new Bike("ktm", 123444);
        // System.out.println(nb.toString());

        try{
            Scanner sc=new Scanner(System.in);
            System.out.println("enter a number");
            int n=sc.nextInt();
            if(n%2==1){
                throw new OddNumberException("the no is odd, exception takes place");
            }

        }
        catch(OddNumberException e){
            // System.out.println(e.getMessage());
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("this is the finally block");
        }
    
        

       
    }
}
