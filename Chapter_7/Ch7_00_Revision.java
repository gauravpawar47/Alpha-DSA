package Programs.Chapter_7;

public class Ch7_00_Revision
{
    public static void _1_Hollow_Rectangle(int rows, int cols)
    {
        for(int i = 1; i <= rows; i++)
        {
            for(int j = 1; j <= cols; j++)
            {
                if(i == 1 || j == 1 || i == rows || j == cols)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void _2_Inverted_Rotated_Half_Pyramid(int n)
    {
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= n - i; j++)
            {
                System.out.print(" ");
            }

            for(int k = 1; k <= i; k++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void _3_Inverted_Half_Pyramid_Number_Pattern(int n)
    {
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= n - i + 1; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void _4_Floyds_Triangle_Pattern(int n)
    {
        for(int i = 1; i <= n; i++)
        {
            int counter = 1;
            for(int j = 1; j <= i; j++)
            {
                System.out.print(counter);
                counter++;
            }
            System.out.println();
        }
    }

    public static void _5_0_1_Triangle_Pattern(int n)
    {
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                if((i + j) % 2 == 0)
                    System.out.print("1");
                else
                    System.out.print("0");
            }
            System.out.println();
        }
    }

    public static void _6_Butterfly_Pattern(int n)
    {
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }

            for(int k = 1; k <= 2 * (n - i); k++)
            {
                System.out.print(" ");
            }

            for(int l = 1; l <= i; l++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = n; i >= 1; i--)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }

            for(int k = 1; k <= 2 * (n - i); k++)
            {
                System.out.print(" ");
            }

            for(int l = 1; l <= i; l++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void _7_Solid_Rhombus_Pattern(int n)
    {
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= n - i; j++)
            {
                System.out.print(" ");
            }

            for(int k = 1; k <= n; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void _8_Hollow_Rhombus(int n)
    {
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= n - i; j++)
            {
                System.out.print(" ");
            }

            for(int k = 1; k <= n; k++)
            {
                if(i == 1 || k == 1 || i == n || k == n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void _9_Diamond_Pattern(int n)
    {
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= n - i; j++)
            {
                System.out.print(" ");
            }

            for(int k = 1; k <= (2 * i) - 1; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = n; i >= 1; i--)
        {
            for(int j = 1; j <= n - i; j++)
            {
                System.out.print(" ");
            }

            for(int k = 1; k <= (2 * i) - 1; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void _10_Number_Pyramid_Pattern(int n)
    {
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= n - i; j++)
            {
                System.out.print(" ");
            }

            for(int k = 1; k <= i; k++)
            {
                System.out.print(i +" ");
            }
            System.out.println();
        }
    }

    public static void _11_Palindromic_Number_Pattern(int n)
    {
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= n - i; j++)
            {
                System.out.print(" ");
            }

            for(int k = i; k >= 1; k--)
            {
                System.out.print(k);
            }

            for(int l = 2; l <= i; l++)
            {
                System.out.print(l);
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        // 1 - Print Hollow Rectangle

//        _1_Hollow_Rectangle(5, 15);

        // 2 - Inverted And Rotated Half Pyramid

//        _2_Inverted_Rotated_Half_Pyramid(5);

        // 3 - Inverted Half Pyramid Pattern with Numbers

//        _3_Inverted_Half_Pyramid_Number_Pattern(5);

        // 4 - Floyd's Triangle Pattern

//        _4_Floyds_Triangle_Pattern(5);

        // 5 - 0-1 Triangle Pattern

//        _5_0_1_Triangle_Pattern(5);

        // 6 - Butterfly Pattern

//        _6_Butterfly_Pattern(5);

        // 7 - Solid Rhombus

//        _7_Solid_Rhombus_Pattern(5);

        // 8 - Hollow Rhombus

//        _8_Hollow_Rhombus(5);

        // 9 - Diamond Pattern

//        _9_Diamond_Pattern(5);

        // 10 - Number Pyramid Pattern

//        _10_Number_Pyramid_Pattern(5);

        // 11 - Palindromic Pattern With Numbers

//        _11_Palindromic_Number_Pattern(5);
    }
}