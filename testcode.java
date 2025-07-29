

abstract class Shape{
    abstract void area();

    abstract void perimeter();

}

  class Circle extends Shape{
        int radius;

        Circle(int r){
            this.radius=r;
        }

        void area(){
            double result= 3.14 * radius*radius ;
            System.out.println("area is :- "+result);
        }

        void perimeter(){
            double result= 3.14 * 2 *radius ;
            System.out.println("perimeter is :- "+result);
        }
}


 class Triangle extends Shape{
    int base;
    int height;

    Triangle(int b, int h){
        this.base=b;
        this.height=h;
    }

    void area(){
        double result= (1/2) * base *height ;
        System.out.println("area is :- "+result);
    }

    void perimeter(){
        int result= 3* base ;
        System.out.println("perimeter is :- "+result);
    }
}





public class testcode {

    public static void main(String[] args) {
        // System.out.println("hiiii");

        Circle obj1 = new Circle(4);
        obj1.area();
    }
    
}
