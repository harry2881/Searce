package Practice;

import java.util.Scanner;
public class Deletion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Size ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements in the array ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("Position where to delete ");
        int pos=sc.nextInt();
        sc.close();
        for(int j=pos-1;j<n-1;j++)
        {
            arr[j]=arr[j+1];
        }
        arr[n-1]=0;
        for (int h : arr) 
        System.out.print(h+" ");
    }
}