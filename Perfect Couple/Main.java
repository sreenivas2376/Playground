import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      int i=0,j=0;
      for(i=0;i<n;i++)
      {
        a[i]=sc.nextInt();
      }
      int val=sc.nextInt();
      for(i=0;i<n;i++)
      {
        for(j=i+1;j<n;j++)
        {
          if((a[i]+a[j])==val)
          {
            System.out.println(+a[i] + ","+" "  +a[j]);
          }
        }
        //System.out.print("\n");
      }
    }
}