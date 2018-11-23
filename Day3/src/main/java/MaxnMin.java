import java.util.Scanner;

public class MaxnMin
{
	int myArr[];

	public void getArrayElements(int size)
	{
		Scanner sc = new Scanner(System.in);

		myArr = new int[size];
		System.out.println("Enter elements:");
		for (int i = 0; i < size; i++)
		{
			myArr[i] = sc.nextInt();
		}
		sc.close();
	}

	public void sort()
	{
		for (int i = 0; i < myArr.length; i++)
		{
			for (int j = i + 1; j < myArr.length; j++)
			{
				if (myArr[i] > myArr[j])
				{
					int temp = myArr[i];
					myArr[i] = myArr[j];
					myArr[j] = temp;
				}
			}
		}
	}

	public void printArr()
	{
		System.out.println("Smallest Element is: "+myArr[0]);
		System.out.println("Biggest Elements is: "+myArr[myArr.length-1]);
	}

	public static void main(String[] args)
	{
		MaxnMin obj = new MaxnMin();
		obj.getArrayElements(5);
		obj.sort();
		obj.printArr();
	}
}
