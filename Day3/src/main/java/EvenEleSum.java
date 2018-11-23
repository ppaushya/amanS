import java.util.Scanner;

public class EvenEleSum {

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

	public void EvenEle() {
		int sum = 0;
		System.out.println("Even elements are:");
		for (int i = 0; i < myArr.length; i++) {
			if (myArr[i] % 2 == 0) {
				System.out.println(myArr[i]);
				sum += myArr[i];
			}
		}
		System.out.println("Sum is:" + sum);
	}

	public static void main(String[] args) {
		EvenEleSum obj = new EvenEleSum();
		obj.getArrayElements(5);
		obj.EvenEle();

	}

}
