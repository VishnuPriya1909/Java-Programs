import java.util.*;
public class Integerconvert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     String str=sc.nextLine();
     for(int i=0;i<str.length();i++)
     {
    	 if(str.charAt(i)!=' ')
    	 {
    		  Integer.parseInt(String.valueOf(str.charAt(i)));
    	 }
      }
        System.out.println(str);
	}

}
