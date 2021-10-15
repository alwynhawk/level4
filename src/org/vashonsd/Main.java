package org.vashonsd;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Soda arizona = new Soda(.99, "delicious tea", "arizona", 24);
        // We begin with Sprite as the default
        Soda theSoda = new Soda(.75, "splendid soda", "sprite", 16);
        Soda coke = new Soda(10000000, "mm M MMM M MMMM", "coke", 24);

        Scanner scan = new Scanner(System.in);

        System.out.println("this program will calculate the soda tax for you, it has some preset sodas already");

        System.out.println("Enter: type of soda:");


        String whichSoda = scan.nextLine();

        if (!whichSoda.equals("sprite")) {
            //Now that we know the user does not want Sprite,
            //we collect all the necessary information to build a custom soda.
            System.out.println("Enter: cost of soda:");
            double costOfSoda2 = scan.nextDouble();
            scan.nextLine();

            System.out.println("Enter: ounces:");
            double ouncesOfSoda2 = scan.nextDouble();
            scan.nextLine();

            System.out.println("Enter: description:");
            String descriptionOfSoda2 = scan.nextLine();

            System.out.println("Enter: brandname:");
            String nameOfBrand2 = scan.nextLine();

            // Create a new Soda with all the info you have collected.
            theSoda = new Soda(costOfSoda2, descriptionOfSoda2, nameOfBrand2, (int) ouncesOfSoda2);
        }

        System.out.println("your soda costs: " + theSoda.getPrice());


    }


}
