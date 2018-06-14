package quicksort;
import java.util.Scanner;

public class QuickSort{
	 int partition(int arr[], int low, int high)
    {
        int pivot = arr[high]; 
        int i = (low-1);
        for (int j=low; j<high; j++)
        {
        
            if (arr[j] <= pivot)
            {
                i++;
 
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
	
	  void quicksort(int arr[], int low, int high)
    {
        if (low < high)
        {
            int p = partition(arr, low, high);
            quicksort(arr, low, p-1);
            quicksort(arr, p+1, high);
        }
    }
	public static void main(String... args){
		
		QuickSort q=new QuickSort();
		Scanner s=new Scanner(System.in);

        System.out.println("enter mo of elements");

        int n=s.nextInt();

        int arr[]=new int[n];

        System.out.println("enter elements");

        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
		q.quicksort(arr,0,n-1);
		for(int i=0; i < n; i++){  
            
			System.out.print(arr[i] + " ");  
        }  
	}
}