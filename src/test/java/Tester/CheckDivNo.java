package Tester;

public class CheckDivNo {

    public void checkDivisibleNo(int inputNumber){

        if (inputNumber % 5 == 0 && inputNumber % 11 == 0)
        {
            System.out.println("number divisible by 5 & 11");
        }
        else {
            System.out.println("number not divisible by 5 & 11");
        }


    }

}
