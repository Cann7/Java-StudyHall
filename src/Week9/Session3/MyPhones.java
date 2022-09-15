package Week9.Session3;

public class MyPhones {

    public static void main(String[] args) {

        AppleIphone iphone =new AppleIphone(3,20);

        iphone.chargeBattery(20);
        iphone.setPrice(1000);
        iphone.takePicture();
        iphone.takePicture();
        iphone.lookGallery();


        System.out.println(iphone);

        Nokia3310 nokia =new Nokia3310();

        System.out.println(nokia.toString());

    }

    /*
    Inheritence
    overriding
    super() we used without
    Encapsulation


     */
}
