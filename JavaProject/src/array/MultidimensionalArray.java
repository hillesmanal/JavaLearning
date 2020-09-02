package array;

public class MultidimensionalArray {

	public static void main(String[] args) {
		
		int[] array1 = new int[5];
		
		//
		int[][] array2 = new int[2][3];
		
		
		array2[0][0] = 10;
		array2[0][1] = 12;
		array2[0][2] = 13;
		array2[1][0] = 17;
		array2[1][1] = 19;
		array2[1][2] = 11;
		
		
		for(int i = 0; i<array2.length;i++)
		{
			for(int j = 0 ; j<3;j++)
			{
				System.out.print(array2[i][j] + "\t");
			}
			System.out.println();
		}
		//copying an array
		int[][] array3 = array2;
		
		for(int i = 0; i<array3.length;i++)
		{
			for(int j = 0 ; j<3;j++)
			{
				System.out.print(array3[i][j] + "\t");
			}
			System.out.println();
		}
		
		//cloning an array
		int[][] array4 = array2.clone();
		
		for(int i = 0; i<array4.length;i++)
		{
			for(int j = 0 ; j<3;j++)
			{
				System.out.print(array4[i][j] + "\t");
			}
			System.out.println();
		}

		if(array2==array4)
		{
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		
	}

}
