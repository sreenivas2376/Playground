import java.util.Scanner;

class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
		    arr[i]=sc.nextInt();
		}
		int sum=0,j=-1,flag=0;
		int b[]=new int[n];
		for(int i=0;i<n;i=i+3)
		{
		   j++;
		  b[j]=arr[i]+arr[i+1]+arr[i+2];  
		}
		for(int i=0;i<j;i++)
		{
		    if(b[i]==b[i+1])
		      flag=1;
		    else
		      flag=0;
		}
		if(flag==1)
		    System.out.println("Perfect Batch");
		 else
		     System.out.println("Not a Perfect Batch");
		
	}
}