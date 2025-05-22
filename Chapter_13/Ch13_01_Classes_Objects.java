package Programs.Chapter_13;

class Student_01
{
    String name;
    int roll;
    int marks;

    void setData(String name, int roll, int marks)
    {
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }

    void getData()
    {
        System.out.println("Name : "+ name);
        System.out.println("Roll : "+ roll);
        System.out.println("Marks : "+ marks +"\n");
    }
}

public class Ch13_01_Classes_Objects
{
    public static void main(String []args)
    {
        Student_01 s1 = new Student_01();

        s1.setData("Gaurav", 41, 90);
        s1.getData();

        s1.setData("Vaibhav", 7, 96);
        s1.getData();
    }
}