
class Hashmap {
    static int capacity;
   // int arr[]=new int[capacity];
    public Hashmap(int capacity)
    {
       Hashmap.capacity=capacity;
    }
    Node arr[]=new Node[capacity];
    public int generateindex(int sum)
    {
        return sum%capacity;
    }
    public void put(int key,int value)
    {
      int index=generateindex(hashCode(key));
      Node n=new Node();
      n.key=key;
      n.value=value;    
      if(arr[index]==null)
        arr[index]=n;
      else
    {    Node temp=arr[index];
         while(temp.next!=null)
         {
            temp=temp.next;
         }
         temp.next=n;
         n.next=null;
    }
        
    }
    public int hashCode(int key)
    {
        int sum=0;
         while(key!=0)
        {
            int a=key%10;
            sum+=a;
            key =key/10;
        }
        return sum;
    }
    public Node get(int key)
    {
       int index=generateindex(hashCode(key));
        return arr[index];   
    }
}
