import java.util.*;
public class Problem2 
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    int size=sc.nextInt();
	   ArrayList<ArrayList<Integer>>rows=new ArrayList();
	    for(int i=0;i<size;i++)
	    {
		   ArrayList<Integer>row=new ArrayList();
		   int len=sc.nextInt();
		   for(int j=0;j<len;j++)
		   {
			  row.add(sc.nextInt());  
		    }
		   rows.add(row);  
	   }
	   int query=sc.nextInt();
	   for(int i=0;i<query;i++)
	   {
		 int x=sc.nextInt();
		 int y=sc.nextInt();
		 try
		 {
		     System.out.println(rows.get(x-1).get(y-1));
		 }
		 catch(IndexOutOfBoundsException e)
		 {
			    System.out.println("Error");
		 }
	  }
	}
}

//5
//5 41 77 74 22 44
//1 12
//4 37 34 36 52
//0
//3 20 22 33
//5
//1 3
//3 4
//3 1
//4 3
//5 5
