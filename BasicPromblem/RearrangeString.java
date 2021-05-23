import java.util.*;
public class RearrangeString
{

	public static void main(String[] args)  
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		//ArrayList al=new ArrayList();  
		  //  for(int i=0;i<str.length();i++)
		  //  {
		    //	al.add(str.charAt(i));
		   // }
		   // System.out.println(al);
		   //for(int i=1;i<al.size();i+=2)
		   // {
		      //  if(i%2==0)
		      //  {
		        //	Collections.swap(al, i, i+1);
		       // }
		     // else
		      // {
		        //	Collections.swap(al, i-1, i);
		        //}
		  //  }
		  // System.out.println(al);
		String even="",odd="";
		for(int i=0;i<str.length();i++)
		{
			if(i%2==0)
			{
				even+=str.charAt(i);
			}
			else
				odd+=str.charAt(i);
		}
		System.out.print(even+""+odd);
	}
}
