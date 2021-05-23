import java.util.*;
class Myds 
{
  ArrayList<Integer>arr;
  HashMap<Integer,Integer>hash;
  public Myds()
  {
	  arr=new ArrayList<Integer>();
	  hash=new HashMap<Integer,Integer>();
  }
  void add(int x)
  {
	if(hash.containsKey(x))
	return;
	else
	{
		arr.add(x);
		hash.put(x, arr.size());
	}
  }
  void remove(int x)
  {
	 if(hash.containsKey(x))
	 {
		int size=arr.size();
		int index=hash.get(x);
		int last=arr.get(size-1);
		Collections.swap(arr, index, size-1);
		arr.remove(size-1);
		hash.put(last,index);
	 }
  }
  int search(int x)
  {
	if(hash.containsKey(x));
	{
		return hash.get(x);
	}
  }
  int getRandom()
  {
	  Random r=new Random();
	  int index=r.nextInt(arr.size());
	  return arr.get(index);
  }
  
  }
class DataStructure
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Myds ds=new Myds();
		  ds.add(sc.nextInt());
		  ds.add(sc.nextInt());
		  ds.add(sc.nextInt());
		  ds.add(sc.nextInt());
		  System.out.println(ds.search(sc.nextInt()));
		  ds.remove(sc.nextInt());
		  ds.add(sc.nextInt());
		  System.out.println(ds.search(sc.nextInt()));
		  System.out.println(ds.getRandom());

	}

}
