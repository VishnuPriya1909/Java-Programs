import java.util.*;
public class Doug 
{
   static void abs(int []n1,int length,String[] c1)
    {   
	   int ans=0,res=0;
	     for(int i=0;i<length;i++)
		 {
		   for(int j=0;j<i;j++)
		   {    	 
				   if(c1[j].equals("P"))
				    {
				       res+=n1[i];
				      }
				      else 
				      {
					    res=-n1[i];
				       }
		      }
		   }
	     System.out.println(res);
	   }
	public static void main(String[] args) 
	{
	  Scanner sc=new Scanner(System.in);
	  String inum=sc.nextLine();
	  String ch=sc.nextLine();
	  int length=sc.nextInt();
	  String integer[]=inum.split(" ");
	  int n1[]=new int[integer.length];
	  String c1[]=ch.split("");
	  for(int i=0;i<c1.length;i++)
	  {
		  for(int j=0;j<integer.length;j++)
		 {
			 n1[j]=Integer.parseInt(integer[j]); 
		  }
	  }
    abs(n1,length,c1);
	 }
  }
