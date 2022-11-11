
package ExpNo12;


public class Program2 {

    public static void main(String[] args) {
      
        Integer se[]={0,2,13,54,15,86};
        test4<Integer,Integer> obj=new test4<>();
        obj.search(15, se);
       
    }
   
}
class test4<S,N>
{
    boolean check=false;
   
    public  <S,N> void search(S s,N[] value)
    {
        for(int i=0;i<value.length;i++)
        {
            if(s.equals(value[i]))
            {
                check= true;
                break;
            }
            else
                check=false;      
        }
       
        if(check)
            System.out.println("Search value Present");
        else
            System.out.println("Search value Not Present");
    }
}