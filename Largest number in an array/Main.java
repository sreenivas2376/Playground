import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner sc=new Scanner(System.in);
      int size=sc.nextInt();
      int arr[]=new int[size];
      for(int i=0;i<size;i++)
      {
        arr[i]=sc.nextInt();
      }
      int max=arr[0];
      for(int i=1;i<size;i++)
      {
        if(max<arr[i])
        {
           max=arr[i];
        }
      }
      System.out.println(max);
    }
}