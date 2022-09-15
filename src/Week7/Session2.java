package Week7;

import java.util.Arrays;

public class Session2 {
    public static void main(String[] args) {

        sayHello();
        makeLines();

        //    Interview question
//     (Array) Concat two arrays
//    Write a program that can concate two arrays

        int [] array1={2,4,6,8}; // 4
        int [] array2 = {3,5,7,9,11}; // 5
        // answer : 2 4 6 8 3 5 7 9 11


        int [] arrayAnswer=new int [array1.length+ array2.length];

        int index=0;
        for (int i = 0; i < array1.length; i++) {
            //System.out.println(array1[i]);

            arrayAnswer[index++]=array1[i];
                 // 0    1 2 3>> 2 4 6 8
            //index++;
        }
        makeLines();

        System.out.println(Arrays.toString(arrayAnswer));

        for (int i = 0; i < array2.length; i++) {

            arrayAnswer[index++]=array2[i];

        }
        System.out.println(Arrays.toString(arrayAnswer));
        makeLines();

        /**
         *  Methods : A block of the code that will run when it's called.
         *
         * return methods and void
         */

        sayHello();
        giveme5();

        int number=giveme5();
        System.out.println("number = " +number);

        makeLines();

        String myName=myName();
        System.out.println("myName = " + myName);

        makeLines();

        calculateAge(2000);

        calculateAge(1990);

        makeLines();

        int a =calculateAge2(1995);  // return 2022-1995;
        System.out.println(a);

        int age2=calculateAge2(1995);
        System.out.println("age2 = " + age2);

        System.out.println(calculateAge2(1995)); // return 2022-1995

        makeLines();
        makeLines();

        calAge("Alican", 1995);
        calAge("Yaseen",1978);

        makeLines();

        ReverseName1("Renastech");
        ReverseName1("riham");


    }
    public static void makeLines(){
        System.out.println("*************************");
    }

    public static void sayHello(){
        System.out.println("Hello Hello");
    }

    // return methods

    public static int giveme5(){
        return  5;
    }

    public static String myName(){

        String name ="Renastech";

        return name;
    }

    public static void calculateAge(int birthYear){

        int age=2022-birthYear;

        System.out.println("age = " + age);
    }

    public static int calculateAge2(int birthYear){
       // int age=2022-birthYear;
      //  return age;

        // OR
        return 2022-birthYear;
    }

    public static void calAge(String fName, int birthYear){
        System.out.println(fName +" " + " is " + (2022-birthYear)+ " years old.");
    }

  public static void ReverseName1(String name){

        String reverse="";
      for (int i = name.length()-1; i >=0 ; i--) {

          reverse+=name.charAt(i);

      }
      System.out.println("Your String : "+ name);
      System.out.println("Reverse : " +reverse);
  }


}
