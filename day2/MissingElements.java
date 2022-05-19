package week2.day2;

import java.util.Arrays;

public class MissingElements {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,6,7,8};
		int length = arr.length;
		Arrays.sort(arr);
		for(int i =1; i<length; i++)
			
		{
			if(i!= arr[i-1]) 
			{
				System.out.println("Missing number is");
				System.out.println(i);
				break;
			}
		}
		
		// TODO Auto-generated method stub

	}

}
