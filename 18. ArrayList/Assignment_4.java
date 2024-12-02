import java.util.*;

public class Assignment_4
{
    public static ArrayList<Integer> beautifulArray(int N)
    {
        ArrayList<Integer> res = new ArrayList<>();
        divideConque(1, 1, res, N);
        return res;
    }

    private static void divideConque(int start, int increment, ArrayList<Integer> res, int n) 
    {
        if (start + increment > n) 
        {
            res.add(start);
            return;
        }

        divideConque(start, 2 * increment, res, n);
        divideConque(start + increment, 2 * increment, res, n);
    }


    public static void main(String[] args)
    {
        // Q 4. Beautiful Array
        int n = 5;
        System.out.println("Beautiful Array of "+ n + " is : "+ beautifulArray(n));
    }
}