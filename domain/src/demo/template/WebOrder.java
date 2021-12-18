package demo.template;

public class WebOrder extends OrderTemplate {

	@Override
	public void doCheckout() {
		System.out.println("Get items from cart,");
		System.out.println("Set delivery address,");
		System.out.println("Set billing address.");
	}

	@Override
	public void doPayment() {
		System.out.println("Process payment");
	}

	@Override
	public void doDelivery() {
		System.out.println("Ship to address");
	}

	@Override
	public void doReceipt() {
		System.out.println("Order receipt");
	}

}
