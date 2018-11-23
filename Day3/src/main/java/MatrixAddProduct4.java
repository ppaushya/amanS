import java.util.Scanner;

public class MatrixAddProduct4
{
	int r1,c1,r2,c2,arr1[][],arr2[][],pro[][];
	
	public void input()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of rows and columns of matrix 1:");
		r1 = sc.nextInt();
		c1 = sc.nextInt();
		
		System.out.println("Enter the number of rows and columns of matrix 1:");
		r2 = sc.nextInt();
		c2 = sc.nextInt();
		arr1 = new int[r1][c1];
		arr2 = new int[r2][c2];
		System.out.println("Enter the elements in matrix 1:");
		for (int i = 0; i < r1; i++)
		{
			for (int j = 0; j < c1; j++)
			{
				arr1[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter the elements in matrix 2:");
		for (int i = 0; i < r2; i++)
		{
			for (int j = 0; j < c2; j++)
			{
				arr2[i][j] = sc.nextInt();
			}
		}
		sc.close();
	}
	
	public void sumArr()
	{
		if (r1 == r2 && c1==c2)
		{
			System.out.println("The Sum is:");
			for (int i = 0; i < r2; i++)
			{
				for (int j = 0; j < c2; j++)
				{
					System.out.print((arr1[i][j]+arr2[i][j])+"\t");
				}
				System.out.println();
			}
		}
		else
			System.out.println("Sum Not Possible !");
	}
	
	public void Product()
	{
		if(c1==r2)
		{
			System.out.println("The Product is:");
			pro=new int[r1][c2];
			for (int i = 0; i < r1; i++)
	        {
	            for (int j = 0; j < c2; j++)
	            {
	                for (int k = 0; k < c1; k++)
	                {
	                    pro[i][j] = pro[i][j] + arr1[i][k] * arr2[k][j];
	                }
	            }
	        }
		}
		else
			System.out.println("Product Not Possible");
	}
	
	public void ProArr()
	{
		for (int i = 0; i < r2; i++)
		{
			for (int j = 0; j < c2; j++)
			{
			    System.out.print(pro[i][j]+"\t");
			}
			 System.out.println();
		}
	}

	public static void main(String[] args)
	{
		MatrixAddProduct4 obj=new MatrixAddProduct4();
		obj.input();
		obj.sumArr();
		obj.Product();
		obj.ProArr();
	}
}
