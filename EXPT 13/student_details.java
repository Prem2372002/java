import java.util.*;
import java.util.Scanner;
public class std_cgpa {
    public static void main(String[] args) {
        int num;
        Scanner obj=new Scanner(System.in);
        Student arr[]=new Student[20];
        System.out.println("enter the no of student:");
        num=obj.nextInt();
        ArrayList<Student> list=new ArrayList<>();
        if (num<=20)
        {
        for(int i=1;i<=num;i++)
        {
            arr[i]=new Student( );
            arr[i].getdata(i,num);
            list.add(arr[i]);
        }
        System.out.println("             STUDENT DETAILS                  ");
        System.out.println(list);
        System.out.println("\n\n\n");
        System.out.println("Student Details after Sorted  by their CGPA: ");
        Collections.sort(list, new sorting());
        System.out.println(list);
        }
        else 
        {
                    System.out.println("CAN'T ADD FURTHUR STUDENT DETAILS");
        
        }
    }
}
class Student
{
    String name;
    String rollno;
    double cgpa;
    void getdata( int i,int num)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter student"+ i +" Name:");
        name=obj.next();
        System.out.println("Enter student " + i+ " Roll number:");
        rollno=obj.next();
        System.out.println("Enter student " + i+" CGPA:");
        cgpa=obj.nextDouble();
    }
    @Override
    public String toString()
            
    {      
        return "\n NAME :"+ name + "  :: Roll No.=" + rollno +  "  :: CGPA=" + cgpa + "\n";
        
    }
    
}

class sorting implements Comparator<Student>
{
    public int compare(Student s1,Student s2)
    {
        return Double.compare(s2.cgpa, s1.cgpa);
    }
}
