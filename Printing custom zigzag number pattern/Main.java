import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
       Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int count=1;
      for(int i=1;i<=n;i++)
      {
        for(int j=1;j<=n;j++)
        {
          if(i % 2==1)
           {
              if(count != n)
              {
                System.out.print(i);
                count++; 
              }
               else
                 System.out.print(i+1);
           }
            else
            {
              if( count==1)
              {
                 System.out.print(i+1);
                count++; 
              }
              else
             System.out.print(i);
            }
                
           }         
           System.out.print("\n");
           count=1;
        
      }
	}
}