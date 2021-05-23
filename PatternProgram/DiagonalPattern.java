import java.util.*;
public class DiagonalPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
    int j;
	   for(int i=1;i<=n;i++)
       {  
    	   for( j=n;j>=1;j--)
    	   {
    		   if(j!=i)
    		   System.out.print(j);
    		   else
    			   System.out.print("*");
    	   }
    	   System.out.println();
       }
     }
 }


