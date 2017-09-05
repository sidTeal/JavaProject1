package tisdaleproject1;
/******************************************************
***  Class Name: CalculateStatistics
***  Class Author: Chris Tisdale 
******************************************************
*** Purpose of the class:
*** This class provides calculation functionality for this project.
*** It has methods that allow it to build an arrayList of doubles.
*** This arrayList is then used to calculate the mean and population
*** standard deviation. It also has get methods to retrieve these values.
****************************************************** 
*** September 5, 2017
******************************************************
*** August 30:  Reviewed assignment and created design for my program and
***             implemented with pseudocode.
*** August 30:  Created TisdaleProject1, StatisticsGUI and CalculateStatistics classes.
***             Tested the input and verified the output of the program, as well as error catching.
*** August 31:  Added comments and final testing.
******************************************************
***  
*******************************************************/
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;

public class CalculateStatistics {
    // used to hold the numbers that will be used in calculations
    ArrayList<Double> numbers = new ArrayList<>();

/*****************************************************
*** Method Name: buildNumList
*** Author: Chris Tisdale
******************************************************
*** Purpose of the Method: adds the double to the arrayList numbers
*** Method parameters: double number
*** Return value: void
******************************************************
*** Date: August 30
******************************************************/
    void buildNumList(double number) {
        numbers.add(number);
    }

/*****************************************************
*** Method Name: testInputFitInDouble
*** Author: Chris Tisdale
******************************************************
*** Purpose of the Method: test to see if the number is less than or greater than a double
*** Method parameters: String userInput
*** Return value: void
******************************************************
*** Date: September 5
******************************************************/    
    void testInputFitInDouble(String userInput) {
        long test = Long.parseLong(userInput);
        if (test < Double.MIN_VALUE || test > Double.MAX_VALUE) {
            throw new NumberFormatException ();
        }
    }

/*****************************************************
*** Method Name: calculateMean
*** Author: Chris Tisdale
******************************************************
*** Purpose of the Method: calculate the mean of numbers in arrayList numbers
*** Method parameters: none
*** Return value: double
******************************************************
*** Date: August 30
******************************************************/
    double calculateMean() {
        double sum = 0;
        int inputs = 0;
        double mean;

        for (Double number : numbers) {
            sum += number;
            inputs++;
        }

        mean = sum / inputs;
        return mean;
    }

/*****************************************************
*** Method Name: calculateStandardDeviation
*** Author: Chris Tisdale
******************************************************
*** Purpose of the Method: calculate the standard deviation of numbers in arrayList numbers
*** Method parameters: none
*** Return value: double
******************************************************
*** Date: August 30
******************************************************/
    double calculateStandardDeviation() {
        double mean = calculateMean();
        double squaredSum = 0;
        int inputs = 0;
        double standardDeviation;

        // get squared sum after subtracting mean from each number
        for (Double number : numbers) {
            squaredSum += Math.pow((number - mean), 2);
            inputs++;
        }

        // get square root of the squared sum divided by number of inputs
        standardDeviation = Math.sqrt(squaredSum / inputs);

        return standardDeviation;
    }

/*****************************************************
*** Method Name: displayResults
*** Author: Chris Tisdale
******************************************************
*** Purpose of the Method: print mean and standard deviation to console for debugging
*** Method parameters: none
*** Return value: void
******************************************************
*** Date: August 30
******************************************************/
    void displayResults() {

        NumberFormat formatter = new DecimalFormat("#0.00");
        System.out.println("Mean: " + formatter.format(calculateMean()));
        System.out.println("SD: " + formatter.format(calculateStandardDeviation()));
    }
    
/*****************************************************
*** Method Name: getMean
*** Author: Chris Tisdale
******************************************************
*** Purpose of the Method: get mean value (rounded to two decimal places) as a String
*** Method parameters: none
*** Return value: String
******************************************************
*** Date: August 30
******************************************************/
    String getMean() {

        String mean;
        NumberFormat formatter = new DecimalFormat("#0.00");
        mean = "" + formatter.format(calculateMean());
        return mean;
    }

/*****************************************************
*** Method Name: getStandardDeviation
*** Author: Chris Tisdale
******************************************************
*** Purpose of the Method: get standard deviation value (rounded to two decimal places) as a String
*** Method parameters: none
*** Return value: String
******************************************************
*** Date: August 30
******************************************************/
    String getStandardDeviation() {
        String standardDeviation;
        NumberFormat formatter = new DecimalFormat("#0.00");
        standardDeviation = "" + formatter.format(calculateStandardDeviation());
        return standardDeviation;
    }

}