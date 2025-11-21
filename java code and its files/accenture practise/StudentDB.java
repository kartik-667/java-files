import java.util.*;


class student{

    String name;
    int marks;
    int rollno;

    student(String n, int mark, int roll){
        name=n;
        marks=mark;
        rollno=roll;
    }


    boolean isPassed(){
        return marks>=40;
    }

    
}

class studentDB{
    private ArrayList<student> students;

    studentDB(){
        this.students=new ArrayList<>();
    }

    void getHighest(){
        ArrayList<student> temp=new ArrayList<>();
        int maxi=0;
        for(student s:students){
            if(s.marks > maxi){
                maxi=s.marks;
                temp.clear();
                temp.add(s);
            }else{
                temp.add(s);
            }
        }

        System.out.println(temp);

    }

    void addStudent(String  name,int marks, int roll){
        students.add(new student(name, marks, roll));

    }

    void getAllstudents(){
        for(student s:students){
            System.out.println(s.name+" "+s.rollno);
        }
    }
}

public class StudentDB {
    public static void main(String[] args) {
        // System.out.println("hey");
        studentDB db=new studentDB();

        db.addStudent("kartik", 95, 1);
        db.addStudent("rishabh", 88, 2);
        db.addStudent("rishu", 99, 3);

        db.getAllstudents();
        db.getHighest();
    }
    
}
