import java.util.Scanner;
public class pattern 
{
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        int n,i=0,sum=1,j=0;
        System.out.print("Enter no. of rows: ");
        n=s.nextInt();
        for(i=0;i<n;i++)
        {
            for(j=1;j<=i+1;j++)
            {
                System.out.print(sum);
                sum=sum+1;
                
            }
            System.out.println();
            sum=1;
        }
        
    }
}