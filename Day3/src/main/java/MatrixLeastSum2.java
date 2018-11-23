import java.util.Scanner;

public class MatrixLeastSum2 {
	int sum, sum1, sum2, r, c, arr[][];

	public void input() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of rows and columns");
		r = sc.nextInt();
		c = sc.nextInt();

		arr = new int[r][c];
		System.out.println("Enter the elements in matrix:");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		sc.close();
	}

	public void calc() {
		System.out.println("The Sum:");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if (i == 0)
					sum += arr[i][j];
				else if (i == 1)
					sum1 += arr[i][j];
				else
					sum2 += arr[i][j];
			}
		}
		System.out.println(sum);
		System.out.println(sum1);
		System.out.println(sum2);
	}

	public void leastSum() {
		System.out.println("Least Sum:");
		if (sum < sum1 && sum < sum2)
			System.out.println(sum);
		else if (sum1 < sum && sum1 < sum2)
			System.out.println(sum1);
		else
			System.out.println(sum2);
	}

	public static void main(String[] args) {
		MatrixLeastSum2 obj = new MatrixLeastSum2();
		obj.input();
		obj.calc();
		obj.leastSum();
	}
}
