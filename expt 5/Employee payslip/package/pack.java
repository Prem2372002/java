package packagenew;

import employee_data.*;
import java.util.Scanner;

public class pack1 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter no. of Employees: ");
        int n = obj.nextInt();
        Employee[] e = new Employee[n];
        for (int i = 0; i < n; i++) {
            Employee emp = new Employee();
            System.out.println("Enter Employee Name: ");
            String e_name = obj.next();
            emp.setname(e_name);
            System.out.println("Enter Employee Id: ");
            int e_id = obj.nextInt();
            emp.setid(e_id);
            System.out.println("Enter Category: ");
            String e_cat = obj.next();
            emp.setcategory(e_cat);
            System.out.println("Enter Address: ");
            String e_adr = obj.next();
            emp.setaddress(e_adr);
            System.out.println("Enter Mail id: ");
            String e_mail = obj.next();
            emp.setmail(e_mail);
            System.out.println("Enter Mobile Number: ");
            int e_mobile = obj.nextInt();
            emp.setmobile(e_mobile);
            System.out.println("Enter Basic Pay: ");
            double e_bp = obj.nextDouble();
            emp.setbp(e_bp);
             System.out.println("------------------------------------------------------------------------------");
             System.out.println("\t\t EMPLOYEE DETAILS \t\t");
             System.out.println("------------------------------------------------------------------------------");
             System.out.println(emp);
            Incometax obj2=new Incometax();
            obj2.getdata(e_bp, e_cat);
             obj2.cal();
             System.out.println("Income tax amount:"+obj2.getit());
             double pay_it=obj2.getit();
            Payslip ps = new Payslip();
            ps.paycal(e_bp, pay_it);
            System.out.println("DA: "+ps.getda());
            System.out.println("HRA: "+ps.gethra());
            System.out.println("PF: "+ps.getpf());
            System.out.println("Staffclubfund: "+ps.getstaffcfund());
            System.out.println("Gross Salary: "+ps.getgross());
            System.out.println("Net Salary: "+ps.getnet());
             System.out.println("------------------------------------------------------------------------------");
        }
}
}
