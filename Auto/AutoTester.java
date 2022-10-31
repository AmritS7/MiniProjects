
public class AutoTester {
	
	public static void main(String[] args)
	{
	Auto a1=new Auto("Ferrari","Red",3000, 0, 32.5);
	Auto a2=new Auto();
	a2.setBrand("Honda");
	a2.setColor("Blue");
	a2.setMileage(50000);
	a2.setMPG(28.7);
	Auto a3 = new Auto();//<---- no arg
	a3.getInfo();
	

	System.out.println(a1);
	System.out.println(a2);
	System.out.println(a3);
	}


}
