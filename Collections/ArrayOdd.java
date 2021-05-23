import java.util.*;
public class ArrayOdd 
{
	 static void swap(int arr[],int i,int j)
	   {
		 int temp=arr[i];
		 arr[i]=arr[j];
		 arr[j]=temp;
	     }
        static void reArrange(int arr[],int length)
        {
        	for(int i=1;i<length;i+=2)
        	{
        	  if(arr[i-1]>arr[i])
        	  {
        		 swap(arr,i-1,i); 
        	  }
        	  if(i+1<length && arr[i+1]>arr[i])
        	  {
        		  swap(arr,i+1,i);
        	  }
  
    	    }
    	   for(int i=0;i<length;i++)
    	   System.out.print(arr[i]+" ");
 
        }
	   public static void main(String[] args) 
	  {
        Scanner sc=new Scanner(System.in); 
        int length=sc.nextInt();
        int arr[]=new int[length];
          for(int i=0;i<length;i++)
          {
        	  arr[i]=sc.nextInt();
          }
          reArrange(arr,length);
	}

}
