package Programs.Chapter_44;

public class Ch44_5_Update_Query_Max_Segment_Tree
{
    public static int[] maxTree;
    public static int[] minTree;

    public static void init(int n)
    {
        maxTree = new int[4 * n];
        minTree = new int[4 * n];
    }

    public static void buildST(int i, int si, int sj, int[] arr)
    {
        if(si == sj)
        {
            maxTree[i] = arr[si];
            minTree[i] = arr[si];

            return;
        }

        int mid = si + (sj - si) / 2;
        buildST(2 * i + 1, si, mid, arr);
        buildST(2 * i + 2, mid + 1, sj, arr);

        maxTree[i] = Math.max(maxTree[2 * i + 1], maxTree[2 * i +2]);
        minTree[i] = Math.min(minTree[2 * i + 1], minTree[2 * i +2]);
    }

    public static int getMaxUtil(int i, int si, int sj, int qi, int qj)
    {
        // Case 1 : Non-Overlap
        if(si > qj || sj < qi)
        {
            return Integer.MIN_VALUE;
        }

        // Case 2 : Complete Overlap
        else if(si >= qi && sj <= qj)
        {
            return maxTree[i];
        }

        // Case 3 : Partial Overlap
        else
        {
            int mid = (si + sj) / 2;
            int left = getMaxUtil(2 * i + 1, si, mid, qi, qj);
            int right = getMaxUtil(2 * i + 2, mid + 1, sj, qi, qj);

            return Math.max(left, right);
        }
    }

    public static int getMax(int[] arr, int qi, int qj)
    {
        int n = arr.length;
        return getMaxUtil(0, 0, n - 1, qi, qj);
    }

    public static int getMinUtil(int i, int si, int sj, int qi, int qj)
    {
        // Case 1 : Non-Overlap
        if(si > qj || sj < qi)
        {
            return Integer.MAX_VALUE;
        }

        // Case 2 : Complete Overlap
        else if(si >= qi && sj <= qj)
        {
            return minTree[i];
        }

        // Case 3 : Partial Overlap
        else
        {
            int mid = (si + sj) / 2;
            int left = getMinUtil(2 * i + 1, si, mid, qi, qj);
            int right = getMinUtil(2 * i + 2, mid + 1, sj, qi, qj);

            return Math.min(left, right);
        }
    }

    public static int getMin(int[] arr, int qi, int qj)
    {
        int n = arr.length;
        return getMinUtil(0, 0, n - 1, qi, qj);
    }

    public static void updateMaxUtil(int i, int si, int sj, int idx, int newVal)
    {
        if(idx < si || idx > sj)
        {
            return;
        }

        maxTree[i] = Math.max(maxTree[i], newVal);
        if(si != sj)
        {
            int mid = (si + sj) / 2;

            updateMaxUtil(2 * i + 1, si, mid, idx, newVal);
            updateMaxUtil(2 * i + 2, mid + 1, sj, idx, newVal);
        }
    }

    public static void updateMax(int[] arr, int idx, int newVal)
    {
        arr[idx] = newVal;
        int n = arr.length;

        updateMaxUtil(0, 0, n - 1, idx, newVal);
    }

    public static void updateMinUtil(int i, int si, int sj, int idx, int newVal)
    {
        if(idx < si || idx > sj)
        {
            return;
        }

        if(si == sj)
        {
            minTree[i] = newVal;
        }

        if(si != sj)
        {
            minTree[i] = Math.min(minTree[i], newVal);
            int mid = (si + sj) / 2;

            updateMinUtil(2 * i + 1, si, mid, idx, newVal);
            updateMinUtil(2 * i + 2, mid + 1, sj, idx, newVal);
        }
    }

    public static void updateMin(int[] arr, int idx, int newVal)
    {
        arr[idx] = newVal;
        int n = arr.length;

        updateMinUtil(0, 0, n - 1, idx, newVal);
    }

    public static void main(String[] args)
    {
        int[] arr = {6, 8, 1, 2, 17, 1, 3, 2, 4};
        int n = arr.length;

        init(n);
        buildST(0, 0, n - 1, arr);

        System.out.print("Max Tree Elements : ");
        for(int i = 0; i < maxTree.length; i++)
        {
            System.out.print(maxTree[i] +" ");
        }

        System.out.print("\nMin Tree Elements : ");
        for(int i = 0; i < minTree.length; i++)
        {
            System.out.print(minTree[i] +" ");
        }

        System.out.println("\n\nMaximum Between 2 to 5 Index : "+ getMax(arr, 2, 5));
        System.out.println("Minimum Between 2 to 5 Index : "+ getMin(arr, 2, 5));

        updateMax(arr, 2, 20);
        updateMin(arr, 2, -1);

        System.out.println("\nMaximum Between 2 to 5 Index : "+ getMax(arr, 2, 5));
        System.out.println("Minimum Between 2 to 5 Index : "+ getMin(arr, 2, 5));
    }
}