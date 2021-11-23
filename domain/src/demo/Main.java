package demo;

import demo.abstractfactory.ComputerAbstractFactory;
import demo.abstractfactory.ProcessorFactory;
import demo.builder.Computer;
import demo.models.actors.Consultant;
import demo.models.actors.Employee;
import demo.models.actors.ExecutiveDirector;
import demo.models.actors.Manager;
import demo.models.specs.manufacturer.Manufacturer;
import demo.models.specs.processor.Processor;
import demo.models.structures.registry.*;
import demo.models.structures.store.*;

public class Main {

    public static void main(String[] args) {

        Stock stock = new ItemQuantity(new ItemName(new IDNumber(new StockRegistry())));
        System.out.println(stock.make());

        System.out.println("------------- Computer Description ------------");
        ProcessorFactory factory1 = ComputerAbstractFactory.getFactory(Processor.INTEL);
        demo.models.specs.Computer asus = factory1.create(Manufacturer.ASUS);
        asus.display();

        Computer.Builder builder1 = new Computer.Builder()
                .modelCode("BR103")
                .color("Gold")
                .weight("1.8 kg")
                .dimensions("360.2 x 234.9 x 19.9 mm");
        Computer computer1 = builder1.build();
        System.out.println(computer1);

        ProcessorFactory factory2 = ComputerAbstractFactory.getFactory(Processor.AMD);
        demo.models.specs.Computer hp = factory2.create(Manufacturer.HP);
        hp.display();
        
        Computer.Builder builder2 = new Computer.Builder()
                .modelCode("EQ2025NQ")
                .color("Silver")
                .weight("1.69 kg")
                .dimensions("358.5 x 242 x 17.9 mm");
        Computer computer2 = builder2.build();
        System.out.println(computer2);

        System.out.println("\n" + "---------------- Staff Information ---------------");
        Employee consultant = new Consultant("Mihai", 400L);
        Employee executiveDirector = new ExecutiveDirector("Constantin", 1000L);
        Employee manager = new Manager("Oleg", 700L);

        executiveDirector.add(manager);
        System.out.println(executiveDirector.toString());
        manager.add(consultant);
        System.out.println(manager.toString());
        System.out.println(consultant.toString());

        System.out.println("\n" + "------------ Store Departments -----------");
        Store firstDepartment = new Department("Personnel", 1, "Manager", new FirstDepartment());
        Store secondDepartment = new Department("Marketing", 2, "Executive Director", new SecondDepartment());
        Store thirdDepartment = new Department("Inventory", 3, "Consultant", new ThirdDepartment());

        firstDepartment.description();
        secondDepartment.description();
        thirdDepartment.description();
    }

}

