package Programs.Chapter_23;
import java.util.Arrays;
import java.util.Collections;

public class Ch23_7_Chocola_Problem
{
    public static void main(String[] args)
    {
        int n = 4; // Rows
        int m = 6; // Cols

        // Vertical and Horizontal Cost
        Integer[] costV = {2, 1, 3, 1, 4};   // m - 1
        Integer[] costH = {4, 2, 1};        // n - 1

        // Sorting in Descending Order
        Arrays.sort(costV, Collections.reverseOrder());
        Arrays.sort(costV, Collections.reverseOrder());

        // Pieces and Cuts Pointers
        int hCuts = 0 , vCuts = 0;
        int hPieces = 1, vPieces = 1;
        int cost = 0;

        // Main Loop
        while(hCuts < costH.length && vCuts < costV.length)
        {
            if(costV[vCuts] < costH[hCuts]) // Perform Horizontal Cut
            {
                cost += (costH[hCuts] * vPieces);
                hCuts++;
                hPieces++;
            }
            else // Perform Vertical Cut
            {
                cost += (costV[vCuts] * hPieces);
                vCuts++;
                vPieces++;
            }
        }

        // Remaining Horizontal Cuts
        while(hCuts < costH.length)
        {
            cost += (costH[hCuts] * vPieces);
            hCuts++;
            hPieces++;
        }

        // Remaining Vertical Cuts
        while(vCuts < costV.length)
        {
            cost += (costV[vCuts] * hPieces);
            vCuts++;
            vPieces++;
        }

        System.out.println("Minimum Cost Of Cuts : "+ cost);
    }
}