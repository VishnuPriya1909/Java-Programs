import java.util.*;
public class HackrankProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
      {
    	  arr[i]=sc.nextInt();
      }
      int count=-1;
      for(int i=0;i<arr.length;i++,count++)
      {
    	  if(i+2<n && arr[i+2]==0)
    	  {
    		  i++;
    	  } 
    
      }
      System.out.println(count);
	}

}
