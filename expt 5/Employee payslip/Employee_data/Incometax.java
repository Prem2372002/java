package employee_data;
public class Incometax 
{
    double i_tax;
    double basic_pay;
    double itax;
    String category;
    public void getdata(double bp,String cat){
        basic_pay=bp;
        category=cat;
    }
    public void cal(){
    if(basic_pay<=190000){
    if(category.equalsIgnoreCase("Male") || category.equalsIgnoreCase("Female")){
        i_tax=0;
        System.out.println("Tax Percentage: Nil");
    }
}
    else  if(basic_pay<=200000)
    {
        if(category.equalsIgnoreCase("Male"))
        {
            i_tax=10;
            System.out.println("Tax percentage: "+i_tax);
        }
        else
        {
            i_tax=0;
            System.out.println("Tax percentage: Nil");
        }
    }
    else if(basic_pay<=500000)
    {
        if(category.equalsIgnoreCase("Male"))
        {
            i_tax=20;
            System.out.println("Tax percentage: "+i_tax);
        }
        else
        {
            i_tax=10;
            System.out.println("Tax percentage: "+i_tax);
        }
    }
    else if(basic_pay>500000)
    {
        if(category.equalsIgnoreCase("Male"))
        {
            i_tax=25;
            System.out.println("Tax percentage: "+i_tax);
        }
        else
        {
            i_tax=20;
            System.out.println("Tax percentage: "+i_tax);
        }
    }
    double amt=i_tax/100;
     itax=amt*basic_pay;
    //System.out.println("Tax Amount: "+itax);
    }
    public double getit()
    {
        return itax;
    }
}
