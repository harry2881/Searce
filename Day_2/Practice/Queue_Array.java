
// This is the implementation of Queue using array.
//We will shift the array elements when an element is deleted from the front.
//In this front will always be Q[0] while the rear will keep changing upon enQueue and deQueue
class Queue_Array {
    int size;
    int Q[];
    int front;
    int rear=-1;
    public QueueArray(int size)
    {
    	this.size=size;
    	Q=new int[size];
    }
    public void enqueue(int data)  //enQueue will take O(1) time complexity
    {
        if(rear!=size)
        {
            rear++;
            Q[rear]=data;   //We always insert from the rear
            System.out.println("Element added");
        }
        else
        	System.out.println("Queue is full");
    }
    public void show()
    {
        for(int i=front;i<=rear;i++)
        {
            System.out.print(Q[i]+" ");
        }
    }
    public void dequeue()  // deQueue will take O(n) time complexity since we are shifting the whole array after deleting the front.
    {
    	if(rear!=-1)
    	{
    		int data=Q[front];     //We always Delete from the front
    		for(int i=0;i<rear;i++)
    		{
    			Q[i]=Q[i+1];
    		}
    		rear--;
    		System.out.println("Element deleted "+data);
    	}
    	else
    		System.out.println("Queue is empty");
    }

}
