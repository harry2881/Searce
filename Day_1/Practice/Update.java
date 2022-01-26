package Practice;
import java.util.Scanner;
class Update {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("enter the size ");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("enter the elements ");
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    System.out.print("Index you want to change ");
    int pos=sc.nextInt();
    System.out.print("Change element ");
    int e=sc.nextInt();
    arr[pos-1]=e;
    for (int k : arr) 
        System.out.println(k);

}

}
