import java.util.Scanner;
class book
{
    String name;
    author a;
    double price;
    int qty;
    String GetName()
    {
     return name;
    }
    double getPrice()
    {
        return price;
    }
    int getQty()
    {
        return qty;
    }
    void setprice(double p)
            
            {
                price=p;
            }
    book(String n,author a1,double p,int q)
    {
        name=n;
        a=a1;
        price=p;
        qty=q;
    }
    public String toString()
    {
        return "Book[name: "+name+", Author[name: "+a.aname+", email: "+a.email+", gender: "+a.gen+"], price: "+price+"qty: "+qty+"]";
    }
}
class author
{
    String aname;
    String email;
    char gen;
    String getAname()
    {
        return aname;
    }
    String getEmail()
    {
        return email;
    }
    char getGen()
    {
        return gen;
    }
}
public class NewMain1
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        author obj=new author();
        System.out.println("Enter Name: ");
        obj.aname=s.next();
        System.out.println("Enter Email: ");
        obj.email=s.next();
        System.out.println("Enter Gender: ");
        obj.gen=s.next().charAt(0);
        System.out.println("Enter Book Name: ");
        String n=s.next();
        System.out.println("Enter Book Price: ");
        double p=s.nextInt();
        System.out.println("Enter Quantity: ");
        int qty=s.nextInt();
        book b=new book(n,obj,p,qty);
        System.out.println("Book Name: "+b.GetName());
        System.out.println("Book Price: "+b.getPrice());
        System.out.println("Book Quantity: "+b.getQty());
        System.out.println("Author Name: "+obj.getAname());
        System.out.println("Author E-mail: "+obj.getEmail());
        System.out.println("Author Gender: "+obj.getGen());
        System.out.println(b);
    }
}