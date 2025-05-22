package Programs.Chapter_13;

class Student_16
{
    public String name;
    public int roll;
    static String schoolName;

    public void setData(String name, int roll)
    {
        this.name = name;
        this.roll = roll;
    }

    public void getData()
    {
        System.out.println(name +", "+ roll +", "+ schoolName);
    }
}

public class Ch13_16_Static_Keyword
{
    public static void main(String []args)
    {
        Student_16 s1 = new Student_16();

        Student_16.schoolName = "RSM";
        s1.setData("Gaurav Pawar", 41);
        s1.getData();

        Student_16 s2 = new Student_16();

        s2.setData("Gaurav Kathe", 24);
        s2.getData();
    }
}