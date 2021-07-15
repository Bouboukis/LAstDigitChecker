package com.georgioskachrimanis.javacourse;

public class LastDigitChecker {

    public static boolean hasSameLastDigit(int number1, int number2, int number3) {

       if (isValid(number1) && isValid(number2) && isValid(number3)){
           int lastDigitNumber1= number1 % 10, lastDigitNumber2= number2 % 10,
                   lastDigitNumber3= number3 % 10;
            return ((lastDigitNumber1 == lastDigitNumber2) || (lastDigitNumber2 == lastDigitNumber3)
                    || (lastDigitNumber1 == lastDigitNumber3));
       }
        return false;
    }

    public static boolean isValid (int number) {
        return (number  >= 10 && number <= 1000 );
    }

}
