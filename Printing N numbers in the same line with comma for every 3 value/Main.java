import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   //Type your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int count=0;
    for(int i=1;i<=n;i++)
    {
      if(count !=3)
      {
      System.out.print(i);
        count++;
      }
      else
      {
           System.out.print(",");
          System.out.print(i);
           count=1;
      }
    }
    
  }
}