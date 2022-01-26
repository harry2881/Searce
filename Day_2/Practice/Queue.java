class Queue {
    int Q[]=new Q[10];
    int size;
    int front,rear;
    public void enqueue(int data)
    {
        Q[rear]=data;   //We always insert from the rear
        rear++;
        size++;
    }
    public void show()
    {
        for(int i=0;i<size;i++)
        {
            System.out.print(Q[front+i]+" ");
        }
    }
    public int dequeue()
    {
        int data=Q[front];     //We always Delete from the front
        front++;
        size--;
        return data;
    }

}
