import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      int i=0,j=0,k=1;
       for(i=0;i<n;i++)
      {
        a[i]=sc.nextInt();
      }
      int n1=n+1;
      int b[]=new int[n1];
        for(i=1;i<n+1;i++)
      {
        b[i]=0;
      }    

      for(i=0;i<n;i++)
      {
        for(j=0;j<n;j++)
        {
        if(k==a[j])
        {
          b[k]=a[j];
         
        }
        }
        k++;
      }
      for(i=1;i<n1;i++)    
      {
        if(b[i]==0)
        {
          System.out.println(i);
        }
      }
      
    }
}