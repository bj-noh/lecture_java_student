package Chap5_Practice;
import java.util.Scanner;

public class _02_StudentGradeSorting_answer {
	
	public static void selectionSort(int[] arr, String[][] studentData) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            
            int tempScore = arr[minIndex];
            String[] tempData = studentData[minIndex];
            arr[minIndex] = arr[i];
            studentData[minIndex] = studentData[i];
            arr[i] = tempScore;
            studentData[i] = tempData;
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 본 프로그램은 3명의 학생에 대한 이름, 과목, 점수(정수)를 순서대로 입력받고,
		 * 성적을 기준으로 오름차순 정렬을 진행하는 프로그램이다.
		 * 본 프로그램이 동작하도록 selectionSort()를 작성하여라.
		 * 단, selectionSort()는 selection sort 알고리즘을 활용한다.
		 * 예시
		 * Input>>>
		 * Enter the number of students: 4
		   Enter details for student 1: BJ Linux 100
		   Enter details for student 2: DJ Statistics 56
		   Enter details for student 3: CJ FoodEngineering 99
		   Enter details for student 4: YJ Network 87
		   
		   Output>>>
		   Sorted student data:
		   DJ Statistics 56
		   YJ Network 87
		   CJ FoodEngineering 99
		   BJ Linux 100
		 */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int numStudents = input.nextInt();
        
        String[][] studentData = new String[numStudents][3];
        int[] scores = new int[numStudents];
        
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter details for student " + (i+1) + ":");
            studentData[i][0] = input.next(); // student name
            studentData[i][1] = input.next(); // subject
            studentData[i][2] = input.next(); // score
            scores[i] = Integer.parseInt(studentData[i][2]);
        }
        
        selectionSort(scores, studentData);
        
        System.out.println("Sorted student data:");
        for (int i = 0; i < numStudents; i++) {
            System.out.println(studentData[i][0] + " " + studentData[i][1] + " " + studentData[i][2]);
        }
		

	}

}
