import java.util.*;
class linkedlist_insertafter{
    class Node{
        Node next;
        int data;
        Node(int d){
            data=d;
            next=null;
        }
    }
    Node head;
    public void insert(int d){
         Node ele=new Node(d);
         if(head==null){
           head=ele;
         }
         else{
            Node last =head;
            while(last.next!=null){
                last=last.next;
            }
            last.next=ele;
         }
    }
    public void disp(){
      Node curr =head;
      if(curr==null){
          System.out.print("empty");
      }
      else{System.out.println("elements are:");
          while(curr !=null){
              System.out.print(curr.data+ " ");
              curr=curr.next;
          }
          System.out.println();
      }
   }
   public void insertafter(int e,int pos){ 
   Node el=new Node(e);
       Node curr=head;
       int i=1;
       while(i<pos){
           curr=curr.next;
           i++;
       }
      el.next=curr.next;
      curr.next=el;
   }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        linkedlist_insertafter ob= new linkedlist_insertafter();
        for(int i=0;i<n;i++)
        {
            int el=sc.nextInt();
            ob.insert(el);
        }
        ob.disp();
        System.out.println("enter element");
        int e=sc.nextInt();
        System.out.println("enter postion");
        int pos=sc.nextInt();
        ob.insertafter(e,pos);
        ob.disp();
        sc.close();
    }
}
