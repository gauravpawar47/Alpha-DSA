package Programs.Chapter_29;
import java.util.ArrayList;

public class Ch29_3_Heap_Operations
{
    public static class Heap
    {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) // Operation 1 : Insert
        {
            // Step 1 : Insert the Data
            arr.add(data);

            // Step 2 : Fix the Tree
            int x = arr.size() - 1;
            int parent = (x - 1) / 2;

            while(arr.get(x) < arr.get(parent)) // > : for max heap
            {
                int temp = arr.get(x);
                arr.set(x, arr.get(parent));
                arr.set(parent, temp);

                x = parent;
                parent = (x - 1) / 2;
            }
        }

        public int peek() // Operation 2 : Peek
        {
            return arr.get(0);
        }
        
        private void heapify(int i)
        {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int min = i;
            
            if(left < arr.size() && arr.get(min) > arr.get(left)) // < : for max heap
            {
                min = left;
            }
            
            if(right < arr.size() && arr.get(min) > arr.get(right)) // < : for max heap
            {
                min = right;
            }
            
            if(min != i)
            {
                int temp = arr.get(i);
                arr.set(i, arr.get(min));
                arr.set(min, temp);
            
                heapify(min);
            }
        }

        public int remove()
        {
            int data = arr.get(0);
            
            // Step 1 : Swap 1st with Last Element
            int temp = data;
            arr.set(0, arr.get(arr.size() - 1));
            arr.set(arr.size() - 1, temp);
            
            // Step 2 : Remove the Last Element
            arr.remove(arr.size() - 1);
            
            // Step 3 : Heapify
            heapify(0);
            return data;
        }

        public boolean isEmpty()
        {
            return arr.isEmpty();
        }
    }

    public static void main(String[] args)
    {
        Heap pq = new Heap();

        pq.add(3);
        pq.add(4);
        pq.add(1);
        pq.add(5);

        System.out.print("Heap Elements : ");
        while(!pq.isEmpty())
        {
            System.out.print(pq.peek() +" ");
            pq.remove();
        }
    }
}