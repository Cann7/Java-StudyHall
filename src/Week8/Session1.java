package Week8;

import static Week8.Utils.MakeLines;

public class Session1 {
    /**
     *
     * Method : it's a block of the code, that will be executed when it's called.
     */
    public static void main(String[] args) {

        MakeLines();
        Utils.MakeLines();
        //makeLines();


        WriteName("Renastech");

        String name1="Renastech";

        WriteName(name1);
    }

    public static void sayHello(){
        System.out.println("Hello World");
    }

    public static void makeLines(){
        System.out.println("*******************************");
        System.out.println("*********************************");
        System.out.println("&&&&&&&&&&&&&**********New line*************");
    }

    public static void WriteName(String name){

        System.out.println(name);

    }
}
