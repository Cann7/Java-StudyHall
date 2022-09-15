package Week9;

public class Employee {

    //Employee Id
    static int employeeId = 0;
    String employeeName;
    String Salary;
    //It can be change after setInfo()
    String field = "General";
    public static String companyName = "Renastech";

    // Static methods execute only 1 times for it's class
    static
    {
        System.out.println("Welcome to Employee Database");

    }


    public void setInfo(String employeeName,String salary)
    {
        employeeId++;
        //If you just say employeeName without "this" keyword it will looks to the closest variable
        //If you mention this keyword before variable name, It will looks to Instances
        this.employeeName = employeeName;
        Salary = salary;

    }

    //Method overloading with 3 parameter
    public void setInfo(String employeeName, String salary, String field)
    {
        employeeId++;
        this.employeeName = employeeName;
        Salary = salary;
        this.field = field;
    }

    public void changeSalary(int salary)
    {
        // 80000 ,$
        String[] forSplit = Salary.split(" ");

        String temp ="";
        int newSalary = Integer.parseInt(forSplit[0]) + salary;
        temp += newSalary + " "+forSplit[1];

        Salary = temp;


    }


    //Method Overriding
    public String toString()
    {

        //String concet
        System.out.println("----------------------");
        return "Employee Id: " +employeeId + " EmployeeName is " + employeeName + " earning "+ Salary + " and working for " + field+ "Company name is " +companyName;
    }


}
