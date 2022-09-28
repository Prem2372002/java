package exp_6;
import java.util.Scanner;
public class DistanceFromAverageWithExceptionHandling
{
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        int array_size,i;
        double ele,avg=0.00,diff=0.00;
        while(true)
        {
            
            try
            {
                System.out.println("Enter Array Size: ");
                array_size=s.nextInt();
                if(array_size<0)
                {
                    throw new NegativeArraySizeException("Negative Array Size");
                }
                else
                {
                    double[] values=new double[array_size];
                    break;
                }
            }
            catch(NegativeArraySizeException e)
            {
                System.out.println(e);
            }
        }
        double[] values=new double[array_size];
        for(i=0;i<array_size;i++)
        {
            try
            {
                System.out.println("Enter Element");
                ele=s.nextDouble();
                if(ele%1==0)
                {
                    values[i]=ele;
                }
                else
                {
                    throw new NumberFormatException("Invalid Element");
                }
            }
            catch(NumberFormatException e)
            {
                System.out.println(e);
            }
        }
        for(i=0;i<array_size;i++)
        {
            if(values[i+1]%1==0)
            {
                diff=values[i]-values[i+1];
                avg=avg+values[i];
            }
            System.out.println("The Distance between "+values[i]+" and "+values[i+1]+"is: "+diff);
        }
        System.out.println("Average Distance: "+avg);
    }   
}
