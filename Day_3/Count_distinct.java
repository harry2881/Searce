//import java.io.UnsupportedEncodingException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// This is a program to calculate distinct elements present in an array.

// In the naive approach we have to use two pointers and check if we have already come across that element or not.
//But with hashset we can do it pretty easily in O(1) time complexity.

public class Count_distinct {

    public static int usingHashSet(int a[])
    {
        Set<Integer> m=new HashSet<>();
        for(int k : m)
        {
            m.add(k);
        }
        return m.size();

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        sc.close();
        System.out.print("The no. of distinct elements are "+usingHashSet(arr));
        
    }
}
