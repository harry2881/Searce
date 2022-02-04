
class Queue_CircularArray {
    int size;
    int Q[];
    int front,rear=-1;
    public Queue_CircularArray(int size)
    {
        this.size=size;
        Q=new int[size];
    }
    public void enQueue(int data)
    {
        if((rear+1)%size==front)
        {
            System.out.println("Queue is full. Cannot insert");
        }
        else if(rear==-1)
        {
            front=rear=0;
            Q[rear]=data;
        }
        else
        {
            rear=(rear+1)%size;
            Q[rear]=data;
        }
    }
    public int deQueue()
    {
        if(front==-1)
        {
            System.out.println("No element to dequeue.");
            return -1;
        }
        int res=Q[front];
        if(front==rear)
        {
            front=rear=-1;
        }
        else
        {
            front=(front+1)%size;
        }
        return res; 
    }
    public void show()
    {
        int i=front;
        while(i%size!=rear)
        {
            System.out.print(Q[i]+" ");
            i++;
        }
        System.out.print(Q[i]);
    }
    
}
