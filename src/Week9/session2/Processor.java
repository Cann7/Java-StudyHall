package Week9.session2;

public class Processor {

    public static void main(String[] args) {
        Calculator calculator1 = new Calculator(5,6);
        calculator1.execute("*");

        Calculator calculator2 = new Calculator(6,3,10);
        calculator2.execute("+");
        // calculator1.toString();
        //System.out.println(calculator1);
        //System.out.println(calculator2);

        calculator1.reRun(6,6,6);
        calculator1.execute("*");

        // calculator1.reRun(6,6,6).execute("*);

        calculator1.reRun(6,6,6).execute("*");

        System.out.println(calculator1.toString());
    }
}


// We learn the usage of Constructor
// We learn how we can make overloading for constructors
// Hierarchical working order for constructor and static
// Recap Overloading and Overriding
// Additionally we learn how we can write two line string variable\return in one line
// we learn another approach for Id
// We learn chain method system

// As a homework Create a calculator with unlimited number and chain with constructor
// calculator(int[] {10,2,6,1,6,1,2,7,1,34,7,2,43,7}, "*")
// output 10 * 2 * 6 * 1 * 6 * 1 * 2 * 7 * 1 * 34 * 7 * 2 * 43 * 7 = result



