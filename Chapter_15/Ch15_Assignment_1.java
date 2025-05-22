package Programs.Chapter_15;

public class Ch15_Assignment_1
{
    public static void printString(String arr[])
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }

    public static String[] mergeSort(String arr[], int si, int ei)
    {
        if(si == ei)
        {
            String result[] = { arr[si] };
            return result;
        }

        int mid = si + (ei - si) / 2;
        String arr1[] = mergeSort(arr, si, mid);
        String arr2[] = mergeSort(arr, mid + 1, ei);
        String arr3[] = merge(arr1, arr2);

        return arr3;
    }

    public static String[] merge(String arr1[], String arr2[])
    {
        int m = arr1.length;
        int n = arr2.length;
        String arr3[] = new String[m + n];

        int index = 0;
        int i = 0;
        int j = 0;

        while (i < m && j < n)
        {
            if(isAlphabeticallySmaller(arr1[i], arr2[j]))
            {
                arr3[index] = arr1[i];
                i++;
                index++;
            }
            else
            {
                arr3[index] = arr2[j];
                j++;
                index++;
            }

            while(i < m)
            {
                arr3[index] = arr1[i];
                i++;
                index++;
            }

            while(j < n)
            {
                arr3[index] = arr2[j];
                j++;
                index++;
            }

        }
        return arr3;
    }
    public static boolean isAlphabeticallySmaller(String str1, String str2)
    {
        if(str1.compareTo(str2) < 0)
            return true;
        return false;
    }

    public static void main(String[] args)
    {
        // Q. Apply merge sort to sort an array of Strings. (Assume that all characters in all the strings are in Lowercase)

        String arr[] = {"sum", "earth", "mars", "mercury"};
        String result[] = mergeSort(arr, 0, arr.length - 1);

        System.out.print("Strings Before Sorting : ");
        printString(arr);

        System.out.print("Strings After Sorting  : ");
        printString(result);
    }
}