import java.util.Scanner;

public class MinElementInAnArray {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range of an array");
		n = sc.nextInt();
		System.out.println("Enter the element in an array");
		int[] arr = new int[n];
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("min value is :" + temp);
	}

}
