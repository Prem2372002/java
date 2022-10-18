package exp_9;
import java.util.Scanner;
class thread extends Thread
{
    int n;
    thread(int n)
    {
        this.n=n;
    }
    @Override
    public void run()
    {
        try
        {
            Thread.sleep(1000);
            System.out.println(" Hello, I am Thread #"+n);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
public class TestThreadMany
{
    
    public static void main(String[]args)
    {
       // Scanner s=new Scanner(System.in);
        //int n;
        //System.out.println("Enter no.ofCommand lines:");
        //n=s.nextInt();
        int n=Integer.parseInt(args[0]);
        System.out.println("$ javaTestThreadMany "+n);
       thread t[]=new thread[n+1];
        for(int i=0;i<=n;i++)
        {
            t[i]= new thread(i);
            t[i].start();
        }
       
    }
}
