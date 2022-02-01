import java.util.Arrays;
public class LinearProbing {

    static int capacity;
    int arr[];
    public Linearprobing(int capacity)                // Constructor
    {
    	 Linearprobing.capacity=capacity;
         arr=new int[capacity];
	}
	Arrays.fill(arr,-1);
    public int generateindex(int sum)
    {
        return sum%capacity;
    }
    public void put(int value)
    {
      int index=generateindex(hashCode(value));    
      if(arr[index]==-1)
      {
    	  arr[index]=value;
    	  System.out.println("Element added");
      }
      else
    {    
    	  for(int i=1;i<capacity-1;i++)
    	  {
    		  index=(index+i)%capacity;
    		  if(arr[index]==-1)
    		  { 
    			  arr[index]=value;
    			  break;
    		  }
    	  }
    	  System.out.println("No place left in the array");
     }
         
         //n.next=null;
        // System.out.println("element added");
    }
        
    public void show()
    {
    	for(int i:arr)
    		System.out.print(i+" ");
    }
    public int hashCode(int key)
    {
         return 2*key+3;
    }
    public int get(int value1)
    {
       int index=generateindex(hashCode(value1));
       if(arr[index]==-1)
    	   System.out.println("No value like this is stored here");
       else
       {
    	  for(int i=0;i<capacity-1;i++)
    	  {
    		  if(arr[index]==value1)
    			  return value1;  
    	  }
         return -1;
        
        }

    }


    public static void main(String[] args) {
        LinearProbing lp=new LinearProbing(10);
        lp.put(90);
        lp.put(76);
        lp.put(13);
        lp.put(11);
        System.out.print(lp.get(76));

    }
}
