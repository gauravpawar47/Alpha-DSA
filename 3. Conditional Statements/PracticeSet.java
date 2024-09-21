public class PracticeSet
{
    public static void main(String[] args)
    {
        // Q 1. Positive - Negative Number

        int n = 5;
        boolean isPositive = n > 0 ? true : false;

        if(isPositive)
        {
            System.out.println("Number is Positive");
        }
        else
        {
            System.out.println("Number is Negative");
        }

        // Q 2. Finish Code

        double temp = 103.5;

        if(temp > 100)
        {
            System.out.println("You've Fever");
        }
        else
        {
            System.out.println("You Dont Have Fever");
        }

        // Q 3. Week Of Number

        int num = 2;

        switch (num)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Input !");
                break;
        }

        // Q 4. Output

        // --> False, 63

        // Q 5. Leap Year

        int year = 2024;

        if(year % 4 == 0 && (year % 400 == 0 || year % 100 != 0))
        {
            System.out.println("Leap Year");
        }
        else
        {
            System.out.println("Not Leap Year");
        }
    }
}