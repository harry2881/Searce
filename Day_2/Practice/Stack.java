package Practice;
class Stack {
int st[];
int top;
static int size;
public Stack(int size)
{
    this.st=new int[size];
    Stack.size=size;
    top=-1;

}
public void push(int data)
{
    if(top==size)
    {
        System.out.println("Overflow condition. Stack is already full");
    }
    top++;    
    st[top]=data;
}
public void pop()
{
    if(isEmpty())
        System.out.println("Underflow condition. Stack is empty");
    else
    {
        int res=st[top];
        top--;
        System.out.println(res+"poped from stack");
    }
}
public void peek()
{
    int res=st[top];
    System.out.println(res);
}

public boolean isEmpty()
{
    if(top==-1)
        return true;
    else
        return false;
}
}