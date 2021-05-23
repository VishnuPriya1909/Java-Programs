import java.util.*;
public class LongConsecutive 
{
	static void longCons(int arr[],int n)
	{
		Arrays.sort(arr);
	      int count=1,ans=0;
	      for(int i=1;i<n;i++)
	      {
	    	  if(arr[i]==arr[i-1]+1)
	    	  {
	    		  count++;
	    	  }
	    	  else
	    		  count=1;
	    	  ans=Math.max(ans,count);
	      }
	      System.out.println(ans);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      if(n>=2 && n<=100)
      {
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
      {
    	  arr[i]=sc.nextInt();
      }
      longCons(arr,n);
      }
      else
    	  System.out.println("1");
	}
	

}
