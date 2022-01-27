// this problem is to count the distinct elements in every window of size k
import java.util.*;
public class Distinctk{
    public static void count(int[] arr, int k) 
    {
        //int start=0;
       // Set<Integer> s=new HashSet<>();
        for(int j=0;j<=arr.length-k;j++)
        {
            Set<Integer> s=new HashSet<>();
            for(int i=j;i<j+k;i++)
            {
                s.add(arr[i]);
            }
            System.out.println(s.size());
        }
    }
    public static void main(String[] args)
     {
        int arr[]=new int[6];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Elements");
        for(int i=0;i<7;i++)
        {
            arr[i]=sc.nextInt();
        }
        sc.close();
        System.out.println("Enter window size ");
        int k=sc.nextInt();
        count(arr,k);
            
    }

}