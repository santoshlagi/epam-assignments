package mergesort;
import java.util.Scanner;

public class MergeSort{
	
	public void merge(int arr[],int low,int mid,int high){// merging of elements method
		int sizeOfLeft= mid - low + 1;
        int sizeOfRight= high - mid;
        int Left[] = new int [sizeOfLeft];
        int Right[] = new int [sizeOfRight];
        for (int i=0; i<sizeOfLeft; ++i)
            Left[i] = arr[low + i];
        for (int j=0; j<sizeOfRight; ++j)
            Right[j] = arr[mid + 1+ j];
        int i = 0, j = 0;
        int k = low;
        while (i < sizeOfLeft && j < sizeOfRight)
        {
            if (Left[i] <= Right[j])
            {
                arr[k] = Left[i];
                i++;
            }
            else
            {
                arr[k] = Right[j];
                j++;
            }
            k++;
        }
 
        while (i < sizeOfLeft)
        {
            arr[k] = Left[i];
            i++;
            k++;
        }
 
        while (j < sizeOfRight)
        {
            arr[k] = Right[j];
            j++;
            k++;
        }
		
	}
	
	public void mergesort(int arr[],int low,int high){ // merge sort method
		if(low<high){
			int mid=(low+high)/2;
			mergesort(arr,low,mid);
			mergesort(arr,mid+1,high);
			merge(arr,low,mid,high);
		}
		
	}
	
	public static void main(String... args){ // main method
		
		MergeSort merge=new MergeSort();
		private final Scanner scan=new Scanner(System.in);

        System.out.println("enter mo of elements");

        int size=scan.nextInt();

        int arr[]=new int[size];

        System.out.println("enter elements");

        for(int i=0;i<size;i++){
            arr[i]=scan.nextInt();
        }
		merge.mergesort(arr,0,size-1);
		for(int i=0; i < size; i++){  
            
			System.out.print(arr[i] + " ");  
        }  
	}
}