import java.util.*;
public class RemoveDuplicate 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		for(int k=0;k<4;k++)
		{
		String str=sc.next();
		String str1=sc.next();
		int len=0;
		String s="",s1;
		if(str1.length()>str.length())
		{
			len=str1.length();
			 s=str;
			 s1=str1;	
		}
		else
		{
			len=str.length();
			s=str1;
			s1=str;
		}
		ArrayList<String> al=new ArrayList();
		for(int i=0;i<s.length();i++)
		{
			char c1=s.charAt(i);
			String h=c1+"";
			if(s1.contains(h))
			{
				al.add(h);
			}
		}
    	//System.out.println(al);
		System.out.println(len-al.size());
    	
		}
	}
}
//Kitten
//sitting
