package Week9;

public class DataBaseForEmployee {

    public static void main(String[] args) {

        int increaseSalaryBy = 5000;

        Employee taylan = new Employee();

        taylan.setInfo("Taylan Tonka","80000 $");
        System.out.println(taylan);
        Employee ozan = new Employee();
        ozan.setInfo("Ozan Tomar","200000 Euro", "QA Engineer");



        Employee.companyName = "Renas";

        // taylan.toString();
        System.out.println(taylan);
        System.out.println(ozan);

        ozan.changeSalary(100000);
        System.out.println(ozan);

        Employee raz = new Employee();
        raz.setInfo("Raz","150000 Sterling", "SDET");
        Employee[] employeeDataBase = {taylan,ozan,raz};


        for(int i=0;i< employeeDataBase.length;i++)
        {
            employeeDataBase[i].changeSalary(increaseSalaryBy);
        }

        for (int j=0;j<employeeDataBase.length;j++)
        {
            System.out.println(employeeDataBase[j].employeeName + " Earning " + employeeDataBase[j].Salary);
        }


    }

}
