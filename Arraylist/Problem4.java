import java.util.*;
public class Problem4 
{
   static ArrayList<String> pairSwitch(ArrayList<String>p)
   {
	   for(int i=1;i<p.size();i+=2)
       {
    		   Collections.swap(p, i-1, i);
       }
	   return p;
   }
	public static void main(String[] args) 
	{
	  Scanner sc=new Scanner(System.in);
	  int num=sc.nextInt();
	  ArrayList<String>al=new ArrayList();
	  for(int i=0;i<num;i++)
	  {
		  al.add(sc.next());
	  }
       System.out.println(pairSwitch(al));
	}
}

//6
//four  
//score 
//and   
//seven 
//years 
//ago   

//7
//to
//be
//or
//not
//to 
//be
//hamlet