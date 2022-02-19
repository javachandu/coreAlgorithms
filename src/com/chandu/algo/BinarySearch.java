package com.chandu.algo;

public class BinarySearch {

	public static void main(String args[]) {
		int[] arr = { 3, 6, 8, 17, 20, 25, 32, 35, 38, 42, 50 };
		int key = 42;
		int start = 0;
		int end = arr.length;
		int keyv = binary(arr, start, end, key);
		System.out.println(keyv);
	}

	public static int binary(int[] arr, int start, int end, int key) {
		if(end>=start){
			int mid= (start+(end-start)/2);
			if(arr[mid]==key)
				return mid;
			if(arr[mid]>key)
				return binary(arr,start,mid-1,key);
			
			return binary(arr,mid+1,end,key);
		}
		
		return -1;
	}
	
	static int binarySearch(int arr[], int l, int r, int x)
    {
        if (r>=l)
        {
            int mid = l + (r - l)/2;
 
            // If the element is present at the 
            // middle itself
            if (arr[mid] == x)
               return mid;
 
            // If element is smaller than mid, then 
            // it can only be present in left subarray
            if (arr[mid] > x)
               return binarySearch(arr, l, mid-1, x);
 
            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid+1, r, x);
        }
 
        // We reach here when element is not present
        //  in array
        return -1;
    }
}
