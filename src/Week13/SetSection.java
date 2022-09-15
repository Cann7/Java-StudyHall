package Week13;

import sun.reflect.generics.tree.Tree;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetSection {

    // Set is another subset of the collections
    // it has unique elements only

    public static void main(String[] args) {
        HashSet<String> employees = new HashSet<>();
        employees.add("Taylan");
        employees.add("Gulay");
        employees.add("Seray");
        employees.add("Taylan");
        employees.add(null);
        employees.add(null);
        employees.add(null);

        System.out.println(employees);

        if(employees.contains("Taylan"))
        {
            System.out.println("Taylan is exist");
        }

        System.out.println("*********");
        employees.clear();
        System.out.println("*********");
        if(employees.isEmpty())
        {
            System.out.println("employees object is null");
        }

        // TreeSet
        Set<String> employees2 = new TreeSet<>();
        employees2.add("Taylan");
        employees2.add("Gulay");
        employees2.add("Seray");
        employees2.add("Taylan");
        employees2.add(null);


        System.out.println(employees2);





    }

}
