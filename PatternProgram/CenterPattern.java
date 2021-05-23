import java.util.*;
public class CenterPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=1,sp=n-1;
        for(int i=1;i<=n;i++)
        {
        	num=i;
        	for(int j=1;j<=sp;j++)
        	{
        		System.out.print(" ");
        	}
        	sp--;
        	for(int k=1;k<=i;k++)
        	{
        		System.out.print(num);
        		num++;
        	}
        	num-=2;
        	for(int k=1;k<i;k++)
        	{
        		System.out.print(num);	
        		num--;
        	}
        	System.out.println();
        }
	}
}
