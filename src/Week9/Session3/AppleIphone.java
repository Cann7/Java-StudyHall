package Week9.Session3;

import java.util.Arrays;

public class AppleIphone extends CellPhone {

    int lensQuantity =0;
    int galleryCapacity =0;
    int[] gallery ;

    // this "count" for gallery array
    int count;
    public AppleIphone(int lensQuantity,int galleryCapacity){

        // Super() sends parameters to parent class
        super("Apple","Iphone");
        // local Instance
        this.lensQuantity=lensQuantity;
        this.galleryCapacity=galleryCapacity;
    }

    public void takePicture(){
        System.out.println("Picture is adding to Gallery");

        if (gallery==null){

            gallery=new int[galleryCapacity];
        }

        if (count<= galleryCapacity){
            gallery[count]=1;
            count++;
            usePhone(1);
            galleryCapacity -=1;
        }
        else {
            System.out.println("Please Delete a picture");
            System.out.println("The Gallery is full!!");
        }

    }

    public void lookGallery(){
        System.out.println(Arrays.toString(gallery));
    }


    @Override
    public String toString(){
        String getpercentageOfBattery;
        return "Make : " +make+ "\r\n"+ " Model: " +model +"\r\n" + " Price : "+ getPrice() + "\r\n"
                +" percentage of Battery : " + getPercentageOfBattery() + "Lens Quantity : " + lensQuantity + "\r\n" +
                " Remaining Capacity for gallery " +galleryCapacity + " \r\n-----------";
    }


}
