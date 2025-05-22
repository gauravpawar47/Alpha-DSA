package Programs.Chapter_18;
import java.util.ArrayList;

public class Ch18_Assignment_4
{
    public static ArrayList<Integer> beautifulArray(int n)
    {
        ArrayList<Integer> res = new ArrayList<>();
        divideConque(1, 1, res, n);
        return res;
    }

    public static void divideConque(int start, int increment, ArrayList<Integer> res, int n)
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
        int n = 4;
        System.out.println("Beautiful ArrayList with Elements : "+ beautifulArray(n));
    }
}