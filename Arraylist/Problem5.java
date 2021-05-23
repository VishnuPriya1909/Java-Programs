import java.util.*;
public class Problem5 {
	public static void main(String[] args) 
	{
    Scanner sc=new Scanner(System.in);
    ArrayList<String>al=new ArrayList();
    int len=sc.nextInt();
    sc.nextLine();
    for(int i=0;i<len;i++)
    {
    	al.add(sc.next());
    
    }
    ListIterator<String> itr=al.listIterator();
    while(itr.hasNext())
    {
    	String s=itr.next();
    	if(s.length()==4)
    	{
    		itr.add("****");
    	}
    }
 //  System.out.println(al);
    for(int i=1;i<al.size()-1;i++)
    {
    	if(al.get(i)=="****")
    	{
    		Collections.swap(al, i, i-1);
    	}
    }
    System.out.println(al);
   }
}
//9
//this
//is
//lots
//of
//fun
//for
//every
//java
//programmer
