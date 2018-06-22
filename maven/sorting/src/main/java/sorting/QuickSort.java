package quicksort;
import java.util.Scanner;

public class QuickSort{ 
	 public int partition(int arr[], int low, int high)// partition of elements method
    {
        int pivot = arr[high]; 
        int index = (low-1);
        for (int j=low; j<high; j++)
        {
        
            if (arr[j] <= pivot)
            {
                index++;
 
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
 
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
 
        return i+1;
    }
	
	 public void quicksort(int arr[], int low, int high)// quicksort method
    {
        if (low < high)
        {
            int  split= partition(arr, low, high);
            quicksort(arr, low, split-1);
            quicksort(arr, split+1, high);
        }
    }
	public static void main(String... args){// main method
		
		QuickSort quick=new QuickSort();
		private final Scanner scan=new Scanner(System.in);

        System.out.println("enter no of elements");

        int size=scan.nextInt();

        int arr[]=new int[size];

        System.out.println("enter elements");

        for(int i=0;i<size;i++){
            arr[i]=scan.nextInt();
        }
		quick.quicksort(arr,0,size-1);
		for(int i=0; i < size; i++){  
            
			System.out.print(arr[i] + " ");  
        }  
	}
}