import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();
      int count=1;
      for(int i=1;i<2*num;i++)
      {
        if(count<=num)
        {
          if(i%2==1)
          {
            System.out.println(i);
            count++;
          }
         
        }
      }
        
	}
}