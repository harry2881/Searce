package Practice;
import java.util.Scanner;
class Traverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Size ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter Elements ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        sc.close();
        for (int k : arr) 
        System.out.print(k+" ");    
        
    }
}