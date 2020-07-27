import java.util.*;

class linkedlist_findelement{
class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    Node head;
    public void insert(int d){
         Node ele=new Node(d);
         if(head==null)
         {
           head=ele;
         }
         else{
            Node last =head;
            while(last.next!=null)
            {
                last=last.next;
            }
            last.next=ele;
         }
    }
    public void find(int k){
    int flag=0;
        Node curr=head;
        int i=1;
        while(curr.next!=null)
        {
            if(curr.data==k)
            {   flag=1;
                break;
            }
            i++;
            curr=curr.next;
        }
        if(curr.data==k)
        flag=1;
        
        if(flag==1)
        {
            System.out.println("found at position: "+i);
        }
        else{
            System.out.println("not found!!");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        linkedlist_findelement in =new linkedlist_findelement();
        for(int i=0;i<n;i++)
        {
            int el =sc.nextInt();
            in.insert(el);
        }
        
        System.out.println("enter element to find:");
        int k=sc.nextInt();
        in.find(k);
        sc.close();
    }
}
