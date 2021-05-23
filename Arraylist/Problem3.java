import java.util.*;
public class Problem3 
{
	public static void main(String[] args) 
	{
	  Scanner sc=new Scanner(System.in);
	  ArrayList<String>al=new ArrayList();
	  al.add("four");
	  al.add("score");
	  al.add("and");
	  al.add("JavaScript");
	  al.add("Ruby");
	  System.out.println("Unsorted ArrayList: "+al);
	  Collections.sort(al,Collections.reverseOrder());
//	  Collections.reverse(al);
	  System.out.println("Sorted ArrayLIst in Descending order: "+al);
	}

}
