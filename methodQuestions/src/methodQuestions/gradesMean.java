package methodQuestions;
import java.util.Scanner;
public class gradesMean {

	public static void main(String[] args) {
		int studentNumber = 0;
		double gradeSum=0;
		Scanner keyboard = new Scanner (System.in);
		System.out.println("Enter number of students enrolled in the course: ");
		studentNumber = keyboard.nextInt();
		
		for (int count=0; count<studentNumber;count++) {
			double grade = readGrade();
			gradeSum=gradeSum+grade;
			}
		System.out.println("No. of students enrolled in class: "+studentNumber);
		System.out.println("Course mean grade is: "+gradeMean(gradeSum,studentNumber));
	}
	public static double readGrade() {
		Scanner keyboard = new Scanner (System.in);
		double studentGrade=0;
		System.out.println("Enter student grade: ");
		studentGrade = keyboard.nextDouble();
		return studentGrade;
	}
	public static double gradeMean (double grade_Sum, int student_Number) {
		return (grade_Sum/student_Number);
	}
}

