package employee_data;
public class Employee {
    String emp_name;
    int emp_id;
    String  category;
    String address;
    String mail_id;
    int mobile_no; 
   public  double basic_pay;
    double it;
    public void setname(String en)
    {
        emp_name=en;
    }
    public void setid(int id)
    {
        emp_id=id;
    }
    public void setcategory(String cat)
    {
        category=cat;
    }
    public void setaddress(String adr)
    {
        address=adr;
    }
    public void setmail(String ml)
    {
        mail_id=ml;
    }
    public void setmobile(int mobile)
    {
        mobile_no=mobile;
    }
    public void setbp(double bp)
    {
       basic_pay=bp;
    }
    @Override
    public String toString()
    {
        return "Employee Name: "+emp_name+"\nEmployee id: "+emp_id+"\nCategory: " +category+"\nAddress: "+address+"\nMail id: "+mail_id+"\nMobile No: "+mobile_no+"\nBasic Pay: "+basic_pay;
    }
}
