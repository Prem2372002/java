package expt_8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class resume{
    public static void main(String[] args) throws FileNotFoundException, IOException {
       
 NewThread ob1 = new NewThread("One");
 NewThread ob2 = new NewThread("Two");
 try
 {
 Thread.sleep(1000);
 ob1.mysuspend();
 
 Thread.sleep(1000);
ob1.myresume();

 ob2.mysuspend();
 
 Thread.sleep(1000);
ob2.myresume();
 }
 catch (InterruptedException e)
 {
 
 }
 try
 {

 ob1.t.join();
 ob2.t.join();
 }
 catch (InterruptedException e)
 {
 System.out.println("Main thread Interrupted");
 }
 System.out.println("Main thread exiting.");
 }  
    }
   
class NewThread implements Runnable
{
 String name;
 Thread t;
 boolean suspendFlag;
 NewThread(String threadname)
 {
 name = threadname;
 t = new Thread(this, name);
 System.out.println("New thread: " + t);
 suspendFlag = false;
 t.start();
 }
public void run() {
 try {
 for(int i = 5; i > 0; i--)
 {
     try
     {
        if(i==1)
        {
           t.stop();
        }
     }
     catch(Exception e)
     {
         System.out.println(e);
     }
System.out.println(name + ": " + i);
 Thread.sleep(200);
 synchronized(this)
 {
 while(suspendFlag)
 {
 wait();
 }
 }
 }
 }
 catch (InterruptedException e)
 {
 System.out.println(name + " interrupted.");
 }
 System.out.println(name + " exiting.");
}
 synchronized void mysuspend()
 {
 suspendFlag = true;
}
 synchronized void myresume()
 {
 suspendFlag = false;
 notify();
 }
synchronized static void stop()
{
     int i = 0;
if(i==1);
}

}
