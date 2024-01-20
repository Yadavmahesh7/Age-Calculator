import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Wecome to Age calculator\n");
        System.out.println("Please enter Your age");
        int age=input.nextInt();

        if(age>60) {
            System.out.println("Your are the Senior citizen");
        } else if(age<60 && age>20) {
            System.out.println("Your are adult");
        } else if (age<20 && age>13) {
            System.out.println("Your are teen");
        }else {
            System.out.println("Your are child");

        }
    }

    }

