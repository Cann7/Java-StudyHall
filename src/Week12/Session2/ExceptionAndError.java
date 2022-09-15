package Week12.Session2;

import java.rmi.RemoteException;

public class ExceptionAndError {

      /*
            Error and Exception
            For the error we cannot manage it with intellij, it is out of our control for example; memory problem
1 Error
Classified as an unchecked type
It belongs to java.lang.error
2	Exception
It belongs to java.lang.Exception
Classified as checked and unchecked
           Other name of checked is Compile time error
                         unchecked is run time erroe
     */


    public static void main(String[] args) throws InterruptedException {



        try {
            int i = 5/1;
        }catch (Exception e)
        {

            System.out.println("hello");

        }
        finally {
            System.out.println("This line is works");
        }

        Thread.sleep(2000);

    }

}
