package Week9.session2;

public class Calculator {

    //Id for every object
    static int id =0;
    int number1 =0;
    int number2=0;
    int number3=0;
    int result =0;
    String type  = null;
    int calculatorId=0;

    // It will executes first and only 1 time
    static
    {
        System.out.println("------------");
        System.out.println("Let start to calculate");
        System.out.println("------------");
    }

    // The constructor exectues everytime
    //Overloading
    public Calculator(int number1, int number2)
    {

        System.out.println("------------");
        System.out.println("Calculator is created");
        System.out.println("------------");
        id++;
        this.number1 = number1;
        this.number2 = number2;
        this.calculatorId = id;
    }

    // The constructor exectues everytime
    //Overloading
    public Calculator(int number1, int number2, int number3)
    {
        System.out.println("------------");
        System.out.println("Calculator is created");
        System.out.println("------------");
        id++;
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
        this.calculatorId = id;
    }


    public void execute(String type)
    {
        this.type = type;
        switch (type)
        {
            case "+":
                getSum();
                break;
            case "-":
                getDiff();
                break;
            case "/":
                getDivide();
                break;
            case "*":
                getMultiply();
                break;
            default:
        }

        System.out.println("------------");
        System.out.println("Calculating");
        System.out.println("------------");
    }

    // Overlading!!
    public Calculator reRun(int number1, int number2)
    {
        System.out.println("Calculate one more time!!!");
        this.number1 = number1;
        this.number2 = number2;

        return this;
    }

    public Calculator reRun(int number1, int number2, int number3)
    {
        System.out.println("Calculate one more time!!!");
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;

        return this;
    }


    private void getSum()
    {
        if(number3 == 0)
        {
            result = number1 + number2;
        } else if (number3 !=0) {
            result = number1 + number2 + number3;
        }

    }

    private void  getDiff()
    {
        if(number3 ==0)
        {
            result = number1 -number2;
        }
        else if(number3 != 0)
        {
            result = number1 - number2 - number3;
        }
    }

    private void  getMultiply()
    {
        if(number3 ==0)
        {
            result = number1 * number2;
        }
        else if(number3 != 0)
        {
            result = number1 * number2 * number3;
        }
    }

    private void getDivide()
    {
        if(number3 ==0)
        {
            result = number1 / number2 ;
        }
        else
        {
            result = number1 / number2 /number3;
        }
    }



    // We can't overload toString method because there is no parameter
    public String toString()
    {

        int number4 = number1;
        int number5 = number2;
        int number6 = number3;
        int result2 = result;
        result =0;
        number1 =0;
        number2 =0;
        number3 =0;




        if(number6 !=0)
        {
            return "Calculator id is =" + calculatorId+ " ----" + number4  + " " + type + " " + number5 + " " +type+" " + number6 +" =" + result2 + "\r\n------------";


        }
        else
        {
            return "Calculator id is =" + calculatorId+ " ----" +number4  + " " + type + " " + number5 + " =" + result2 + "\r\n------------";

        }

    }
}
