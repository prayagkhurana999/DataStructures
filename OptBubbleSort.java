import java.util.*;
public class OptBubbleSort{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int i,j,temp=0;
        int ar[]=new int[x];
        Boolean swap=false;
        for(i=0;i<x;i++)
        {
            ar[i]=s.nextInt();
        }
        for(i=0;i<x;i++)
        {
            for(j=1;j<x;j++)
            {
                if(ar[j]>ar[j+1])
                {
                    swap=true;
                    
                    temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;

                }
              
                else{
                    swap=false;
                    break;
                }
              
            }
        }

        for(i=0;i<x;i++)
        {
            System.out.println(ar[i]);
        }
    }
}
