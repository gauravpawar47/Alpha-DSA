package Programs.Chapter_30;
import java.util.HashSet;

public class Ch30_8_Hash_Set
{
    public static void main(String[] args)
    {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(5);
        set.add(2);
        set.add(4);
        set.add(2);

        System.out.println("\nSet Elements : "+ set);
        System.out.println("Set Contain 3 : "+ set.contains(3));

        set.remove(1);
        System.out.println("\nSet Elements : "+ set);
        System.out.println("Size of Set : "+ set.size());

        set.clear();
        System.out.println("\nSet Elements : "+ set);
    }
}