/*Amritpal Singh
 * Calculates the letter grade of a student using a combination of three 
 * exam grades.
 */

import java.util.Scanner;
import java.text.DecimalFormat;
public class ParallelArrayStudent {
	
	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###.0");
		int[] id = {1,2,3,4,5};
		double[] test1 = new double[5];
		double[] test2 = new double[5];
		double[] test3 = new double[5];
		double[][] tests = {test1, test2, test3};
		String[] number = {"first","second","third"};
		String letterGrade[] = new String[5];
		for (int i=0;i<5;i++)
		{
			for (int g=0;g<3;g++)
			{
			System.out.println("Please enter the "+number[g]+" test grade for Student with "+id[i]);
			tests[g][i] = kb.nextDouble();
			}
			if ((test1[i]+test2[i]+test3[i])/3>=95)
				letterGrade[i] ="A";
			else if ((test1[i]+test2[i]+test3[i])/3>=90)
				letterGrade[i] = "A-";
			else if ((test1[i]+test2[i]+test3[i])/3>=87)
				letterGrade[i]="B+";
			else if ((test1[i]+test2[i]+test3[i])/3>=84)
				letterGrade[i]="B";
			else if ((test1[i]+test2[i]+test3[i])/3>=80)
				letterGrade[i]="B-";
			else if ((test1[i]+test2[i]+test3[i])/3>=77)
				letterGrade[i]="C+";
			else if ((test1[i]+test2[i]+test3[i])/3>=74)
				letterGrade[i]="C";
			else if ((test1[i]+test2[i]+test3[i])/3>=70)
				letterGrade[i]="C-";
			else if ((test1[i]+test2[i]+test3[i])/3>=65)
				letterGrade[i]="D+";
			else if ((test1[i]+test2[i]+test3[i])/3>=60)
				letterGrade[i]="D";
			else
				letterGrade[i]="F";
			
		}
		
		
		
		System.out.println("Student\tTest 1\tTest 2\tTest 3\tAverage\tLetter Grade");
		
		for (int i=0;i<5;i++)
		{
			System.out.println(id[i]+"\t"+df.format(test1[i])+"\t"+df.format(test2[i])+"\t"+df.format(test3[i])+"\t"
			+df.format((test1[i]+test2[i]+test3[i])/3)+"\t"+letterGrade[i]);
		}
		

}
}
