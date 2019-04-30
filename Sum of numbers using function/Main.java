import java.util.Scanner;
class Main{
     public static int sum_of_num(int num)
     {
       int add=0;
       for(int i=1;i<=num;i++)
       {
         add=add+i;
       }
       return add;
     }
	public static void main (String[] args){
	    // Type your code here
       Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int sum=sum_of_num(n);
      System.out.println(sum);
	}
}