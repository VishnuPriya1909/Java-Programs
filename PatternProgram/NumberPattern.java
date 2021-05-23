import java.util.*;
public class NumberPattern {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          int no=1;
     for(int i=1;i<=n+1;i++)
     {
    	 for(int j=1;j<=n;j++)
    	 {	 
    		 if(j==n-1 && i!=1)
    		 {
    			 System.out.print(no+" ");
    			 no++;
    		 }
    		 else
    		 {
    		       System.out.print(n+" ");
    		 }
    	 }
    	 System.out.println();
      }
	}
}
