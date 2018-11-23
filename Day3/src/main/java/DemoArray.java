import java.util.Scanner;

public class DemoArray {

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

	public void revArray() {
		System.out.println("Reverse Array:");
		for (int i = myArr.length - 1; i >= 0; i--) {
			System.out.println(myArr[i]);
		}
	}

	public static void main(String[] args) {

		DemoArray obj = new DemoArray();

		System.out.println(obj.myArr); // prints null

		obj.getArrayElements(5);
		obj.revArray();
	}
}
