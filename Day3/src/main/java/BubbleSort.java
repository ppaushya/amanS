import java.util.Scanner;

public class BubbleSort {
	int myArr[];

	public void getArrayElements(int size) {
		Scanner sc = new Scanner(System.in);

		myArr = new int[size];
		System.out.println("Enter " + size + " Array Elements");
		for (int i = 0; i < size; i++) {
			myArr[i] = sc.nextInt();
		}
		sc.close();
	}

	public void sort() {
		for (int i = 0; i < myArr.length; i++) {
			for (int j = i + 1; j < myArr.length; j++) {
				if (myArr[i] > myArr[j]) {
					int temp = myArr[i];
					myArr[i] = myArr[j];
					myArr[j] = temp;
				}
			}
		}
	}

	public void printArr() {
		for (int i = 0; i < myArr.length; i++) {
			System.out.println(myArr[i]);
		}
		System.out.println("Aman");
	}

	public static void main(String[] args) {
		BubbleSort obj = new BubbleSort();
		obj.getArrayElements(5);
		obj.sort();
		obj.printArr();
	}
}
