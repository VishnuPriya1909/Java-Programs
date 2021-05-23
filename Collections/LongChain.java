import java.util.*;
class LongChain 
{
	int a;
	int b;
	public LongChain(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
    static void maxLen(LongChain  arr[],int pairno)
	{
	 int max=0,count=1;
	  for(int i=1;i<pairno;i++)
	  {
		 for(int j=0;j<i;j++)
		 {
			 if(arr[i].a>arr[j].b)
			 {
				 count+=1;
			 }
			 else
				count=1;
		 }
		 if(count>max)
		 {
			 max=count;
		 }
	 }
    System.out.println(max);
  }
	public static void main(String[] args) 
	{
	 Scanner sc=new Scanner(System.in);
	 int tc=sc.nextInt();
	 for(int i=0;i<tc;i++)
	 {
		 int pairno=sc.nextInt();
		 LongChain arr[]=new LongChain [pairno];
		 for(int j=0;j<pairno;j++)
		 {
			 int a=sc.nextInt();
			 int b=sc.nextInt();
			 arr[j]=new LongChain (a,b);
		 }
		 maxLen(arr,pairno); 
	  }
	 
	}
}



