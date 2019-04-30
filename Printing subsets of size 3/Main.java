import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
       Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      int i=0,j=0,k=0;
      for(i=0;i<n;i++)
      {
        a[i]=sc.nextInt();
      }
      for(i=0;i<n;i++)
      {
          for(j=i+1;j<n;j++)
          {
            for(k=j+1;k<n;k++)
            {
              System.out.print("("+a[i] +","+" "+a[j] +","+" " +a[k] +")"+" ");
            }
          }
        if(i+2!=n-1)
        System.out.println();
      }
    }
}