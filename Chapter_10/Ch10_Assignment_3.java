package Programs.Chapter_10;

public class Ch10_Assignment_3
{
    public static void transposedArray(int arr[][])
    {
        int column = arr[0].length;
        int row = arr.length;
        int transArray[][] = new int[column][row];

        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[i]. length; j++)
            {
                transArray[j][i] = arr[i][j];
            }
        }

        for(int i = 0; i < transArray.length; i++)
        {
            for(int j = 0; j < transArray[0].length; j++)
            {
                System.out.print(transArray[i][j] +" ");
            }
            System.out.println();
        }
    }

    public static void main(String []args)
    {
        int arr[][] = {{11, 12, 13},
                       {21, 22, 23}};

        transposedArray(arr);
    }
}