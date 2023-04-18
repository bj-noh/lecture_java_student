package midterm_exam;

public class Num29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 9, 5, 7, 13, 12, 37};
		int n = arr.length;
		int index = 0;
		while (index < n) {
			if (index == 0) {
				index++;
			}
			if (arr[index] >= arr[index - 1]) {
				index++;
			} else {
				int temp = arr[index];
				arr[index] = arr[index - 1];
				arr[index - 1] = temp;
				index--;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
