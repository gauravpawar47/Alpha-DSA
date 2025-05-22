package Programs.Chapter_8;

public class Ch8_03_Array_Function_Argument
{
    public static void updateArray(int arr[], String temp)
    {
        temp = "Changed";
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] += 1;
        }
    }

    public static void main(String []args)
    {
        int arr[] = {98, 99, 100};
        String temp = "Not Changed";

        updateArray(arr, temp);
        System.out.println(temp);

        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] +" ");
        }
    }
}