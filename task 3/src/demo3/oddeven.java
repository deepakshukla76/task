package demo3;

public class oddeven {

	public static void main(String[] args) {
		int arr[]= {14,43,59,68,71,86};
		int oddSum=0,evenSum=0,evenCount=0,OddCount=0;
		
		
		for(int i=0; i<6; i++) {
			if(arr[i]%2==0) {
				evenSum=evenSum+arr[i];
				evenCount++;
			}
			else {
				oddSum=oddSum+arr[i];
				OddCount++;
			}
		}
		double avgOdd=oddSum/OddCount;
		double avgEven=evenSum/evenCount;
		
		System.out.println("Average of even number"+avgEven);
		System.out.println("Average of odd number"+avgOdd);
		
	}

}
