import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
       Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int p=n;
      for(int i=1;i<=n;i++)
      {
        int num=p;
        for(int j=1;j<=(n-(i-1));j++)
            {
              System.out.print(num);
              num=num-1;
            }
               System.out.print("\n");
             p--;
            }
            
	}
}