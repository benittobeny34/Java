package encapsulatoin_demo;


public class Encapsulation2_method {
    public static void main(String arr[])
    {
        employee emp1=new employee();
        //employee emp2=new employee();
        emp1.setempId(300);
        emp1.setempName("benni");
        int empId1=emp1.getempId();
        String empname1=emp1.getempName();
        System.out.println("The employee id is:"+empId1);
        System.out.println("The employee name is:"+empname1);
        emp1.setempId(500);
        emp1.setempName("mani");
        int empId2=emp1.getempId();
        String empname2=emp1.getempName();
        System.out.println("The employee id is:"+empId2);
        System.out.println("The employee name is:"+empname2);    
    }
    
}
class employee
{ 
    private
    int empId;
    String empname;
    public
            void setempId(int empId)
            {
                this .empId=empId;
            }
            int getempId()
            {
                return this.empId;
            }
            void setempName(String empname)
            {
                this.empname=empname;
            }
            String getempName()
            {
                return this.empname;
            }
}