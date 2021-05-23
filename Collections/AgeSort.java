import java.util.*;
class Employeedetail 
{
	 String empname,empid,empdes;
	 int empage;
	 public Employeedetail(String empname,String empid,int empage,String empdes)
	 {
		 this.empname=empname;
		 this.empid=empid;
		 this.empdes=empdes;
		 this.empage=empage;
	 }
}
class SortbyAge implements Comparator <Employeedetail> 
{
	public int compare(Employeedetail a,Employeedetail b)
	{
		return b.empage-a.empage;
	}
 }
public class AgeSort 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		 for(int k=0;k<test;k++)
		 {
			 ArrayList <Employeedetail> al=new ArrayList();
			 int n=sc.nextInt();
			 sc.nextLine();
             for(int i=0;i<n;i++)
             {
            	 String str=sc.nextLine();
            	 String arr[]=str.split(",");
            	 al.add(new Employeedetail(arr[0],arr[1],Integer.parseInt(arr[2]),arr[3]));
             }
             Collections.sort(al,new SortbyAge()); 
             for(int i=0;i<n;i++)
             {
               System.out.println(al.get(i).empname+" "+al.get(i).empid+" "+al.get(i).empage+" "+al.get(i).empdes);
             }
		 }
	}
}
