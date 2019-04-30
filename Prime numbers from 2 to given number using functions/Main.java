import java.util.Scanner;
class Main
{
   public static void prime(int n)
   {
     int count=0,i,j;
     for(i=1;i<=n;i++)
     {
       count=0;
       for(j=1;j<=i;j++)
       {
         if(i%j==0)
         {
           count++;
         }
       }
       if(count==2)
         System.out.println(i);
     }
   }
       
	public static void main (String[] args)
    {
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int range=sc.nextInt();
      prime(range);
      
	}
}