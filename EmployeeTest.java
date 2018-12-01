import java.sql.Date;
import java.time.LocalDate;

public class EmployeeTest{
    public static void main(String args[]){
        Employee staff[]=new Employee[3];
        staff[0]=new Employee("Baoyang",324627,1995,1,11);
        staff[1]=new Employee("Huaxinkang",421625,1995,10,5);
        staff[2]=new Employee("Lujiangwei",123223,1997,6,24);
        for(Employee e:staff){
            e.raiseSalary(5);
        }
        for(Employee e:staff){
            System.out.println("name="+e.getName()+",salary="+e.getSalary()+",hireday="+e.getHireday());
        }
        System.out.println("通过返回私有状态的clone，避免了对封装性的破坏");
        System.out.println("破坏了封装性，改变了私有状态hireday:"+staff[0].getHireday());
        
    }
}
class Employee{
    private String name;
    private double Salary;
    private LocalDate hireDay;

    public Employee(String n,double s,int year,int month,int day){
        name=n;
        Salary=s;
        hireDay=LocalDate.of(year, month, day);
    }
    
    public String getName(){
        return name;
    }

    public double getSalary(){
        return Salary;
    }

    public LocalDate getHireday(){
        return hireDay;
    }

    public void raiseSalary(double byPercent){
        double raise=Salary*byPercent/100;
        Salary+=raise;
    }
}