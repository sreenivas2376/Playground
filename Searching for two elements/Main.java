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
      int search1=sc.nextInt();
      int search2=sc.nextInt();
      int index1=-1;
      int index2=-1;
      for(int i=0;i<size;i++)
      {
         if(search1==arr[i])
         {
            index1=i;
         }
         if(search2==arr[i])
         {
           index2=i;
         }
      }
     System.out.println(index1);
      System.out.println(index2);
      
    }
}