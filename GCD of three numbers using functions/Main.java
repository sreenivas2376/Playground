import java.util.Scanner;
public class Main{
   public static int gcd(int a,int b)
    {
     int min,z=0;
      if(a<b)
        min=a;
      else
        min=b;
     while(min>1)
     {
     if(a % min==0 && b % min==0)
     {
       z= min;
       break;
     }
     else
     {
       min--;
     }
     }
     return z;
    }
	public static void main (String[] args)
	{
	    // Type your code here
       Scanner sc=new Scanner(System.in);
      int n1=sc.nextInt();
       int n2=sc.nextInt();
       int n3=sc.nextInt();
      int n4=gcd(n1,n2);
      int res=gcd(n3,n4);
      System.out.println(res);
	}
}