public class _10_Calculator
{
    public static void main(String[] args)
    {
        int a = 4;
        int b = 2;
        char ch = '+';

        switch (ch)
        {
            case '+':
                System.out.println("Addition : "+ (a + b));
                break;
            case '-':
                System.out.println("Subtraction : "+ (a - b));
                break;
            case '*':
                System.out.println("Multiplication : "+ (a * b));
                break;
            case '/':
                System.out.println("Division : "+ (a / b));
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
        System.out.println("");    
    }
}