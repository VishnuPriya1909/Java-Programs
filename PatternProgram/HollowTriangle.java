import java.util.*;
public class HollowTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
//        for(int i=1;i<=n;i++)
//        {
//       	 for(int j=1;j<=n-i;j++)
//       	 {
//       		 System.out.print("  ");
//       	 }
//       	 for(int j=1;j<=n;j++)
//       	 {
//       		 System.out.print("* ");
//       	 }
//       	 
//       	 System.out.println();
//        }
//        input:3
//        output:          * * * 
//                       * * * 
//                     * * * 
      for(int i=1;i<=n;i++)
      {
     	 for(int j=n-1;j>n-i;j--)
     	 {
     		 System.out.print("  ");
     	 }
     	 for(int j=1;j<=n;j++)
     	 {
     		 System.out.print("* ");
     	 }
     	 
     	 System.out.println();
      }
//      input:3
//      output:          * * * 
//                         * * * 
//                           * * * 
	}

}
