# Creational Design Patterns - Lab 2

### _Author: Birsan Andreea_

----

## Objectives:

* Study and understand the Structural Design Patterns;
* As a continuation of the previous laboratory work, think about the functionalities that your system will need to provide to the user;
* Implement some additional functionalities using structural design patterns.


## Theoretical background:

__Structural design patterns__ are concerned with how classes and objects can be composed, to form larger structures.
The structural design patterns simplifies the structure by identifying the relationships.
These patterns focus on, how the classes inherit from each other and how they are composed from other classes.
* _Adapter Pattern_ -
  Adapting an interface into another according to client expectation.
* _Bridge Pattern_ -
  Separating abstraction (interface) from implementation.
* _Composite Pattern_ -
  Allowing clients to operate on hierarchy of objects.
* _Decorator Pattern_ -
  Adding functionality to an object dynamically.
* _Facade Pattern_ -
  Providing an interface to a set of interfaces.
* _Flyweight Pattern_ -
  Reusing an object by sharing it.
* _Proxy Pattern_ -
  Representing another object.


## Used Design Patterns:

* Composite
* Decorator
* Bridge


## Implementation

For my laboratory work I chose 3 structural design patterns in order add on to the already implemented simulation of a Computer Store.
Based on the changes, there are a couple of additional packages:
* abstractfactory
* builder
* models
    * _actors_
    * specs
      * manufacturer
      * processor
    * structures
      * _registry_
      * _store_

With the help of the chosen patterns, there has been added:
* _staff information_, 
* _stock registry information_,
* _store department structure_. 

The __Composite__ pattern deals with a tree-like structure of objects. In this tree, the individual object, or even the entire hierarchy, is treated the same way. In simpler words, this pattern arranges objects in a hierarchical fashion so that a client can work seamlessly with either the part of the whole.
This pattern was implemented in a designated package, named _actors_, in order to extend the information about staff positions, their salaries and present the hierarchy(Executive Director, Manager, Consultant).
In the __Main__ class we are able to see this pattern work:
```
System.out.println("\n" + "---------------- Staff Information ---------------");
        Employee consultant = new Consultant("Mihai", 400L);
        Employee executiveDirector = new ExecutiveDirector("Constantin", 1000L);
        Employee manager = new Manager("Oleg", 700L);

        executiveDirector.add(manager);
        manager.add(consultant);
```

The __Decorator__ pattern comes into play when we want to enhance the behavior of an object without modifying the original object itself. This is achieved by adding a wrapper of the same type to the object to attach additional responsibility to it.
This pattern was implemented in a designated package, named _registry_, in order to present the stock registry of the store, with information about the items' names, identification numbers and quantity

```
public abstract class StockDecorator implements Stock {
    protected Stock customStock;

    public StockDecorator(Stock customStock) {
        this.customStock = customStock;
    }

    public String make() {
        return customStock.make();
    }
    
__________________________________________________________

Stock stock = new ItemQuantity(new ItemName(new IDNumber(new StockRegistry())));
        System.out.println(stock.make());
```

The __Bridge__ pattern allows separation between abstractions and implementations so that they can be developed independently of each other but still have a way, or bridge, to coexist and interact.
This pattern was implemented in a designated package, named _store_, in order to specify the separated store departments, their names, identification numbers and employees. That was done by separating two different classes, _Department_ and _Store_.

```
public class Department extends Store {

    private String name, staff;
    private int IDNumber;

    public Department(String name, int IDNumber, String staff, DescriptionAPI descriptionAPI) {
        super(descriptionAPI);
        this.name = name;
        this.IDNumber = IDNumber;
        this.staff = staff;
    }

    public void description() {
        descriptionAPI.description(name, IDNumber, staff);
    }
}
```

## Conclusion
In conclusion, after implementing the project, I got to familiarize myself with thw structural design pattern, specifically composite, decorator and bridge. 
Ultimately, these patterns help us to structure our objects, the relationships and inheritance between classes. They help us adapt between interfaces, aggregate and manage children objects, add additional functionality to an object at runtime,hide complex code or interface behind a more simplified interface, as well as share and shuttle data between processes.

__Results__

```
--------------- Stock Registry --------------
ID Number          | 1                2     |
Items in the stock | Asus VivoBook    HP 15S|
Item Quantity      | 34               6     |

---------------- Staff Information ---------------
Executive Director |    Constantin   |  1000 euro |
Manager            |       Oleg      |  700 euro  |
Consultant         |       Mihai     |  400 euro  |

------------ Store Departments -----------
|  Personnel  | id.1 |       Manager      |
|  Marketing  | id.2 | Executive Director |
|  Inventory  | id.3 |     Consultant     |
```
