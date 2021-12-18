# Behavioral Design Patterns - Lab 3

### _Author: Birsan Andreea_

----

## Objectives:

* Study and understand the Behavioral Design Patterns
* As a continuation of the previous laboratory work, think about what communication between software entities might be involed in your system;
* Implement some additional functionalities using behavioral design patterns.


## Theoretical background:

In software engineering, __behavioral design patterns__ are design patterns that identify common communication patterns between objects and realize these patterns. By doing so, these patterns increase flexibility in carrying out this communication.
* _Chain of responsibility_ - A way of passing a request between a chain of objects
* _Command_ - Encapsulate a command request as an object
* _Interpreter_ - A way to include language elements in a program
* _Iterator_ - Sequentially access the elements of a collection
* _Mediator_ - Defines simplified communication between classes
* _Memento_ - Capture and restore an object's internal state 
* _Null Object_ - Designed to act as a default value of an object
* _Observer_ - A way of notifying change to a number of classes
* _State_ - Alter an object's behavior when its state changes 
* _Strategy_ - Encapsulates an algorithm inside a class 
* _Template method_ - Defer the exact steps of an algorithm to a subclass 
* _Visitor_ - Defines a new operation to a class without change


## Used Design Patterns:

* Template method


## Implementation

For my laboratory work I chose one behavioral design patterns in order to add on to the already implemented simulation of a Computer Store.
Based on the changes, there is one additional package:
* abstractfactory
* builder
* models
* _template_

With the help of the chosen pattern, there has been added:
* _Web Order logic_,
* _Store Order logic_.

The __template method__ design pattern is to define an algorithm as a skeleton of operations and leave the details to be implemented by the child classes. The overall structure and sequence of the algorithm are preserved by the parent class.
The _OrderTemplate_ is an abstract class which should be made final so that it cannot be overridden.
```
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
```

The __WebOrder__ and __StoreOrder__ class mplements all the operations required by the templateMethod that were defined as abstract in the parent class.

```
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
```

```
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
```

## Conclusion
In conclusion, after implementing the project, I got to familiarize myself with the behavioral design pattern, specifically template method.
Ultimately, these patterns help us to reduce complexity of code, and duplication of code, reduced sender and receiver coupling and enable better support by others and flexibility in the future.

__Results__

```
----------------- Orders -----------------
|Web Order|
Get items from cart,
Set delivery address,
Set billing address.
Process payment
Order receipt
Ship to address

|Store Order|
Put item in cart
Process payment in cash
Print receipt
Bag items at counter
```
