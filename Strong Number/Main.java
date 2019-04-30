import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int fact=1,sum=0,d=0;
      int temp;
      temp=n;
      while(n>0)
      {
        d=n%10;
        for(int i=1;i<=d;i++)
        {
          fact=fact*i;
          // System.out.println("fact" +fact);
        }
        sum=sum+fact;
        n=n/10;
        fact=1;
         //System.out.println(sum);
      }
      if(temp==sum)
        System.out.println("Yes");
      else 
        System.out.println("No");
        
	}
}