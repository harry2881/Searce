package Day_3;
import java.util.*;
public class Sum_subarray{
    
    public static void naive(int a[],int sum)     // This is a naive approach to find the subarray with a given sum
    {
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
    public static void Using_hashmap(int a[],int sum)
    {
        int start=0;
        int cursum=0;
        int end=-1;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<a.length;i++)
        {
            cursum+=a[i];
            
            if(cursum==sum)   // Special case if Subarray containing the sum starts from the first index
            {
                start=0;
                end=i;
                break;
            }
            if(map.containsKey(cursum-sum))
            {
                start=map.get(cursum-sum)+1;
                end=i;
                break;
            }
            map.put(cursum,i);

        }
        if(end==-1)
            System.out.println("not found");
        else
            System.out.println("Subarray found from index "+start+" to "+end);
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
        
        naive(arr,sum);              //calling naive approach mathod   
        Using_hashmap(arr,sum);     //calling Hashmap method
    }
}



