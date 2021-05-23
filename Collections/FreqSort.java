import java.util.*;
class Freq implements Comparator<Integer>
{
	    HashMap<Integer,Integer>map;
	        Freq( HashMap<Integer,Integer>map)
	         {
		        this.map=map;
	          }
     public int compare(Integer o1,Integer o2)
    {
		 int fr=map.get(o2)-map.get(o1);
		  int val=o1.compareTo(o2);
		   if(fr==0)
		   {
			   return val;
		   }
		   else
			   return fr;
	  }
}
public class FreqSort 
{
	public static void main(String[] args) 
	{
       Scanner sc=new Scanner(System.in);
       int test=sc.nextInt();
       sc.nextLine();
          for(int k=0;k<test;k++)
          {
             String str=sc.nextLine();
             String s1[]=str.split(" ");
              int arr[]=new int[s1.length];
     	    for(int i=0;i<s1.length;i++)
     	    {
     	    	if(!s1[i].equals("/s"))
     	    	{
     	    		arr[i]=Integer.parseInt(s1[i]);
     	    	}
     	    }
        	HashMap<Integer,Integer>map=new HashMap();
        	   ArrayList<Integer>result=new ArrayList();
        	   for(int j=0;j<arr.length;j++)
        	   {
        	      if(map.containsKey(arr[j]))
      		       map.put(arr[j],map.get(arr[j])+1);
      		       else
      	           map.put(arr[j], 1);
        	        result.add(arr[j]);
        	    }
     	        Collections.sort(result,new Freq(map));
			       for(int x=0;x<result.size();x++) 
			         { 
			         	  System.out.print(result.get(x)+" "); 
				      }
        	     sc.nextLine();
          }
          
	}

}
