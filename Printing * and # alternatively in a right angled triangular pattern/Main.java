import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		// Type your code here
       Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a=1;
      for(int i=1;i<=n;i++)
      {
        for(int j=1;j<=i;j++)
        {
          if(a%2 ==0)
            System.out.print("#");
          else
              System.out.print("*");
           a++;
        }
          System.out.print("\n");
      }
    }
}