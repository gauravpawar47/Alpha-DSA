package Programs.Chapter_13;

class Student_05
{
    public String name;
    public int roll;

    Student_05()
    {
        name = "Default";
        roll = -1;
    }

    Student_05(String name, int roll)
    {
        this.name = name;
        this.roll = roll;
    }
}

public class Ch13_05_Types_Constructors
{
    public static void main(String []args)
    {
        Student_05 s1 = new Student_05();
        System.out.println(s1.name +", "+ s1.roll);

        Student_05 s2 = new Student_05("Gaurav", 41);
        System.out.println(s2.name +", "+ s2.roll);
    }
}