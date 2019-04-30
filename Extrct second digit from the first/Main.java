import java.util.Scanner;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int temp=0,slast=0;
    while(num>10)
    {
      slast=num%10;
      num=num/10;  
      //temp=num;
    }
    System.out.println(slast);
  }
}