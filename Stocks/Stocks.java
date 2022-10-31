/*Amritpal Singh
 * Lab 4- Stacks and Queues
 * CUS 1126
 */
public class Stocks {
	
	String stockName;
	int numShares;
	double purchPrice;
	
	
	
	Stocks next;


	public Stocks(String sName, int nShares, double pPrice) {
		this.stockName = sName;
		this.numShares = nShares;
		this.purchPrice = pPrice;
		this.next = null;
	}
}
