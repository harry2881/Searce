import java.util.Scanner;
import java.util.Stack;

public class PreviousSmallerElement {

    public int[] find(int arr[])
    {
      Stack s=new Stack<>();
      int min[]=new int[arr.length];
      min[0]=-1;
      for(int i=1;i<n;i++)
      {
        if(s.peek<arr[i])
        {
            min[i]=s.peek();
        }
        else
            s.pop();
        s.add(arr[i]);
          
      }
        
    }
    public static void main(String[] args) {
        Scanner sc=new scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        find(arr);


    }
}
