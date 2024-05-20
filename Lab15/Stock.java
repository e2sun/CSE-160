//Evelyn Sun
//115417946

public class Stock {
	private String symbol;
	private String name;
	private double previousClosingPrice;
	private double currentPrice;
	
	public Stock(String s, String n) {
		symbol=s;
		name=n;
	}
	public String getSymbol() {
		return symbol;
	}
	public String getName() {
		return name;
	}
	public double getPreviousClosingPrice() {
		return previousClosingPrice;
	}
	public double getCurrentPrice() {
		return currentPrice;
	}
	public void setPreviousClosingPrice(double pcp) {
		previousClosingPrice=pcp;
	}
	public void setCurrentPrice(double cp) {
		currentPrice=cp;
	}
	public double changePercent() {
		double p = (Math.abs(currentPrice-previousClosingPrice))/previousClosingPrice;
		return p*100;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stock one = new Stock("GOOG", "Google Inc.");
		one.setPreviousClosingPrice(1000);	
		one.setCurrentPrice(2000);
		System.out.println("Price Change Percentage: " + one.changePercent());

	}

}
