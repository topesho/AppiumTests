import java.util.Scanner;

public class DivBy {
private static Scanner sc;
    // Java Program to Check whether Number is Divisible by 5 and 11
    public static void main(String[] args){
              int number;
              sc = new Scanner(System.in);
              System.out.println("Please Enter any Number to Check whether it is Divisible by 5 and 11 : ");
              number = sc.nextInt();

        if (number % 5 == 0 && number % 11 ==0)
        {

            System.out.println("\n Given number  "+ number +" divisible by 5 & 11");
        }

        else {

            System.out.println("\n Given number "+ number +" not divisible by 5 & 11");
        }

    }

}
