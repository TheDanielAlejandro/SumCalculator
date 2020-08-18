package com.company;

public class SimpleCalculator {

    private double firstNumber;                                           // . Creating the class SimpleCalculator with it variables.
    private double secondNumber;


    public double getFirstNumber(){                                       // . Creating the first method to retrieve the first number
        return firstNumber;
    }


    public double getSecondNumber(){                                      // . Creating the second method to retrieve the second number
        return secondNumber;
    }


    public void setFirstNumber(double number){                           // . Creating the first method to set the first number
        this.firstNumber = number;
    }


    public void setSecondNumber(double number){                         // . Creating the second method to set the second number
        this.secondNumber = number;
    }


    public double getAdditionResult(){                                  // . Creating the first method to retrieve the sum of the fields
        double result = getFirstNumber() + getSecondNumber();
        return result;
    }


    public double getSubtractionResult(){                               // . Creating the second method to retrieve the subtraction of the fields
        double result = getFirstNumber() - getSecondNumber();
        return result;
    }


    public double getMultiplicationResult(){                            // . Creating the third method to retrieve the multiplication of the fields
        double result = getFirstNumber() * getSecondNumber();
        return result;
    }


    public double getDivisionResult() {                                 // . Creating the fourth method to retrieve the division of the fields
        if (getSecondNumber() == 0) {                                   // . The only method that is checking if the second field is 0 and if yes return 0.
            double result = 0;
            return result;
        } else {
            double result = getFirstNumber() / getSecondNumber();
            return result;
        }

    }
}
