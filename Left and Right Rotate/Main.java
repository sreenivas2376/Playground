import java.util.Scanner;
class Main 
{
  public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    int i=0,j=0,k=0,p=0,temp=0,t=0,temp1=0;
    for(i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
    }
    int odd[]=new int[n];
    int even[]=new int[n];
    int rot=sc.nextInt();
    for(i=0;i<n;i++)
    {
      if(i%2==1)
      {
        even[k]=a[i];
         k++;
      }
      else
      {
        odd[j]=a[i];
         j++;
      }
  	}
    for(t=0;t<rot;t++)
    {
      temp=odd[j-1];
      for(i=j-2;i>=0;i--)
      {
        odd[i+1]=odd[i];
      }
      odd[0]=temp;
      temp1=even[0];
      for(p=1;p<k;p++)
      {
        even[p-1]=even[p];
      }
      even[p-1]=temp1;
    }
    j=0;k=0;
   for(i=0;i<n;i++)
   {
     if(i%2==1)
     {
       a[i]=even[j];
     j++;
     }
     else
     {
       a[i]=odd[k];
       k++;
     }
   }
    for(i=0;i<n;i++)
    {
      System.out.print(a[i]+" ");
    }
  }
}