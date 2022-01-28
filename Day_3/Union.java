import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

// This fxn does the union of two arrays using HashSet
public class Union {

    public void unionTwoArrays(int[] a,int[] b)
    {
        Set<Integer> un=new HashSet<>();
        for(int i : a)
            un.add(i);
        for(int j: b)
            un.add(j);
        Iterator value=un.iterator();
        System.out.println("The union of two arrays is: ");
        while (value.hasNext()) {
        System.out.println(value.next());
        }
        System.out.print("The size of the union is "+un.size());
        
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
    }
}
