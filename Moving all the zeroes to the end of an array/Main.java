import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      int i=0,j=0,temp=0,k=0;
      for(i=0;i<n;i++)
      {
         a[i]=sc.nextInt();
      }
    for(i=0;i<n;i++)
    {
      if(a[j]==0)
      {
        temp=a[j];
        for(k=j+1;k<n;k++)
        {
          a[k-1]=a[k];
        }
        a[k-1]=temp;
      }
      else
        j++;
    }
    for(i=0;i<n;i++)
    {
      System.out.print(a[i]+" ");
    }
    }
}