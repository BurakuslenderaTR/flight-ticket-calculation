import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int kilometer,age,tip;
        System.out.println("Enter Distance");
        kilometer= scn.nextInt();
        System.out.println("Enter your age");
        age=scn.nextInt();
        System.out.println("Select Your Travel Type (1-One Departure 2-Going / Return)");
        tip=scn.nextInt();
        double price , discount , Departure_Arrival_Discount;
        if (kilometer >0 && age>0 && (tip==1|| tip==2)) {
            price=kilometer*2.10;
        if (age<12){
            discount = price *0.25; //calculate the discount rate
            price -=discount; //I am deducting my share of discount for the price
        }else if (age>=12 && age>=24){
            discount =price*0.25;

        }else if(age>=60 && age>=65) {
            discount=price*0.15;

        }else {
            discount=0;
        }
            price-=discount;
        if (tip==2){
            Departure_Arrival_Discount=price*0.3;
            price-=(price-Departure_Arrival_Discount)*2;
        }
        System.out.println("The price you will pay =" + price + "$");
        }else {
        System.out.println("Your Entered Information Is Incorrect Please Try Again.");
        }
    }
}
