package faq100a;

import java.util.Arrays;

public class LargestSmallestInIntArray6 {
    //How to find the largest/smallest no. in the given integer Array??
	public static void main(String[] args) {
		
	int	numbers[]= {-10,24,50,-88,9874,98749,0};
	
	//nos available in oth location is being stored in the var largest:timecomplexity:o(n)since
	//only one for loop
	int largest = numbers[0];
	int smallest = numbers[0];
	
	for(int i=1;i<numbers.length;i++) {
		if(numbers[i]>largest) {
			largest=numbers[i];
		}
		else if(numbers[i]<smallest){
			smallest=numbers[i];
		}
	}
     System.out.println("given array is:"+Arrays.toString(numbers));
     System.out.println("largest no is::"+largest);
     System.out.println("smallest no is :::"+smallest);
	}

}
