import java.util.*;
class work3{
  public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter the size of array");
	  int n=sc.nextInt();
	  System.out.println("enter the value of k");
	  int k=sc.nextInt();
	  int array[]=new int [n];
	  System.out.println("enter the elemnt of array");
	  for(int i=0;i<n;i++)
		  array[i]=sc.nextInt();
	  int count=0;
	  n=n-k+1;
	  count=(n*(n+1))/2;
	  System.out.println("output");
	  System.out.print(count);
  }
}