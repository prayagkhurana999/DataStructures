import java.util.Scanner;
class BinarySearch { 
    int binarySearch(int arr[], int l, int r, int x) 
    { 
        if (r >= l) { 
            int mid = l + (r - l) / 2; 
   
            if (arr[mid] == x) 
                return mid; 
   
            if (arr[mid] > x) 
                return binarySearch(arr, l, mid - 1, x); 

            return binarySearch(arr, mid + 1, r, x); 
        } 
        return -1; 
    } 
  
    public static void main(String args[]) 
    { 
        BinarySearch ob = new BinarySearch(); 
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = obj.nextInt();
        } 
        int result = ob.binarySearch(arr, 0, n - 1, x); 
        if (result == -1) 
            System.out.println("Element not present"); 
        else
            System.out.println("Element found at index " + result); 
    } 
}
