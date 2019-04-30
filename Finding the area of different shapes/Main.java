import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        //Try your code here
      Scanner sc=new Scanner(System.in);
      int ch=sc.nextInt();
      switch(ch)
      {
        case 1:
                int side=sc.nextInt();
                int res1=side*side;
                System.out.println(res1);
                break;
        case 2:
                 int l=sc.nextInt();
                 int br=sc.nextInt();
                 int res2=l*br;
                 System.out.println(res2);
                 break;
        case 3:
                  int b=sc.nextInt();
                  int h=sc.nextInt();
                  double res3= 0.5 * b * h;
                  System.out.println(res3);
                  break;
        case 4:
                   double r=sc.nextInt();
                   double res4= r * 3.14 * r;
                   System.out.println(res4);
                   break;
        default:
                   System.out.println("invalid");
      }
    }
}