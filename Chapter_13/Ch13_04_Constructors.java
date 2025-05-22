package Programs.Chapter_13;

class Student_04
{
    public String name;
    public int roll;

    Student_04(String name, int roll)
    {
        this.name = name;
        this.roll = roll;
    }
}

public class Ch13_04_Constructors
{
    public static void main(String []args)
    {
        Student_04 s1 = new Student_04("Gaurav", 41);

        System.out.println(s1.name +", "+ s1.roll);
    }
}