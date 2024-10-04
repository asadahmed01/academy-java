package com.bptn.course._13_stock;

public class Stock {
	
//	tickerSymbol (String)
	String tickerSymbol;
//	companyName (String)
	String companyName;
//	price (int)
	int price;
//	percentChange (double)
	double percentChange;
//	totalShares(int)
	int totalShares;
//	marketCap(long)
	long marketCap;
	
	

	public Stock(String tickeerSymbol, String companyName, int price, int totalShares) {
		this.tickerSymbol = tickeerSymbol.toUpperCase();
		this.companyName = companyName;
		this.price = price;
		this.totalShares = totalShares;
		this.percentChange = 0.0;
		this.marketCap = this.totalShares * this.price;
	}
	
	public void adjustPrice(int change) {
		
		int previousPrice = this.price; // Store the previous price
        
	    this.price += change; // Update the current price
	    
	    // Calculate percent change based on the previous price
	    if (previousPrice != 0) { // Prevent division by zero
	        this.percentChange = ((double) change / previousPrice) * 100;
	    } else {
	        this.percentChange = 0.0; // If the previous price was zero, no change can be calculated
	    }
		this.marketCap = this.totalShares * this.price;
	}
	
	// toString method to format the output
    @Override
    public String toString() {
        return "Ticker Symbol: " + tickerSymbol + "\n" +
               "Company: " + companyName + "\n" +
               "Current Price: $" + price + " (" + percentChange + "%)\n" +
               "Market Cap: $" + marketCap;
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stud
		Stock stock = new Stock("goog", "Google, Inc.", 802, 5373400);
		stock.adjustPrice(20);
		System.out.println(stock.toString());
	}

}
