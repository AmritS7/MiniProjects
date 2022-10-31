import javax.swing.JOptionPane;

/*Amritpal Singh
 * GradeBook - first time using JSwing. Resembles a gradebook. Program enables user to enter 
 * 3 grades per course and displays the averages and the calculated GPA, from a combination of 4 courses.
 */

public class Gradebook {
public static void main(String[] args) {
		
		double pointSum = 0;
		
		System.out.printf("%-15s%-11s%-17s%-15s", "Course", "Average", "Letter Grade", "Grade Points");
		System.out.println();
		

		for (int courseNumber = 1; courseNumber <= 4; courseNumber++)
		{
			String courseName = JOptionPane.showInputDialog(null, "Please enter the name of the course: ");
			
			double average = getGradeSum() / 3.0;
			
			String letterGrade = getLetterGrade(average);
			
			double gradePoint = getGradePoint(letterGrade);
		
			pointSum += gradePoint;
	
			System.out.printf("%-16s%-16.1f%-15s%-15.1f", courseName, average, letterGrade, gradePoint);
			System.out.println();
		
		}
		
		double GPA = pointSum/4.0;
		System.out.print("GPA: " + GPA);
   }
		

		public static double getGradeSum()
		{
			double gradeSum = 0;
			for (int gradeCounter = 1; gradeCounter <= 3; gradeCounter++)
			{ 
				String gradeString = JOptionPane.showInputDialog(null, "Please enter the grade (1-100): ");
				double grade = Double.parseDouble(gradeString);
				gradeSum += grade;
			}	
				return gradeSum;
		}
			
		
		public static String getLetterGrade(double average)
		{
		String letterGrade;
		if (average >= 90)
			letterGrade = "A";
		else if (average >= 80)
			letterGrade = "B";
		else if (average >= 70)
			letterGrade = "C";
		else if (average >= 60)
			letterGrade = "D";
		else //average < 60
			letterGrade = "F";
			
		return letterGrade;	
		}
		
		
		public static double getGradePoint(String letterGrade)
		{
			Double gradePoint;
			if (letterGrade.equals("A"))
				gradePoint = 4.0;
			else if (letterGrade.equals("B"))
				gradePoint = 3.0;
			else if (letterGrade.equals("C"))
				gradePoint = 2.0;
			else if (letterGrade.equals("D"))
				gradePoint = 1.0;
			else //letterGrade.equals "f"
				gradePoint = 0.0;
			
			return gradePoint;
		}
		   
}
		
		
		

	




