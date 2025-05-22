package Programs.Chapter_14;

public class Ch14_Assignment_5
{
    public static void towerOfHanoi(int n, String src, String helper, String des)
    {
        if(n == 1)
        {
            System.out.println("Transfer Disk "+ n +" from " + src +" to "+ des);
            return;
        }

        towerOfHanoi(n - 1, src, des, helper);
        System.out.println("Transfer Disk "+ n +" from "+ src +" to "+ helper);
        towerOfHanoi(n - 1, helper, src, des);
    }

    public static void main(String[] args)
    {
        int n = 4;

        towerOfHanoi(n, "A", "B", "C");
    }
}