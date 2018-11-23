import java.util.Scanner;

public class LeastElement {
	int myArr[];

	public void getArrayElements(int size) {
		Scanner sc = new Scanner(System.in);

		myArr = new int[size];
		System.out.println("Enter elements");
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

	public int findSmallestElement() {
		int p = myArr[0] + 1;
		return p;
	}

	public static void main(String[] args) {
		LeastElement obj = new LeastElement();
		obj.getArrayElements(5);
		obj.sort();
		int q = obj.findSmallestElement();
		System.out.println(q);
	}
}
