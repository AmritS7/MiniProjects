/*Amritpal Singh
 * Simple program that calculates the profit a retail store makes based on units
 * of different items purchased.
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class RetailDemo {
	
	public static void main(String[] args)
	{
		
		
	Scanner kb = new Scanner(System.in);	
	DecimalFormat df = new DecimalFormat("$#,##0.00");
		
	RetailItem r1=new RetailItem();
	r1.setDescription("Jacket");
	r1.setUnits(12);
	r1.setPrice(59.95);
	RetailItem r2=new RetailItem();
	r2.setDescription("Designer Jeans");
	r2.setUnits(40);
	r2.setPrice(34.95);
	RetailItem r3= new RetailItem();
	r3.setDescription("Shirt");
	r3.setUnits(20);
	r3.setPrice(24.95);
	System.out.println("INVENTORY AT START OF DAY");
	System.out.println("DESCRIPTION\t\tUNITS\tPRICE");
	System.out.println(r1.getDescription()+"\t\t\t"+r1.getUnits()+"\t"+r1.getPrice());
	System.out.println(r2.getDescription()+"\t\t"+r2.getUnits()+"\t"+r2.getPrice());
	System.out.println(r3.getDescription()+"\t\t\t"+r3.getUnits()+"\t"+r3.getPrice());

	System.out.println("How many Jackets were purchased today?: ");
	int jacketsPurchased = kb.nextInt();
	System.out.println("How many Designer Jeans were purchased today?: ");
	int designerJeansPurchased = kb.nextInt();
	System.out.println("How many Shirts were purchased today?: ");
	int shirtsPurchased = kb.nextInt();
	
	r1.setUnits(r1.getUnits() - jacketsPurchased);
	r2.setUnits(r2.getUnits() - designerJeansPurchased);
	r3.setUnits(r3.getUnits() - shirtsPurchased);
	
	System.out.println("INVENTORY AT END OF DAY");
	System.out.println("DESCRIPTION\t\tUNITS\tPRICE");
	System.out.println(r1.getDescription()+"\t\t\t"+r1.getUnits()+"\t"+r1.getPrice());
	System.out.println(r2.getDescription()+"\t\t"+r2.getUnits()+"\t"+r2.getPrice());
	System.out.println(r3.getDescription()+"\t\t\t"+r3.getUnits()+"\t"+r3.getPrice());
	
	System.out.println("Profit from Jacket Sales:"+"\t\t"+ (df.format(r1.getPrice() * jacketsPurchased)));
	System.out.println("Profit from Designer Jean Sales:"+"\t"+ (df.format(r2.getPrice() * designerJeansPurchased)));
	System.out.println("Profit from Shirt Sales:"+"\t\t"+ (df.format(r3.getPrice() * shirtsPurchased)));
	}


}
