import java.util.Scanner;
class Main
{
  public static int power(int base,int expo)
  { 
    int pow=1;
    for(int i=1;i<=expo;i++)
    {
     pow=pow*base;
    }
    return pow;
  }
  public static void main (String[] args)

  {
  Scanner sc=new Scanner(System.in);
    int base=sc.nextInt();
    int expo=sc.nextInt();
    int result=power(base,expo);
    System.out.println(result);
  }
  }