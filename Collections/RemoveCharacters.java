import java.util.*;
public class RemoveCharacters 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String s[]=str.split(" ");
		String str1=sc.nextLine();
		String s1[]=str1.split(" ");
		ArrayList<String>al=new ArrayList();
		for(int i=0;i<s.length;i++)
		{
			al.add(s[i]);
		}
		for(int i=0;i<s1.length;i++)
		{
			al.removeAll(Collections.singleton((s1[i])));
		}
		System.out.println(al);
  }
}