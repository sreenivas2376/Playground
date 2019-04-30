import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int count=0,j=0;
      int temp;
      int d=0;
      int sum=0;
      j=n;
      temp=n;
      while(n>0)
      {
        n=n/10;
        count++;
      }
      while(temp>0)
      {
        d=temp%10;
        sum=sum+(d*d*d);
        temp=temp/10;
      }
     if( j==sum)
     {
       System.out.println("Armstrong Number");
     }
      else
        System.out.println("Not a Armstrong Number");
      
	}
}