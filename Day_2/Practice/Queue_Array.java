
// This is the implementation of Queue using array
class Queue_Array {
    int size=10;
    int Q[]=new Q[size];
    int front,rear;
    public void enqueue(int data)
    {
        if(rear!=size)
        {
            rear++;
            Q[rear]=data;   //We always insert from the rear
        }
    }
    public void show()
    {
        for(int i=front;i<=rear;i++)
        {
            System.out.print(Q[i]+" ");
        }
    }
    public int dequeue()
    {
        int data=Q[front];     //We always Delete from the front
        for(i=0;i<rear;i++)
        {
            Q[i]=Q[i+1];
        }
        rear--;
        return data;
    }

}
