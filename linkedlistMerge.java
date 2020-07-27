import java.util.*;
class linkedlist_merge{
class Node{
      Node next;
      int data;
      Node(int d){
        data=d;
        next=null;
      }
    }
    Node head1;
    Node head2;
    public void insert(int d){ 
      Node el =new Node(d);
      if(head1==null)
      head1=el;
      else{
        Node curr=head1;
        while(curr.next!=null)
        {
          curr=curr.next;
        }
        curr.next=el;
      }
    }
    public void insert2(int d){ 
      Node el =new Node(d);
      if(head2==null)
      head2=el;
      else{
        Node curr=head2;
        while(curr.next!=null)
        {
          curr=curr.next;
        }
        curr.next=el;
      }
    }
    public void merge(){
      Node curr =head1;
      while(curr.next!=null)
      {
        curr=curr.next;
      }
      curr.next=head2;
    }
    public void disp(){   System.out.println("elements after merge:");
        Node curr=head1;
        while(curr.next!=null)
        {
            System.out.print(curr.data+" ");
            curr=curr.next;
        }System.out.println(curr.data);
    }
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      linkedlist_merge in=new linkedlist_merge();
      System.out.println("Enter size of first list:");
      int n=sc.nextInt();
      for(int i=0;i<n;i++)
      {
        int el=sc.nextInt();
        in.insert(el);
      }
      System.out.println("Enter size of second list:");
      int n2=sc.nextInt();
      for(int t=0;t<n2;t++)
      {
        int e=sc.nextInt();
        in.insert2(e);
      }
      in.merge();
      in.disp();
      sc.close();
    }
}
