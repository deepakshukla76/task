package Demo;

public class Pallindrome {

     

	public static void palindrome (int arr[], int n) {
		int flag =0;
		for(int i=0;i<=n/2 && n !=0;i++)
		{
			if (arr[i] != arr[n - i - 1]) {
				flag =1;
				break;
			}
		}
		if(flag ==  1)
			System.out.println("Not palindrome");
		else
			System.out.println("palindrome");
	}
	public static void main (String[] args)
	{
		int arr[] = { 1, 2 , 3, 2, 1};
		int n = arr.length;
		palindrome(arr, n);
			

	}

}
