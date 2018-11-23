import java.util.Scanner;

public class Matrix1
{
	int r, c, arr[][], tr[][];

	public void input()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of rows and columns");
		r = sc.nextInt();
		c = sc.nextInt();

		if (r == c)
		{
			arr = new int[r][c];
			System.out.println("Enter the elements in matrix:");
			for (int i = 0; i < r; i++)
			{
				for (int j = 0; j < c; j++)
				{
					arr[i][j] = sc.nextInt();
				}
			}
		}
		else
			System.out.println("Insufficient !");
		sc.close();
	}

	public void lower()
	{
		System.out.println("Lower matrix:");
		for (int i = 0; i < r; i++)
		{
			for (int j = 0; j < c; j++)
			{
				if (i < j)
					System.out.print(" " + "\t");
				else
					System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public void upper()
	{
		System.out.println("Upper matrix:");
		for (int i = 0; i < r; i++)
		{
			for (int j = 0; j < c; j++)
			{
				if (i > j)
					System.out.print(" " + "\t");
				else
					System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public void transpose()
	{
		tr = new int[r][c];
		for (int i = 0; i < r; i++)
		{
			for (int j = 0; j < c; j++)
			{
				tr[j][i] = arr[i][j];
			}
		}
	}

	public void printTrans()
	{
		System.out.println("Transposed Matrix:");
		for (int i = 0; i < r; i++)
		{
			for (int j = 0; j < c; j++)
			{
				System.out.print(tr[i][j]+"\t");
			}
			System.out.println();
		}
	}

	public void print()
	{
		System.out.println("The Matrix is:");
		for (int i = 0; i < r; i++)
		{
			for (int j = 0; j < c; j++)
			{
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static void main(String[] args)
	{
		Matrix1 obj = new Matrix1();
		obj.input();
		obj.print();
		obj.lower();
		obj.upper();
		obj.transpose();
		obj.printTrans();
	}
}
