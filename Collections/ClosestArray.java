import java.util.*;
public class ClosestArray 
{
	static void findClosest(TreeSet<Integer>myset,int[]arr2,int size)
	{
		ArrayList<Integer> list=new ArrayList();
		for(int i=0;i<size;i++)
		{
			Integer greater=myset.higher(arr2[i]);
			if(greater==null)
			{
				list.add(-1);
			}
			else
			{
				list.add(greater);
			}
		 }
		 for(int C: list)
		 {
		  System.out.print(C+" ");	
		}
	}

	public static void main(String[] args) 
	{
	  Scanner sc=new Scanner(System.in);
	  int size=sc.nextInt();
	  TreeSet<Integer>myset=new TreeSet();
	  int arr1[]=new int[size];
	  for(int i=0;i<size;i++)
	  {
		  arr1[i]=sc.nextInt();
		  myset.add(arr1[i]);
	  }
	  int arr2[]=new int[size];
	  for(int i=0;i<size;i++)
	  {
	   arr2[i]=sc.nextInt();
	  }
	  findClosest(myset,arr2,size);
	}

}
