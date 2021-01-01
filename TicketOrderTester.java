
public class TicketOrderTester {
	public static void main(String[] args) {
		TicketOrder to = (new TicketOrder(1, 2, 3, "Jörg Pilawas Silvestershow"))
				.prices(1000, 750, 250).date("2020-12-31").value();
		System.out.println("Created Order: " + to.title + " on " + to.date + " for a total of " + to.value
				+ " Euros");
	}
}
