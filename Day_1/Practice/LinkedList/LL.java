class LL{
    Node head;
    public void insertLast(data)
    {
        Node n=new Node(data);
        if(head==null)
        {
            head=n;
        }
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=n;

    }

    public void show() {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data);
        }
        
    }
}