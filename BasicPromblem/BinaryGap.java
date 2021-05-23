import java.util.*;
public class BinaryGap 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		String bin=Integer.toBinaryString(num);
		System.out.println(bin);
          int max=0;
			     String arr[]=bin.split("1"); 
			       int len=arr.length; 
			       if(bin.endsWith("0")) 
			        {
			          len=len-1; 
			       } 
			       for(int i=0;i<len;i++) { 
				        if(max<arr[i].length()) 
				       {
			            max=arr[i].length(); 
			           } 
				    } 
			        if(max==0) { 
					  System.out.println("No binary gap"); 
					 }
			           else { 
				  System.out.println(max); 
				  }
	}
}