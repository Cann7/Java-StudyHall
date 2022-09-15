package Week11;

import java.util.ArrayList;
import java.util.Arrays;

public class AmazonOrder {

    private String[] cartItems = null; // {telephone, laptop}
    private Address address;
    private AccountHolder accountHolder;
    private boolean isPrime;

    public String[] getCartItems() {
        return cartItems;
    }

    public void setCartItems(String cartItems) {
        if(cartItems != null)
        {
            ArrayList<String> tempArrayList = new ArrayList<>();
            tempArrayList.addAll(Arrays.asList(this.cartItems));
            tempArrayList.add(cartItems);
            String[] tempArray = new String[tempArrayList.size()];

            for(int i= 0;i<tempArrayList.size();i++)
            {
                tempArray[i] = tempArrayList.get(i);


            }

            tempArray[tempArrayList.size()-1] = cartItems;

            this.cartItems = tempArray;
        }
        else
        {
            this.cartItems = new String[1];
            this.cartItems[0] = cartItems;
        }


        System.out.println(cartItems + " is successfully adding to cart");
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public AccountHolder getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(AccountHolder accountHolder) {
        this.accountHolder = accountHolder;
    }

    public boolean isPrime() {
        return isPrime;
    }

    public void setPrime(boolean prime) {
        isPrime = prime;
    }
}
