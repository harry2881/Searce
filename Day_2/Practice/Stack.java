package Practice;
class Stack {
int st[]=new int[10];
int top=0;
public void push(int data)
{
    st[top]=data;
    top++;
}
public void showAll()
{
    for(int n:st)
        System.out.print(n+" ");
}
}
