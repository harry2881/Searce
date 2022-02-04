// This is the implementation of Stack using Linked list
// No need to provide the size

import Practice;
class StackLL {

    int size;
    Node head;
    public StackLL()
    {
        head=null;
        size=0;
    }

    public void push(int data)
    {
        Node n=new Node(data);
        n.next=head;
        head=n;
    }
    public void pop()
    {
        if(isEmpty())
            System.out.println("UnderFlow condition. Stack is empty");
        else
            System.out.print("Element poped is"+head.data);
            head=head.next;
    }
    public void peek()
    {
        if(isEmpty())
            System.out.println("Stack is empty");
        else
            System.out.println("");
    }
    boolean isEmpty()
    {
        if(head==null)
            return true;
        else
            return false;

    }
}
