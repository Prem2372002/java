/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.util.Scanner;
class student
{
    Scanner s=new Scanner(System.in);
    String name;
    int reg;
    int tw=365;
    int tp;
    void details()
    {
        System.out.println("Enter Name: ");
        name=s.next();
        System.out.println("Enter Reg no.: ");
        reg=s.nextInt();
        System.out.println("Enter Days Present: ");
        tp=s.nextInt();
    }
    int internal()
    {
        if(tp*100/tw>=90)
        {
            return 5;
        }
        else if(tp*100/tw>=80)
        {
            return 4;
        }
        else if(tp*100/tw>=75)
        {
            return 3;
        }
        else if(tp*100/tw<75)
        {
            return 0;
        }
        else
        {
            return 0;
        }
    }
    
}
public class NewMain4
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Size: ");
        int n=s.nextInt();
        student obj[]=new student[n];
        int i;
        for(i=0;i<n;i++)
        {
            obj[i]= new student();
            obj[i].details();
        }
        int o;
        System.out.println("Enter Student reg no. to get Internal Mark");
        o=s.nextInt();
        System.out.println("Internal Mark: "+obj[i].internal());
    }
}