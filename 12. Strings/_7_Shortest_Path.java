public class _7_Shortest_Path
{
    public static float getShortestPath(String str)
    {
        int x = 0;
        int y = 0;

        for(int i = 0; i < str.length(); i++)
        {
            char direction = str.charAt(i);

            if(direction == 'S')
            {
                y--;
            }
            else if(direction == 'N')
            {
                y++;
            }
            else if(direction == 'W')
            {
                x--;
            }
            else
            {
                x++;
            }
        }

        return (float) Math.sqrt((x * x) + (y * y));
    }

    public static void main(String[] args)
    {
        String str = "WNEENESENNN";

        System.out.println("Shotest Path Distance : "+ getShortestPath(str));
    }
}