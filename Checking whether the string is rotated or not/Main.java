import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner sc=new Scanner(System.in);
      String str1=sc.nextLine();
      String str2=sc.nextLine();
      String temp=str1+str1;
     // System.out.println(temp);
      boolean res=temp.contains(str2);
      //System.out.println(res);
      if(res==true)
       System.out.println("Yes");
      else
        System.out.println("No");
    }
}