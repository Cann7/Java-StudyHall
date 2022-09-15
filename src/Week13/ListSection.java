package Week13;

import java.util.ArrayList;
import java.util.List;

public class ListSection {

    // Collections

    // List interface
    // it can includes dublicate
    // We can order it
    public static void main(String[] args) {

        List<String> employees = new ArrayList<>();
        //List<int > employees = new ArrayList<>(); we cannot store primitive data
        employees.add("Taylan");
        employees.add("Gulay");
        employees.add("Seray");
        employees.add("Tonka");

        System.out.println(employees);

        System.out.println("****************");

        for(int i =0 ;i<employees.size();i++)
        {
            // System.out.print(employees.get(i) + ", ");
        }
        System.out.println("****************");

        for(String employee: employees)
        {
            // System.out.println(employee);
        }
        // with List.set() we may replace our elements with new one
        employees.set(3,"Alican");
        System.out.println("****************");
        System.out.println(employees);

        employees.clear();

        System.out.println("****************");
        System.out.println(employees);




    }


}
