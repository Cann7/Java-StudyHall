package Week11;

import java.util.Arrays;

public class Warehouse {

    public static void main(String[] args) {
        Address address = new Address();

        address.setUnitNumber("11");
        address.setCity("Toronto");
        address.setStreetNumber("1 king street");
        address.setCountry("Canada");


        AccountHolder ac = new AccountHolder();
        ac.setUserName("Renastech");
        ac.setPassword("123456");
        ac.setEmail("renas@renastech.com");

        AmazonOrder ao = new AmazonOrder();

        ao.setPrime(true);
        ao.setAddress(address);
        ao.setAccountHolder(ac);

        /*ao.setCartItems("Telephone");
        System.out.println(Arrays.toString(ao.getCartItems()));
        ao.setCartItems("Telephone");
        System.out.println(Arrays.toString(ao.getCartItems()));
        */

        // Warehouse

        System.out.println("ao.getAddress().getCountry() = " + ao.getAddress().getCountry());


    }
}
