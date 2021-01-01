
public class TicketOrder {
	String title;
	private int quantityCategory1;
	private int quantityCategory2;
	private int quantityCategory3;
	private int priceCategory1;
	private int priceCategory2;
	private int priceCategory3;
	String date;
	int value;
	
	public TicketOrder(int qtyCat1, int qtyCat2, int qtyCat3, String title) {
		this.quantityCategory1 = qtyCat1;
		this.quantityCategory2 = qtyCat2;
		this.quantityCategory3 = qtyCat3;
		this.title = title;
	}
	
	public TicketOrder prices(int pCat1, int pCat2, int pCat3) {
		this.priceCategory1 = pCat1;
		this.priceCategory2 = pCat2;
		this.priceCategory3 = pCat3;
		return this;
	}
	
	public TicketOrder date(String date) {
		this.date = date;
		return this;
	}
	
	public TicketOrder value() {
		this.value = quantityCategory1*priceCategory1+quantityCategory2*priceCategory2+quantityCategory3*priceCategory3;
		return this;
	}

}
