package Programs.Chapter_4;

public class Ch4_Assignment_5 {
    public static void main(String[] args)
    {
        // Q. What is wrong in the following program ?

        for (int i = 0; i <= 5; i++) {
            System.out.println("i = " + i);
        }
        // System.out.println("i after the loop = " + i );

        // Note - Originally the above statement is un commented but because it has error it can cause trouble
        // in execution of further programs that's why it's comment out

        // --> At Line 13, the i is not accessible because, As it's only accessible and usable within the loop
    }
}