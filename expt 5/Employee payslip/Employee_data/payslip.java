package employee_data;
public class Payslip 
{  
    double basic_pay;
    double da;
    double hra;
    double pf;
    double staffcfund;
    double gross_salary;
    double net_salary;
    double it;
    public void paycal(double bpay,double pay_it)
    {
        this.basic_pay=bpay;
        this.it=pay_it;
        this. da=97*(this.basic_pay/100);
        this.hra=10*(this.basic_pay/100);
        this.pf=12*(this.basic_pay/100);
        this.staffcfund=0.1*(this.basic_pay/100);
        this.gross_salary=this.basic_pay+this.hra+this.da+this.pf;
        this.net_salary=this.gross_salary-this.it-this.pf;
    }
    public double getda()
    {
        return da;
    }
    public double gethra(){
        return hra;
    }
    public double getpf()
    {
        return pf;
    }
    public double getstaffcfund()
    {
        return staffcfund;
    }
    public double getgross()
    {
        return gross_salary;
    }
    public double getnet()
    {
        return net_salary;
    }
}
