package Programs.Chapter_13;

class Student_06
{
    public String name;
    protected String password;
    public int roll;

    Student_06()
    {
        name = "Defualt";
        roll = Integer.MIN_VALUE;
    }

    Student_06(String name, int roll)
    {
        this.name = name;
        this.roll = roll;
    }

    Student_06(Student_06 s)
    {
        this.name = s.name;
        this.roll = s.roll;
    }
}

public class Ch13_06_Copy_Constructor
{
    public static void main(String []args)
    {
        Student_06 s1 = new Student_06("Gaurav", 41);
        s1.password = "pwd";

        Student_06 s2 = new Student_06(s1);
        s2.password = "pwd2";

        System.out.println(s1.name +", "+ s1.password +", "+ s1.roll);
        System.out.println(s2.name +", "+ s2.password +", "+ s2.roll);
    }
}