package Assignment;
class Reverse {
    public static void main(String[] args) {
        int arr[]=new int[5];
        for(int i=0;i<5;i++)
        {
            arr[i]=i;
        }
        for(int i=4;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }
 
    }
}
