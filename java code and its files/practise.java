import java.util.Scanner;
import java.util.*;


class student{
    public String name;
    public Integer marks;

    student(String n, Integer i){
        this.name=n;
        this.marks=i;
    }

    public void getInfo(){
        System.out.println("name is"+name+"marks is"+marks);

    }


}

public class practise {
    public static void main(String[] args) {
        ArrayList<student> l=new ArrayList<>();

        ArrayList<String> names=new ArrayList<>();
        names.add("kartik");
        names.add("rishabh");
        names.add("akshat");

        for(String n:names){
            l.add(new student(n, 96));

        }

        // System.out.println(l);
        for(student s:l){
            s.getInfo();
        }

    //     Scanner sc=new Scanner(System.in);
    //     System.out.println("enter ur string");
    //     // String str=sc.nextLine();
    //     HashMap mp=new HashMap<Integer,Integer>();
    //     ArrayList<String> l1=new ArrayList<String>();
    //     l1.add("kartik");
    //     l1.add("kartik2");
    //     l1.add("kartik3");

    //     HashSet<Integer> st=new HashSet<>();
    //     st.add(123);
    //     st.add(123);
    //     st.add(123);

    //     st.size();
    //     st.add(123);

    //     System.out.println(st.size());

    //     System.out.println("set is"+st);

    //     // l1.removeLast();
    //     System.out.println(l1);
        

    }
    
}
