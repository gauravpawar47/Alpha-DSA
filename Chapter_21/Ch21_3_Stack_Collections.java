package Programs.Chapter_21;
import java.util.Stack;

public class Ch21_3_Stack_Collections
{
    public static void main(String[] args)
    {
        Stack<Integer> obj = new Stack<>();
        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.push(40);
        obj.push(50);

        System.out.println("Stack Elements : "+ obj);
        System.out.println("Peek Element   : "+ obj.peek());

        obj.pop(); // removed 50
        obj.pop(); // removed 40
        obj.pop(); // removed 30

        System.out.println("Stack Elements : "+ obj);
        System.out.println("Peek Element   : "+ obj.peek());
    }
}