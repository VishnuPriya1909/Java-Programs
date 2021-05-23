import java.util.*;
public class AbsolutePath 
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    String pathname=sc.nextLine();
	    String path[]=pathname.split("/");
         ArrayList<String>al=new ArrayList<>();
         for(int i=0;i<path.length;i++)
         {
        	 if(path[i].equals(".")) 
        		 continue;
        	   else if(path[i].equals(".."))
        	   {
        		if(al.size()>0)
        		 al.remove(al.size()-1);
        	   }
        	   else
        	  al.add("/"+path[i]); 
           }
           if(al.size()>0)
        	      pathname="";
        	 for(int i=1;i<al.size();i++)
               pathname+=al.get(i);
        		 System.out.println(pathname);
       }
  }