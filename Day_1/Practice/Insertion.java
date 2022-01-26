package Practice;

import java.util.Scanner;

class Insertion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Size ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements in the array ");
        for(int i=0;i<n-1;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("Position where to insert ");
        int pos=sc.nextInt();
        System.out.print("Element to be inserted ");
        int ele=sc.nextInt();
        sc.close();
        for(int j=n-1;j>=pos-1;j--)
        {
            arr[j]=arr[j-1];
        }
        arr[pos-1]=ele;
        for (int h : arr) 
        System.out.print(h+" ");
}
}