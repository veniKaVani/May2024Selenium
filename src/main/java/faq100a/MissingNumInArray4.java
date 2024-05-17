package faq100a;

public class MissingNumInArray4 {
   //How do you find the particular no which is missing in a sorted Array?? 
	public static void main(String[] args) {
		// the array elements/nos in sequence or sorted--in ascending or descending order:
		
		//int a[]= {1,2,3,5,....100};
		
		int a[]= {1,3,4,5,6};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum = sum + a[i];
		}
		System.out.println("array sum with missing no:"+sum);
		
		int sum1=0;
		for(int j=1;j<=6;j++) {
			sum1=sum1+j;
		}
		System.out.println("Array sum without missing no:"+sum1);
		
		System.out.println("Missing no. is:::"+(sum1-sum));
		

	}

}
