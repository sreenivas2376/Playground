import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();
      
      for(int i=1;i<=num;i++)
      {
        if(i%2==1)
        {
          System.out.println(i);
        }
      }
	}
}