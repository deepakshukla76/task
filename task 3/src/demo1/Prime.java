package demo1;

public class Prime {

	
	private static int j;

	public static void main(String[] args) {

       int ar[]= {2,3,4,5,6,7,8,9,10,11,12,13,14,15};
       for(int i=0;i<ar.length;i++)
       {
    	   int count=0;
    	   for(j=1;j<=ar[i];j++)
    	   {
    		   if(ar[i]%j==0)
    	   
    	   count++;
       }
       if(count==2)
       {
    	   System.out.println(ar[i]+" prime number:");

       }
       else
       {
    	   System.out.println(ar[i]+" Not prime number:");

       }
	   }
     }
   }
