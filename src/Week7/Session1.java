package Week7;

import java.util.Arrays;

public class Session1 {
    public static void main(String[] args) {
        // Array.

        int a =67;
        String str ="renastech";
        System.out.println(a);

        String [] students={"Ali","Aruna","Mike"};  // leng =3 , last index is 2
        //                    0     1       2
        System.out.println(students[1]);

        //System.out.println(students[7]); ArrayIndexOutOfBoundsException   THIS IS OUT OF INDEX

        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        //Create a java program that prints how many java is in the  String array=.
        // String [] name={"java","name1","name2","JaVa","JaVA","C","R" ,"Java"}  // 4 java is 4 time


        String [] name={"java","name1","name2","JaVa","JaVA","C","R" ,"Java","C++"};
        //                0       1       2      3       4    5   6     7       8

        // name[0], name[1]

        int JavaCount=0; // we will store answer with this variable

        for (int i = 0; i < name.length; i++) {
            //   i = 0     i  <  9       i++

            if (name[i].equalsIgnoreCase("java")){
                // equalsIgnoreCase means ;  ignore the lower or upper letter just bring it to me java in here
                System.out.println(name[i]);

                JavaCount++;
            }

        }

        System.out.println("javaCount = "+JavaCount);

        System.out.println("****************************");

        //SECOND QUESTION FROM SLACK MAHIR'S QUESTION;

        //Create a java program that will print only numbers that divisible by 3,  int [] arr={23,25,26,32,42,51,99,2};

        int [] arr={23,25,26,32,42,51,99,2};
        //   index   0  1  2  3  4  5  6  7
        for (int i = 0; i < arr.length; i++) {

            System.out.println("index : "+i);
            // System.out.println(arr[i]);

            if (arr[i]%3==0){ // %3==0
                System.out.println(arr[i]);
            }

        }
        System.out.println("****************************");

        //THIRD QUESTION FROM SLACK MAHIR'S QUESTION;

        //   Interview questions
        //   (Array) Find Maximum
        //   Write a program that can find the maximum number from an int Array

        //                 0            1
        int [][] tr = { {0,2,4,6}, {-90,-10,40}}; // exp : 90
        //               0 1 2 3     0   1  2

        int maxValue=tr[0][0];

        for (int i = 0; i < tr.length; i++) {
           // System.out.println(Arrays.toString(tr[i]));  if we do like this the system will bring it all of them

            for (int j = 0; j < tr[i].length; j++) {

                //System.out.println(tr[i][j]); it brings all of them

                if(tr[i][j] >maxValue){
                    maxValue=tr[i][j];

                    //System.out.println(" index number for i : " +i);
                    //System.out.println(" index number for i : " +j);
                }

            }


        }

        System.out.println("maxValue = " + maxValue);

        System.out.println("**************************");

        int [][][] tr2 = {     {     {5,5,6,7,3,7},       {0,5,6,7,2,4}},              {{0,7,8,5,3,7},{23,65,4874}},        {{0,54,67,89},{98,56,75}}};

        for (int i = 0; i < tr2.length; i++) {

            //System.out.println(Arrays.deepToString(tr2[i]));

            for (int j = 0; j < tr2[i].length; j++) {

                //System.out.println(Arrays.deepToString(tr2[i][j]));

                for (int k = 0; k < tr2[i][j].length; k++) {

                    System.out.println(tr2[i][j][k]);
                    
                }

            }


        }
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

// //    (Array) Move Zeros to the End
        ////    Write a program that can move all the zeros to the last indexes of the array (Do Not Use Sort Method)
        ////
        ////    Ex:
        ////
        ////    input:  [1,0,2,0,3,0,4,0];
        ////
        ////    output: [1, 2, 3, 4, 0, 0, 0, 0]

        int [] numbers={1,0,2,0,3,0,4,0};

        int [] answerArray =new int[numbers.length];  // a new array with length of  7

        System.out.println(Arrays.toString(answerArray));

        int index =0;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] !=0){
                answerArray[index]=numbers[i];
                index++;

            }
        }

        System.out.println(Arrays.toString(answerArray));


    }

}
