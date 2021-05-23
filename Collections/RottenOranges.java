import java.util.*;
public class RottenOranges 
{
   static boolean issafe(int i,int j)
    {
	   if(i>=0 && i<3 && j>=0 && j<5)
         return true;
         return false;
    }
   static int rotOrange(int mat[][])
    {
      boolean changed=false;
         int no=2;
        while(true)
        {
		  for(int i=0;i<3;i++)
		  {
			  for(int j=0;j<5;j++)
		   {
		     if(mat[i][j]==no)
		      {
				  if(issafe(i+1,j) && mat[i+1][j]==1)
				  {
					  mat[i+1][j]=mat[i][j]+1;
					  changed=true;
				  }
			     if(issafe(i,j+1) && mat[i][j+1]==1)
			     {
				     mat[i][j+1]=mat[i][j]+1;
				       changed=true;
			   }
			  if(issafe(i-1,j) && mat[i-1][j]==1)
			  {
				  mat[i-1][j]=mat[i][j]+1;
				  changed=true;
				  }
			  if(issafe(i,j-1) && mat[i][j-1]==1)
			  {
				  mat[i][j-1]=mat[i][j]+1;
				  changed=true;
				  }  
		  }	  }
	  }
	  if(!changed)
		 break;
	  changed=false;
	  no++;
   }
    for(int i=0;i<3;i++)
    {
	   for(int j=0;j<5;j++)
	   {
	      if(mat[i][j]==1)
	        return -1;
	   }   
	 }
   return no-2;
   }
	public static void main(String[] args) 
	{
       int mat[][]= {{2,1,0,2,1},{1,0,1,2,1},{1,0,0,2,1}};
      System.out.println(rotOrange(mat));
   
	}
}
