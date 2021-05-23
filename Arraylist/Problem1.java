import java.util.*;
public class Problem1 {
	ArrayList<Integer>A1=new ArrayList();
	ArrayList<Integer>A2=new ArrayList();
	 public ArrayList<Integer> saveEvenNumbers(int inum)
	 {
		for(int i=2;i<=inum;i+=2)
		{
			A1.add(i);
		}
		return A1;
	 }
    public  ArrayList<Integer>  doubleEvenNumbers(int inum)
    {
    	for(int i=0;i<A1.size();i++)
    	{
    		A2.add(A1.get(i)*2);
    	}
    	return A2;
    }
   public int checkNumber(int search )
    {
    	for(Integer i:A1)
    	{
    		if(A1.contains(search))
    		{
    			return search;
    		} 	
    	}
    	return 0;
    }
	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter number :");
      int inum=sc.nextInt();
      Problem1 b=new Problem1();
      System.out.println(b.saveEvenNumbers(inum));
     System.out.println(b.doubleEvenNumbers(inum));
       System.out.println("Enter an element to check");
      int search=sc.nextInt();
     System.out.println("The element is "+b.checkNumber(search));
	}
}
