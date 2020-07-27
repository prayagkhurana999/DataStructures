  import java.util.*;
class linkedlist_beginsert
{   
    class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data=d;
            next=null;
        }
    }
    Node head;
    public void insert(int el)
    {   Node ele =new Node(el);
        if(head==null)
        {
            head=ele;
        }
        else
        { 
              ele.next=head;
              head=ele;
        }
    }
    public void disp()
    {   System.out.println("elements in linked list:");
        Node curr=head;
        while(curr.next!=null)
        {
            System.out.print(curr.data+" ");
            curr=curr.next;
        }System.out.println(curr.data);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        linkedlist_beginsert on= new linkedlist_beginsert();
        for(int i=0;i<n;i++)
        {
            int e=sc.nextInt();
            on.insert(e);
        }
        sc.close();
        on.disp();
    }
}
