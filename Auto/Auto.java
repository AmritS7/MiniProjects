/*Amritpal Singh
 * One of my earliest programs, created to test knowledge of constructors,
 * setters/getters and formatting. 
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Auto {

		private String brand;
		private String color;
		private int mileage;
		private double price;
		private double mpg;
		DecimalFormat df1 = new DecimalFormat("$#,##0.00");
		DecimalFormat df2 = new DecimalFormat("#,##0.00");
		public Auto(String b, String c, int m, double p, double mp)//argument constructor

		{

		brand=b;
		color=c;
		mileage=m;
		price=p;
		mpg = mp;
		}

		public Auto()//no argument contructor
		{
		brand=" ";
		color=" ";
		mileage=0;
		price=0.0;
		mpg=0.0;
		}

		public void setMileage(int m)
		{
		mileage=m;
		}

		public void setBrand(String b)
		{
		brand=b;
		}

		public void setColor(String c)
		{
		color=c;
		}
		
		public void setPrice(double p)
		{
		price = p;
		}
		
		public void setMPG(double mp)
		{
		mpg = mp;	
		}

		public void getInfo()
		{
		Scanner kb=new Scanner(System.in);
		System.out.print("Enter brand:");
		brand=kb.next();
		System.out.print("Enter color:");
		color=kb.next();
		System.out.print("Enter mileage:");
		mileage=kb.nextInt();
		System.out.print("Enter price:");
		price=kb.nextDouble();
		System.out.print("Eneter MPG:");
		mpg=kb.nextDouble();
		}
		public String toString()
		{
		return "Brand:\t\t"+brand+"\nColor:\t\t"+color+"\nMileage:\t"+df2.format(mileage)+"\nPrice:\t\t"+df1.format(price)+"\nMPG:\t\t"+df2.format(mpg);
		//2 decimal digits precision--mpg   ---price money

		}

}
