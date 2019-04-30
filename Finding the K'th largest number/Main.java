import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int k=0,count=0;
        for(int i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
      int p=sc.nextInt();
        for(int i=0;i<n;i++)
        {
          for(int j=i+1;j<n;j++)
          {
            if(a[i]>a[j])
            {
              int temp=a[i];
              a[i]=a[j];
              a[j]=temp;
            }
          }
        }
  
         System.out.println(a[n-p]);
    }
}