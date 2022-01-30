package Assignment;
public class PrintLL {
    Node head;
    public void addAtStart(int data)
    {
        Node n=new Node(data);
        if(head==null)
            head=n;
        n.next=head;
        head=n;
    }
    public void addAtLast(int data)
    {
        Node n=new Node(data);
        if(head==null)
            head=n;
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=node;
    }
    public void printList()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data);
        }

    }


    
}

class Node{
    String data;
    Node next;
    Public Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}