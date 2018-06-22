package bubblesort;
import java.util.Scanner;

public class BubbleSort {
	
	void bubblesort(int arr[]){
		int len=arr.length;
		for(int i=0;i<len-1;i++){
			for (int j = 0; j < len-i-1; j++){
				
				if(arr[i]>arr[i+1]){
					int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
					
				}
			}
			
		}
		
	}
	
	public static void main(String args[])
    {
		BubbleSort b=new BubbleSort();
		Scanner s=new Scanner(System.in);

        System.out.println("enter mo of elements");

        int n=s.nextInt();

        int arr[]=new int[n];

        System.out.println("enter elements");

        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
		b.bubblesort(arr);
		for(int i=0; i < n; i++){  
            
			System.out.print(arr[i] + " ");  
        }  
		
	}
}