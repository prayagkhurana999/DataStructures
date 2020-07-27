import java.util.*;

class linkedlist_delete{   
    class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next = null;
        }
    }
    Node head =null;
    public void insert(int d){    
    Node el =new Node(d);
         if(head==null)
         {
             head=el;
         }
         else
         {
             Node curr=head;
             while(curr.next!=null)
             {
                 curr=curr.next;
             }
             curr.next=el;
         }
    }
    public void disp(){
    
       Node curr =head;
       System.out.println("elements after deletion are:");
           while(curr !=null)
           {
               System.out.print(curr.data+ " ");
               curr=curr.next;
           }
       
    }
    public void delete(int del){
    int flag=0;
        
         Node curr=head;
         if(curr.data==del)
         {
            head=curr.next;
         }
         else{
         Node prev;
             while(curr.next!=null)
             {   prev =curr;
                 curr=curr.next;
                 if(curr.data==del)
                {   prev.next=curr.next;
                    flag=1;
                    break;
                }
             }
              if(flag==0)
              {
                  System.out.println("not found!");
              }
              else{ 
                  disp();
              }
         }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of linked list:");
        int n=sc.nextInt();
        linkedlist_delete ob = new linkedlist_delete();
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++)
        {
          int val=sc.nextInt();
          ob.insert(val);
        }
        System.out.println("Enter element to be deleted:");
        int del=sc.nextInt();
        ob.delete(del);
        sc.close();
                 
    }
}
