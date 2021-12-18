package demo.template;

public abstract class OrderTemplate {

	public abstract void doCheckout();
	public abstract void doPayment();
	public abstract void doReceipt();
	public abstract void doDelivery();
	
	public final void processOrder() {
		doCheckout();
		doPayment();
		{
			doReceipt();
		}
		
		doDelivery();
	}
}
