package array;

public class minArray {
	/**
	 * finding the minmum in an array 
	 * @param array
	 */
public static  void  min(int []array){
	int min = array[0];
	for (int i =1;i<array.length;i++) 
		if (min> array[i]) 
			min=array[i];
		
	
	System.out.println(min);
		
	}
/**
 * how to use  anonymous array 
 */
public static void anonymous (int arr[]) {
	for (int i =0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {5,6,3,9,2,4};
min(a);
anonymous ( new int[]{4,6,8,2});
anonymous(new int [] {7,4,9,5,2});
}
	

}