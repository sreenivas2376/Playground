import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
     Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int mid=n/2;
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
    }
    for(int i=0;i<mid;i++)
    {
      for(int j=0;j<mid-1-i;j++)
      {
        if(a[j]>a[j+1])
        {
          int temp=a[j];
          a[j]=a[j+1];
          a[j+1]=temp;
        }
      }
    }for(int i=mid;i<n;i++)
    {
      for(int j=mid;j<n-1;j++)
      {
        if(a[j]<a[j+1])
        {
          int temp=a[j];
          a[j]=a[j+1];
          a[j+1]=temp;
        }
      }
    }
    
    for(int i=0;i<n;i++)
    {
      System.out.print(a[i]+" ");
    }
  }
}