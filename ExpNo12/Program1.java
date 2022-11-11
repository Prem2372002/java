
package ExpNo12;


public class Program1 {
    public static void main(String[] args) {
        Integer n[]={1,2,3,4,5,6,7,8,9};
        test1<Integer> obj=new test1<>();
        System.out.println("BEFORE SWAP");
        for (Integer num1 : n) {
            System.out.println(num1);
        }
        obj.swap(n,2,4);
        System.out.println("AFTER SWAP");
        for (Integer num1 : n) {
            System.out.println(num1);
        }
        
        test1<Integer> obj1=new test1<>();
        obj1.c(n);
      
        test1<Integer> obj2=new test1<>();
        obj2.max(n);  
        
    }
}
class test1<T> {
    public <T> void swap(T[] a,int i,int j) {
                T temp = a[i];
                a[i] = a[j];
                a[j] = temp;
     
    }
    public  <T> void c(T[] value)
    {   int count = 0;
        for(int i=0;i<value.length;i++)
        {
            int v = (Integer)value[i];
            if(v%2==0){
                count++;
            }
            
        }
       
       System.out.println("count : "+count);
    }
    public <T extends Comparable<T>>void max(T[] a) {
    T max = a[0];
    for (T i : a) {
        if (i.compareTo(max) > 0) {
            max = i;
        }
    }
    System.out.println("THE MAXIMUM IN ARRAY IS : "+max);
}
    
    
}



  