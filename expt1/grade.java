/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
package array;
import java.util.Scanner;
public class grade
{
    public static void main(String[] args)
    {
      int marks,grade;
      Scanner obj= new Scanner(System.in);
      System.out.println("Enter the marks");
      marks=obj.nextInt();
      if(marks>=90) 
      {
          System.out.println("O grade");
                  grade='O';
      }
      else if(marks>=80 && marks<90)
      {
          System.out.println("A garde");
          grade='A';
      }
      
      else if(marks>=60 && marks<70)
      {
          System.out.println("C garde");
          grade='C';
      }
      else if(marks>=50 && marks<60)
      {
          System.out.println("D garde");
          grade='D';
      }
      else
      {
          System.out.println("Fail");
          grade='F';
      }
      switch(grade)
      {
          case 'O':
              System.out.println("outstanding");
              break;
          case 'A':
              System.out.println("Excellent");
              break;
          case 'B':
              System.out.println("Very good");
              break;
          case 'C':
              System.out.println("Good");
              break;
          case 'D':
              System.out.println("can improve");
              break;
          default:
              System.out.println("Fail");
              break;
         
              
          
      
             
      }
      
    }
    
    
}
