import java.util.*;
class Hungry
{
	int sum;
	int time;
	Hungry(int time,int sum)
	{
		this.sum=sum;
		this.time=time;
	}
}
class Timesort implements Comparator<Hungry>
{
	public int compare(Hungry a,Hungry b)
	{
		return a.sum- b.sum;
	}
}
public class HungryPizza {

	public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				int test=sc.nextInt();
				for(int k=0;k<test;k++)
				{
				int num=sc.nextInt();
				int x[]=new int[num];
				int y[]=new int[num];
				for(int i=0;i<num;i++)
				{
					x[i]=sc.nextInt();
					y[i]=sc.nextInt();
				}
				 ArrayList<Hungry>al=new ArrayList(); 
				 int sum=0,time=0;
				   for(int i=0;i<num;i++)
				   {
					 time=i+1;
				     sum=x[i]+y[i];
	                al.add(new Hungry(time,sum));
				   }
				  Collections.sort(al,new Timesort());
				  for(int i=0;i<al.size();i++)
				  {
					  System.out.println(al.get(i).time);
				  }
				}
			  }
         }
