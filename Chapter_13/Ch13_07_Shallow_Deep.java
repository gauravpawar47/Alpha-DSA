package Programs.Chapter_13;

class Student_07
{
    public String name;
    public int roll;
    public int marks[] = new int[3];
    protected String password;

    Student_07()
    {
        name = "Default";
        roll = Integer.MIN_VALUE;
    }

    Student_07(String name, int roll)
    {
        this.name = name;
        this.roll = roll;
    }

    Student_07(Student_07 s) // Shallow Copy Constructor
    {
        this.name = s.name;
        this.roll = s.roll;
        this.marks = s.marks;
    }

    Student_07(Student_07 s, String password) // Deep Copy Constructor
    {
        this.name = s.name;
        this.roll = s.roll;
        this.password = s.password;

        for(int i = 0; i < marks.length; i++)
        {
            this.marks[i] = s.marks[i];
        }
    }
}

public class Ch13_07_Shallow_Deep
{
    public static void main(String []args)
    {
        Student_07 s1 = new Student_07("Gaurav", 41);
        s1.password = "PWD_S1";
        s1.marks[0] = 96;
        s1.marks[1] = 90;
        s1.marks[2] = 93;

        Student_07 s2 = new Student_07(s1);
        Student_07 s3 = new Student_07(s1, "PWD_S3");

        s2.password = "PWD_S2";
        s1.marks[0] = 100;

        System.out.println(s1.name +", "+ s1.password +", "+ s1.roll +", "+ s1.marks[0] +", "+ s1.marks[1] +", "+ s1.marks[2]);
        System.out.println(s2.name +", "+ s2.password +", "+ s2.roll +", "+ s2.marks[0] +", "+ s2.marks[1] +", "+ s2.marks[2]);
        System.out.println(s3.name +", "+ s3.password +", "+ s3.roll +", "+ s3.marks[0] +", "+ s3.marks[1] +", "+ s3.marks[2]);
    }
}