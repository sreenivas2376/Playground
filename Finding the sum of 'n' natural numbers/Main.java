
import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
   int res=fact(n);
    System.out.println(res);
  }
  public static int fact(int t)
  {
    if(t==1)
    {
      return 1;
    }
    return t+(fact(t-1));
  }
}