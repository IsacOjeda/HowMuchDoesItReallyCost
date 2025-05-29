import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int speedLimit = 35;
        double milesPerCent = .70;
        Scanner scanner = new Scanner(System.in);
//        int traffic = 5;


        System.out.println("What is the price of the item you wish to purchase?: ");
        double price = scanner.nextDouble();
        System.out.println("How far is your purchase to and back(in miles) ?: ");
        double miles = scanner.nextDouble();
        double gasPrice = miles / milesPerCent;
        double gasPriceDollars = gasPrice / 100;
        double timePrice = miles / speedLimit;
        int hours = (int) timePrice;
        int minutes = (int)((timePrice - hours)*60);

        double realPrice = gasPriceDollars+price;

        System.out.println("Distance: "+miles+" Miles");
        System.out.println("Estimated Price: -$"+price);
        System.out.printf("Estimated Gas Cost: -$%.2f\n",gasPriceDollars);
        System.out.println("Estimated Travel Time: "+hours+" hours and "+minutes+" minutes");
        System.out.println("-----------------TOTAL PRICE------------------");
        System.out.printf("-$%.2f",realPrice);
        System.out.println();
        System.out.println("-"+hours+" hours and "+minutes+" minutes of your life that you will never get back");

        scanner.close();
    }
}
