package array;

public class minArray {
public static  void  min(int []array){
	int min = array[0];
	for (int i =1;i<array.length;i++) 
		if (min> array[i]) 
			min=array[i];
		
	
	System.out.println(min);
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {5,6,3,9,2,4};
min(a);
}
	
}
