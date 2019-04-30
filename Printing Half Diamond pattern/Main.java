import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int p=1;
      for(int i=1;i<=n;i++)
      {
        for(int j=n-1;j>=i;j--)
        {
          System.out.print(" ");
        }
        for(int k=1;k<=p;k++)
        {
          System.out.print("*");
        }
        p=p+2;
        System.out.print("\n");
      }
	}
}