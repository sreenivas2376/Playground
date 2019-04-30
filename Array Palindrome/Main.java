import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      int count=0,j=n-1;
      for(int i=0;i<n;i++)
      {
        a[i]=sc.nextInt();
      }
      for(int i=0;i<n/2;i++)
      {
          if(a[i]==a[j])
          {
            count=1;
            j--;
          }
          else
          {
            j--;
            count=0;
           break;
          }
      }
        if(count==1)
          System.out.println("Yes");
        else
          System.out.println("No");
            
    }
}