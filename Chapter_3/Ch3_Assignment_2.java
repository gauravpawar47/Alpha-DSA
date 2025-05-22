package Programs.Chapter_3;

public class Ch3_Assignment_2
{
    public static void main(String[] args)
    {
        // Q. Finish the Following Code so that it Prints You have fever if your temperature is above 100 and Otherwise prints you don't have fever

        // Code
        double temp = 103.5;

        // Solution
        String report = (temp > 100) ? "You've Fever" : "You Don't have Fever";
        System.out.println(report);
    }
}