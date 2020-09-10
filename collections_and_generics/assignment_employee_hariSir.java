
//package collections_and_generics;

import java.awt.List;
import java.util.ArrayList;

public class assignment_employee_hariSir 
{
    public static void main(String  args[])
    {
        Company company = new Company();
        company.createEmployee(101,"Hari",50000,"Software engg");
        company.createEmployee(102,"Naresh",40000,"Manager");
        company.createEmployee(103,"Mahesh",30000,"Testing engg");
        company.createEmployee(104,"Kiran",60000,"java Developer");
        List <Employee> list = company.getEmployeeList();
        
        for(Employee emp:list)
        {
            System.out.println(emp);
        }
        
    }
}
class Employee
{
   private int empNo;
   private String empName;
   private int salary;
   private String job;
   
   public Employee(int empNo, String empName, int salary , String job)
   {
       this.empNo = empNo;
       this.empName= empName;
       this.salary = salary;
       this.job = job;
   }
   
   public String toString()
   {
       return empNo+" "+empName+" "+salary+" "+job;
   }
   
}

class Company
{
    private Employee employee;
   private  List<Employee> list;
    public Company()
    {
      
        list = new ArrayList<Employee>();
    }
    
    public void createEmployee(int empNo,String empName,int salary,String job)
    {
        employee = new Employee(empNo,empName,salary,job);
        list.add(employee);
    }
    
    public List<Employee> getEmployeeList()
    {
        return list;
    }
}
