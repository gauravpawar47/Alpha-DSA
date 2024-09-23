class Academics
{
    int[] marks = new int[3];
    int attendence;

    Academics()
    {
        marks = null;
        attendence = 0;
    }

    Academics(int[] marks, int attendence)
    {
        for(int i = 0; i < marks.length; i++)
        {
            this.marks[i] = marks[i]; 
        }
        this.attendence = attendence;
    }

    public Academics(Academics a)
    {
        for(int i = 0; i < marks.length; i++)
        {
            this.marks[i] = a.marks[i]; 
        }
        this.attendence = a.attendence;
    }
}

class Student extends Academics
{
    String name;
    int roll;
    static String School = "IVM High School";

    Student()
    {
        super();
        name = "xyz";
        roll = -1;
    }

    Student(String name, int roll, int[] marks, int attendence)
    {
        super(marks, attendence);
        this.name = name;
        this.roll = roll;
    }

    Student(Student s1)
    {
        super(s1.marks, s1.attendence);
        this.name = s1.name;
        this.roll = s1.roll;
    }

    public void getData()
    {
        System.out.println("\nName \t\t   : "+ name);
        System.out.println("Roll \t\t   : "+ roll);
        for (int i = 0; i < marks.length; i++)
        {
            System.out.println("Makrs of Subject 1 : "+ marks[i]);   
        }
        System.out.println("Attendence         : "+ attendence);
        System.out.println("School             : "+ School +"\n");
    }
}

public class _1_Student
{
    public static void main(String[] args)
    {
        Student s = new Student("Gaurav Pawar", 67, new int[]{90, 98, 95}, 100);

        s.getData();
    }
}