import java.util.*;
public class Main
{
public static void main (String[] args) 
{
    int i, j,p,k;
    Scanner input=new Scanner(System.in);
    int n=input.nextInt();
    Scanner in=new Scanner(System.in);
    int m=in.nextInt();
    for(i=0;i<n;i++)
    {
        for(j=n-1;j>i;j--)
            System.out.print(" ") ;
            p=((2*n-1)-(2*m-1))/2;
        if(i>=n-m)
        {
          for(j=0;j<p;j++)
            System.out.print("1");
        for(k=p;k<2*i+1-p;k++)
            System.out.print(" ");
        for(j=0;j<p;j++)
            System.out.print("1");    
        }
        else
        {
        for(j=0;j<2*i+1;j++)
            System.out.print("1");
        }
         System.out.println("");
 
    }
    for(i=n;i<2*n-1;i++)
    {
        for(j=n-1;j<i;j++)
            System.out.print(" ");
        p=((2*n-1)-(2*m-1))/2;
        if(i<2*n-1-(n-m))
        {
        for(j=0;j<p;j++)
            System.out.print("1");
        for(k=p;k<2*(2*n-1-i)-1-p;k++)
            System.out.print(" ");
        for(j=0;j<p;j++)
            System.out.print("1"); 
        }
        else
        {
        for(j=2*(2*n-1-i)-1;j>0;j--)
            System.out.print("1");
        }
        System.out.println("");
    }
        
}
}

