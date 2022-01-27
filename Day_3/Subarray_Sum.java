import java.util.ArrayList;
import java.util.Scanner;
public class Subarray_Sum{
    
    public static void sumSubArray(int a[],int sum)
    {
        //ArrayList <Integer> al=new ArrayList<>();
        for(int i=0;i<a.length;i++)
        {
            int b=0;
            for(int j=i;j<a.length;j++)
            {
                b=b+a[j];
                if(b==sum)
                {
                    for(int k=i;k<=j;k++) 
                        System.out.print(a[k]+" ");
                }

            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[7];
        System.out.println("Enter Elements");
        for(int i=0;i<7;i++)
        {
            arr[i]=sc.nextInt();
        }
        sc.close();
        System.out.println("Enter the sum ");
        int sum=sc.nextInt();
        sumSubArray(arr,sum);
    }
}
