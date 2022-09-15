package Week8;

public class Utils {
    // this class will store all of the util methods

    public static void MakeLines(){
        System.out.println("***********************");
    }

    public static int maxNumber(int []array1){

        int max=array1[0];

        for (int i = 0; i < array1.length; i++) {

            if (array1[i]>max){
                max=array1[i];
            }
        }

        return max;

    }

    public static int whichIsMax(int number1, int number2){

        int max =0;

        if (number1>number2){
           max= number1;
        }else if(number2>number1){
            max= number2;
        }else {
            max=number1;
        }
        return max;

    }

    public static void sayHello(){
        for (int i = 0; i < 100; i++) {
            System.out.println("hello");
        }
    }

    public static void sum(int a,int b){
        System.out.println("sum= "+(a+b));
    }

    public static void sum2(int a,int b,int c){
        System.out.println("Sum ="+(a+b+c));
    }

    public static void sum(int a,double b){
        System.out.println("Sum ="+(a+b));
    }

    public static void sum(int a,String b){
        System.out.println(a);
        System.out.println(b);
    }
}
