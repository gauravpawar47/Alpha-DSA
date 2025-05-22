package Programs.Chapter_13;

class Student_03
{
    private String name;
    private int roll;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getRoll()
    {
        return roll;
    }

    public void setRoll(int roll)
    {
        this.roll = roll;
    }
}

public class Ch13_03_Getters_Setters
{
    public static void main(String []args)
    {
        Student_03 s1 = new Student_03();

        s1.setName("Gaurav");
        s1.setRoll(41);

        System.out.println(s1.getName() +", "+ s1.getRoll());
    }
}