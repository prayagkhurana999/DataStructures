import java.util.*;
public class arrayrotation
{
    void getarray(int n, int arr[])
    {
        Scanner sc2 = new Scanner(System.in);
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter element "+i);
            arr[i] = sc2.nextInt();
        }
        sc2.close();
    }
    void shift(int k, int n, int arr[])
    {
        int temp;
        int i;
        while(k!=0)
        {
            temp = arr[0];
            for(i=0;i<n-1;i++)
            {
                arr[i] = arr[i+1];
            }
            arr[i] = temp;
            k--;
        }
    }
    void printarray(int n, int arr[])
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rotations required");
        int k = sc.nextInt();
        System.out.println("Enter number of elements in array: ");
        final int n = sc.nextInt();
        int[] arr = new int[n];
        arrayrotation obj = new arrayrotation();
        obj.getarray(n, arr);
        obj.shift(k,n, arr);
        obj.printarray(n, arr);
        sc.close();
    } 
}
