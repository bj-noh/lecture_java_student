package midterm_exam;

public class Num30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = {"int", "int", "yet", "float", "yet"};
		int n = arr.length;
		int count = 1;
		for (int i = 1; i < n; i++) {
			if (!arr[i].equals(arr[i - 1])) count++;
		}

		String[] unique = new String[count];
		unique[0] = arr[0];

		int j = 1;
		for (int i = 1; i < n; i++) {
			if (!arr[i].equals(arr[i - 1])) {
				unique[j] = arr[i];
				j++;
			}
		}
		
		for(int i = 0; i < unique.length; i++) {
			System.out.println(unique[i]);
		}
	}

}
