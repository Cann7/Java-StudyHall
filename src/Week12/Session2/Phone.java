package Week12.Session2;

abstract class Phone {

    public void openPhone()
    {
        System.out.println("The phone is open");
    }


    abstract void phoneModel();

    public void closePhone()
    {
        System.out.println("The phone is close");
    }
}
