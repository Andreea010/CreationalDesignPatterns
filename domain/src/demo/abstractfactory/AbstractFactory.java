package demo.abstractfactory;

import demo.models.specs.Computer;
import demo.models.specs.manufacturer.Manufacturer;
import demo.models.specs.processor.Processor;

public class AbstractFactory {

    public static void main(String[] args) {


        ProcessorFactory factory1 = ComputerAbstractFactory.getFactory(Processor.INTEL);
        Computer asus = factory1.create(Manufacturer.ASUS);
        asus.display();

        ProcessorFactory factory2 = ComputerAbstractFactory.getFactory(Processor.AMD);
        Computer hp = factory2.create(Manufacturer.HP);
        hp.display();

    }
}
