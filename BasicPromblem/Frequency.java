import java.util.*;
import java.util.HashMap;
import java.lang.*;
public class Frequency 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
	     Character ans1=null,ans2=null;
		int first=0,second=0;
//	 HashMap <Character,Integer>map=new LinkedHashMap();
		HashMap<Character,Integer> map = new HashMap();
		for(int i=0;i<s.length();i++)
		{
			if(map.containsKey(s.charAt(i)))
			{
			   map.put(s.charAt(i),(int)(map.get(s.charAt(i))+1));
			}
			else
			{
				map.put(s.charAt(i),1);
			}
		 }
          System.out.println(map);
		   for(Character c: map.keySet())
		   {
			   if(map.get(c)>first)
                {
                  second =first;
                   ans2=ans1;
                   ans1=c;
              	  first=map.get(c);
                 } 
			     else if(map.get(c)>second && map.get(c)!=first)
                  {
				   second=map.get(c);
                     ans2=c;
                  }
	       }
//		   System.out.println(ans1);
		   System.out.println(ans2);
}
}