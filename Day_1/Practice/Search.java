package Practice;
import java.util.Scanner;
class Search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        for(int i=0;i<10;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Eement To search");
        int e=sc.nextInt();
        sc.close();
        for (int j=0;j<10;j++) {
            if(arr[j]==e)
                System.out.println("Element at "+j+" index");
        }
    }
}
