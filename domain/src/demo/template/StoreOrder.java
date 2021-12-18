package demo.template;

public class StoreOrder extends OrderTemplate {

	@Override
	public void doCheckout() {
		System.out.println("Put item in cart");
	}

	@Override
	public void doPayment() {
		System.out.println("Process payment in cash");
	}

	@Override
	public void doDelivery() {
		System.out.println("Bag items at counter");
	}

	@Override
	public void doReceipt() {
		System.out.println("Print receipt");
	}
}