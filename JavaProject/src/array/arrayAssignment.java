package array;



public class arrayAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//sumArray();
removeDuplicate();
//reverseArray();
//inserZero();
//hi there 

	}

	private static void inserZero() {
		// TODO Auto-generated method stub
		int [] origArray = {1,5,4,6,5,0,7,5};
		int number = 5;
		int count =0;
		for (int i = 0;i<origArray.length;i++) {
			if (origArray[i]==number)
			{
				count++;
				}
			}
		
		int newArray[] = new int [origArray.length+count];
		int j=0;
		for (int i =0;i<origArray.length;i++) {
			
			newArray[j]=origArray[i];
			j++;
			if (origArray[i]==number) {
				newArray[j]=0;
				j++;
				
			}
		}
		for (int n: newArray) {
			System.out.println(n);
		}
		
	}

	private static void reverseArray() {
		// TODO Auto-generated method stub
//		1. Write a program to reverse the array without using inbuilt function.
//		Example : int[] arr = {1,4,3,7,8,2,6,5}
//		Output = 5,6,2,8,7,3,4,1
		 int[] arr = {1,4,3,7,8,2,6,5};
		 int[] revArray =new int [arr.length];
		 int rev;
		 int j=0;
		 for(int i=arr.length-1;i>0;i--) {
			// for (int j=0;j<revArray.length;j++) {}
			 revArray[j]=arr[i]; 
			 j++;
			
			  
		 }
		 for (int n:revArray) {
			 System.out.println(n);
			 
			 //printing zero instead of 1.
		 }
	}

	private static void removeDuplicate() {
//		Example : int arr[] = {3,4,1,2,4,6,2,8,1,7}
//		Output = 3,4,1,2,6,8,7
		int arr[] = {3,4,1,2,4,6,2,8,1,7};
		int count =0;
		for (int i =0;i<arr.length;i++) {
			for (int j=i+1;j<arr.length;j++) {
				if (arr[i]==arr[j]) {
					count++;
				}
			}}
		int i =0;
		int j=i+1;
		int [] dupArray = new int [arr.length-count]	;
		
		dupArray[j]=arr[i];
		for ( i =0;i<arr.length;i++) {
			for ( j=i+1;j<arr.length;j++) {
				if (arr[j]== arr[i] ){
					dupArray[j]=arr[i+1];
				}
		}

	
	}
		for (int n:dupArray) {
			System.out.println(n);}
		}

	private static void sumArray() {
		// TODO Auto-generated method stub

//6. Write a program to find the Sum of the elements in an array.
//Example : int arr[] = { 1,5,4,6,9,3,2}
//Output = 30
		int arr[] = { 1,5,4,6,9,3,2};
		int sum=0;
		for (int i =0;i<arr.length;i++) {
			sum= sum+ arr[i];
		}
		System.out.println(sum);
		
	}

}
