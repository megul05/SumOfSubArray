package SumOfSubArray;

import java.util.Scanner;

public class SumOfSubArray {
	
	 public static int findSum(int[] arr,int size) 
	 {
	        int sum = 0;
	        int t_sum = 0;
	        if(size <= 1) 
	        {
	            return arr[0];
	        }
	        for(int i=0;i<size;i++)
	        {
	            sum = 0;
	            for(int j=i;j<size;j++)
	            {
	                sum += arr[j];
	                t_sum += sum;
	            }
	        }
	        return t_sum;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Size of the Array :");
		int number = scan.nextInt();
		System.out.println("Enter elements of the Array :");
        int[] arr = new int[number];
        for(int i=0;i<number;i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println(findSum(arr, number));

	}

}
