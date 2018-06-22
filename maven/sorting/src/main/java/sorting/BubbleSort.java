package bubblesort;
import java.util.Scanner;

public class BubbleSort {
	
	public void bubblesort(int arr[]){ // sorting elements using bubble sort
		int length=arr.length;
		for(int i=0;i<length-1;i++){
			for (int j = 0; j < length-i-1; j++){
				
				if(arr[i]>arr[i+1]){
					int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
					
				}
			}
			
		}
		
	}
	
	public static void main(String args[]) // main method
    {
		BubbleSort bubble=new BubbleSort();
		private final Scanner scan=new Scanner(System.in);

        System.out.println("enter no of elements");

        int size=scan.nextInt();

        int arr[]=new int[size];

        System.out.println("enter elements");

        for(int i=0;i<size;i++){
            arr[i]=scan.nextInt();
        }
		bubble.bubblesort(arr);
		for(int i=0; i < size; i++){  
            
			System.out.print(arr[i] + " ");  
        }  
		
	}
}