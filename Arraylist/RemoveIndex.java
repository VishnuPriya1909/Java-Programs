import java.util.*;
public class RemoveIndex
{
	   public static void main(String[] args) {
		ArrayList<String>al=new ArrayList();
		Scanner sc=new Scanner(System.in);
       for(int i=0;i<5;i++)
       {
    	   al.add(sc.next());
       }
         al.remove(new String("5"));
         System.out.println(al);
    }
}
//2 3 4 5 1
