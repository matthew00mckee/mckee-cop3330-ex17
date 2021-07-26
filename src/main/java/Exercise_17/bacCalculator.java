package Exercise_17;

import java.util.Scanner;

public class bacCalculator {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        double gender;
        double AlcOunces;
        double weight;
        double numHours;
        double BAC;
        double ratio;

        while(true){
            try {
                System.out.print("Enter a 1 is you are male or a 2 if you are female: ");
                gender = Double.parseDouble(Input.next());
                break;
            } catch(NumberFormatException exception) {
                System.out.print("Please enter a valid input.\n");
            }
        }
        while(true) {
            try {
                System.out.print("How many ounces of alcohol did you have?: ");
                AlcOunces = Double.parseDouble(Input.next());
                break;
            } catch (NumberFormatException exception) {
                System.out.print("Please enter a valid input.\n");
            }
        }
        while(true){
            try {
                System.out.print("What is your weight, in pounds?: ");
                weight = Double.parseDouble(Input.next());
                break;
            } catch(NumberFormatException e) {
                System.out.print("Please enter a valid input.\n");
            }
        }

        while(true){
            try {
                System.out.print("How many hours has it been since your last drink?: ");
                numHours = Double.parseDouble(Input.next());
                break;
            } catch(NumberFormatException e) {
                System.out.print("Please enter a valid input.\n");
            }
        }
        if(gender == 1) {
            ratio = 0.73;
        }
        else{
            ratio =0.66;
        }
        BAC = (AlcOunces * 5.14/weight * ratio) - 0.015 * numHours;

        if(BAC >= 0.08){
            System.out.print("Your BAC is " + BAC + " \nIt is not legal for you to drive.");
        }
        if(BAC < 0.08){
            System.out.print("Your BAC is" + BAC +" \nIt is legal for you to drive.");
        }
    }
}
