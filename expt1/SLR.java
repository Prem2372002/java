import java.util.Scanner;
public class SLR
{
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        int min=0,max=0,n,i;
        System.out.println("Enter no. of Elements: ");
        n=s.nextInt();
        System.out.println("enter the elements");
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        min=arr[0];
        max=arr[0];
        for(i=0;i<n;i++)
        {
            if(min>arr[i])
            {
                min=arr[i];
            }
            if(max<arr[i])
            {
                max=arr[i];
            }
        }
        System.out.println("Maximum Element: "+max);
        System.out.println("Minimum Element: "+min);
    }
    
}
