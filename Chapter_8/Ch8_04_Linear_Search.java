package Programs.Chapter_8;

public class Ch8_04_Linear_Search
{
    public static int linearSearch(int meritList[], int key)
    {
        for(int i = 0; i < meritList.length; i++)
        {
            if(meritList[i] == key)
                return i;
        }
        return -1;
    }

    public static void main(String []args)
    {
        int meritNumber[] = {100, 946, 125, 234, 956, 74, 253, 963, 747, 525, 998};
        int key = 74;

        int index = linearSearch(meritNumber, key);
        String result = (index == -1 ) ? "Not Found" : "Found at : "+ index;
        System.out.println(result);
    }
}