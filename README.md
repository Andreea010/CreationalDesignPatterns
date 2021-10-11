# Creational Design Patterns - Lab 1

### _Author: Birsan Andreea_

----

## Objectives:

* Get familiar with the Creational DPs;
* Choose a specific domain;
* Implement at least 3 CDPs for the specific domain;


## Theoretical background:

In software engineering, __creational design patterns__ are design patterns that deal with object creation mechanisms, trying to create objects in a manner suitable to the situation. The basic form of object creation could result in design problems or added complexity to the design. Creational design patterns solve this problem by somehow controlling this object creation.

* _Abstract Factory_ - 
Creates an instance of several families of classes
* _Builder_ -
Separates object construction from its representation
* _Factory Method_ -
Creates an instance of several derived classes
* _Object Pool_ -
Avoid expensive acquisition and release of resources by recycling objects that are no longer in use
* _Prototype_ -
A fully initialized instance to be copied or cloned
* _Singleton_ -
A class of which only a single instance can exist


## Used Design Patterns: 

* Abstract Factory
* Builder
* Singleton


## Implementation

For my laboratory work I chose to implement 3 creational design patterns in order to simulate a Computer Store. 
The project is separated into 3 main packages: 
* abstractfactory
* builder
* models
  * actors
  * specs
  * structures
  
The Computer Store includes:
* _Staff_ 
* _Computer Stock_ with a brief description of
  * computers' manufacturer, 
  * processor, 
  * model code, 
  * color,
  * wight,
  * dimensions 

The __Abstract Factory__ patterns work around a super-factory which creates other factories. 
This factory is also called as factory of factories. This type of design pattern comes under creational pattern as this
 pattern provides one of the best ways to create an object. In Abstract Factory pattern an interface is responsible for 
 creating a factory of related objects without explicitly specifying their classes. Each generated factory can give the objects as per the Factory pattern.
This pattern was implemented in the designaned package in order to assign the processor type for each computer.

```
public static ProcessorFactory getFactory(Processor processor) {

        switch (processor) {
            case AMD:
                return new AMDprocessor();
            case INTEL:
                return new INTELprocessor();
            default:
                return null;
        }
    }
```

The __Builder__ pattern builds a complex object using simple objects and using a step by step approach. This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.
This pattern was implemented in the designaned package in order to create the computer object with the general description of color, model code, weight and dimensions.

```
public static class Builder {
        private String modelCode;
        private String color;
        private String weight;
        private String dimensions;

        public Builder() {
        }

        public Computer build() {
            return new Computer(this);
        }

        public Builder modelCode(String modelCode) {
            this.modelCode = modelCode;
            return this;
        }

        public Builder color(String color) {
            this.color = color;
            return this;
        }

        public Builder weight(String weight) {
            this.weight = weight;
            return this;
        }

        public Builder dimensions(String dimensions) {
            this.dimensions = dimensions;
            return this;
        }
```

The __Singleton__ pattern is one of the simplest design patterns in Java. This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.
This pattern involves a single class which is responsible to create an object while making sure that only single object gets created. This class provides a way to access its only object which can be accessed directly without need to instantiate the object of the class.
This pattern was implemented in the _actor_ package in order to create the objects in staff.

```
private static Staff INSTANCE;
    private String name = "Ethan";
    private String surname = "Klein";

    public static Staff getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new Staff();
        }

        return INSTANCE;
    }
```

## Conclusion
In conclusion, after implementing the project, I got to familiarize myself with thw creational design pattern, specifically abstract factory, singleton and builder pattern. Creational patterns provide object creation mechanisms that can create objects in a controlled manner that are suitable to the situation. In this way, they help reduce complexities and instability, while also offering increased flexibility and allowing for the reuse of code.

__Results__

```
Asus VivoBook
Description: 
Model Code = BR103
Color = Gold
Weight = 1.8 kg
Dimensions = 360.2 x 234.9 x 19.9 mm
HP 15S
Description: 
Model Code = EQ2025NQ
Color = Silver
Weight = 1.69 kg
Dimensions = 358.5 x 242 x 17.9 mm

Computer Store Staff { 
Dan Moraru
}
```
