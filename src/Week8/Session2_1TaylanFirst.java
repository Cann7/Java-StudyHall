package Week8;

import java.util.ArrayList;
import java.util.Arrays;

public class Session2_1TaylanFirst {
    public static void main(String[] args) {

        int [] number ={23,56,90,6};

        ArrayList<Integer> numbers1=new ArrayList<>();

        for (int i = 0; i < number.length; i++) {
            numbers1.add(number[i]);
        }
//        ArrayList<Integer>numbers2=new ArrayList<>();
//        numbers2.addAll(Arrays.asList(number));
        System.out.println(numbers1);

        for (int j = 0; j < numbers1.size(); j++) {
            System.out.println("numbers1.get(j) : "+numbers1.get(j));
        }

        // Taylan's important interview question very important dont forget

        int [] team1ages={25,26,40,35,97,2};

        int maxNumber=team1ages[0]; // you can 1,4,5 doestn matter also but we cant call out of index number

        for (int i = 0; i < team1ages.length; i++) {
            if (maxNumber<team1ages[i]){
                maxNumber=team1ages[i];
            }
        }
        System.out.println("maxNumber= "+maxNumber);
        System.out.println("***************************");

        int minNumber =team1ages[0];

        for (int i = 0; i < team1ages.length; i++) {
            if (minNumber>team1ages[i]){
                minNumber=team1ages[i];
            }
        }
        System.out.println("minNumber= "+minNumber);
        System.out.println("************************");

        String sentence ="The sky is blue";
        // blue is sky The
        String [] words =sentence.split(" ");
        System.out.println(Arrays.asList(words));
        ArrayList<String> wordsofSentence =new ArrayList<String>(Arrays.asList(words));

        String reversedString="";
        for (int i = wordsofSentence.size()-1; i >=0 ; i--) {

            if (i != 0){
                reversedString+= wordsofSentence.get(i) + " ";
            }
            else {
                reversedString+= wordsofSentence.get(i);
            }

           // reversedString+=wordsofSentence.get(i) + " ";   second way
        }
        System.out.println("reversedString : "+reversedString);
        System.out.println("************************************");

        String str ="a4v6aa9!214";
        ArrayList<Integer> digitofStr= new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            if ((int) str.charAt(i)>=48 && (int) str.charAt(i)<=57){
                digitofStr.add(Integer.parseInt(String.valueOf(str.charAt(i))));
            }
        }
        System.out.println("digitsOfStr="+digitofStr);
        System.out.println("********************************************");

        int [] team3ages={25,26,40,35,97,2};
        team3ages[5]= 6;
        System.out.println("team3ages = " + Arrays.toString(team3ages));

        int[] LastArray= new int[4];
        boolean[] boolArray= new boolean[4];
        System.out.println("Arrays.toString(LastArray) = " + Arrays.toString(LastArray));
        System.out.println("Arrays.toString(boolArray) = " + Arrays.toString(boolArray));


    }
}
