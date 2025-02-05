package javaPackage;

public class Array5 {

	public static void main(String[] args) 
	{
//		Defining Multi Dimensional Array
		int a[][] = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
		
//		Total number of rows
		int row = a.length; //Length is an property of an array
		System.out.println(row);
		
//		Total number of column 
		int column = a[0].length;
		System.out.println(column);
		
//		print all values - matrix form
//		outer loop
		for(int i=0;i<row;i++)
		{
//			inner loop
			for(int j=0; j< column;j++)
			{
				System.out.print(a[i][j] + "  ");
			}
			System.out.println();
		}
		
		
	}

}
