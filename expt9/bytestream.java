import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;
class STUDENT
{
   int no;
   Scanner s=new Scanner(System.in);
   STUDENT()
   {
       System.out.println("Enter how many students");
       no=s.nextInt();
   }
   String Stu_Name[]=new String[10];
   String Stu_Address[]=new String[10];
   byte name[];
   byte add[];
   void InsertStuDetail()throws Exception
   {
            for(int i=0;i<no;i++)
            {
                System.out.println("Enter stu_name and stu_address");
                Stu_Name[i]=s.nextLine();
                Stu_Address[i]=s.nextLine();
            }
            FileOutputStream fout=new FileOutputStream("IN.txt");
            for(int i=0;i<no;i++)
            {
                 name=Stu_Name[i].getBytes();
                 add=Stu_Address[i].getBytes();
                 fout.write(name);
                 fout.write(add);
            }
            System.out.println("successfully written");
            fout.close();
   }
   void CopyLower()throws Exception
   {
       FileInputStream fin=new FileInputStream("IN.txt");
       FileOutputStream fout=new FileOutputStream("OUT.txt");
       int read;
       String c="";
       while((read=fin.read())!=-1)
       {
           c+=((char)read);
       }
       c=c.toLowerCase();
       byte b[]=c.getBytes();
       fout.write(b);
       fin.close();
       fin.close();
   }
}
public class FileStoreCopy
{
    public static void main(String[] args)throws Exception
    {
        STUDENT st=new STUDENT();
        st.InsertStuDetail();
        st.CopyLower();   
    }
}
