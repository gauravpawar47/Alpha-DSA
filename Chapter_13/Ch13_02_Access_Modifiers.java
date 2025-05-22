package Programs.Chapter_13;

class Instagram_02
{
    public String username;
    private String password;

    void setData(String username, String password)
    {
        this.username = username;
        this.password = password;
    }

    protected void getData()
    {
        System.out.println("Username : "+ username);
    }
}

public class Ch13_02_Access_Modifiers
{
    public static void main(String []args)
    {
        Instagram_02 acc1 = new Instagram_02();

        acc1.setData("student47", "pwd");
        acc1.getData();
    }
}