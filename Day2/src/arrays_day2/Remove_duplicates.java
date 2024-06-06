package arrays_day2;

import java.util.Scanner;

public class Remove_duplicates {
	 public static void main (String[] args) {  
	        int arr[] = {10,20,20,30,30,40,50,50};  
	        int n = arr.length;  
	        int[] temp = new int[n];  
	        int j = 0;  
	        for (int i=0; i<n-1; i++){  
	            if (arr[i] != arr[i+1]){  
	                temp[j++] = arr[i];  
	            }  
	         }  
	        temp[j] = arr[n-1];     
	    
	    
	        for(int i=0;i<temp.length;i++)
	        {
	        	if(temp[i]!=0)
	        	{
	        	System.out.print(temp[i]+" ");
	        	}
	        }
	        
	 }
}
