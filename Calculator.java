import java.util.*;
public class Calculator
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a math problem: ");

        //User input math expression
        String math = sc.nextLine();

        //checks if string has the following 4 math operations
        if(math.contains("+"))
        {
            //Calls Addition method from Calculation class
            Calculation.AdditionCalc(math);

        }
        else if(math.contains("-"))
        {
            Calculation.SubtractionCalc(math);
        }
        else if(math.contains("*"))
        {
            Calculation.MultiplicationCalc(math);
        }
        else if(math.contains("/"))
        {
            Calculation.DivisionCalc(math);
        }
        else
        {
            System.out.println("Invalid input");
        }


    }

    static class Calculation
    {
        public static void AdditionCalc(String math)
        {
            //Splits String into an array of strings
            String [] num = math.split("\\+");

            // parses the individual numbers
            float num1 = Float.parseFloat(num[0]);
            float num2 = Float.parseFloat(num[1]);

            float sum = num1 + num2;
            //prints out answer
            System.out.println("The answer is: "+ sum);
            
        }
        public static void SubtractionCalc(String math)
        {
            String [] num = math.split("-");

            float num1 = Float.parseFloat(num[0]);
            float num2 = Float.parseFloat(num[1]);

            float minus = num1 - num2;

            System.out.println("The answer is: "+ minus);
        }
        public static void MultiplicationCalc(String math)
        {
            String [] num = math.split("\\*");

            float num1 = Float.parseFloat(num[0]);
            float num2 = Float.parseFloat(num[1]);

            float multiply = num1 * num2;

            System.out.println("The answer is: "+ multiply);
        }
        public static void DivisionCalc(String math)
        {
            String [] num = math.split("/");

            float num1 = Float.parseFloat(num[0]);
            float num2 = Float.parseFloat(num[1]);

            float division = num1 / num2;

            System.out.println("The answer is: "+ division);


        }
    }
}