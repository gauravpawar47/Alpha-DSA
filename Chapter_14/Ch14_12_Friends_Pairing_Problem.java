package Programs.Chapter_14;

public class Ch14_12_Friends_Pairing_Problem
{
    public static int friendsPairing(int n)
    {
        if(n == 1 || n == 2)
            return n;

        return friendsPairing(n - 1) + ((n - 1) * friendsPairing(n - 2));
    }

    public static void main(String[] args)
    {
        int n = 5;

        System.out.println("Total Number Of Ways : "+ friendsPairing(n));
    }
}