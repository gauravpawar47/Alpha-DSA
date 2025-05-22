package Programs.Chapter_11;

public class Ch11_10_Question_Largest_String
{
    public static void main(String []args)
    {
        String names[] = {"Gaurav", "Aditya", "Vipul"};
        String largest = names[0];

        for(int i = 1; i < names.length; i++)
        {
            if(largest.compareTo(names[i]) < 0)
                largest = names[i];
        }

        System.out.println(largest);
    }
}